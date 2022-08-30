/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Healthplus.Org;
import Healthplus.Role.Roles;
import Healthplus.Role.Supervisor;
import java.util.ArrayList;


public class CampaignOrg extends Org {
    public CampaignOrg() {
        super(OrgType.Campaign.getValue());
    }

    
    @Override
    public ArrayList<Roles> getSupportedRole() {
        ArrayList<Roles> roles = new ArrayList();
        roles.add(new Supervisor());
        return roles;
    }
}
