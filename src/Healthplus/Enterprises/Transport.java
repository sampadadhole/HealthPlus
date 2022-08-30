/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Healthplus.Enterprises;

import Healthplus.Role.Roles;
import java.util.ArrayList;

/**
 *
 * @author sampadadhole
 */
public class Transport extends Enterprise {
    public Transport(String name) {
        super(name, Enterprise.EnterpriseType.Transport);
    }

    @Override
    public ArrayList<Roles> getSupportedRole() {
       return null;
    }
    
    
}
