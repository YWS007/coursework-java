package studentGUI;

/**
 *
 * @author acer
 */
public class FormatInputData extends javax.swing.JFrame {

    /**
     * Creates new form FormatInputData
     */
    public FormatInputData() {
        initComponents();
        tStudentName.setEditable(false);
        tStudentID.setEditable(false);
        tIC.setEditable(false);
        tEmail.setEditable(false);
        tPhone.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lIC = new javax.swing.JLabel();
        lEmail = new javax.swing.JLabel();
        tStudentName = new javax.swing.JFormattedTextField();
        tStudentID = new javax.swing.JFormattedTextField();
        tIC = new javax.swing.JFormattedTextField();
        tEmail = new javax.swing.JFormattedTextField();
        lMainTitle = new javax.swing.JLabel();
        lStudentName = new javax.swing.JLabel();
        tPhone = new javax.swing.JFormattedTextField();
        lPhone = new javax.swing.JLabel();
        lStudentID = new javax.swing.JLabel();
        btnClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lIC.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        lIC.setText("IC NO : ");

        lEmail.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        lEmail.setText("Student Email :");

        tStudentName.setText("Tan Li June");
        tStudentName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tStudentNameActionPerformed(evt);
            }
        });

        tStudentID.setText("TPXXXXXX");

        tIC.setText("XXXXXX-XX-XXXX");
        tIC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tICActionPerformed(evt);
            }
        });

        tEmail.setText("lijune123@gmail.com");

        lMainTitle.setFont(new java.awt.Font("Algerian", 3, 48)); // NOI18N
        lMainTitle.setForeground(new java.awt.Color(110, 74, 48));
        lMainTitle.setText("FORMAT INPUT DATA");

        lStudentName.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        lStudentName.setText("Student Name : ");

        tPhone.setText("XXX-XXXXXXX / XXX-XXXXXXXX");

        lPhone.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        lPhone.setText("Phone NO :");

        lStudentID.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        lStudentID.setText("Student ID : ");

        btnClose.setBackground(new java.awt.Color(165, 144, 127));
        btnClose.setFont(new java.awt.Font("Stencil", 2, 36)); // NOI18N
        btnClose.setForeground(new java.awt.Color(110, 74, 48));
        btnClose.setText("CLOSE");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(126, Short.MAX_VALUE)
                .addComponent(lMainTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99))
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnClose)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lStudentName)
                            .addComponent(lStudentID)
                            .addComponent(lIC)
                            .addComponent(lPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tStudentName)
                            .addComponent(tStudentID)
                            .addComponent(tIC)
                            .addComponent(tEmail)
                            .addComponent(tPhone, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lMainTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lStudentName)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tStudentName)
                        .addGap(2, 2, 2)))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lStudentID)
                    .addComponent(tStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tIC)
                    .addComponent(lIC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lEmail)
                    .addComponent(tEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lPhone)
                    .addComponent(tPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnClose)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tStudentNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tStudentNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tStudentNameActionPerformed

    private void tICActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tICActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tICActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        Reservation reservation = new Reservation();
        reservation.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

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
            java.util.logging.Logger.getLogger(FormatInputData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormatInputData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormatInputData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormatInputData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormatInputData().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JLabel lEmail;
    private javax.swing.JLabel lIC;
    private javax.swing.JLabel lMainTitle;
    private javax.swing.JLabel lPhone;
    private javax.swing.JLabel lStudentID;
    private javax.swing.JLabel lStudentName;
    private javax.swing.JFormattedTextField tEmail;
    private javax.swing.JFormattedTextField tIC;
    private javax.swing.JFormattedTextField tPhone;
    private javax.swing.JFormattedTextField tStudentID;
    private javax.swing.JFormattedTextField tStudentName;
    // End of variables declaration//GEN-END:variables
}
