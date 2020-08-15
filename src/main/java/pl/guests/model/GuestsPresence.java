/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.guests.model;

/**
 *
 * @author Bogdan
 */
public enum GuestsPresence {
    WILL("WILL"),
    WONT("WONT"),
    UNDECIDED("UNDECIDED");
     
    String presence;
     
    private GuestsPresence(String presence){
        this.presence = presence;
    }
     
    public String getUserProfileType(){
        return presence;
    }
}
