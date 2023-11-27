package studentGUI;

import studentBackend.Authentication;
import javax.swing.JOptionPane;

public class StudentRegister extends javax.swing.JFrame {

    /**
     * Creates new form StudentRegister
     */
    public StudentRegister() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        lMainTitle = new javax.swing.JLabel();
        lStudentID = new javax.swing.JLabel();
        lPassword = new javax.swing.JLabel();
        tstudentID = new javax.swing.JTextField();
        btnRegister = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        tPassword = new javax.swing.JPasswordField();
        lGender = new javax.swing.JLabel();
        radioMale = new javax.swing.JRadioButton();
        radioFemale = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lMainTitle.setFont(new java.awt.Font("Algerian", 3, 48)); // NOI18N
        lMainTitle.setForeground(new java.awt.Color(110, 74, 48));
        lMainTitle.setText("Student Registration");

        lStudentID.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lStudentID.setForeground(new java.awt.Color(165, 100, 36));
        lStudentID.setText("STUDENT ID :");

        lPassword.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lPassword.setForeground(new java.awt.Color(165, 100, 36));
        lPassword.setText("PASSWORD : ");

        tstudentID.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        tstudentID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tstudentIDActionPerformed(evt);
            }
        });

        btnRegister.setBackground(new java.awt.Color(165, 144, 127));
        btnRegister.setFont(new java.awt.Font("Stencil", 2, 36)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(110, 74, 48));
        btnRegister.setText("register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        btnClear.setBackground(new java.awt.Color(165, 144, 127));
        btnClear.setFont(new java.awt.Font("Stencil", 2, 36)); // NOI18N
        btnClear.setForeground(new java.awt.Color(110, 74, 48));
        btnClear.setText("CLEAR");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(165, 144, 127));
        btnBack.setFont(new java.awt.Font("Stencil", 2, 36)); // NOI18N
        btnBack.setForeground(new java.awt.Color(110, 74, 48));
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lGender.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lGender.setForeground(new java.awt.Color(165, 100, 36));
        lGender.setText("GENDER : ");

        buttonGroup1.add(radioMale);
        radioMale.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        radioMale.setText("MALE");

        buttonGroup1.add(radioFemale);
        radioFemale.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        radioFemale.setText("FEMALE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(101, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lMainTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lPassword)
                            .addComponent(lGender))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tPassword)
                                .addComponent(tstudentID, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radioMale, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radioFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(164, 164, 164))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnRegister)
                        .addGap(18, 18, 18)
                        .addComponent(btnClear)
                        .addGap(18, 18, 18)
                        .addComponent(btnBack)
                        .addGap(116, 116, 116))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lMainTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tstudentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lStudentID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lGender)
                    .addComponent(radioMale)
                    .addComponent(radioFemale))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegister)
                    .addComponent(btnClear)
                    .addComponent(btnBack))
                .addGap(83, 83, 83))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed

        Authentication auth = new Authentication();

        String studentIDText = tstudentID.getText();
        String passwordText = tPassword.getText();

// Check if either field is empty or gender is not selected
        if (studentIDText.isEmpty() || passwordText.isEmpty() || (!radioMale.isSelected() && !radioFemale.isSelected())) {
            JOptionPane.showMessageDialog(this, "Please enter both student ID and password and also select your gender.", "Error Box", JOptionPane.ERROR_MESSAGE);
            return; // exit the method without attempting registration
        }

        String gender = "";
        if (radioMale.isSelected()) {
            gender = "Male";
        } else if (radioFemale.isSelected()) {
            gender = "Female";
        }

// Check if the studentID is not valid
        if (!studentIDText.startsWith("TP") || studentIDText.length() != 8) {
            JOptionPane.showMessageDialog(this, "Invalid student ID. Student ID should start with 'TP' and have 6 digits.", "Error Box", JOptionPane.ERROR_MESSAGE);
            return; // exit the method without attempting registration
        }

        int response = auth.registration(studentIDText, passwordText, gender, false);

        if (response == 0) {  //no error
            JOptionPane.showMessageDialog(this, "Register Successful", "Information Box", JOptionPane.INFORMATION_MESSAGE);

            StudentPage stuPage = new StudentPage();
            stuPage.setVisible(true);

            dispose();
        } else if (response == 1) {
            JOptionPane.showMessageDialog(this, "Username has already existed", "Error Box", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Registration failed", "Error Box", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        tstudentID.setText("");
        tPassword.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        StudentPage stupage = new StudentPage();
        stupage.setVisible(true);

        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void tstudentIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tstudentIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tstudentIDActionPerformed

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
            java.util.logging.Logger.getLogger(StudentRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new StudentRegister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnRegister;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel lGender;
    private javax.swing.JLabel lMainTitle;
    private javax.swing.JLabel lPassword;
    private javax.swing.JLabel lStudentID;
    public javax.swing.JRadioButton radioFemale;
    public javax.swing.JRadioButton radioMale;
    private javax.swing.JPasswordField tPassword;
    private javax.swing.JTextField tstudentID;
    // End of variables declaration//GEN-END:variables

}
