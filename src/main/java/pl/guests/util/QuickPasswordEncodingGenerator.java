/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.guests.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 *
 * @author Bogdan
 */
public class QuickPasswordEncodingGenerator {
    public static void main(String[] args){
    String password = "abc";
    BCryptPasswordEncoder passEncoder = new BCryptPasswordEncoder();
    System.out.println(passEncoder.encode(password));
    }
}
