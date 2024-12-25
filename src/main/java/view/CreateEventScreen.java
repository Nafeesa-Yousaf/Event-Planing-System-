/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.EventController;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import javax.swing.JOptionPane;
import models.EventModel;

/**
 *
 * @author PMYLS
 */
public class CreateEventScreen extends javax.swing.JFrame {

    /**
     * Creates new form CreateEventScreen
     */
    public CreateEventScreen() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        eventNameLabel = new javax.swing.JLabel();
        eventNameTextField = new javax.swing.JTextField();
        eventDateLabel = new javax.swing.JLabel();
        eventDateTextField = new javax.swing.JTextField();
        locationalLabel = new javax.swing.JLabel();
        locationTextField = new javax.swing.JTextField();
        descriptionLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descriptionTextfield = new javax.swing.JTextArea();
        createEventButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 0, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Create Event");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(265, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(261, 261, 261))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        eventNameLabel.setBackground(new java.awt.Color(0, 0, 0));
        eventNameLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        eventNameLabel.setForeground(new java.awt.Color(0, 0, 0));
        eventNameLabel.setText("Event Name:");

        eventNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventNameTextFieldActionPerformed(evt);
            }
        });

        eventDateLabel.setBackground(new java.awt.Color(0, 0, 0));
        eventDateLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        eventDateLabel.setForeground(new java.awt.Color(0, 0, 0));
        eventDateLabel.setText("Event Date:");

        eventDateTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventDateTextFieldActionPerformed(evt);
            }
        });

        locationalLabel.setBackground(new java.awt.Color(0, 0, 0));
        locationalLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        locationalLabel.setForeground(new java.awt.Color(0, 0, 0));
        locationalLabel.setText("Location:");

        descriptionLabel.setBackground(new java.awt.Color(0, 0, 0));
        descriptionLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        descriptionLabel.setForeground(new java.awt.Color(0, 0, 0));
        descriptionLabel.setText("Description:");

        descriptionTextfield.setColumns(20);
        descriptionTextfield.setRows(5);
        jScrollPane1.setViewportView(descriptionTextfield);

        createEventButton.setBackground(new java.awt.Color(102, 0, 102));
        createEventButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        createEventButton.setForeground(new java.awt.Color(255, 255, 255));
        createEventButton.setText("Create Event");
        createEventButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createEventButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(eventNameLabel)
                            .addComponent(eventDateLabel)
                            .addComponent(locationalLabel)
                            .addComponent(descriptionLabel))
                        .addGap(118, 118, 118)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(eventNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                            .addComponent(eventDateTextField)
                            .addComponent(locationTextField)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(createEventButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eventNameLabel)
                    .addComponent(eventNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eventDateLabel)
                    .addComponent(eventDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(locationalLabel)
                    .addComponent(locationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descriptionLabel)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addComponent(createEventButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eventNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eventNameTextFieldActionPerformed

    private void createEventButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createEventButtonActionPerformed
        // Get input values from the text fields
        String eventName = eventNameTextField.getText().trim();
        String eventDate = eventDateTextField.getText().trim();
        String location = locationTextField.getText().trim();
        String description = descriptionTextfield.getText().trim();

        // Validate that none of the fields are empty
        if (eventName.isEmpty() || eventDate.isEmpty() || location.isEmpty() || description.isEmpty()) {
            JOptionPane.showMessageDialog(this, "All fields are required. Please fill them in.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return; // Exit the method to prevent further processing
        }

        // Validate the event date format (dd-MM-yyyy)
        String datePattern = "\\d{2}-\\d{2}-\\d{4}";
        if (!eventDate.matches(datePattern)) {
            JOptionPane.showMessageDialog(this, "Invalid date format. Please use dd-MM-yyyy.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Parse the event date to LocalDate and check if it's after today's date
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate eventLocalDate = LocalDate.parse(eventDate, formatter);
            LocalDate currentDate = LocalDate.now();

            if (eventLocalDate.isBefore(currentDate)) {
                JOptionPane.showMessageDialog(this, "Event date must be after today's date.", "Validation Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (DateTimeParseException e) {
            JOptionPane.showMessageDialog(this, "Invalid date format. Please use dd-MM-yyyy.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
// Create EventModel object with gathered data
    EventModel event = new EventModel( eventName, eventDate, location, description, "upcoming");

    // Use EventController to save the event
    EventController eventController = new EventController();
    boolean isSaved = eventController.saveEvent(event);

    // Provide feedback to the user
    if (isSaved) {
        JOptionPane.showMessageDialog(this, "Event Created Successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
    } else {
        JOptionPane.showMessageDialog(this, "Error creating event. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
    }
        // If all validations pass, proceed with the event creation logic
        // You can replace this with the actual logic to create the event (e.g., save data to the database)

    }//GEN-LAST:event_createEventButtonActionPerformed

    private void eventDateTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventDateTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eventDateTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(CreateEventScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateEventScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateEventScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateEventScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateEventScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createEventButton;
    private javax.swing.JLabel descriptionLabel;
    private javax.swing.JTextArea descriptionTextfield;
    private javax.swing.JLabel eventDateLabel;
    private javax.swing.JTextField eventDateTextField;
    private javax.swing.JLabel eventNameLabel;
    private javax.swing.JTextField eventNameTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField locationTextField;
    private javax.swing.JLabel locationalLabel;
    // End of variables declaration//GEN-END:variables
}
