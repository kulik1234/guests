/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.guests.service;

import java.util.List;
import pl.guests.model.Guest;

/**
 *
 * @author Bogdan
 */
public interface GuestService {
    void save(Guest guest);
    List getBeetwen(int start,int amout, int uId);
    Guest findById(int id);
}
