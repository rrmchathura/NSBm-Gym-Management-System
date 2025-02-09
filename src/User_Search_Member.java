
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;


public class User_Search_Member extends javax.swing.JFrame {
Connection con=null;
ResultSet rs=null;
PreparedStatement pst=null;
    /**
     * Creates new form Search_Member
     */
    public User_Search_Member() {
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

        slblFullname = new javax.swing.JTextField();
        slblMembershipno = new javax.swing.JTextField();
        slblAge = new javax.swing.JTextField();
        slblGender = new javax.swing.JTextField();
        slblCountry = new javax.swing.JTextField();
        slblContact = new javax.swing.JTextField();
        slblWeight = new javax.swing.JTextField();
        slblRegistereddate = new javax.swing.JTextField();
        slblEmail = new javax.swing.JTextField();
        slblStatus = new javax.swing.JTextField();
        slblStartdate = new javax.swing.JTextField();
        slblDuration = new javax.swing.JTextField();
        slblOccupation = new javax.swing.JTextField();
        slblFeesmode = new javax.swing.JTextField();
        slblPhoto = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnDelete1 = new rojerusan.RSButtonHover();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblSearchMember = new rojerusan.RSButtonHover();
        txtFullname = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtMno = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Search Member");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        slblFullname.setEditable(false);
        slblFullname.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        slblFullname.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(slblFullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 210, -1));

