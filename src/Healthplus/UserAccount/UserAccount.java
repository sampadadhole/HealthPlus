/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Healthplus.UserAccount;

import Healthplus.Applicant.Applicant;
import Healthplus.Worker.Worker;
import Healthplus.Role.Roles;
import Healthplus.WorkQueue.WorkQueue;

public class UserAccount {
    private String username;
    private String password;
    private Worker employee;
    private Applicant applicant;
    private Roles role;
    private WorkQueue workQueue;

    public UserAccount() {
        workQueue = new WorkQueue();
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Roles getRole() {
        return role;
    }

    public void setEmployee(Worker employee) {
        this.employee = employee;
    }

    public void setRole(Roles role) {
        this.role = role;
    }

    public Worker getEmployee() {
        return employee;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public Applicant getApplicant() {
        return applicant;
    }

    public void setApplicant(Applicant applicant) {
        this.applicant = applicant;
    }

    @Override
    public String toString() {
        return username;
    }
}
