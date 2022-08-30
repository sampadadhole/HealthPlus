/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Healthplus.Org;
import Healthplus.Role.CareTaker;
import Healthplus.Role.Roles;
import java.util.ArrayList;


public class Senior_Care_Org extends Org  {
    
public Senior_Care_Org() {
       super(OrgType.SeniorCare.getValue());
    }
    
    @Override
    public ArrayList<Roles> getSupportedRole() {
        ArrayList<Roles> roles = new ArrayList();
        roles.add(new CareTaker());
        return roles;
    }
    
}
