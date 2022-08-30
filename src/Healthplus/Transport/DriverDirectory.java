/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Healthplus.Transport;

import Healthplus.Applicant.Applicant;
import java.util.ArrayList;

/**
 *
 * @author sampadadhole
 */
public class DriverDirectory {
     private ArrayList <Driver> driverslist;
    
    public DriverDirectory(){
        this.driverslist = new ArrayList<>();
    }

    public ArrayList<Driver> getApplicantList() {
        return driverslist;
    }

    public void setApplicantList(ArrayList<Driver> driverslist) {
        this.driverslist = driverslist;
    }
    public Driver createApplicant(String name){
        Driver driver = new Driver();
        driver.setName(name);
        driverslist.add(driver);
        return driver;
    }
    
    public void removeApplicant (Driver driver){
        driverslist.remove(driver);
    }
    
    
}
