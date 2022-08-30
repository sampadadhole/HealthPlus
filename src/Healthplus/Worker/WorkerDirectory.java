/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Healthplus.Worker;

import java.util.ArrayList;

public class WorkerDirectory {
    private ArrayList<Worker> employeeList;

    public WorkerDirectory() {
        employeeList = new ArrayList();
    }

    public ArrayList<Worker> getEmployeeList() {
        return employeeList;
    }
    
    public Worker createEmployee(String name){
        Worker employee = new Worker();
        employee.setName(name);
        employeeList.add(employee);
        return employee;
    }
    
    public void removeEmployee(Worker employee){
        employeeList.remove(employee);
    }
}
