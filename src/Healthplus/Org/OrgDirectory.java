/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Healthplus.Org;
import Healthplus.Org.Org.OrgType;
import java.util.ArrayList;
import javax.mail.Transport;

public class OrgDirectory {
    private ArrayList<Org> organizationList;

    public OrgDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Org> getOrganizationList() {
        return organizationList;
    }
    
    public Org createOrganization(OrgType type){
        Org organization = null;
        if (type.getValue().equals(OrgType.Admin.getValue())){
            organization = new AdminOrg();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(OrgType.Manager.getValue())){
            organization = new ManagerOrg();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(OrgType.Campaign.getValue())){
            organization = new CampaignOrg();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(OrgType.Welfare.getValue())){
            organization = new Welfare_Org();
            organizationList.add(organization);
        } 
        else if (type.getValue().equals(OrgType.SeniorCare.getValue())){
            organization = new Senior_Care_Org();
            organizationList.add(organization);
        } 
        else if (type.getValue().equals(OrgType.Medical.getValue())){
            organization = new MedicalOrg();
            organizationList.add(organization);
        } 
        else if (type.getValue().equals(OrgType.EmergencyRequest.getValue())){
            organization = new EmergencyServices();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(OrgType.Transport.getValue())){
            organization = new TransportOrg();
            organizationList.add(organization);
        }
        return organization;
    }
    
    public void deleteOrganization(Org organization){
      organizationList.remove(organization);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
