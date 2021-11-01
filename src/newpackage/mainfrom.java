
package newpackage;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class mainfrom extends javax.swing.JFrame {
private Bangsinhvien mStudentPanel;
private Bangdiem mGPA;
   
    public mainfrom() {
        initComponents();
        setLocationRelativeTo(null);
        
      
       
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        tbrLogout = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        quanly = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        jButton3 = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        tbrAboutUs = new javax.swing.JButton();
        tplMainsinhvien1 = new javax.swing.JTabbedPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuFileexit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuManageStudent = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        menuManageDiem = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        menuAbou = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jToolBar1.setRollover(true);

        tbrLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly_app/icon/Log out.png"))); // NOI18N
        tbrLogout.setText("Đăng xuất");
        tbrLogout.setFocusable(false);
        tbrLogout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tbrLogout.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tbrLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbrLogoutActionPerformed(evt);
            }
        });
        jToolBar1.add(tbrLogout);
        jToolBar1.add(jSeparator4);

        quanly.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly_app/icon/User group.png"))); // NOI18N
        quanly.setText("Quản lý sinh viên");
        quanly.setFocusable(false);
        quanly.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        quanly.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        quanly.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quanlyActionPerformed(evt);
            }
        });
        jToolBar1.add(quanly);
        jToolBar1.add(jSeparator5);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly_app/icon/Calculator.png"))); // NOI18N
        jButton3.setText("Quản lý điểm");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton3);
        jToolBar1.add(jSeparator6);

        tbrAboutUs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly_app/icon/Problem.png"))); // NOI18N
        tbrAboutUs.setText("Giới thiệu");
        tbrAboutUs.setFocusable(false);
        tbrAboutUs.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tbrAboutUs.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tbrAboutUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbrAboutUsActionPerformed(evt);
            }
        });
        jToolBar1.add(tbrAboutUs);

        jMenu1.setText("Hệ thống");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly_app/icon/Log out.png"))); // NOI18N
        jMenuItem1.setText("Đăng xuất");
        jMenu1.add(jMenuItem1);
        jMenu1.add(jSeparator1);

        menuFileexit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        menuFileexit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly_app/icon/Delete.png"))); // NOI18N
        menuFileexit.setText("Thoát");
        menuFileexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFileexitActionPerformed(evt);
            }
        });
        jMenu1.add(menuFileexit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Quản lý");

        menuManageStudent.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        menuManageStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly_app/icon/Boy.png"))); // NOI18N
        menuManageStudent.setText("Quản lý sinh viên");
        menuManageStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuManageStudentActionPerformed(evt);
            }
        });
        jMenu2.add(menuManageStudent);
        jMenu2.add(jSeparator2);

        menuManageDiem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        menuManageDiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly_app/icon/Diagram.png"))); // NOI18N
        menuManageDiem.setText("Quản lý điểm");
        menuManageDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuManageDiemActionPerformed(evt);
            }
        });
        jMenu2.add(menuManageDiem);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Trợ Giúp");

        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly_app/icon/Notes.png"))); // NOI18N
        jMenuItem7.setText("Nội dung");
        jMenu3.add(jMenuItem7);
        jMenu3.add(jSeparator3);

        menuAbou.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly_app/icon/List.png"))); // NOI18N
        menuAbou.setText("Giới thiệu");
        menuAbou.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAbouActionPerformed(evt);
            }
        });
        jMenu3.add(menuAbou);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 981, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tplMainsinhvien1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tplMainsinhvien1, javax.swing.GroupLayout.DEFAULT_SIZE, 696, Short.MAX_VALUE)
                .addGap(8, 8, 8))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuFileexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFileexitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuFileexitActionPerformed

    private void menuManageDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuManageDiemActionPerformed
        if (mGPA == null) {
        mGPA = new Bangdiem();
        ImageIcon icon = new ImageIcon(getClass()
        .getResource("/poly_app/icon/Bell.png"));
        tplMainsinhvien1.addTab
        ("Quản lý điểm",icon,mGPA,"Quản lý điểm");
        } 
        tplMainsinhvien1.setSelectedComponent(mGPA);
    }//GEN-LAST:event_menuManageDiemActionPerformed

    private void menuAbouActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAbouActionPerformed
        tbrAboutUsActionPerformed(evt);
    }//GEN-LAST:event_menuAbouActionPerformed

    private void menuManageStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuManageStudentActionPerformed
        if (mStudentPanel == null) {
        mStudentPanel = new Bangsinhvien();
        ImageIcon icon = new ImageIcon(getClass()
        .getResource("/poly_app/icon/Fax.png"));
        tplMainsinhvien1.addTab
        ("Quản lý sinh viên",icon,mStudentPanel,"Quản lý sinh viên");
        }
        tplMainsinhvien1.setSelectedComponent(mStudentPanel);
    }//GEN-LAST:event_menuManageStudentActionPerformed

    private void tbrAboutUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbrAboutUsActionPerformed
        GioiThieu abou = new GioiThieu(this, true);
        
       abou.setVisible(true);
    }//GEN-LAST:event_tbrAboutUsActionPerformed

    private void quanlyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quanlyActionPerformed
        menuManageStudentActionPerformed(evt);
    }//GEN-LAST:event_quanlyActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        menuManageDiemActionPerformed(evt);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tbrLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbrLogoutActionPerformed
        Login login = new Login(this, true);
        
        login.setVisible(true);
    }//GEN-LAST:event_tbrLogoutActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
         Login dialog = new Login(this, true);
        dialog.setVisible(true);
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(mainfrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainfrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainfrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainfrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainfrom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuItem menuAbou;
    private javax.swing.JMenuItem menuFileexit;
    private javax.swing.JMenuItem menuManageDiem;
    private javax.swing.JMenuItem menuManageStudent;
    private javax.swing.JButton quanly;
    private javax.swing.JButton tbrAboutUs;
    private javax.swing.JButton tbrLogout;
    private javax.swing.JTabbedPane tplMainsinhvien1;
    // End of variables declaration//GEN-END:variables
}
