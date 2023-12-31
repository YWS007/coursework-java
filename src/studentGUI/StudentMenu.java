package studentGUI;

/**
 *
 * @author acer
 */
public class StudentMenu extends javax.swing.JFrame {

    private String holdstr;
    
    /**
     * Creates new form StudentMenu
     */
    public StudentMenu() {
        initComponents();
    }

    
        public void passData(String studentID){
        this.holdstr = studentID;
    }
        
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lCommand = new javax.swing.JLabel();
        lCommand1 = new javax.swing.JLabel();
        btnReservation = new javax.swing.JButton();
        btnTrack = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnInfo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lCommand.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        lCommand.setText("Hello,");

        lCommand1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        lCommand1.setText("What You Want To Do?");

        btnReservation.setBackground(new java.awt.Color(165, 144, 127));
        btnReservation.setFont(new java.awt.Font("Stencil", 2, 36)); // NOI18N
        btnReservation.setForeground(new java.awt.Color(110, 74, 48));
        btnReservation.setText("Make Reservation");
        btnReservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservationActionPerformed(evt);
            }
        });

        btnTrack.setBackground(new java.awt.Color(165, 144, 127));
        btnTrack.setFont(new java.awt.Font("Stencil", 2, 36)); // NOI18N
        btnTrack.setForeground(new java.awt.Color(110, 74, 48));
        btnTrack.setText("TRACK APPLICATION");
        btnTrack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrackActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(165, 130, 102));
        btnBack.setFont(new java.awt.Font("Stencil", 2, 36)); // NOI18N
        btnBack.setForeground(new java.awt.Color(110, 74, 48));
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnInfo.setBackground(new java.awt.Color(165, 144, 127));
        btnInfo.setFont(new java.awt.Font("Stencil", 2, 36)); // NOI18N
        btnInfo.setForeground(new java.awt.Color(110, 74, 48));
        btnInfo.setText("CHECK AND READ ROOM INFORMATION");
        btnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBack)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnTrack)
                                .addComponent(btnReservation))
                            .addGap(179, 179, 179))
                        .addComponent(btnInfo, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(lCommand, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lCommand1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(213, 213, 213))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lCommand)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lCommand1)
                .addGap(52, 52, 52)
                .addComponent(btnReservation)
                .addGap(18, 18, 18)
                .addComponent(btnInfo)
                .addGap(18, 18, 18)
                .addComponent(btnTrack)
                .addGap(46, 46, 46)
                .addComponent(btnBack)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnReservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservationActionPerformed
        Reservation reservation = new Reservation();
        reservation.passData(holdstr);
        reservation.setVisible(true);

        dispose();
    }//GEN-LAST:event_btnReservationActionPerformed

    private void btnTrackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrackActionPerformed
        // TODO add your handling code here:
        TrackApplication track = new TrackApplication();
        track.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_btnTrackActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        StudentPage stuPage = new StudentPage();       
        stuPage.setVisible(true);

        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoActionPerformed
        // TODO add your handling code here:
        HostelAndRoomInformation information = new HostelAndRoomInformation();
        information.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_btnInfoActionPerformed

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
            java.util.logging.Logger.getLogger(StudentMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                new StudentMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnInfo;
    private javax.swing.JButton btnReservation;
    private javax.swing.JButton btnTrack;
    private javax.swing.JLabel lCommand;
    private javax.swing.JLabel lCommand1;
    // End of variables declaration//GEN-END:variables
}
