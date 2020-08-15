/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.guests.controller;

import java.nio.charset.Charset;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
//import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pl.guests.model.Guest;
import pl.guests.model.User;
import pl.guests.service.GuestService;

/**
 *
 * @author Bogdan
 */
@Controller
@RequestMapping("/app")
public class AppController {
     
    @Autowired
    GuestService service;
    
    @RequestMapping(value = "/pokaz-gosci", method = RequestMethod.GET)
    public String guests(Model m,Authentication auth){
        /*SessionFactory factory = new AnnotationConfiguration().configure().addAnnotatedClass(pl.guests.model.Guest.class).buildSessionFactory();
        Session session = factory.openSession();
        Query q = session.createQuery("FROM Guest g WHERE g.appUserId = :userId");
        q.setParameter("userId", 1);*/
         
        List list = service.getBeetwen(0, 20,((User)auth.getPrincipal()).getId());
        String guests = "";
        for(int i = 0;i < list.size();i++){
            JSONObject o = new JSONObject();
            o.put("name", ((Guest)list.get(i)).getName());
            o.put("presence",((Guest)list.get(i)).getPresence().toLowerCase());
            o.put("id", ((Guest)list.get(i)).getId());
            guests += "<item>"+o.toJSONString()+"</item>\n            ";
        }
        
        m.addAttribute("guests",guests+"\n"+((User)auth.getPrincipal()).getId());
        //<item>{"name":"abc","presence":"will"}</item>
                return "g/selectGuests";
            }
    
    
    @RequestMapping(value = "/pokaz-gosci", method = RequestMethod.POST)
    public String guestsPost(Model m,Authentication auth,HttpServletRequest req){
         SessionFactory factory = new AnnotationConfiguration().configure().addAnnotatedClass(pl.guests.model.Guest.class).buildSessionFactory();
         Session session = factory.openSession();
         Transaction t = session.beginTransaction();
         Guest g = new Guest();
         g.setName(new String(req.getParameter("guestName").getBytes(Charset.forName("ISO-8859-1")),Charset.forName("UTF-8")));
         g.setPresence(req.getParameter("presence").toUpperCase());
         g.setAppUserId(((User)auth.getPrincipal()).getId());
         session.save(g);
         t.commit();
        return "redirect:/app/pokaz-gosci";
    
    }
    
    
    
    @RequestMapping(value = "/settings", method = RequestMethod.GET)
    public String appMain(Model m){
        
         SessionFactory factory = new AnnotationConfiguration().configure().addAnnotatedClass(pl.guests.model.Guest.class).buildSessionFactory();
         Session session = factory.openSession();
        Query q = session.createQuery("FROM Guest");
        
        List list = q.list();
        m.addAttribute("dupa",((Guest)list.get(7)).getName());
         System.out.println(list);
                return "g/main"; 
    }
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String app(Model m){
            m.addAttribute("main","to jest główna scieżka alikacji");
            return "app/index";
    };
}
