/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Healthplus.FundRaiser;
import java.util.ArrayList;


public class FundRaiserDirectory {
    private ArrayList <FundRaiser> agencyList;
    
       public FundRaiserDirectory(){
        this.agencyList = new ArrayList<>();
    }
   
    public ArrayList<FundRaiser> getAgencyList() {
        return agencyList;
    }

    public void setAgencyList(ArrayList<FundRaiser> agencyList) {
        this.agencyList = agencyList;
    }
  
    public FundRaiser createAgency(String name, int amount){
        FundRaiser agency = new FundRaiser();
        agency.setName(name);
        agency.setAmount(amount);
        agency.setStatus(false);
        agencyList.add(agency);
        return agency;
    }
     public void removeAgency(FundRaiser agency){
        agencyList.remove(agency);
    }
}
