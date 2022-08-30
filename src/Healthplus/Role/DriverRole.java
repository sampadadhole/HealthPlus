/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Healthplus.Role;

import Healthplus.DB4OUtil.DB4OUtil;
import Healthplus.E_System;
import Healthplus.EmergencyServices.EmergencyRequestDirectory;
import Healthplus.Enterprises.Enterprise;
import Healthplus.Org.Org;
import Healthplus.Transport.DriverDirectory;
import Healthplus.UserAccount.UserAccount;
import UI.EmergencyServices.EmergencyServicesHome_Panel;
import UI.Transport.TransportServicesHome_Panel;
import javax.swing.JPanel;


public class DriverRole extends Roles{

    
   // private EmergencyRequestDirectory EmergencyList;
    
public DriverDirectory driverslist;
    public DriverRole(){
        super(Roles.RoleType.DriverRole.getValue());
    }
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, E_System business, DB4OUtil dB4OUtil, UserAccount userAccount, Org organization, Enterprise enterprise, EmergencyRequestDirectory EmergencyList) {
        return new TransportServicesHome_Panel(userProcessContainer, business, dB4OUtil, userAccount, organization, enterprise,  EmergencyList);
    }
    
}

