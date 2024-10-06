/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Address;
import model.Person;
import model.PersonDirectory;

/**
 *
 * @author user
 */
public class CreatePersonProfile extends javax.swing.JPanel {

    JPanel viewProfilePanel;
    PersonDirectory personDirectory;
    Person p;
    private String viewMode;
    /**
     * Creates new form CreatePersonProfile
     */
    public CreatePersonProfile(JPanel container, PersonDirectory directory, Person person, boolean isViewMode) {
        initComponents();
        viewProfilePanel = container;
        personDirectory = directory;
        this.p = person;
        if(isViewMode){
            RefreshTextField();
            setViewMode();
        }else{
            setCreateMode();
        }
    }
    
     private void RefreshTextField() {
          txtFirstName.setText(p.getFirstName());
          txtLastName.setText(p.getLastName());
          txtSsn.setText(p.getSSN());
          txtAge.setText(String.valueOf(p.getAge()));
          txtHeight.setText(String.valueOf(p.getHeight()));
          txtGender.setText(String.valueOf(p.getGender()));
          
          Address homeAddr = p.getHomeAddress();
          txtHomeAddrStAddr.setText(homeAddr.getStreetAddress());
          txtHomeUnitNumber.setText(homeAddr.getUnitNumber());
          txtHomeAddrCity.setText(homeAddr.getCity());
          txtHomeAddrState.setText(homeAddr.getState());
          txtHomeAddrZipCode.setText(homeAddr.getZipCode());
          txtHomeAddrPhoneNumber.setText(String.valueOf(homeAddr.getPhoneNumber()));
          
          Address workAddr = p.getWorkAddress();
          txtWorkAddrStAddr.setText(workAddr.getStreetAddress());
          txtWorkUnitNumber.setText(workAddr.getUnitNumber());
          txtWorkAddrCity.setText(workAddr.getCity());
          txtWorkAddrState.setText(workAddr.getState());
          txtWorkAddrZipCode.setText(workAddr.getZipCode());
          txtWorkAddrPhoneNumber.setText(String.valueOf(workAddr.getPhoneNumber()));
    }

    private void setViewMode() {
//        txtRoutingNumber.setEnabled(false);
//        txtAccountNumber.setEnabled(false);
//        txtBankName.setEnabled(false);
        
        btnCreate.setEnabled(false);
        btnUpdate.setEnabled(true);
    }
    
    private void setCreateMode(){
        btnCreate.setEnabled(true);
        btnUpdate.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {

        lblHomeUnitNumber = new javax.swing.JLabel();
        txtHomeAddrZipCode = new javax.swing.JTextField();
        lblLastName = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        txtSsn = new javax.swing.JTextField();
        lblAge = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtHomeAddrStAddr = new javax.swing.JTextField();
        lblHomeAddrStaddr = new javax.swing.JLabel();
        lblFirstName = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        lblHomeAddrCity = new javax.swing.JLabel();
        txtHomeUnitNumber = new javax.swing.JTextField();
        lblHomeAddrState = new javax.swing.JLabel();
        txtHomeAddrCity = new javax.swing.JTextField();
        lblHomeAddrZipCode = new javax.swing.JLabel();
        txtHomeAddrState = new javax.swing.JTextField();
        lblHomeAddrPhoneNumber = new javax.swing.JLabel();
        txtHomeAddrPhoneNumber = new javax.swing.JTextField();
        lblWorkTitle = new javax.swing.JLabel();
        lblWorkAddrStaddr = new javax.swing.JLabel();
        txtWorkAddrStAddr = new javax.swing.JTextField();
        lblWorkUnitNumber = new javax.swing.JLabel();
        txtWorkUnitNumber = new javax.swing.JTextField();
        lblWorkAddrCity = new javax.swing.JLabel();
        txtWorkAddrCity = new javax.swing.JTextField();
        lblWorkAddrState = new javax.swing.JLabel();
        txtWorkAddrState = new javax.swing.JTextField();
        lblWorkAddrZipCode = new javax.swing.JLabel();
        txtWorkAddrZipCode = new javax.swing.JTextField();
        lblWorkAddrPhoneNumber = new javax.swing.JLabel();
        txtWorkAddrPhoneNumber = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblHeight = new javax.swing.JLabel();
        txtHeight = new javax.swing.JTextField();
        lblGender = new javax.swing.JLabel();
        txtGender = new javax.swing.JTextField();
        lblSsn = new javax.swing.JLabel();

        lblHomeUnitNumber.setText("Unit Number");

        lblLastName.setText("Last Name");

        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });

