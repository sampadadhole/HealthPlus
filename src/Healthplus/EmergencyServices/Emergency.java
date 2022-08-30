/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Healthplus.EmergencyServices;

/**
 *
 * @author sampadadhole
 */
public class Emergency {
    private String Country;
    private String City;
    private String State;
    private String drivername;

    public String getDrivername() {
        return drivername;
    }

    public void setDrivername(String drivername) {
        this.drivername = drivername;
    }
    private int Eid;
    private static int count = 1;
    
     public Emergency() {
        Eid = count;
        count++;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getState() {
        return State;
    }

    public void setState(String State) {
        this.State = State;
    }

    public int getEid() {
        return Eid;
    }

    public void setEid(int Eid) {
        this.Eid = Eid;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Emergency.count = count;
    }

   
//    @Override
//    public String toString() {
//        return country;
//    }

}
