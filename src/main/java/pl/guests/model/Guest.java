/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.guests.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author Bogdan
 */
@Entity
@Table(name="app_guest")
public class Guest {

    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    
    @NotEmpty
    @Column(name="name", nullable=false)
    private String name;
    
    @NotEmpty
    @Column(name="presence", nullable=false)
    private String presence;
    
    @NotNull
    @Column(name="app_user_id",nullable=false)
    private int appUserId;

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPresence(String presence) {
        this.presence = presence;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setAppUserId(int appUserId){
        this.appUserId = appUserId;
    }

    public String getName() {
        return name;
    }

    public String getPresence() {
        return presence;
    }
    
    public int getAppUserId(){
        return appUserId;
    }
    
}
