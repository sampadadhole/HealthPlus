/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Healthplus.Enterprises;
import Healthplus.Org.Org;
import Healthplus.Org.OrgDirectory;

import Healthplus.Enterprises.EmergencyServices;

public abstract class Enterprise extends Org {
    private EnterpriseType enterpriseType;
    private OrgDirectory organizationDirectory;
    
    public Enterprise(String name, EnterpriseType enterpriseType) {
        super(name);
        this.enterpriseType = enterpriseType;
        organizationDirectory = new OrgDirectory();
    }
    
    public enum EnterpriseType{
        Trust("Trust"),
        OldAgeHome("OldAgeHome"),
        EmergencyServices("EmergencyServices"),
        Transport("Transport");
        private String value;

        private EnterpriseType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
        
        @Override
        public String toString() {
            return value;
        }  
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }

    public OrgDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public void setOrganizationDirectory(OrgDirectory organizationDirectory) {
        this.organizationDirectory = organizationDirectory;
    }

}
