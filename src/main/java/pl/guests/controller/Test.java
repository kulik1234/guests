/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.guests.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
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
public class Test {
    
    @Autowired
    GuestService service;
    
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String t(Model m,Authentication auth){
        String string = "";
        List a = service.getBeetwen(0, 50,((User)(auth.getPrincipal())).getId());
       
        for(int i = 0; i < a.size(); i++){
            string +=  ((Guest)a.get(i)).getName()+";";
        }
        m.addAttribute("m", string);
        return "test/1";
    }
}
