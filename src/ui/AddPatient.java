package ui;

import javax.swing.JOptionPane;
import javax.swing.JSplitPane;

import api.MedicalProcedureAPI;
import api.ParameterizedDecorator;
import components.MRI;
import components.Xray;
import facade.DataFacade;
import items.Toothpaste;
import items.Tylenol;
import model.MGHBIll;
import model.Person;
import statePattern.State;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author khushbu
 */

public class AddPatient extends javax.swing.JPanel {

	JSplitPane splitPane;
	
    /**
     * Creates new form AddPatient
     */
	DataFacade dataFacade;
	private MedicalProcedureAPI medicalBill;
	
    public AddPatient(JSplitPane splitPane, DataFacade dataFacade) {
        initComponents();
        this.splitPane = splitPane;
        this.dataFacade = dataFacade;
        medicalBill = new MGHBIll();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        txtFirstName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        MedicalServices = new javax.swing.JPanel();
        checkBoxMri = new javax.swing.JCheckBox();
        checkBoxXray = new javax.swing.JCheckBox();
        titleMedicalServices = new javax.swing.JLabel();
        Products = new javax.swing.JPanel();
        checkBoxTylenol = new javax.swing.JCheckBox();
        checkBoxToothPaste = new javax.swing.JCheckBox();
        titleProducts = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSavePatientActionPerformed(evt);
            }
        });


        jLabel1.setText("First Name");

        jLabel2.setText("Last Name");

        jLabel3.setText("ID");

        checkBoxMri.setText("MRI");
        checkBoxMri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxMriActionPerformed(evt);
            }
        });

        checkBoxXray.setText("XRAY");
        checkBoxXray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxXrayActionPerformed(evt);
            }
        });

        titleMedicalServices.setText("Medical Services :");

        javax.swing.GroupLayout MedicalServicesLayout = new javax.swing.GroupLayout(MedicalServices);
        MedicalServices.setLayout(MedicalServicesLayout);
        MedicalServicesLayout.setHorizontalGroup(
            MedicalServicesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MedicalServicesLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(MedicalServicesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleMedicalServices, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(MedicalServicesLayout.createSequentialGroup()
                        .addComponent(checkBoxXray)
                        .addGap(40, 40, 40)
                        .addComponent(checkBoxMri)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MedicalServicesLayout.setVerticalGroup(
            MedicalServicesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MedicalServicesLayout.createSequentialGroup()
                .addComponent(titleMedicalServices, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(MedicalServicesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkBoxXray)
                    .addComponent(checkBoxMri))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        checkBoxTylenol.setText("Tylenol");
        checkBoxTylenol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxTylenolActionPerformed(evt);
            }
        });

        checkBoxToothPaste.setText("ToothPaste");
        checkBoxToothPaste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxToothPasteActionPerformed(evt);
            }
        });

        titleProducts.setText("Products");
        titleProducts.setToolTipText("");

        javax.swing.GroupLayout ProductsLayout = new javax.swing.GroupLayout(Products);
        Products.setLayout(ProductsLayout);
        ProductsLayout.setHorizontalGroup(
            ProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProductsLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(ProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleProducts, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ProductsLayout.createSequentialGroup()
                        .addComponent(checkBoxToothPaste)
                        .addGap(40, 40, 40)
                        .addComponent(checkBoxTylenol)))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        ProductsLayout.setVerticalGroup(
            ProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProductsLayout.createSequentialGroup()
                .addComponent(titleProducts, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(ProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkBoxToothPaste)
                    .addComponent(checkBoxTylenol))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        btnSave.setText("Save");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(MedicalServices, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Products, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel1)
                            .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(283, 283, 283)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(144, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(MedicalServices, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Products, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(95, Short.MAX_VALUE))
        );
    }// </editor-fold>                        

    private void checkBoxMriActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void checkBoxXrayActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void checkBoxTylenolActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    }                                               

    private void checkBoxToothPasteActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        // TODO add your handling code here:
    }                                                  

    private void btnSavePatientActionPerformed(java.awt.event.ActionEvent evt) {
    	Person p = new Person();
    	String firstName = txtFirstName.getText();
    	String lastName = txtLastName.getText();
    	String id = txtId.getText();
    	
    	p.setFirstName(firstName);
		p.setLastName(lastName);
		p.setId(Integer.parseInt(id));
		p.setRole(State.role.PATIENT);
		
		if(checkBoxMri.isSelected()) {
			medicalBill = new MRI(medicalBill);
		}
		
		if(checkBoxXray.isSelected()) {
			medicalBill = new Xray(medicalBill);
		}
		
		// p.setMedicalBill(new MRI(new Xray(new MGHBIll())));
		
		p.setMedicalBill(medicalBill);
		
		if(checkBoxToothPaste.isSelected()) {
			MedicalProcedureAPI legacyBill = new ParameterizedDecorator(new Toothpaste(), p.getMedicalBill());
			p.setMedicalBill(legacyBill);
		}
		
		if(checkBoxTylenol.isSelected()) {
			MedicalProcedureAPI legacyBill = new ParameterizedDecorator(new Tylenol(), p.getMedicalBill());
			p.setMedicalBill(legacyBill);
		}
//		
//		MedicalProcedureAPI legacyBill2 = new ParameterizedDecorator(new Toothpaste(), p.getMedicalBill());
//		p.setMedicalBill(legacyBill2);
		
		dataFacade.saveData(p);
		
		JOptionPane.showMessageDialog(this, "Success! Patient added successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
		
		// ViewPatientDetails cp = new ViewPatientDetails();
		
		txtFirstName.setText("");
		txtLastName.setText("");
		txtId.setText("");
		
		checkBoxMri.setSelected(false);
		checkBoxToothPaste.setSelected(false);
		checkBoxTylenol.setSelected(false);
		checkBoxXray.setSelected(false);
    } 

    // Variables declaration - do not modify                     
    private javax.swing.JPanel MedicalServices;
    private javax.swing.JPanel Products;
    private javax.swing.JButton btnSave;
    private javax.swing.JCheckBox checkBoxMri;
    private javax.swing.JCheckBox checkBoxToothPaste;
    private javax.swing.JCheckBox checkBoxTylenol;
    private javax.swing.JCheckBox checkBoxXray;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel titleMedicalServices;
    private javax.swing.JLabel titleProducts;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtLastName;
    // End of variables declaration                   
}
