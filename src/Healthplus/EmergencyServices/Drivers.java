/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Healthplus.EmergencyServices;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author sampadadhole
 */
public class Drivers {
       private static ArrayList<String>  driverslist = new ArrayList<String>(){
           {add("John");
            add("Ben");
            add("Alex");
            add("Kairi");
            add("Henry");
            add("Andrew");
            add("Lee");
           }

       };  

       Drivers(){
       }

    
    
    public static String setDriver(){
        Random r = new Random();
        return driverslist.get(r.nextInt(driverslist.size()));
    }
}
