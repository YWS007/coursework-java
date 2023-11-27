
package adminGUI;

import adminClass.Room;
import adminClass.Hostel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class RoomFunction extends javax.swing.JFrame {

    private DefaultTableModel model = new DefaultTableModel();
    private String[] columns = {"Room ID","Rental(RM)","Room Type","Capacity"};
    private int row;
    
    public RoomFunction() {
        final int WINDOW_WIDTH = 860;
        final int WINDOW_HEIGHT = 650;
        
        model.setColumnIdentifiers(columns);  //set the column name
        initComponents();
        
        setTitle("APU HOSTEL");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        bView = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tID = new javax.swing.JTextField();
        tRoomID = new javax.swing.JTextField();
        tType = new javax.swing.JTextField();
        tCapacity = new javax.swing.JTextField();
        tRental = new javax.swing.JTextField();
        tHostelID = new javax.swing.JTextField();
        bAdd = new javax.swing.JButton();
        bUpdate = new javax.swing.JButton();
        bDelete = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mBack = new javax.swing.JMenuItem();
        mLogout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Room Management");

        bView.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bView.setText("View");
        bView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bViewActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable1.setModel(model);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable1MouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Room ID");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Room Type");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Room Capacity");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Rental");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Hostel ID");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Hostel ID : ");

        tID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        tRoomID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        tType.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        tCapacity.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        tRental.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        tHostelID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        bAdd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bAdd.setText("Add");
        bAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAddActionPerformed(evt);
            }
        });

        bUpdate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bUpdate.setText("Update");
        bUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUpdateActionPerformed(evt);
            }
        });

        bDelete.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bDelete.setText("Delete");
        bDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDeleteActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        mBack.setText("Back");
        mBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBackActionPerformed(evt);
            }
        });
        jMenu1.add(mBack);

        mLogout.setText("Logout");
        mLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mLogoutActionPerformed(evt);
            }
        });
        jMenu1.add(mLogout);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tID, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bView, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 731, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(67, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(281, 281, 281))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(tHostelID))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(tRental, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(tRoomID, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(tType, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tCapacity, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(182, 182, 182))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bView)
                    .addComponent(jLabel7)
                    .addComponent(tID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tRoomID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tCapacity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(tRental, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(bAdd)
                        .addGap(36, 36, 36)
                        .addComponent(bUpdate)
                        .addGap(27, 27, 27)
                        .addComponent(bDelete)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tHostelID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(59, 59, 59))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAddActionPerformed
        //get input data
        String rn = tRoomID.getText();
        String type = tType.getText();
        String cap = tCapacity.getText();    
        String ren = tRental.getText();
        String hostelID = tHostelID.getText();
         
        // Check if any required fields are blank using the checkBlank() method
        if(!checkBlank()){
            // Check if the capacity format is valid using the checkFormatCapacity() method
            if(!checkFormatCapacity(cap)){
                int capacity = Integer.parseInt(cap);
                // Check if the rental format is valid
                if(!checkFormatRental(ren)){
                    double rental = Double.parseDouble(ren);
                    Room room = new Room(); //create object
                    room.ReadFromFile("room.txt");  //read data
                    boolean check = true;
                    check = room.checkRoom(rn); //check room using checkRoom() method
                    //if room number exists
                    if(check){
                        JOptionPane.showMessageDialog(this, "Room Number already exists. Please enter again.");
                    }else{
                        room.setRoomNumber(rn);
                        room.setRental(rental);
                        room.setType(type);
                        room.setCapacity(capacity);
                        room.setHostelID(hostelID);
                        room.add(); //add those data
                        room.WriteToFile("room.txt");   //wriet to file
                        Object[] record = {rn, String.format("%.2f", rental), type, capacity};
                        model.addRow(record);   //in the string array
                        JOptionPane.showMessageDialog(this, "Add Successful!");
                    } 
                }
            }   
        }
        cleartextField(); //clear text
    }//GEN-LAST:event_bAddActionPerformed
    //clear the data in the text after add
    public void cleartextField(){
            tRoomID.setText("");    
            tRental.setText("");
            tCapacity.setText("");
            tType.setText("");
    }
    
    //makesure all fields are not empty
    public boolean checkBlank(){
        if(tRoomID.getText().isEmpty() || tRental.getText().isEmpty() || tCapacity.getText().isEmpty()|| tType.getText().isEmpty()|| tHostelID.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Fields cannot be blanked.");
            return true;
        }else{
            return false;
        }
    }
    
    //check capacity format
    public boolean checkFormatCapacity(String cap){
        try {
            int capacity = Integer.parseInt(cap);
            return false; // Capacity is valid
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid capacity. Please enter a valid number.");
            return true; // Capacity is invalid
        }
    }
    
    //check rental format
    public boolean checkFormatRental(String ren){
        try {
            double rental = Double.parseDouble(ren);
            return false; // rental is valid
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid rental. Please enter a valid number.");
            return true; // rental is invalid
        }
    }

    private void bViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bViewActionPerformed
        //makesure tID is not empty
        if(tID.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Hostel ID cannot be blanked.");
            return;
        }
        // Clear existing rows from the jTable
        model.setRowCount(0);
        
        Hostel h = new Hostel();    //create hostel object
        Room r = new Room();    //create room object
        r.ReadFromFile("room.txt");
        h.ReadFromFile("hostel.txt");
        
        //check hostel ID
        if(!h.checkHostel(tID.getText())){
            JOptionPane.showMessageDialog(this, "Hostel ID not found.");
            return;
        }
        //add data to jtable
        for (int i = 0; i < r.roomInfo.size(); i += 5) {
            if (r.roomInfo.get(i + 4).equals(tID.getText())) {
                double value = Double.parseDouble(r.roomInfo.get(i + 1).toString());
                String formattedValue = String.format("%.2f", value);
                Object[] record = { r.roomInfo.get(i), formattedValue, r.roomInfo.get(i + 2), r.roomInfo.get(i + 3) };
                model.addRow(record); //add data to Jtable
            }
        }
        
        tHostelID.setText(tID.getText());

    }//GEN-LAST:event_bViewActionPerformed

    private void bUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUpdateActionPerformed
        String rn = tRoomID.getText();
        String type = tType.getText();
        String cap = tCapacity.getText();    
        String ren = tRental.getText();
        String hostelID = tHostelID.getText();
        
        // Check if any required fields are blank using the checkBlank() method
        if(!checkBlank()){
            // Check if the capacity format is valid using the checkFormatCapacity() method
            if(!checkFormatCapacity(cap)){
                int capacity = Integer.parseInt(cap);
                if(!checkFormatRental(ren)){
                    double rental = Double.parseDouble(ren);
                    Room room = new Room(); //craete object
                    room.ReadFromFile("room.txt");  //raed file

                    room.search(rn);
                    room.setRoomNumber(rn);
                    room.setRental(rental);
                    room.setType(type);
                    room.setCapacity(capacity);
                    room.setHostelID(hostelID);
                    room.update();    //call update method  
                    room.WriteToFile("room.txt");   //write data to file
                    Object[] record = {rn, String.format("%.2f", rental), type, capacity};
                    model.removeRow(row);   //remove the row you want to edit
                    model.addRow(record);   //in the string array
                    JOptionPane.showMessageDialog(this, "Update successful!");
                }
            }
        }
        cleartextField(); //clear text
    }//GEN-LAST:event_bUpdateActionPerformed

    private void jTable1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseReleased
        row = jTable1.getSelectedRow(); 
        // select the row automatically fill up
        tRoomID.setText(String.valueOf(model.getValueAt(row,0)));
        tRental.setText(String.valueOf(model.getValueAt(row,1)));
        tType.setText(String.valueOf(model.getValueAt(row,2)));
        tCapacity.setText(String.valueOf(model.getValueAt(row,3)));
    }//GEN-LAST:event_jTable1MouseReleased

    private void bDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDeleteActionPerformed
        // Check if any required fields are blank using the checkBlank() method
        if (!checkBlank()){
            Room room = new Room(); //create object
            room.ReadFromFile("room.txt");  //raed file

            room.search(tRoomID.getText()); //call searche method
            room.delete();  //use delete() method to delete
            room.WriteToFile("room.txt");
            JOptionPane.showMessageDialog(this, "Delete successful!");
            model.removeRow(row);   //remove the row you want to delete
        }
        cleartextField();
    }//GEN-LAST:event_bDeleteActionPerformed

    private void mBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mBackActionPerformed
        AdminInterface adminInterface = new AdminInterface();
        adminInterface.setVisible(true);
        dispose();
    }//GEN-LAST:event_mBackActionPerformed

    private void mLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mLogoutActionPerformed
        AdminLoginPage admin = new AdminLoginPage();
        admin.setVisible(true);
        dispose();
    }//GEN-LAST:event_mLogoutActionPerformed

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
            java.util.logging.Logger.getLogger(RoomFunction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RoomFunction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RoomFunction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RoomFunction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RoomFunction().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAdd;
    private javax.swing.JButton bDelete;
    private javax.swing.JButton bUpdate;
    private javax.swing.JButton bView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JMenuItem mBack;
    private javax.swing.JMenuItem mLogout;
    private javax.swing.JTextField tCapacity;
    private javax.swing.JTextField tHostelID;
    private javax.swing.JTextField tID;
    private javax.swing.JTextField tRental;
    private javax.swing.JTextField tRoomID;
    private javax.swing.JTextField tType;
    // End of variables declaration//GEN-END:variables
}
