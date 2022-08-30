/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Healthplus;

import Healthplus.Applicant.ApplicantDirectory;
import Healthplus.Network.Country;
import Healthplus.Org.Org;
import Healthplus.Role.Roles;
import Healthplus.Role.SysAdmin;
import java.util.ArrayList;


public class E_System extends Org {

    private static E_System business;
    
    //Ecosystem has applicant directory for the entire network.
    private ApplicantDirectory applicantDirectory;
    private ArrayList<Country> networkList;
    
    private E_System() {
        super(null);
        networkList = new ArrayList<>();
        applicantDirectory = new ApplicantDirectory();
    }
    
    public static E_System getInstance()
    {
        if(business == null){
            business = new E_System();
        }
        
        return business;
    }
    
    @Override
    public ArrayList<Roles> getSupportedRole() {
        ArrayList<Roles> roleList = new ArrayList<>();
        roleList.add(new SysAdmin());
        return roleList;
    }

    public ArrayList<Country> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Country> networkList) {
        this.networkList = networkList;
    }
    
    public Country createAndAddNetwork()
    {
        Country network = new Country();
        networkList.add(network);
        return network;
    }
    
    public void removeNetwork(Country country)
    {
        networkList.remove(country);
    }

    public ApplicantDirectory getApplicantDirectory() {
        return applicantDirectory;
    }

    public void setApplicantDirectory(ApplicantDirectory applicantDirectory) {
        this.applicantDirectory = applicantDirectory;
    }
    
     public boolean checkIfUserNameIsUnique(String username){
        
        if(!this.getUserAccountDirectory().checkIfUsernameIsUnique(username)){
            return false;
        }
        return true;
        
    }
     
    @Override
    public String toString(){
        return "Ecosystem";
    }
}
