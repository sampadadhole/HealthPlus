/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Healthplus.EmergencyServices;


import java.util.ArrayList;

/**
 *
 * @author sampadadhole
 */
public class EmergencyRequestDirectory {
    private ArrayList <Emergency> EmergencyList;
    
    public EmergencyRequestDirectory(){
        this.EmergencyList = new ArrayList<Emergency>();
    }

    public ArrayList<Emergency> getEmergencyList() {
        return EmergencyList;
    }

    public void setEmergencyList(ArrayList<Emergency> EmergencyList) {
        this.EmergencyList = EmergencyList;
    }
    public Emergency AddNewEmergency(){
        Emergency emrer = new Emergency();
//        emrer.setCountry(name);
//        emrer.setCity(name);
//        emrer.setState(name);
        EmergencyList.add(emrer);
        return emrer;
    }
    
    public void removeEmergency (Emergency emergency){
        EmergencyList.remove(emergency);
    }
}
