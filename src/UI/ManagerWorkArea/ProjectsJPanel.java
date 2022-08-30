/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.ManagerWorkArea;

import Healthplus.Enterprises.Enterprise;
import Healthplus.Org.Org;
import Healthplus.Project.Project;
import Healthplus.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class ProjectsJPanel extends javax.swing.JPanel {
    /**
     * Creates new form Projects
     */
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private Org organization;
    private Enterprise enterprise;

    public ProjectsJPanel(JPanel userProcessContainer, UserAccount userAccount, Org organization, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.organization = organization;
        this.enterprise = enterprise;
        populateProjectTable();
    }

    public void populateProjectTable() {
        DefaultTableModel model = (DefaultTableModel) tblViewProjects.getModel();

        model.setRowCount(0);
        for (Project project : enterprise.getProjectDirectory().getProjectList()) {
            Object[] row = new Object[2];
            //row[0] = project.getId();
            row[0] = project;
            row[1] = project.getBudget();
            model.addRow(row);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_deleteProject = new javax.swing.JButton();
        label_projectName = new javax.swing.JLabel();
        btn_addProject = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        label_budget = new javax.swing.JLabel();
        text_bufget = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblViewProjects = new javax.swing.JTable();
        lblWarning = new javax.swing.JLabel();
        lblHeader = new javax.swing.JLabel();
        combo_projectName = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 228, 214));
        setMaximumSize(new java.awt.Dimension(700, 700));
        setMinimumSize(new java.awt.Dimension(700, 700));
        setPreferredSize(new java.awt.Dimension(700, 700));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_deleteProject.setBackground(new java.awt.Color(255, 255, 255));
        btn_deleteProject.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        btn_deleteProject.setText("Delete Project");
        btn_deleteProject.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_deleteProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteProjectActionPerformed(evt);
            }
        });
        add(btn_deleteProject, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 380, -1, -1));

        label_projectName.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        label_projectName.setText("Project Name:");
        add(label_projectName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 450, -1, -1));

        btn_addProject.setBackground(new java.awt.Color(255, 255, 255));
        btn_addProject.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        btn_addProject.setText("Add");
        btn_addProject.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_addProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addProjectActionPerformed(evt);
            }
        });
        add(btn_addProject, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 590, 123, -1));

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/backicon.jpeg"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 90, 70));

        label_budget.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        label_budget.setText("Budget:");
        add(label_budget, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 510, -1, -1));

        text_bufget.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        add(text_bufget, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 510, 180, -1));

        tblViewProjects.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Budget"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblViewProjects);
        if (tblViewProjects.getColumnModel().getColumnCount() > 0) {
            tblViewProjects.getColumnModel().getColumn(0).setResizable(false);
            tblViewProjects.getColumnModel().getColumn(1).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 110, 470, 240));

        lblWarning.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        lblWarning.setForeground(new java.awt.Color(255, 0, 51));
        lblWarning.setText("* Budget currency is considered to be in US Dollar");
        add(lblWarning, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 650, -1, -1));

        lblHeader.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeader.setText("Projects");
        add(lblHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 220, 26));

        combo_projectName.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        combo_projectName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Provide Medication", "Provide Treatment", "Donate Basic Amenities"}));
        combo_projectName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_projectNameActionPerformed(evt);
            }
        });
        add(combo_projectName, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 450, 180, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btn_addProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addProjectActionPerformed
        // TODO add your handling code here:
        String projectName = combo_projectName.getSelectedItem().toString();
        String budgetText = text_bufget.getText();
        if (budgetText != "" || projectName != "") {
            
            String regex = "^[a-z A-Z]+$";
            Pattern namePattern = Pattern.compile(regex);
            Matcher nameMatcher = namePattern.matcher(projectName);

            if(!nameMatcher.matches()){
                 JOptionPane.showMessageDialog(null, "Invalid characters in project name", "Warning", JOptionPane.WARNING_MESSAGE);
                 return;
            }
            
            regex = "^[0-9]+$";
            Pattern intPattern = Pattern.compile(regex);
            Matcher intMatcher = intPattern.matcher(budgetText);

            if(!intMatcher.matches()){
                 JOptionPane.showMessageDialog(null, "Invalid characters in budget, enter only numbers", "Warning", JOptionPane.WARNING_MESSAGE);
                 return;
            }
            
            int budget = Integer.parseInt(budgetText);
            System.out.println(enterprise.getAccountDirectory().getBalance());            
            if(budget <= enterprise.getAccountDirectory().getBalance()){
                Project project = new Project();
                project = enterprise.getProjectDirectory().addProject(project);
                project.setName(projectName);
                project.setBudget(budget);
                project.setManager(userAccount.getEmployee());

                //deducting the budget from balance
                int balance = enterprise.getAccountDirectory().getBalance() - budget;
                enterprise.getAccountDirectory().setBalance(balance);

                JOptionPane.showMessageDialog(null, "Project added successfully", "Information", JOptionPane.INFORMATION_MESSAGE);
                text_bufget.setText("");
                populateProjectTable();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "No enough budget for the Project", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please enter both the fields", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_addProjectActionPerformed

    private void btn_deleteProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteProjectActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblViewProjects.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Project project = (Project) tblViewProjects.getValueAt(selectedRow, 1);
//        for(Project p : enterprise.getProjectDirectory().getProjectList()){
//            if(project.equals(p)){
        enterprise.getProjectDirectory().RemoveProject(project);
        JOptionPane.showMessageDialog(null, "Project deleted successfully", "Information", JOptionPane.INFORMATION_MESSAGE);

        populateProjectTable();
    }//GEN-LAST:event_btn_deleteProjectActionPerformed

    private void combo_projectNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_projectNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_projectNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btn_addProject;
    private javax.swing.JButton btn_deleteProject;
    private javax.swing.JComboBox<String> combo_projectName;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_budget;
    private javax.swing.JLabel label_projectName;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblWarning;
    private javax.swing.JTable tblViewProjects;
    private javax.swing.JTextField text_bufget;
    // End of variables declaration//GEN-END:variables
}