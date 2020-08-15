/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.guests.controller.rest;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.guests.model.User;
import pl.guests.service.UserService;

/**
 *
 * @author bogdan
*/
@Controller
public class GetGuest {
    
    @Autowired
    private UserService gDao;
    
    
    @RequestMapping("/rest/{id}")
    public @ResponseBody String getOne(@PathVariable int id){
        User g = gDao.findById(id);
      /* Guest g = new Guest();
        g.setAppUserId(1);
        g.setId(id);
        g.setName("dupa");
        g.setPresence("will");*/
        JSONObject o = new JSONObject();
        o.put("id",g.getId());
        o.put("name",g.getFirstName());
        o.put("presence",g.getSsoId());
        o.put("userId",g.getUsername());
    return  /*g;*/o.toJSONString();
    }
}
