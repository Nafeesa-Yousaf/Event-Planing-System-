/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.EventController;
import controller.EventOrganizorController;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import models.EventModel;
import models.EventOrganizorModel;

/**
 *
 * @author PMYLS
 */
public class HomeScreen extends javax.swing.JFrame {

    private EventOrganizorModel organizor;
    private JPanel eventPanelContainer; // Container for dynamic events
    private int authId;

    public HomeScreen(int authId) {
        this.authId = authId;
        // Fetch the EventOrganizor details using authId
        organizor = EventOrganizorController.getEventOrganizorDetails(authId);

        // Initialize components
        initComponents();
        // Display the fetched details
        if (organizor != null) {
            userEmail.setText(organizor.getEmail());
        } else {
            userEmail.setText("Details not found");
        }
        // Initialize eventPanelContainer
        eventPanelContainer = new javax.swing.JPanel();

        eventPanelContainer.setLayout(new javax.swing.BoxLayout(eventPanelContainer, javax.swing.BoxLayout.Y_AXIS)); // Stack events vertically
        eventPanel.setLayout(new java.awt.BorderLayout());
        eventPanel.add(eventPanelContainer, java.awt.BorderLayout.CENTER);

        // Fetch events and display them
        List<EventModel> events = new EventController().getEventsByOrganizerId(organizor.getId());

        // Dynamically add events to eventPanelContainer
        if (events != null && !events.isEmpty()) {
            for (EventModel event : events) {
                addEventToPanel(event);
            }
        } else {
            JLabel noEventLabel = new JLabel("NO Event Found");
            noEventLabel.setFont(new java.awt.Font("Segoe UI", 1, 18));
            eventPanel.add(noEventLabel, java.awt.BorderLayout.CENTER);

        }
    }

    // Method to add individual event to the container
    // Method to add individual event to the container
    private void addEventToPanel(EventModel event) {
        // Create a new panel for each event
        JPanel eventDisplayPanel = new JPanel();
        eventDisplayPanel.setLayout(new BoxLayout(eventDisplayPanel, BoxLayout.Y_AXIS)); // Stack vertically
        eventDisplayPanel.setBackground(Color.WHITE); // Set background color to white
        eventDisplayPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Add some space around each event container

        // Event Name
        JLabel eventNameLabel = new JLabel("Event Name: " + event.getName());
        eventNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 18));
        eventNameLabel.setForeground(new Color(102, 0, 102)); // Set event name color to purple

        // Event Status
        JLabel statusLabel = new JLabel("Status: " + event.getEventStatus());
        statusLabel.setFont(new java.awt.Font("Segoe UI", 0, 14));

        // Event Date
        JLabel dateLabel = new JLabel("Date: " + event.getDate());
        dateLabel.setFont(new java.awt.Font("Segoe UI", 0, 14));

        // Event Location
        JLabel locationLabel = new JLabel("Location: " + event.getLocation());
        locationLabel.setFont(new java.awt.Font("Segoe UI", 0, 14));

        // "More Details" button
        JButton moreDetailsButton = new JButton("More Details");
        moreDetailsButton.setBackground(new Color(102, 0, 102)); // Set button color to purple
        moreDetailsButton.setForeground(Color.WHITE); // Set button text color to white
        moreDetailsButton.addActionListener(evt -> {
            // Handle more details action
            System.out.println("More details for event: " + event.getName());
        });

        // Add components to the event panel
        eventDisplayPanel.add(eventNameLabel);
        eventDisplayPanel.add(statusLabel);
        eventDisplayPanel.add(dateLabel);
        eventDisplayPanel.add(locationLabel);
        eventDisplayPanel.add(moreDetailsButton);

        // Set the event panel to take up the full width
        eventDisplayPanel.setMaximumSize(new Dimension(Integer.MAX_VALUE, eventDisplayPanel.getPreferredSize().height));

        // Add the event panel to the eventPanelContainer
        eventPanelContainer.add(eventDisplayPanel);

        // Add some space between each event container
        eventPanelContainer.add(Box.createVerticalStrut(20)); // Adjust the vertical gap as needed

        eventPanelContainer.revalidate(); // Refresh the container
        eventPanelContainer.repaint(); // Repaint the container
    }

    // Dynamically add event details to the UI
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // </editor-fold>
    @SuppressWarnings("unchecked")


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        userEmail = new javax.swing.JLabel();
        userRole = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        eventPanel = new javax.swing.JPanel();
        createEventButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 0, 102));

        userEmail.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        userEmail.setForeground(new java.awt.Color(255, 255, 255));
        userEmail.setText("UserName");

        userRole.setForeground(new java.awt.Color(255, 255, 255));
        userRole.setText("Event Organizor");

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setForeground(new java.awt.Color(102, 0, 102));
        jButton2.setText("Profile");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(userRole)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(userEmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 601, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(25, 25, 25))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userEmail)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userRole)
                .addGap(12, 12, 12))
        );

        eventPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout eventPanelLayout = new javax.swing.GroupLayout(eventPanel);
        eventPanel.setLayout(eventPanelLayout);
        eventPanelLayout.setHorizontalGroup(
            eventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 272, Short.MAX_VALUE)
        );
        eventPanelLayout.setVerticalGroup(
            eventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 182, Short.MAX_VALUE)
        );

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(eventPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(createEventButton)
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(eventPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 182, Short.MAX_VALUE)
                .addComponent(createEventButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void createEventButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createEventButtonActionPerformed
        this.setVisible(false);
        CreateEventScreen createEventScreen = new CreateEventScreen(organizor.getId(), authId);
        createEventScreen.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_createEventButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeScreen(1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createEventButton;
    private javax.swing.JPanel eventPanel;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel userEmail;
    private javax.swing.JLabel userRole;
    // End of variables declaration//GEN-END:variables
}
