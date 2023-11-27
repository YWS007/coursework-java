package studentGUI;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Reservation extends javax.swing.JFrame {

  
    private DefaultTableModel model = new DefaultTableModel();
    private String[] columns = {"NAME", "STUDENT ID", "IC", "EMAIL", "PHONE NUMBER", "ROOM TYPE"};
    private int row;
    private String holdstr;

    public Reservation() {

        initComponents();
        model.setColumnIdentifiers(columns);
    }

    public void passData(String studentID) {
        this.holdstr = studentID;
        tID.setText(holdstr);
    }

    public String getSelectedRoomType() {
        if (radioSingle.isSelected()) {
            return "Single Room";
        } else if (radioTwins.isSelected()) {
            return "Twins Room";
        } else if (radioQuadruple.isSelected()) {
            return "Quadruple Room";
        }
        return "";
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        lMainTitle = new javax.swing.JLabel();
        lStudentName = new javax.swing.JLabel();
        lStudentID = new javax.swing.JLabel();
        lIC = new javax.swing.JLabel();
        lEmail = new javax.swing.JLabel();
        lPhone = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        tName = new javax.swing.JFormattedTextField();
        tID = new javax.swing.JFormattedTextField();
        tIC = new javax.swing.JFormattedTextField();
        tEmail = new javax.swing.JFormattedTextField();
        tPhone = new javax.swing.JFormattedTextField();
        btnEdit = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableReservation = new javax.swing.JTable();
        lRoomType = new javax.swing.JLabel();
        radioSingle = new javax.swing.JRadioButton();
        radioTwins = new javax.swing.JRadioButton();
        radioQuadruple = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lMainTitle.setFont(new java.awt.Font("Algerian", 3, 48)); // NOI18N
        lMainTitle.setForeground(new java.awt.Color(110, 74, 48));
        lMainTitle.setText("RESERVATION");

        lStudentName.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        lStudentName.setText("Student Name : ");

        lStudentID.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        lStudentID.setText("Student ID       : ");

        lIC.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        lIC.setText("IC NO               : ");

        lEmail.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        lEmail.setText("Student Email :");

        lPhone.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        lPhone.setText("Phone NO        :");

        btnAdd.setBackground(new java.awt.Color(165, 144, 127));
        btnAdd.setFont(new java.awt.Font("Stencil", 2, 36)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(110, 74, 48));
        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
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

        tID.setEditable(false);

        btnEdit.setBackground(new java.awt.Color(165, 144, 127));
        btnEdit.setFont(new java.awt.Font("Stencil", 2, 36)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(110, 74, 48));
        btnEdit.setText("EDIT");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnSave.setBackground(new java.awt.Color(165, 144, 127));
        btnSave.setFont(new java.awt.Font("Stencil", 2, 36)); // NOI18N
        btnSave.setForeground(new java.awt.Color(110, 74, 48));
        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        tableReservation.setModel(model);
        tableReservation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tableReservationMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tableReservation);

        lRoomType.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        lRoomType.setText("Room Type      : ");

        buttonGroup2.add(radioSingle);
        radioSingle.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        radioSingle.setText("Single Room");
        radioSingle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioSingleActionPerformed(evt);
            }
        });

        buttonGroup2.add(radioTwins);
        radioTwins.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        radioTwins.setText("Twins Room");

        buttonGroup2.add(radioQuadruple);
        radioQuadruple.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        radioQuadruple.setText("Quadruple Room");
        radioQuadruple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioQuadrupleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSave)
                        .addGap(18, 18, 18)
                        .addComponent(btnBack))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 678, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnEdit))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(lEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lStudentName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lPhone, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lRoomType, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lIC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lStudentID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(tName)
                                        .addComponent(tID)
                                        .addComponent(tIC)
                                        .addComponent(tEmail)
                                        .addComponent(tPhone)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(radioSingle)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(radioTwins, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(radioQuadruple))))))))
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lMainTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(185, 185, 185))
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
                        .addComponent(tName)
                        .addGap(2, 2, 2)))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lStudentID)
                    .addComponent(tID, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tIC)
                    .addComponent(lIC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lEmail)
                    .addComponent(tEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lPhone)
                    .addComponent(tPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lRoomType)
                    .addComponent(radioSingle)
                    .addComponent(radioTwins)
                    .addComponent(radioQuadruple))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdd)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(btnEdit)))
                .addGap(8, 8, 8)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnBack))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void cleartextField() {
        tName.setText(""); //after click add, delete and edit, it will clear the column
        tIC.setText("");
        tEmail.setText("");
        tPhone.setText("");
    }
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

        String name = tName.getText();
        String id = tID.getText();
        String ic = tIC.getText();
        String email = tEmail.getText();
        String phone = tPhone.getText();
        String roomType = getSelectedRoomType();

        if (name.isEmpty() || ic.isEmpty() || email.isEmpty() || phone.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in all fields");
        } else if (!name.matches("[a-zA-Z ]+")) {
            JOptionPane.showMessageDialog(this, "Invalid name");
        } else if (!id.matches("^TP\\d{6}$")) {
            JOptionPane.showMessageDialog(this, "Invalid student ID. Must start with TP and be followed by exactly six digits");
        } else if (!ic.matches("\\d{6}-\\d{2}-\\d{4}")) {
            JOptionPane.showMessageDialog(this, "Invalid IC");
        } else if (!email.matches("[^@]+@[^\\.]+\\..+")) {
            JOptionPane.showMessageDialog(this, "Invalid email address");
        } else if (!phone.matches("\\d{3}-?\\d{7,8}")) {
            JOptionPane.showMessageDialog(this, "Invalid phone number");
        } else {
            String[] record = {name, id, ic, email, phone, roomType};

            model.addRow(record);

            cleartextField();

            try {
                FileWriter writer = new FileWriter("reservationData.txt", true);

                for (String data : record) {
                    writer.write(data + "\n"); 
                }
                writer.write("\n"); // add empty line to separate data for different people
                writer.close();
                
                JOptionPane.showMessageDialog(this, "Data saved successfully!");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Error!");
            }
            
            try {
                FileWriter writer = new FileWriter("pending.txt", true);

                for (String data : record) {
                    writer.write(data + "\n"); 
                }
                writer.write("\n"); // add empty line to separate data for different people
                writer.close();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Error!");
            }
        }


    }//GEN-LAST:event_btnAddActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        StudentMenu menu = new StudentMenu();
        menu.setVisible(true);

        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        String name = tName.getText();
        String id = tID.getText();
        String ic = tIC.getText();
        String email = tEmail.getText();
        String phone = tPhone.getText();
        String roomType = "";
        if (radioSingle.isSelected()) {
            roomType = "Single Room";
        } else if (radioTwins.isSelected()) {
            roomType = "Twins Room";
        } else if (radioQuadruple.isSelected()) {
            roomType = "Quadruple Room";
        }

        if (row >= 0) {
            model.setValueAt(name, row, 0);
            model.setValueAt(id, row, 1);
            model.setValueAt(ic, row, 2);
            model.setValueAt(email, row, 3);
            model.setValueAt(phone, row, 4);
            model.setValueAt(roomType, row, 5);
            cleartextField();
        }
      
        try {
            FileWriter writer = new FileWriter("reservationData.txt");
            FileWriter writer2 = new FileWriter("pending.txt");
            for (int i = 0; i < model.getRowCount(); i++) {
                for (int j = 0; j < model.getColumnCount(); j++) {
                    writer.write(model.getValueAt(i, j).toString() + "\n");
                    writer2.write(model.getValueAt(i, j).toString() + "\n");
                }
                writer.write("\n");
                writer2.write("\n");
            }
            writer.close();
            writer2.close();
            JOptionPane.showMessageDialog(this, "Data updated successfully!");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error!");
        }
        
    }//GEN-LAST:event_btnEditActionPerformed

    private void tableReservationMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableReservationMouseReleased
        // TODO add your handling code here:
        // TODO add your handling code here:
        tName.setText(String.valueOf(model.getValueAt(row, 0)));
        tID.setText(String.valueOf(model.getValueAt(row, 1)));
        tIC.setText(String.valueOf(model.getValueAt(row, 2)));
        tEmail.setText(String.valueOf(model.getValueAt(row, 3)));
        tPhone.setText(String.valueOf(model.getValueAt(row, 4)));
        String roomType = String.valueOf(model.getValueAt(row, 5));
        if (radioSingle.isSelected()) {
            roomType = "Single Room";
        } else if (radioTwins.isSelected()) {
            roomType = "Twins Room";
        } else if (radioQuadruple.isSelected()) {
            roomType = "Quadruple Room";
        }

    }//GEN-LAST:event_tableReservationMouseReleased

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Data saved successfully!");
        StudentMenu menu = new StudentMenu();
        menu.setVisible(true);

        dispose();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void radioSingleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioSingleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioSingleActionPerformed

    private void radioQuadrupleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioQuadrupleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioQuadrupleActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reservation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSave;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lEmail;
    private javax.swing.JLabel lIC;
    private javax.swing.JLabel lMainTitle;
    private javax.swing.JLabel lPhone;
    private javax.swing.JLabel lRoomType;
    private javax.swing.JLabel lStudentID;
    private javax.swing.JLabel lStudentName;
    private javax.swing.JRadioButton radioQuadruple;
    private javax.swing.JRadioButton radioSingle;
    private javax.swing.JRadioButton radioTwins;
    private javax.swing.JFormattedTextField tEmail;
    private javax.swing.JFormattedTextField tIC;
    private javax.swing.JFormattedTextField tID;
    private javax.swing.JFormattedTextField tName;
    private javax.swing.JFormattedTextField tPhone;
    private javax.swing.JTable tableReservation;
    // End of variables declaration//GEN-END:variables

}
