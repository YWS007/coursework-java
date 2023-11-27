
package adminGUI;

import adminClass.Hostel;
import adminClass.Permission;
import adminClass.Room;
import adminClass.WriteAndReadFile;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CheckRoomAvailability extends javax.swing.JFrame {

    private DefaultTableModel model = new DefaultTableModel();
    private DefaultTableModel model2 = new DefaultTableModel();
    private String[] columns = {"Hostel ID","Hostel Name","Capacity"};
    private String[] columns2 = {"Room ID","Rental(RM)","Type","Capacity"};
    private int row, row2;
    
    
    public CheckRoomAvailability() {
        initComponents();
        
        model.setColumnIdentifiers(columns);  //set the column name
        model2.setColumnIdentifiers(columns2);  //set the column name
        
        final int WINDOW_WIDTH = 860;
        final int WINDOW_HEIGHT = 650;
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
        bview = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        tHostelID = new javax.swing.JTextField();
        bSearch1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        bSearch2 = new javax.swing.JButton();
        tRoomID = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mBack = new javax.swing.JMenuItem();
        mLogout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Check Room Availability");

        bview.setText("view");
        bview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bviewActionPerformed(evt);
            }
        });

        jTable1.setModel(model);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable1MouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        bSearch1.setText("Search");
        bSearch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSearch1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Hostel ID");

        jTable2.setModel(model2);
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable2MouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jLabel3.setText("Room ID");

        bSearch2.setText("Search");
        bSearch2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSearch2ActionPerformed(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(264, 264, 264)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bview, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 778, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tHostelID, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(bSearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tRoomID, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(bSearch2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bview)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tHostelID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bSearch1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(bSearch2)
                    .addComponent(tRoomID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bviewActionPerformed
        Hostel h = new Hostel();    //create object
        h.ReadFromFile("Hostel.txt");   //read file
        
        // Clear existing rows from the jTable
        model.setRowCount(0);
    
        //display information in Jtable
        for(int i=0; i<h.hostelInfo.size(); i+=3){
            Object[] record = {h.hostelInfo.get(i),h.hostelInfo.get(i+1), h.hostelInfo.get(i+2)};
            model.addRow(record);   //in the string array
        }
    }//GEN-LAST:event_bviewActionPerformed

    private void jTable1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseReleased
        row = jTable1.getSelectedRow(); 
        // select the row automatically fill up
        tHostelID.setText(String.valueOf(model.getValueAt(row,0)));
    }//GEN-LAST:event_jTable1MouseReleased

    private void jTable2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseReleased
        row2 = jTable2.getSelectedRow(); 
        // select the row automatically fill up
        tRoomID.setText(String.valueOf(model2.getValueAt(row2,0)));
    }//GEN-LAST:event_jTable2MouseReleased

    private void bSearch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSearch1ActionPerformed
        // Clear existing rows from the jTable
        model2.setRowCount(0);
        
        Hostel h = new Hostel();    //create hostel object
        Room r = new Room();    //create room object
        r.ReadFromFile("room.txt");
        h.ReadFromFile("hostel.txt");
        
        //check hostel ID
        if(!h.checkHostel(tHostelID.getText())){
            JOptionPane.showMessageDialog(this, "Hostel ID not found.");
            return;
        }
        //add data to jtable
        for (int i = 0; i < r.roomInfo.size(); i += 5) {
            if (r.roomInfo.get(i + 4).equals(tHostelID.getText())) {
                double value = Double.parseDouble(r.roomInfo.get(i + 1).toString());
                String formattedValue = String.format("%.2f", value);
                Object[] record = { r.roomInfo.get(i), formattedValue, r.roomInfo.get(i + 2), r.roomInfo.get(i + 3) };
                model2.addRow(record); //add data to Jtable
            }
        }
    }//GEN-LAST:event_bSearch1ActionPerformed

    private void bSearch2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSearch2ActionPerformed
        Room r = new Room();
        r.ReadFromFile("room.txt");
        List<Object> availableRoom = new ArrayList<>();
        WriteAndReadFile data = new WriteAndReadFile("roomAvailability.txt");
        data.read(availableRoom); 

        Permission p = new Permission();
        p.checkCapacity();
        p.checkAvailability(tRoomID.getText(), availableRoom);
        
        if(p.isAvailable()){
            JOptionPane.showMessageDialog(this, "Room available!");
        }else{
            JOptionPane.showMessageDialog(this, "Room not available!");
        }
    }//GEN-LAST:event_bSearch2ActionPerformed

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
            java.util.logging.Logger.getLogger(CheckRoomAvailability.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckRoomAvailability.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckRoomAvailability.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckRoomAvailability.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckRoomAvailability().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bSearch1;
    private javax.swing.JButton bSearch2;
    private javax.swing.JButton bview;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JMenuItem mBack;
    private javax.swing.JMenuItem mLogout;
    private javax.swing.JTextField tHostelID;
    private javax.swing.JTextField tRoomID;
    // End of variables declaration//GEN-END:variables
}
