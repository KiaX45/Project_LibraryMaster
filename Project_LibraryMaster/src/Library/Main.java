
package Library;

import java.awt.event.ActionEvent;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JMenuItem;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;


public class Main extends javax.swing.JFrame {
//------------------------------------------------------------------------------
    private Data data;
    public Main() {
        initComponents();
        data = new Data();
        data.loadUsers();
       // data.loadMagazines();
    //    data.loadBooks();
    }
//------------------------------------------------------------------------------
    public JDesktopPane getDpi_main() {
        return dpi_main;
    } 

    public JMenuItem getjMenuItemAdd() {
        return jMenuItemAdd;
    }
    
//------------------------------------------------------------------------------ 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dpi_main = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuUsers = new javax.swing.JMenu();
        jMenuItemAdmin = new javax.swing.JMenuItem();
        jMenuItemStudents = new javax.swing.JMenuItem();
        jMenuInventory = new javax.swing.JMenu();
        jMenuItemAdd = new javax.swing.JMenuItem();
        jMenuItemMagazines = new javax.swing.JMenuItem();
        jMenuReports = new javax.swing.JMenu();
        jMenuItemDebts = new javax.swing.JMenuItem();
        jMenuItemStatistics = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        javax.swing.GroupLayout dpi_mainLayout = new javax.swing.GroupLayout(dpi_main);
        dpi_main.setLayout(dpi_mainLayout);
        dpi_mainLayout.setHorizontalGroup(
            dpi_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1210, Short.MAX_VALUE)
        );
        dpi_mainLayout.setVerticalGroup(
            dpi_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 746, Short.MAX_VALUE)
        );

        jMenuUsers.setText("Users");

        jMenuItemAdmin.setText("Admin");
        jMenuUsers.add(jMenuItemAdmin);

        jMenuItemStudents.setText("Students");
        jMenuItemStudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemStudentsActionPerformed(evt);
            }
        });
        jMenuUsers.add(jMenuItemStudents);

        jMenuBar1.add(jMenuUsers);

        jMenuInventory.setText("Inventory");

        jMenuItemAdd.setText("Add Magazines or Books");
        jMenuItemAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAddActionPerformed(evt);
            }
        });
        jMenuInventory.add(jMenuItemAdd);

        jMenuItemMagazines.setText("Buscar Article");
        jMenuItemMagazines.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMagazinesActionPerformed(evt);
            }
        });
        jMenuInventory.add(jMenuItemMagazines);

        jMenuBar1.add(jMenuInventory);

        jMenuReports.setText("Reports");

        jMenuItemDebts.setText("Debts");
        jMenuReports.add(jMenuItemDebts);

        jMenuItemStatistics.setText("Statistics");
        jMenuReports.add(jMenuItemStatistics);

        jMenuBar1.add(jMenuReports);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(dpi_main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpi_main)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//------------------------------------------------------------------------------

    private void jMenuItemStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemStudentsActionPerformed
       Users user = new Users(data, this);
       dpi_main.add(user);
        packChild(user, evt);
    }//GEN-LAST:event_jMenuItemStudentsActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
       data.saveUser();
       data.saveMagazines();
       data.saveBooks();
    }//GEN-LAST:event_formWindowClosing

    private void jMenuItemMagazinesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMagazinesActionPerformed
       ViewArticles viewA = new ViewArticles(data, this);
       dpi_main.add(viewA);
        packChild(viewA, evt);
    }//GEN-LAST:event_jMenuItemMagazinesActionPerformed

    private void jMenuItemAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAddActionPerformed
        AddArticles add = new AddArticles(this, data);
        dpi_main.add(add);
        packChild(add, evt);
    }//GEN-LAST:event_jMenuItemAddActionPerformed

//------------------------------------------------------------------------------
    
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(() -> {
            new Main().setVisible(true);
        });
        
        
    }
    
     private void packChild(JInternalFrame child, ActionEvent evt) {
        child.moveToFront();
        try {
            child.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Library.Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        int lastx = -20, lasty = -20;
        for (JInternalFrame c : dpi_main.getAllFrames()) {
            if (c == child) {
                continue;
            }
            if (c.getX() > lastx) {
                lastx = c.getX();
            }

            if (c.getY() > lasty) {
                lasty = c.getY();
            }

        }

        child.setLocation(lastx + 20, lasty + 20);
        ((JMenuItem) (evt.getSource())).setEnabled(false);   //donde se hizo click
        child.addInternalFrameListener(new InternalFrameAdapter() {
            @Override
            public void internalFrameClosing(InternalFrameEvent ev) {
                ((JMenuItem) (evt.getSource())).setEnabled(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dpi_main;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuInventory;
    private javax.swing.JMenuItem jMenuItemAdd;
    private javax.swing.JMenuItem jMenuItemAdmin;
    private javax.swing.JMenuItem jMenuItemDebts;
    private javax.swing.JMenuItem jMenuItemMagazines;
    private javax.swing.JMenuItem jMenuItemStatistics;
    private javax.swing.JMenuItem jMenuItemStudents;
    private javax.swing.JMenu jMenuReports;
    private javax.swing.JMenu jMenuUsers;
    // End of variables declaration//GEN-END:variables
}
