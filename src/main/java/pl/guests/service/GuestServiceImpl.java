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
import pl.guests.dao.GuestDao;
import pl.guests.model.Guest;

/**
 *
 * @author Bogdan
 */
@Service("guestService")
@Transactional
public class GuestServiceImpl implements GuestService{

    @Autowired
    GuestDao gDao;
    
    @Override
    public void save(Guest guest) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Guest findById(int id) {
        return gDao.findById(id);
    }

    @Override
    public List getBeetwen(int start, int amount, int uId) {
        return gDao.getBeetwen(start, amount,uId);
    }



}
