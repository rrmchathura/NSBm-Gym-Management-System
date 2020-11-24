
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chathura
 */
public class User_Add_Fees extends javax.swing.JFrame {
         Connection con=null;
	 ResultSet rs=null;
	 PreparedStatement pst=null;

   
    public User_Add_Fees() {
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
        jLabel2 = new javax.swing.JLabel();
        lblFullName = new javax.swing.JLabel();
        lblEndDate = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtFull_Name = new javax.swing.JTextField();
        e_Date = new com.toedter.calendar.JDateChooser();
        reg_Date = new com.toedter.calendar.JDateChooser();
        s_Date = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        lblMemberStatus = new javax.swing.JLabel();
        lblTotalFee = new javax.swing.JLabel();
        txtpaid = new javax.swing.JTextField();
        comboBox = new javax.swing.JComboBox<>();
        lblPaidFee = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        btnNew2 = new rojerusan.RSButtonHover();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtmNo = new javax.swing.JTextField();
        btnSearch = new rojerusan.RSButtonHover();
        jLabel20 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add Fees");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "new game", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(153, 255, 0)), "Member Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 14), new java.awt.Color(255, 255, 0))); // NOI18N
        jPanel1.setToolTipText("");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Reg.Date");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        lblFullName.setBackground(new java.awt.Color(255, 255, 255));
        lblFullName.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblFullName.setForeground(new java.awt.Color(255, 255, 255));
        lblFullName.setText("Full Name");
        jPanel1.add(lblFullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        lblEndDate.setBackground(new java.awt.Color(255, 255, 255));
        lblEndDate.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblEndDate.setForeground(new java.awt.Color(255, 255, 255));
        lblEndDate.setText("End Date");
        jPanel1.add(lblEndDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Start Date");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        txtFull_Name.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        txtFull_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFull_NameActionPerformed(evt);
            }
        });
        jPanel1.add(txtFull_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 240, -1));

        e_Date.setDateFormatString("yyyy-MM-dd");
        jPanel1.add(e_Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 240, 30));

        reg_Date.setDateFormatString("yyyy-MM-dd");
        jPanel1.add(reg_Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 240, 30));

        s_Date.setDateFormatString("yyyy-MM-dd");
        jPanel1.add(s_Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 240, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 360, 260));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "new game", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(153, 255, 0)), "Member Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 14), new java.awt.Color(255, 255, 0))); // NOI18N
        jPanel2.setToolTipText("");
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMemberStatus.setBackground(new java.awt.Color(255, 255, 255));
        lblMemberStatus.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblMemberStatus.setForeground(new java.awt.Color(255, 255, 255));
        lblMemberStatus.setText("Member Ststus");
        jPanel2.add(lblMemberStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        lblTotalFee.setBackground(new java.awt.Color(255, 255, 255));
        lblTotalFee.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblTotalFee.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalFee.setText("Total Fee");
        jPanel2.add(lblTotalFee, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        txtpaid.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        txtpaid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpaidActionPerformed(evt);
            }
        });
        jPanel2.add(txtpaid, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 190, -1));

        comboBox.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Registerd", "UnRegisterd" }));
        jPanel2.add(comboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 190, -1));

        lblPaidFee.setBackground(new java.awt.Color(255, 255, 255));
        lblPaidFee.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblPaidFee.setForeground(new java.awt.Color(255, 255, 255));
        lblPaidFee.setText("Paid Fee");
        jPanel2.add(lblPaidFee, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, 20));

        txtTotal.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });
        jPanel2.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 190, -1));

        jPanel9.setBackground(new java.awt.Color(0, 0, 0));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "clear", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 14), new java.awt.Color(255, 255, 0))); // NOI18N
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnNew2.setBackground(new java.awt.Color(102, 102, 255));
        btnNew2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnNew2.setText("Clear");
        btnNew2.setColorHover(new java.awt.Color(255, 0, 153));
        btnNew2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnNew2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNew2ActionPerformed(evt);
            }
        });
        jPanel9.add(btnNew2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 190, -1));

        jPanel2.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, 210, 100));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 600, 260));

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Please Search Your ID", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 14), new java.awt.Color(255, 255, 0))); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Membership No");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 150, 30));

        txtmNo.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jPanel5.add(txtmNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 170, 30));

        btnSearch.setBackground(new java.awt.Color(255, 0, 0));
        btnSearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnSearch.setText("Search");
        btnSearch.setColorHover(new java.awt.Color(255, 0, 153));
        btnSearch.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        jPanel5.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, 160, 30));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/TollHome.png"))); // NOI18N
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 10, 50, 50));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 70));

        jPanel6.setBackground(new java.awt.Color(0, 153, 153));

        jPanel7.setBackground(new java.awt.Color(0, 153, 153));
        jPanel6.add(jPanel7);

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 10, 260));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtFull_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFull_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFull_NameActionPerformed

    private void txtpaidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpaidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpaidActionPerformed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        try {
		
					con=Connect.connectDb();
					String sql="Select full_name,reg_date,start_date,end_date,paid_fee from members where membership_no="+txtmNo.getText()+"";
					pst=con.prepareStatement(sql);
					rs=pst.executeQuery();
					rs.next();
					{
						txtFull_Name.setText(rs.getString("full_name"));
						txtFull_Name.setEnabled(false);
						
						reg_Date.setDate(rs.getDate("reg_date"));
						reg_Date.setEnabled(false);
						//reg_Date
						s_Date.setDate(rs.getDate("start_date"));
						s_Date.setEnabled(false);
						//double a=(rs.getDouble("paid_fee"));
						e_Date.setDate(rs.getDate("end_date"));
						e_Date.setEnabled(false);
                                                txtTotal.setText(rs.getString("paid_fee"));
                                                txtTotal.setEnabled(false);
                                                
                                                
                                                
						txtTotal.setText("2000");
                                                txtTotal.setEnabled(false);
						
						//String b=String.valueOf(a);
						txtpaid.setText("500");
                                                
                                                txtpaid.setEnabled(false);
                                                
						
						
									
					}
					
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, e1);
				}
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnNew2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNew2ActionPerformed
        txtmNo.setText(null);
        txtFull_Name.setText(null);
        reg_Date.setDate(null);
        s_Date.setDate(null);
        e_Date.setDate(null);
        txtTotal.setText(null);        
        txtpaid .setText(null);
        
    }//GEN-LAST:event_btnNew2ActionPerformed

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        User_Frame ad= new User_Frame();
        ad.setVisible(true);
        hide();
    }//GEN-LAST:event_jLabel20MouseClicked

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
            //here you can put the selected theme class name in JTattoo
            UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
 
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Add_Fees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_Fees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_Fees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_Fees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_Fees().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSButtonHover btnNew2;
    private rojerusan.RSButtonHover btnSearch;
    private javax.swing.JComboBox<String> comboBox;
    private com.toedter.calendar.JDateChooser e_Date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lblEndDate;
    private javax.swing.JLabel lblFullName;
    private javax.swing.JLabel lblMemberStatus;
    private javax.swing.JLabel lblPaidFee;
    private javax.swing.JLabel lblTotalFee;
    private com.toedter.calendar.JDateChooser reg_Date;
    private com.toedter.calendar.JDateChooser s_Date;
    private javax.swing.JTextField txtFull_Name;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtmNo;
    private javax.swing.JTextField txtpaid;
    // End of variables declaration//GEN-END:variables
}
