package Library;

import java.awt.Image;
import javax.swing.ImageIcon;

public class UserProfile extends javax.swing.JInternalFrame {

    private Users student;
    private Data data;
    private String id;

    public UserProfile(Users users, Data data, String id) {
        initComponents();
        this.student = users;
        this.data = data;
        this.id = id;
        student.setVisible(false);
        inicialitacion();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jl_Name = new javax.swing.JLabel();
        jl_ID = new javax.swing.JLabel();
        jl_Amount = new javax.swing.JLabel();
        jl_Telephone = new javax.swing.JLabel();
        jl_state = new javax.swing.JLabel();
        jl_Image = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Users Profile");
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

        jl_Name.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl_Name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_Name.setText("Name: ");

        jl_ID.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl_ID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_ID.setText("ID: ");

        jl_Amount.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl_Amount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_Amount.setText("Amount of books:");

        jl_Telephone.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl_Telephone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_Telephone.setText("Telephone: ");

        jl_state.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl_state.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_state.setText("State:");

        jl_Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Library/0UserProfile.jpeg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jl_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jl_Telephone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jl_Name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jl_Amount, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                    .addComponent(jl_state, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jl_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jl_Telephone, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jl_state, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jl_Amount, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jl_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jl_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//------------------------------------------------------------------------------
    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        student.setVisible(true);
    }//GEN-LAST:event_formInternalFrameClosing
//------------------------------------------------------------------------------

    private void inicialitacion() {
        String[] fields;
        fields = data.getUser(id);
        jl_ID.setText("ID: " + fields[0]);
        jl_Name.setText("Name: " + fields[1]);
        jl_Telephone.setText("Telephone: " + fields[2]);
        jl_Amount.setText("Amount of books: " + fields[5]);
        jl_state.setText("State: " + fields[3]);
        String path = fields[6];
        Image image = new ImageIcon(path).getImage();

        ImageIcon icon = new ImageIcon(image.getScaledInstance(200,
                181, Image.SCALE_SMOOTH));
        jl_Image.setIcon(icon);

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jl_Amount;
    private javax.swing.JLabel jl_ID;
    private javax.swing.JLabel jl_Image;
    private javax.swing.JLabel jl_Name;
    private javax.swing.JLabel jl_Telephone;
    private javax.swing.JLabel jl_state;
    // End of variables declaration//GEN-END:variables
}
