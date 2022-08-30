/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Healthplus.Org;
import Healthplus.Role.Admin;
import Healthplus.Role.Roles;
import java.util.ArrayList;


public class AdminOrg extends Org {
    public AdminOrg() {
        super(OrgType.Admin.getValue());
    }
    
    @Override
    public ArrayList<Roles> getSupportedRole() {
        ArrayList<Roles> roles = new ArrayList();
        roles.add(new Admin());
        return roles;
    }
}
