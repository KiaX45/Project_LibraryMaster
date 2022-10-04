package Library;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class AddStudent extends javax.swing.JInternalFrame {

    private Data data;
    private Users users;
    private String path = "D:\\Carpetas importantes\\Documentos\\U nari�o\\Tercer semestre\\Programaci�n\\Programas en desarrollo\\CHAPTERDMAINFRAME\\images\\0UserProfile.jpg";

    public AddStudent(Data d, Users user) {
        initComponents();
        this.data = d;
        this.users = user;
        users.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jl_Telephone = new javax.swing.JLabel();
        jl_Name = new javax.swing.JLabel();
        jl_ID = new javax.swing.JLabel();
        jb_SelectImage = new javax.swing.JButton();
        jb_Add = new javax.swing.JButton();
        jt_Name = new javax.swing.JTextField();
        jt_telephone = new javax.swing.JTextField();
        jt_ID = new javax.swing.JTextField();
        jl_Image = new javax.swing.JLabel();
        jb_Cancel1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Add student");
        setVisible(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jl_Telephone.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl_Telephone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_Telephone.setText("Telephone");

        jl_Name.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl_Name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_Name.setText("Name");

        jl_ID.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl_ID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_ID.setText("ID");

        jb_SelectImage.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jb_SelectImage.setText("Select an image");
        jb_SelectImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_SelectImageActionPerformed(evt);
            }
        });

        jb_Add.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jb_Add.setText("Add");
        jb_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_AddActionPerformed(evt);
            }
        });

        jt_Name.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jt_telephone.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jt_ID.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jl_Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Library/0UserProfile.jpeg"))); // NOI18N
        jl_Image.setText("jLabel1");
        jl_Image.setPreferredSize(new java.awt.Dimension(100, 100));

        jb_Cancel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jb_Cancel1.setText("Cancel");
        jb_Cancel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_Cancel1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jl_ID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jl_Telephone, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                            .addComponent(jl_Name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jt_Name, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                            .addComponent(jt_telephone)
                            .addComponent(jt_ID))
                        .addGap(92, 92, 92))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jb_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addComponent(jb_Cancel1, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                        .addGap(83, 83, 83)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jl_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_SelectImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jt_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jt_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_Telephone, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jt_telephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jl_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jb_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jb_Cancel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jb_SelectImage, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_AddActionPerformed

        if (!"".equals(jt_ID.getText()) && !"".equals(jt_Name.getText()) && !"".equals(jt_telephone.getText())) {
            if (data.exist(jt_ID.getText()) == false) {
                System.out.println(path);
                data.addUser(jt_ID.getText(), jt_Name.getText(), jt_telephone.getText(), "Debt free", "true", "0", path);
                jt_ID.setText("");
                jt_Name.setText("");
                jt_telephone.setText("");
                JOptionPane.showMessageDialog(rootPane, "success");
                System.out.println("SI");
            } else {
                JOptionPane.showMessageDialog(rootPane, "This code is alredy in use");
            }

        } else {
            JOptionPane.showMessageDialog(rootPane, "Full fill all the fields");
        }
    }//GEN-LAST:event_jb_AddActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        users.setVisible(true);
    }//GEN-LAST:event_formInternalFrameClosing

    private void jb_SelectImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_SelectImageActionPerformed
        JFileChooser jFileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG, PNG & GIF", "jpg", "png", "gif");
        jFileChooser.setFileFilter(filter);
        int answer = jFileChooser.showOpenDialog(this);
        if (answer == JFileChooser.APPROVE_OPTION) {
            path = jFileChooser.getSelectedFile().getPath();
            //System.out.println(path);
            Image image = new ImageIcon(path).getImage();
            ImageIcon icon = new ImageIcon(image.getScaledInstance(jl_Image.getWidth(),
                    jl_Image.getHeight(), Image.SCALE_SMOOTH));
            jl_Image.setIcon(icon);
        }
    }//GEN-LAST:event_jb_SelectImageActionPerformed

    private void jb_Cancel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_Cancel1ActionPerformed
        users.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jb_Cancel1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jb_Add;
    private javax.swing.JButton jb_Cancel1;
    private javax.swing.JButton jb_SelectImage;
    private javax.swing.JLabel jl_ID;
    private javax.swing.JLabel jl_Image;
    private javax.swing.JLabel jl_Name;
    private javax.swing.JLabel jl_Telephone;
    private javax.swing.JTextField jt_ID;
    private javax.swing.JTextField jt_Name;
    private javax.swing.JTextField jt_telephone;
    // End of variables declaration//GEN-END:variables
}
