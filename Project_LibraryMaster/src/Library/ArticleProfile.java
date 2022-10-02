package Library;

import java.awt.Image;
import javax.swing.ImageIcon;

public class ArticleProfile extends javax.swing.JInternalFrame {

    private Data data;
    private ViewArticles articles;
    private String code;
    private String type;

    public ArticleProfile(Data data, ViewArticles articles, String code, String type) {
        initComponents();
        this.data = data;
        this.articles = articles;
        this.code = code;
        this.type = type;
        articles.setVisible(false);
        inicialitation();
    }

    private void inicialitation() {
        String[] field;
        if (type.equals("Magazines")) {
            field = data.getMagazine(code);
        } else {
            field = data.getBook(code);
        }
        jl_ID.setText("Code: " + field[0]);
        jl_Name.setText("Name: " + field[1]);
        jl_Author.setText("Author: " + field[2]);
        jl_Pages.setText("Pages: " + field[3]);
        jl_Time.setText("Time: " + field[6]);
        jl_State.setText("State: " + field[4]);
        if (jl_State.getText().equals("Available")) {
            jl_IDStudent.setText("ID Student: " + field[9]);
        } else {
            jl_IDStudent.setText("ID Student : NA");
        }
        String path = field[10];
        Image image = new ImageIcon(path).getImage();
        ImageIcon icon = new ImageIcon(image.getScaledInstance(jl_Image.getWidth(),
                jl_Image.getHeight(), Image.SCALE_SMOOTH));
        jl_Image.setIcon(icon);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jl_Image = new javax.swing.JLabel();
        jl_ID = new javax.swing.JLabel();
        jl_Author = new javax.swing.JLabel();
        jl_Name = new javax.swing.JLabel();
        jl_Pages = new javax.swing.JLabel();
        jl_State = new javax.swing.JLabel();
        jl_Time = new javax.swing.JLabel();
        jl_IDStudent = new javax.swing.JLabel();

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

        jl_Image.setText("jLabel1");

        jl_ID.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl_ID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_ID.setText("ID");

        jl_Author.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl_Author.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_Author.setText("Author");

        jl_Name.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl_Name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_Name.setText("Name");

        jl_Pages.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl_Pages.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_Pages.setText("Pages");

        jl_State.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl_State.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_State.setText("State");

        jl_Time.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl_Time.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_Time.setText("Time");

        jl_IDStudent.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl_IDStudent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_IDStudent.setText("ID student");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jl_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_Author, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_Pages, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_State, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_Time, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_IDStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jl_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(170, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jl_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 29, Short.MAX_VALUE)
                        .addComponent(jl_ID)
                        .addContainerGap(88, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jl_Name)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jl_Author)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jl_Pages)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jl_Time)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jl_State)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jl_IDStudent)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        articles.setVisible(true);
    }//GEN-LAST:event_formInternalFrameClosing


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jl_Author;
    private javax.swing.JLabel jl_ID;
    private javax.swing.JLabel jl_IDStudent;
    private javax.swing.JLabel jl_Image;
    private javax.swing.JLabel jl_Name;
    private javax.swing.JLabel jl_Pages;
    private javax.swing.JLabel jl_State;
    private javax.swing.JLabel jl_Time;
    // End of variables declaration//GEN-END:variables
}
