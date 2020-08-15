/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.guests.dao;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Repository;
import pl.guests.model.Guest;
import pl.guests.model.User;
import pl.guests.service.UserService;

/**
 *
 * @author bogdan
 */
@Repository("guestDao")
public class GuestDaoImpl extends AbstractDao<Integer, Guest> implements GuestDao{
    

    @Override
    public void save(Guest guest) {
        persist(guest);
    }

    @Override
    public Guest findById(int id) {
        return getByKey(id);
    }

    @Override
    public List getBeetwen(int start, int amount, int uId) {
        Criteria crit = createEntityCriteria();
        crit.setFirstResult(start);
        crit.setMaxResults(amount);
        crit.add(Restrictions.eq("appUserId", uId));
       /*
        Guest[] g = new Guest[end-start+1];
        System.out.println(crit.uniqueResult());
        int l = g.length;
        int index = 0;
        for(int i = start;i <= end; i++){
            g[index++] = getByKey(i);
        }
        */
        return  crit.list();
    }

    
}
