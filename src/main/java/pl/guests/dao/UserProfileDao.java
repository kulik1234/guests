/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.guests.dao;

import java.util.List;
import pl.guests.model.UserProfile;

/**
 *
 * @author Bogdan
 */
public interface UserProfileDao {
    
    List<UserProfile> findAll();
    
    UserProfile findByType(String type);
    
    UserProfile findById(int id);
}
