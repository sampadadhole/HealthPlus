/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Healthplus.Project;

import Healthplus.Worker.Worker;
import java.util.ArrayList;

public class Project {
    private String name;
    private int id;
    private int budget;
    private ArrayList<Worker> coordinatorList;
    private Worker manager;
    private static int count = 0;

    public Project() {
        count = count + 1;
        id = count;       
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public ArrayList<Worker> getCoordinatorList() {
        return coordinatorList;
    }

    public void setCoordinatorList(ArrayList<Worker> coordinatorList) {
        this.coordinatorList = coordinatorList;
    }

    public Worker getManager() {
        return manager;
    }

    public void setManager(Worker manager) {
        this.manager = manager;
    }
    
    @Override
    public String toString() {
        return name;
    }
    
}
