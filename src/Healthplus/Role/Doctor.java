package Healthplus.Role;

import Healthplus.DB4OUtil.DB4OUtil;
import Healthplus.E_System;
import Healthplus.EmergencyServices.EmergencyRequestDirectory;
import javax.swing.JPanel;
import Healthplus.Enterprises.Enterprise;
import Healthplus.Org.Org;
import Healthplus.UserAccount.UserAccount;
import UI.DoctorWorkArea.DoctorHome_Page;


public class Doctor extends Roles {
    public Doctor(){
        super(Roles.RoleType.Doctor.getValue());
    }
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, E_System business, DB4OUtil dB4OUtil, UserAccount userAccount, Org organization, Enterprise enterprise,EmergencyRequestDirectory EmergencyList) {
        return new DoctorHome_Page(userProcessContainer, business, dB4OUtil, userAccount, organization, enterprise);
    }
}
