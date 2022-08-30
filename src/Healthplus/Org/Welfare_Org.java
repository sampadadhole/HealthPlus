/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Healthplus.Org;
import Healthplus.Role.Guest;
import Healthplus.Role.Roles;
import java.util.ArrayList;


public class Welfare_Org extends Org{
    public Welfare_Org() {
       super(OrgType.Welfare.getValue());
    }

    
    @Override
    public ArrayList<Roles> getSupportedRole() {
        ArrayList<Roles> roles = new ArrayList();
        roles.add(new Guest());
        return roles;
    }
    
}
