/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projek;

import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ziyad
 */
class prod{
private String ID,Nama,Gaji,Dept_ID;

    public prod(String ID, String Nama, String Gaji, String Dept_ID) {
        this.ID = ID;
        this.Nama = Nama;
        this.Gaji = Gaji;
        this.Dept_ID = Dept_ID;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getGaji() {
        return Gaji;
    }

    public void setGaji(String Gaji) {
        this.Gaji = Gaji;
    }

    public String getDept_ID() {
        return Dept_ID;
    }

    public void setDept_ID(String Dept_ID) {
        this.Dept_ID = Dept_ID;
    }


}
public class Produk extends javax.swing.JFrame {

    /**
     * Creates new form Departemen
     */
    public Produk(mainApp frame) {
        initComponents();
        show_user();
        this.setTitle("Produk");
    }
public ArrayList<prod>userList(){
ArrayList<prod>userList=new ArrayList<>();
try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
            Connection con = Driver.getcon();
            String query1 = "SELECT * FROM Produk";
            
            Statement st = con.createStatement();
            ResultSet res = st.executeQuery(query1);
            prod user;
            while (res.next()) {
                user=new prod(res.getString(1),res.getString(2),res.getString(3),res.getString(4));
                userList.add(user);
                
            }
            return userList;
        } catch(Exception e){
	JOptionPane.showMessageDialog(null, "Ups! Ada yang salah");
            

            System.out.println("");
        }
        return userList;
}
public void show_user(){
ArrayList<prod>list=userList();
DefaultTableModel model=(DefaultTableModel)jTable_karyawan.getModel();
Object[]row=new Object[4];
    for (int i = 0; i < list.size(); i++) {
        row[0]=list.get(i).getID();
        row[1]=list.get(i).getNama();
        row[2]=list.get(i).getGaji();
        row[3]=list.get(i).getDept_ID();
        model.addRow(row);
        
    }
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        Nama = new javax.swing.JTextField();
        BtnUpdate = new javax.swing.JButton();
        ID = new javax.swing.JTextField();
        BtnAdd = new javax.swing.JButton();
        BtnDel = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        back_btn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_karyawan = new javax.swing.JTable();
        Dept_ID = new javax.swing.JTextField();
        Gaji = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(530, 430));
        setPreferredSize(new java.awt.Dimension(530, 430));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Nama");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 217, -1, -1));
        getContentPane().add(Nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 211, 169, -1));

        BtnUpdate.setText("UPDATE");
        BtnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(BtnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 311, -1, -1));

        ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDActionPerformed(evt);
            }
        });
        getContentPane().add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 186, 169, -1));

        BtnAdd.setText("ADD");
        BtnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAddActionPerformed(evt);
            }
        });
        getContentPane().add(BtnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 311, -1, -1));

        BtnDel.setText("DELETE");
        BtnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDelActionPerformed(evt);
            }
        });
        getContentPane().add(BtnDel, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 311, -1, -1));

        jLabel2.setText("Harga");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 239, -1, -1));

        back_btn.setText("Back");
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });
        getContentPane().add(back_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(391, 336, 69, -1));

        jLabel4.setText("Jumlah");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 264, -1, -1));

        jTable_karyawan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nama", "Harga", "Jumlah"
            }
        ));
        jTable_karyawan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_karyawanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_karyawan);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 486, 147));
        getContentPane().add(Dept_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 261, 169, -1));

        Gaji.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GajiActionPerformed(evt);
            }
        });
        getContentPane().add(Gaji, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 236, 169, -1));

        jLabel1.setText("ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 191, 31, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUpdateActionPerformed
        
        try{Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
            Connection con = Driver.getcon();
            String query1 = "update Produk set Nama_Produk=?,Harga_Produk=?,Jumlah_Produk=? where ID_Produk=?";
            PreparedStatement pst=con.prepareStatement(query1);
            pst.setString(1,Nama.getText());
            pst.setString(2,Gaji.getText());
            pst.setString(3,Dept_ID.getText());
            pst.setString(4,ID.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Update berhasil!");
            DefaultTableModel model = (DefaultTableModel) jTable_karyawan.getModel();
model.setRowCount(0);
            show_user();
         }
         catch(Exception e){
	JOptionPane.showMessageDialog(null, "Ups! Ada yang salah");
            

            }/*Karyawan mhsDao = new Karyawan();
        dept mhs = new dept();
        mhs.setID_Departemen(ID.getText());
        mhs.setNama_Departemen(Nama.getText());
        mhs.setNama_Departemen(Gaji.getText());
        mhs.setNomor_Telepon(Dept_ID.getText());
        mhs.setMANAGER_ID_MANAGER(Pengirim_ID.getText());
        try {
            mhsDao.updateMhs(mhs);
            rows = mhsDao.getAllMhs();
            tableModel = new TableModel(rows);
            jTable_karyawan.setModel(tableModel);
        } catch (SQLException ex) {
            Logger.getLogger(mainApp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(mainApp.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }//GEN-LAST:event_BtnUpdateActionPerformed

    private void IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDActionPerformed

    private void BtnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddActionPerformed
         try{Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
            Connection con = Driver.getcon();
            String query1 = "insert into Produk values(?,?,?,?)";
            PreparedStatement pst=con.prepareStatement(query1);
            
            pst.setString(1,ID.getText());
            pst.setString(2,Nama.getText());
            pst.setString(3,Gaji.getText());
            pst.setString(4,Dept_ID.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Insert berhasil!");
            DefaultTableModel model = (DefaultTableModel) jTable_karyawan.getModel();
model.setRowCount(0);
            show_user();
         }
         catch(Exception e){
	JOptionPane.showMessageDialog(null, "Ups! Ada yang salah");
            

            }
            
        /*MhsDao mhsDao = new MhsDao();
        dept mhs = new dept();
        mhs.setID_Departemen(ID.getText());
        mhs.setNama_Departemen(Nama.getText());
        mhs.setNama_Departemen(Gaji.getText());
        mhs.setNomor_Telepon(Dept_ID.getText());
        mhs.setMANAGER_ID_MANAGER(Pengirim_ID.getText());
        try {
            mhsDao.insertMhs(mhs);
            rows = mhsDao.getAllMhs();
            tableModel = new TableModel(rows);
            jTable_karyawan.setModel(tableModel);
        } catch (SQLException ex) {
            Logger.getLogger(mainApp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(mainApp.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }//GEN-LAST:event_BtnAddActionPerformed

    private void BtnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDelActionPerformed
        try{Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
            Connection con = Driver.getcon();
            String query1 = "delete Produk where ID_Produk=?";
            PreparedStatement pst=con.prepareStatement(query1);
            pst.setString(1,ID.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Delete berhasil!");
            DefaultTableModel model = (DefaultTableModel) jTable_karyawan.getModel();
model.setRowCount(0);
            show_user();
         }
         catch(Exception e){
	JOptionPane.showMessageDialog(null, "Ups! Ada yang salah");
            

            }
        /*MhsDao mhsDao = new MhsDao();
        dept mhs = new dept();
        mhs.setID_Departemen(ID.getText());
        mhs.setNama_Departemen(Nama.getText());
        mhs.setNama_Departemen(Gaji.getText());
        mhs.setNomor_Telepon(Dept_ID.getText());
        mhs.setMANAGER_ID_MANAGER(Pengirim_ID.getText());
        try {
            mhsDao.deleteMhs(mhs);
            rows = mhsDao.getAllMhs();
            tableModel = new TableModel(rows);
            jTable_karyawan.setModel(tableModel);
        } catch (SQLException ex) {
            Logger.getLogger(mainApp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(mainApp.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }//GEN-LAST:event_BtnDelActionPerformed
public void showSelectedRow(int row) {
        String[]val=new String[4];
        for (int i = 0; i < val.length; i++) {
        val[i] = jTable_karyawan.getModel().getValueAt(row, i).toString();
        
        
    }
    ID.setText(val[0]);
        Nama.setText(val[1]);
        Gaji.setText(val[2]);
        Dept_ID.setText(val[3]);
    }
    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed
        // TODO add your handling code here:
        mainApp ma=new mainApp();
        ma.setVisible(true);
        dispose();
    }//GEN-LAST:event_back_btnActionPerformed

    private void jTable_karyawanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_karyawanMouseClicked
        int row = jTable_karyawan.getSelectedRow();
        showSelectedRow(row);
    }//GEN-LAST:event_jTable_karyawanMouseClicked

    private void GajiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GajiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GajiActionPerformed

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
            java.util.logging.Logger.getLogger(Produk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Produk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Produk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Produk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAdd;
    private javax.swing.JButton BtnDel;
    private javax.swing.JButton BtnUpdate;
    private javax.swing.JTextField Dept_ID;
    private javax.swing.JTextField Gaji;
    private javax.swing.JTextField ID;
    private javax.swing.JTextField Nama;
    private javax.swing.JButton back_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable_karyawan;
    // End of variables declaration//GEN-END:variables
}
