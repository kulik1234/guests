/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.guests.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.guests.model.GuestsUserDetails;

import pl.guests.model.User;
import pl.guests.model.UserProfile;
/**
 *
 * @author Bogdan
 */
@Service("customUserDetailsService")
public class CustomUserDetailsService implements UserDetailsService {
    
    @Autowired
    private UserService userService;

    @Transactional(readOnly=true)
    @Override
    public UserDetails loadUserByUsername(String ssoId) throws UsernameNotFoundException {
        User user = userService.findBySso(ssoId);
        System.out.println("User :" + user);
        if(user==null){
            System.out.println("User not found");
            throw new UsernameNotFoundException("Username not found");
        }
        /*
        GuestsUserDetails customUserDetail=new GuestsUserDetails();
        customUserDetail.setUser(user);
        customUserDetail.setAuthorities((Set<GrantedAuthority>) getGrantedAuthorities(user));
        */
            return user;/*customUserDetail;*//*new org.springframework.security.core.userdetails.User(
                    user.getSsoId(), 
                    user.getPassword(), 
                    user.getState().equals("Active"),
                    true,
                    true,
                    true,
                    getGrantedAuthorities(user));*/
    }
    
   
    
    private List<GrantedAuthority> getGrantedAuthorities(User user){
        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
        
        for(UserProfile userProfile : user.getUserProfiles()){
            System.out.println("UserProfile :" + userProfile);
            authorities.add(new SimpleGrantedAuthority("ROLE_"+userProfile.getType()));
        }
        System.out.println("authorities :" + authorities);
                return authorities;
    }
    
}
