/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.guests.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.guests.dao.UserDao;
import pl.guests.model.User;

/**
 *
 * @author Bogdan
 */

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService{
    
    @Autowired
    private UserDao dao;
     
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void save(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        dao.save(user);
    }

    @Override
    public User findById(int id) {
        return dao.findById(id);
    }

    @Override
    public User findBySso(String sso) {
        return dao.findBySSO(sso);
    }
    
    
}
