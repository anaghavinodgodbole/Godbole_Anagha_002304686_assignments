/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import java.awt.CardLayout;
import javax.swing.JPanel;
import model.Address;
import model.Person;
import model.PersonDirectory;

/**
 *
 * @author user
 */
public class MainJFrame extends javax.swing.JFrame {

    PersonDirectory personDirectory;
    JPanel viewProfileContainer;
    Person p;

    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
        initComponents();
        viewProfileContainer = viewProfilePanel;
        personDirectory = new PersonDirectory();
        p = new Person();
        populateData();
    }
    
    public void populateData(){
        Person p1 = personDirectory.addPerson();
        p1.setFirstName("James");
        p1.setLastName("Bond");
        p1.setSSN("AAA-GG-SSSS");
        p1.setHeight((float) 171.5);
        p1.setGender('M');
        p1.setAge(35);
        
        Address homeaddress = p1.getHomeAddress();
        homeaddress.setStreetAddress("360 Huntington Ave");
        homeaddress.setUnitNumber("403");
        homeaddress.setCity("Boston");
        homeaddress.setState("MA");
        homeaddress.setZipCode("02120");
        homeaddress.setPhoneNumber(5555555555L);
        p1.setHomeAddress(homeaddress);
        
        Address workAddress = p1.getWorkAddress();
        workAddress.setStreetAddress("Fenway");
        workAddress.setUnitNumber("201");
        workAddress.setCity("Boston");
        workAddress.setState("MA");
        workAddress.setZipCode("02121");
        workAddress.setPhoneNumber(5551234567L);
        p1.setWorkAddress(workAddress);
        
        
        Person p2 = personDirectory.addPerson();
        p2.setFirstName("Will");
        p2.setLastName("Smith");
        p2.setSSN("AAA-GG-FFFF");
        p2.setHeight((float) 180);
        p2.setGender('M');
        p2.setAge(25);
        
        Address homeaddress1 = p2.getHomeAddress();
        homeaddress1.setStreetAddress("56 Longwood");
        homeaddress1.setUnitNumber("405");
        homeaddress1.setCity("Boston");
        homeaddress1.setState("MA");
        homeaddress1.setZipCode("02129");
        homeaddress1.setPhoneNumber(5559876543L);
        p1.setHomeAddress(homeaddress1);
        
        Address workAddress1 = p2.getWorkAddress();
        workAddress1.setStreetAddress("36 South Ave");
        workAddress1.setUnitNumber("203");
        workAddress1.setCity("Boston");
        workAddress1.setState("MA");
        workAddress1.setZipCode("02125");
        workAddress1.setPhoneNumber(5559876555L);
        p2.setWorkAddress(workAddress1);
        
        Person p3 = personDirectory.addPerson();
        p3.setFirstName("Rachel");
        p3.setLastName("Green");
        p3.setSSN("DDD-GG-SSSS");
        p3.setHeight((float) 163);
        p3.setGender('F');
        p3.setAge(30);
        
        Address homeaddress2 = p3.getHomeAddress();
        homeaddress2.setStreetAddress("90 North Ave");
        homeaddress2.setUnitNumber("0901");
        homeaddress2.setCity("NY");
        homeaddress2.setState("NY");
        homeaddress2.setZipCode("04567");
        homeaddress2.setPhoneNumber(8575550199L);
        p3.setHomeAddress(homeaddress2);
        
        Address workAddress2 = p3.getWorkAddress();
        workAddress2.setStreetAddress("Manhatton");
        workAddress2.setUnitNumber("1001");
        workAddress2.setCity("NY");
        workAddress2.setState("NY");
        workAddress2.setZipCode("4567");
        workAddress2.setPhoneNumber(5555550177L);
        p3.setWorkAddress(workAddress2);
        
        
        Person p4 = personDirectory.addPerson();
        p4.setFirstName("Daniel");
        p4.setLastName("Peterson");
        p4.setSSN("AAA-BB-SSSS");
        p4.setHeight((float) 170);
        p4.setGender('M');
        p4.setAge(21);
        
        Address homeaddress3 = p4.getHomeAddress();
        homeaddress3.setStreetAddress("Mission Main");
        homeaddress3.setUnitNumber("809");
        homeaddress3.setCity("San Franscisco");
        homeaddress3.setState("California");
        homeaddress3.setZipCode("51203");
        homeaddress3.setPhoneNumber(5557890123L);
        p4.setHomeAddress(homeaddress3);
        
        Address workAddress3 = p4.getWorkAddress();
        workAddress3.setStreetAddress("Downtown bay");
        workAddress3.setUnitNumber("903");
        workAddress3.setCity("San Franscisco");
        workAddress3.setState("California");
        workAddress3.setZipCode("02127");
        workAddress3.setPhoneNumber(5558901114L);
        p4.setWorkAddress(workAddress3);
        
        
        Person p5 = personDirectory.addPerson();
        p5.setFirstName("Riya");
        p5.setLastName("Verma");
        p5.setSSN("SSS-GG-SSSS");
        p5.setHeight((float) 153);
        p5.setGender('F');
        p5.setAge(25);
        
        Address homeaddress4 = p5.getHomeAddress();
        homeaddress4.setStreetAddress("362 Huntington Ave");
        homeaddress4.setUnitNumber("502");
        homeaddress4.setCity("Boston");
        homeaddress4.setState("MA");
        homeaddress4.setZipCode("02123");
        homeaddress4.setPhoneNumber(8571113399L);
        p5.setHomeAddress(homeaddress4);
        
        Address workAddress4 = p5.getWorkAddress();
        workAddress4.setStreetAddress("Echange Ave");
        workAddress4.setUnitNumber("702");
        workAddress4.setCity("NY");
        workAddress4.setState("NY");
        workAddress4.setZipCode("04302");
        workAddress4.setPhoneNumber(4681239911L);
        p5.setWorkAddress(workAddress4);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPane = new javax.swing.JSplitPane();
        createProfilePanel = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        btnAddPerson = new javax.swing.JButton();
        btnList = new javax.swing.JButton();
        viewProfilePanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        createProfilePanel.setBackground(new java.awt.Color(59, 89, 152));

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Person Profile");

        btnAddPerson.setText("Add Person ");
        btnAddPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPersonActionPerformed(evt);
            }
        });

        btnList.setText("List Person ");
        btnList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout createProfilePanelLayout = new javax.swing.GroupLayout(createProfilePanel);
        createProfilePanel.setLayout(createProfilePanelLayout);
        createProfilePanelLayout.setHorizontalGroup(
            createProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createProfilePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(createProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddPerson, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                    .addComponent(btnList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        createProfilePanelLayout.setVerticalGroup(
            createProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createProfilePanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(btnAddPerson)
                .addGap(18, 18, 18)
                .addComponent(btnList)
                .addContainerGap(265, Short.MAX_VALUE))
        );

        splitPane.setLeftComponent(createProfilePanel);

        viewProfilePanel.setLayout(new java.awt.CardLayout());
        splitPane.setRightComponent(viewProfilePanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPersonActionPerformed
        // TODO add your handling code here:
        CreatePersonProfile panel = new CreatePersonProfile(viewProfileContainer, personDirectory, p, false);
        viewProfileContainer.add("CreatePersonProfile", panel);

        CardLayout layout = (CardLayout) viewProfileContainer.getLayout();
        layout.next(viewProfileContainer);
    }//GEN-LAST:event_btnAddPersonActionPerformed

    private void btnListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListActionPerformed
        // TODO add your handling code here:
        ManagePersonDetails panel = new ManagePersonDetails(viewProfileContainer, personDirectory);
        viewProfileContainer.add("ManagePersonDetails", panel);

        CardLayout layout = (CardLayout) viewProfileContainer.getLayout();
        layout.next(viewProfileContainer);
    }//GEN-LAST:event_btnListActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddPerson;
    private javax.swing.JButton btnList;
    private javax.swing.JPanel createProfilePanel;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JSplitPane splitPane;
    private javax.swing.JPanel viewProfilePanel;
    // End of variables declaration//GEN-END:variables
}
