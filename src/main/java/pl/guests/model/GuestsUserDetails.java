/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.guests.model;

import java.util.Collection;
import java.util.Set;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

/**
 *
 * @author bogdan
 */
public class GuestsUserDetails implements UserDetails {

     private static final long serialVersionUID = 1L;
    private User user;

    Set<GrantedAuthority> authorities=null;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

     @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(Set<GrantedAuthority> authorities)
    {
        this.authorities=authorities;
    }

     @Override
    public String getPassword() {
        return user.getPassword();
    }

     @Override
    public String getUsername() {
        return user.getSsoId();
    }

     @Override
    public boolean isAccountNonExpired() {
        return true;
    }

     @Override
    public boolean isAccountNonLocked() {
        return true;
    }

     @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

     @Override
    public boolean isEnabled() {
        return user.getState().equals("Active");
    }

}
