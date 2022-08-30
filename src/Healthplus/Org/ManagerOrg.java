/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Healthplus.Org;
import Healthplus.Role.Manager;
import Healthplus.Role.Roles;
import java.util.ArrayList;

public class ManagerOrg extends Org {
    public ManagerOrg() {
        super(OrgType.Manager.getValue());
    }

    
    @Override
    public ArrayList<Roles> getSupportedRole() {
        ArrayList<Roles> roles = new ArrayList();
        roles.add(new Manager());
        return roles;
    }
    
}
