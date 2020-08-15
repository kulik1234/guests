/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.guests.dao;

import java.util.List;
import pl.guests.model.Guest;


/**
 *
 * @author bogdan
 */
public interface GuestDao {
    
    void save(Guest guest);
    List getBeetwen(int start,int amount, int uId);
    Guest findById(int id);
    
    
}