        lblAge.setText("Age");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Home Address");

        lblHomeAddrStaddr.setText("Street Address");

        lblFirstName.setText("First Name");

        lblHomeAddrCity.setText("City");

        lblHomeAddrState.setText("State");

        txtHomeAddrCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHomeAddrCityActionPerformed(evt);
            }
        });

        lblHomeAddrZipCode.setText("Zip Code");

        lblHomeAddrPhoneNumber.setText("Phone Number");

        lblWorkTitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblWorkTitle.setText("Work Adddress");

        lblWorkAddrStaddr.setText("Street Address");

        txtWorkAddrStAddr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWorkAddrStAddrActionPerformed(evt);
            }
        });

        lblWorkUnitNumber.setText("Unit Number");

        txtWorkUnitNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWorkUnitNumberActionPerformed(evt);
            }
        });

        lblWorkAddrCity.setText("City");

        lblWorkAddrState.setText("State");

        lblWorkAddrZipCode.setText("Zip Code");

        lblWorkAddrPhoneNumber.setText("Phone Number");

        txtWorkAddrPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWorkAddrPhoneNumberActionPerformed(evt);
            }
        });

        btnCreate.setBackground(new java.awt.Color(59, 89, 152));
        btnCreate.setText("Create Profile");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(59, 89, 152));
        btnUpdate.setText("Update Profile");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        lblHeight.setText("Height");

        lblGender.setText("Gender");

        txtGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGenderActionPerformed(evt);
            }
        });

        lblSsn.setText("Social Security Number");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblFirstName)
                                    .addComponent(txtAge)
                                    .addComponent(lblAge))
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblHeight)
                                    .addComponent(txtHeight)
                                    .addComponent(lblLastName)
                                    .addComponent(txtLastName, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblHomeAddrStaddr)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblHomeUnitNumber))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtHomeAddrCity, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblHomeAddrCity, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtHomeAddrZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblHomeAddrZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblHomeAddrPhoneNumber)
                                    .addComponent(txtHomeAddrPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblHomeAddrState)
                                    .addComponent(txtHomeAddrState, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(128, 128, 128))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblGender)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblSsn)
                                        .addComponent(txtSsn, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                                        .addComponent(txtGender)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblWorkTitle)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtHomeAddrStAddr, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(txtHomeUnitNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblWorkAddrStaddr)
                                    .addComponent(txtWorkAddrStAddr, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblWorkUnitNumber)
                                    .addComponent(txtWorkUnitNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblWorkAddrCity, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblWorkAddrZipCode)
                                        .addComponent(txtWorkAddrCity, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                                        .addComponent(txtWorkAddrZipCode))
                                    .addGap(35, 35, 35)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtWorkAddrState, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblWorkAddrState)
                                        .addComponent(lblWorkAddrPhoneNumber)
                                        .addComponent(txtWorkAddrPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(btnUpdate)))
                        .addGap(0, 696, Short.MAX_VALUE))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtAge, txtGender, txtHeight, txtLastName, txtSsn});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCreate, btnUpdate});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(160, 160, 160)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHomeAddrStaddr)
                            .addComponent(lblHomeUnitNumber))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtHomeAddrStAddr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHomeUnitNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFirstName)
                            .addComponent(lblLastName)
                            .addComponent(lblSsn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSsn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAge)
                            .addComponent(lblHeight)
                            .addComponent(lblGender, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHomeAddrState)
                    .addComponent(lblHomeAddrCity))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtHomeAddrState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHomeAddrCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHomeAddrZipCode)
                    .addComponent(lblHomeAddrPhoneNumber))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHomeAddrZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHomeAddrPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblWorkTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWorkAddrStaddr)
                    .addComponent(lblWorkUnitNumber))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtWorkAddrStAddr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtWorkUnitNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWorkAddrCity)
                    .addComponent(lblWorkAddrState))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtWorkAddrCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtWorkAddrState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWorkAddrZipCode)
                    .addComponent(lblWorkAddrPhoneNumber))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtWorkAddrPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtWorkAddrZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(btnCreate)
                .addGap(18, 18, 18)
                .addComponent(btnUpdate)
                .addContainerGap(68, Short.MAX_VALUE))
        );
    }

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void txtWorkAddrPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        
        // Retrieve input fields
        String firstName = txtFirstName.getText();
        String lastName = txtLastName.getText();
        String ssn = txtSsn.getText();
        String heightInput = txtHeight.getText();
        String genderInput = txtGender.getText();
        String ageInput = txtAge.getText();

        // Input validation for mandatory fields
        if (firstName.isBlank() || lastName.isBlank() || ssn.isBlank()
                || heightInput.isBlank() || ageInput.isBlank()
                || genderInput.isBlank()
                || txtHomeAddrStAddr.getText().isBlank()
                || txtHomeUnitNumber.getText().isBlank()
                || txtHomeAddrCity.getText().isBlank()
                || txtHomeAddrState.getText().isBlank()
                || txtHomeAddrZipCode.getText().isBlank()
                || txtHomeAddrPhoneNumber.getText().isBlank()
                || txtWorkAddrStAddr.getText().isBlank()
                || txtWorkUnitNumber.getText().isBlank()
                || txtWorkAddrCity.getText().isBlank()
                || txtWorkAddrState.getText().isBlank()
                || txtWorkAddrZipCode.getText().isBlank()
                || txtWorkAddrPhoneNumber.getText().isBlank()) {

            JOptionPane.showMessageDialog(this, "All fields are mandatory", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Parse height input
        float height;
        try {
            height = Float.parseFloat(heightInput);
            if (height <= 0) {
                JOptionPane.showMessageDialog(this, "Please enter a valid height.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Height must be a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Parse gender
        char gender;
        if (genderInput.length() > 0) {
            gender = genderInput.charAt(0);
        } else {
            JOptionPane.showMessageDialog(this, "Please enter a gender.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Parse age
        int age;
        try {
            age = Integer.parseInt(ageInput);
            if (age <= 0) {
                JOptionPane.showMessageDialog(this, "Please enter a valid age.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Age must be a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Retrieve home address inputs
        Address homeAddress = p.getHomeAddress();
        homeAddress.setStreetAddress(txtHomeAddrStAddr.getText());
        homeAddress.setUnitNumber(txtHomeUnitNumber.getText());
        homeAddress.setCity(txtHomeAddrCity.getText());
        homeAddress.setState(txtHomeAddrState.getText());
        homeAddress.setZipCode(txtHomeAddrZipCode.getText());
        homeAddress.setPhoneNumber(Long.parseLong(txtHomeAddrPhoneNumber.getText()));

        // Retrieve work address inputs
        Address workAddress = p.getWorkAddress();
        workAddress.setStreetAddress(txtWorkAddrStAddr.getText());
        workAddress.setUnitNumber(txtWorkUnitNumber.getText());
        workAddress.setCity(txtWorkAddrCity.getText());
        workAddress.setState(txtWorkAddrState.getText());
        workAddress.setZipCode(txtWorkAddrZipCode.getText());
        workAddress.setPhoneNumber(Long.parseLong(txtWorkAddrPhoneNumber.getText()));
        
        if (!String.valueOf(homeAddress.getPhoneNumber()).matches("\\d{10}")) {
            JOptionPane.showMessageDialog(this, "Home phone number must be a 10-digit number.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!String.valueOf(workAddress.getPhoneNumber()).matches("\\d{10}")) {
            JOptionPane.showMessageDialog(this, "Work phone number must be a 10-digit number.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Create and populate the Person object
        Person p = personDirectory.addPerson();
        p.setFirstName(firstName);
        p.setLastName(lastName);
        p.setSSN(ssn);
        p.setAge(age);
        p.setHeight(height);
        p.setGender(gender);
        p.setHomeAddress(homeAddress);
        p.setWorkAddress(workAddress);

        // Success message
        JOptionPane.showMessageDialog(this, "Profile created successfully!", "Information", JOptionPane.INFORMATION_MESSAGE);

        // Clear input fields after successful creation
        txtFirstName.setText("");
        txtLastName.setText("");
        txtAge.setText("");
        txtSsn.setText("");
        txtHeight.setText("");
        txtGender.setText("");
        txtHomeAddrStAddr.setText("");
        txtHomeUnitNumber.setText("");
        txtHomeAddrCity.setText("");
        txtHomeAddrState.setText("");
        txtHomeAddrZipCode.setText("");
        txtHomeAddrPhoneNumber.setText("");
        txtWorkAddrStAddr.setText("");
        txtWorkUnitNumber.setText("");
        txtWorkAddrCity.setText("");
        txtWorkAddrState.setText("");
        txtWorkAddrZipCode.setText("");
        txtWorkAddrPhoneNumber.setText("");
    }


     private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        String firstName = txtFirstName.getText();
        String lastName = txtLastName.getText();
        String ssn = txtSsn.getText();
        String age = txtAge.getText();
        String heightInput = txtHeight.getText();
        String genderInput = txtGender.getText();
        
        if (firstName.isBlank() || lastName.isBlank() || ssn.isBlank()
                || heightInput.isBlank() || age.isBlank()
                || genderInput.isBlank()
                || txtHomeAddrStAddr.getText().isBlank()
                || txtHomeUnitNumber.getText().isBlank()
                || txtHomeAddrCity.getText().isBlank()
                || txtHomeAddrState.getText().isBlank()
                || txtHomeAddrZipCode.getText().isBlank()
                || txtHomeAddrPhoneNumber.getText().isBlank()
                || txtWorkAddrStAddr.getText().isBlank()
                || txtWorkUnitNumber.getText().isBlank()
                || txtWorkAddrCity.getText().isBlank()
                || txtWorkAddrState.getText().isBlank()
                || txtWorkAddrZipCode.getText().isBlank()
                || txtWorkAddrPhoneNumber.getText().isBlank()) {

            JOptionPane.showMessageDialog(this, "All fields are mandatory", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Person person = p;
        person.setFirstName(firstName);
        person.setLastName(lastName);
        person.setSSN(ssn);
        try {
            person.setAge(Integer.parseInt(age));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Age can only be number", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
       
        Address homeAddress = p.getHomeAddress();
        homeAddress.setStreetAddress(txtHomeAddrStAddr.getText());
        homeAddress.setUnitNumber(txtHomeUnitNumber.getText());
        homeAddress.setCity(txtHomeAddrCity.getText());
        homeAddress.setState(txtHomeAddrState.getText());
        homeAddress.setZipCode(txtHomeAddrZipCode.getText());
        homeAddress.setPhoneNumber(Long.parseLong(txtHomeAddrPhoneNumber.getText()));

        // Retrieve work address inputs
        Address workAddress = p.getWorkAddress();
        workAddress.setStreetAddress(txtWorkAddrStAddr.getText());
        workAddress.setUnitNumber(txtWorkUnitNumber.getText());
        workAddress.setCity(txtWorkAddrCity.getText());
        workAddress.setState(txtWorkAddrState.getText());
        workAddress.setZipCode(txtWorkAddrZipCode.getText());
        workAddress.setPhoneNumber(Long.parseLong(txtWorkAddrPhoneNumber.getText()));
        
        JOptionPane.showMessageDialog(this, "Profile updated successfully!", "Information", JOptionPane.INFORMATION_MESSAGE);
        for (Person a : personDirectory.getPersonList()) {
            Address a1 = a.getHomeAddress();
            Address a2 = a.getWorkAddress();
            System.out.println(a.getFirstName());
            System.out.println(a1.getStreetAddress());
            System.out.println(a2.getStreetAddress());

        }
    }                                         


    private void txtGenderActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void txtWorkUnitNumberActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void txtWorkAddrStAddrActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void txtHomeAddrCityActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }


    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblHeight;
    private javax.swing.JLabel lblHomeAddrCity;
    private javax.swing.JLabel lblHomeAddrPhoneNumber;
    private javax.swing.JLabel lblHomeAddrStaddr;
    private javax.swing.JLabel lblHomeAddrState;
    private javax.swing.JLabel lblHomeAddrZipCode;
    private javax.swing.JLabel lblHomeUnitNumber;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblSsn;
    private javax.swing.JLabel lblWorkAddrCity;
    private javax.swing.JLabel lblWorkAddrPhoneNumber;
    private javax.swing.JLabel lblWorkAddrStaddr;
    private javax.swing.JLabel lblWorkAddrState;
    private javax.swing.JLabel lblWorkAddrZipCode;
    private javax.swing.JLabel lblWorkTitle;
    private javax.swing.JLabel lblWorkUnitNumber;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtHeight;
    private javax.swing.JTextField txtHomeAddrCity;
    private javax.swing.JTextField txtHomeAddrPhoneNumber;
    private javax.swing.JTextField txtHomeAddrStAddr;
    private javax.swing.JTextField txtHomeAddrState;
    private javax.swing.JTextField txtHomeAddrZipCode;
    private javax.swing.JTextField txtHomeUnitNumber;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtSsn;
    private javax.swing.JTextField txtWorkAddrCity;
    private javax.swing.JTextField txtWorkAddrPhoneNumber;
    private javax.swing.JTextField txtWorkAddrStAddr;
    private javax.swing.JTextField txtWorkAddrState;
    private javax.swing.JTextField txtWorkAddrZipCode;
    private javax.swing.JTextField txtWorkUnitNumber;
}
