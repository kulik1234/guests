/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.guests.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.guests.dao.UserProfileDao;
import pl.guests.model.UserProfile;

/**
 *
 * @author Bogdan
 */
@Service("userProfileService")
@Transactional
public class UserProfileServiceImpl implements UserProfileService{
    
    @Autowired
    UserProfileDao dao;

    @Override
    public List<UserProfile> findAll() {
        return dao.findAll();
    }

    @Override
    public UserProfile findByType(String type) {
        return dao.findByType(type);
    }

    @Override
    public UserProfile findById(int id) {
        return dao.findById(id);
    }
    
}
