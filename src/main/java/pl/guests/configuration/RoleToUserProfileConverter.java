/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.guests.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import pl.guests.model.UserProfile;
import pl.guests.service.UserProfileService;
/**
 *
 * @author Bogdan
 */
@Component
public class RoleToUserProfileConverter implements Converter<Object, UserProfile> {
    
    @Autowired
    UserProfileService userProfileService;
    
    @Override
    public UserProfile convert(Object element){
        Integer id = Integer.parseInt((String)element);
        UserProfile profile = userProfileService.findById(id);
        System.out.println("Profile :" + profile);
        return profile;
        
    }
}
