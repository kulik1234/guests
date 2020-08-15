/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.guests.dao;

import pl.guests.model.User;

/**
 *
 * @author Bogdan
 */
public interface UserDao {
    
    void save(User user);
    
    User findById(int id);
    
    User findBySSO(String sso);
    
}
