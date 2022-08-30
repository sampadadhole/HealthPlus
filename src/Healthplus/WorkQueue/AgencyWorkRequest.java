/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Healthplus.WorkQueue;

import Healthplus.FundRaiser.FundRaiser;

public class AgencyWorkRequest extends WorkRequest{
    private FundRaiser agency;

    public AgencyWorkRequest(){
        super(WorkRequest.WorkRequestType.Agency.getValue());
    }
    public FundRaiser getAgency() {
        return agency;
    }

    public void setAgency(FundRaiser agency) {
        this.agency = agency;
    }
    
    @Override
    public String toString(){
        return agency.getName();
    }
}