        slblMembershipno.setEditable(false);
        slblMembershipno.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        slblMembershipno.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(slblMembershipno, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 210, -1));

        slblAge.setEditable(false);
        slblAge.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        slblAge.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(slblAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 210, -1));

        slblGender.setEditable(false);
        slblGender.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        slblGender.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(slblGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 210, -1));

        slblCountry.setEditable(false);
        slblCountry.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        slblCountry.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(slblCountry, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 210, -1));

        slblContact.setEditable(false);
        slblContact.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        slblContact.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(slblContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 210, -1));

        slblWeight.setEditable(false);
        slblWeight.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        slblWeight.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(slblWeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 210, -1));

        slblRegistereddate.setEditable(false);
        slblRegistereddate.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        slblRegistereddate.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(slblRegistereddate, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 150, 210, -1));

        slblEmail.setEditable(false);
        slblEmail.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        slblEmail.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(slblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 120, 210, -1));

        slblStatus.setEditable(false);
        slblStatus.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        slblStatus.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(slblStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 210, 210, -1));

        slblStartdate.setEditable(false);
        slblStartdate.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        slblStartdate.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(slblStartdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 180, 210, -1));

        slblDuration.setEditable(false);
        slblDuration.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        slblDuration.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(slblDuration, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 300, 210, -1));

        slblOccupation.setEditable(false);
        slblOccupation.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        slblOccupation.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(slblOccupation, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 240, 210, -1));

        slblFeesmode.setEditable(false);
        slblFeesmode.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        slblFeesmode.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(slblFeesmode, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 270, 210, -1));
        getContentPane().add(slblPhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, 120, 110));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Member Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 14), new java.awt.Color(255, 255, 0))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Full Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Gender");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Age");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Contact No");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Country");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, 20));

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Weight");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Membership No");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Email");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 50, -1, 20));

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Registed Date");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 80, -1, -1));

        jLabel12.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Start Date");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, -1, 20));

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Status");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 140, -1, -1));

        jLabel14.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Occupation");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 170, -1, 20));

        jLabel15.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Fees Mode");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 200, -1, -1));

        jLabel16.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Duration");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 230, -1, 20));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Options", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 14), new java.awt.Color(255, 255, 0))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnDelete1.setBackground(new java.awt.Color(255, 102, 102));
        btnDelete1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnDelete1.setText("Clear");
        btnDelete1.setColorHover(new java.awt.Color(255, 0, 153));
        btnDelete1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnDelete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete1ActionPerformed(evt);
            }
        });
        jPanel3.add(btnDelete1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 160, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 270, 380, 90));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1080, 380));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search Member", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 14), new java.awt.Color(255, 255, 0))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Membership No:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, -1, 30));

        lblSearchMember.setBackground(new java.awt.Color(255, 102, 102));
        lblSearchMember.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        lblSearchMember.setText("Search");
        lblSearchMember.setColorHover(new java.awt.Color(0, 153, 51));
        lblSearchMember.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblSearchMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblSearchMemberActionPerformed(evt);
            }
        });
        jPanel2.add(lblSearchMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 20, 150, 30));

        txtFullname.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jPanel2.add(txtFullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 260, 30));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Full Name");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, 30));

        txtMno.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jPanel2.add(txtMno, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, 210, 30));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/TollHome.png"))); // NOI18N
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 10, -1, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 70));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblSearchMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblSearchMemberActionPerformed
        String sql="Select * from members where membership_no="+txtMno.getText()+" and full_name='"+txtFullname.getText()+"'";
				try {
                                    
					con=Connect.connectDb();
					pst=con.prepareStatement(sql);
					rs=pst.executeQuery();
					rs.next();
					{
						slblMembershipno.setText(rs.getString("membership_no"));
						slblFullname.setText(rs.getString("full_name"));
						slblGender.setText(rs.getString("gender"));
						slblCountry.setText(rs.getString("country"));
						slblContact.setText(rs.getString("contact_no"));
						slblOccupation.setText(rs.getString("occupation"));
						slblFeesmode.setText(rs.getString("fees_mode"));
						slblRegistereddate.setText(rs.getString("reg_date"));
						slblEmail.setText(rs.getString("email"));
						slblDuration.setText(rs.getString("duration"));
						slblStartdate.setText(rs.getString("start_date"));
						slblStatus.setText(rs.getString("status"));
						slblWeight.setText(rs.getString("weight"));
						
						SimpleDateFormat format= new SimpleDateFormat("yyyy-MMMMMM-dd");
						String s=format.format(rs.getDate("dob"));
						String arr[]=s.split("-");
						int year=Integer.parseInt(arr[0]);
						Month month=(Month.valueOf(arr[1].toUpperCase()));
						int day=Integer.parseInt(arr[2]);
						
						LocalDate localDate=LocalDate.now();
						LocalDate birthday=LocalDate.of(year, month, day);
						
						Period p=Period.between(birthday, localDate);
						int curAge=p.getYears();
						String curAge1=String.valueOf(curAge);
						slblAge.setText(curAge1);
						
						byte[] imagebytes = rs.getBytes("img");
			        	Image image=getToolkit().createImage(imagebytes);
			        	Image newImage=image.getScaledInstance(slblPhoto.getWidth(), slblPhoto.getHeight(), Image.SCALE_SMOOTH);
				    	ImageIcon icon=new ImageIcon(newImage);
				    	slblPhoto.setIcon(icon);
				    	pst.close();
						rs.close();
						con.close();

						
					}
					
				}catch(Exception ee)
				{
					JOptionPane.showMessageDialog(null, ee);
				}
				finally {
					try {
						pst.close();
						rs.close();
						con.close();
						
					} catch (Exception e2) {
						JOptionPane.showMessageDialog(null, e2);
					}
				}
    }//GEN-LAST:event_lblSearchMemberActionPerformed

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        User_Frame ad= new User_Frame();
        ad.setVisible(true);
        hide();
    }//GEN-LAST:event_jLabel20MouseClicked

    private void btnDelete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete1ActionPerformed
     txtFullname.setText(null);
        txtMno.setText(null);
    }//GEN-LAST:event_btnDelete1ActionPerformed

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
            java.util.logging.Logger.getLogger(Search_Member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Search_Member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Search_Member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Search_Member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Search_Member().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSButtonHover btnDelete1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private rojerusan.RSButtonHover lblSearchMember;
    private javax.swing.JTextField slblAge;
    private javax.swing.JTextField slblContact;
    private javax.swing.JTextField slblCountry;
    private javax.swing.JTextField slblDuration;
    private javax.swing.JTextField slblEmail;
    private javax.swing.JTextField slblFeesmode;
    private javax.swing.JTextField slblFullname;
    private javax.swing.JTextField slblGender;
    private javax.swing.JTextField slblMembershipno;
    private javax.swing.JTextField slblOccupation;
    private javax.swing.JLabel slblPhoto;
    private javax.swing.JTextField slblRegistereddate;
    private javax.swing.JTextField slblStartdate;
    private javax.swing.JTextField slblStatus;
    private javax.swing.JTextField slblWeight;
    private javax.swing.JTextField txtFullname;
    private javax.swing.JTextField txtMno;
    // End of variables declaration//GEN-END:variables
}
