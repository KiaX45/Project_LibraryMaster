package Library;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class ViewArticles extends javax.swing.JInternalFrame {

    private Data data;
    private Main main;
    private ArrayList<String[]> visibleArticles = new ArrayList<>();

    public ViewArticles(Data data, Main main) {
        initComponents();
        this.data = data;
        this.main = main;
       
    }
//------------------------------------------------------------------------------
    private int rowCount() {
        visibleArticles.clear();
        int rowCount = 0;
        String choise = "" + cb_Articles.getSelectedItem();
        if (choise.equals("Books")) {
            
            for (String[] fields : data.getBooks()) {
                if (fields[8].equals("true")) {
                    rowCount++;
                   // System.out.println("Este " + fields[8]);
                    visibleArticles.add(fields);
                }
            }
        } else {
            rowCount = 0;
            for (String[] fields : data.getMagazines()) {
                if (fields[8].equals("true")) {
                    rowCount++;
                    visibleArticles.add(fields);
                }
            }
        }

        return rowCount;
    }
//------------------------------------------------------------------------------
    private void refresh() {

        tb_Articles.setModel(new TableModel() {
            @Override
            public int getRowCount() {
                return rowCount();
            }

            @Override
            public int getColumnCount() {
                return 4;
            }

            @Override
            public String getColumnName(int columnIndex) {
                switch (columnIndex) {
                    case 0:
                        return "Code";
                    case 1:
                        return "Name";
                    case 2:
                        return "Author";
                    case 3:
                        return "State";
                    default:
                        return "";
                }
            }

            @Override
            public Class<?> getColumnClass(int columnIndex) {
                return String.class;
            }

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }

            @Override
            public Object getValueAt(int rowIndex, int columnIndex) {
               
                if(columnIndex == 3){
                     return visibleArticles.get(rowIndex)[4];
                }else{
                     return visibleArticles.get(rowIndex)[columnIndex];
                }
            }

            @Override
            public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
            }

            @Override
            public void addTableModelListener(TableModelListener l) {
            }

            @Override
            public void removeTableModelListener(TableModelListener l) {
            }
        });
    }
//------------------------------------------------------------------------------
    private void comprobationCodeB(){
        if(tf_Code.getText().length()>2){
            for (String[] article : data.getBooks()) {
                if (article[0].toUpperCase().contains(tf_Code.getText().toUpperCase())) {
                    //System.out.println("SI");
                   // System.out.println(article[0]);
                    article[8] = "true";
                } else {
                   // System.out.println("NO");
                   // System.out.println(article[0]);
                    article[8] = "false";
                }
                //si();
                //System.out.println(article[8]);
            }
        }
        
    }
//------------------------------------------------------------------------------    
     private void comprobationCodeM(){
        if(tf_Code.getText().length()>2){
            for (String[] article : data.getMagazines()) {
                if (article[0].toUpperCase().contains(tf_Code.getText().toUpperCase())) {
                    article[8] = "true";
                } else {
                    article[8] = "false";
                }
            }
        }
    }
//------------------------------------------------------------------------------
     private void comprobationNameB(){
         
        if(tf_Name.getText().length()>2){
           
            for (String[] article : data.getBooks()) {
                if (article[1].toUpperCase().contains(tf_Name.getText().toUpperCase())) {
                    article[8] = "true";
                } else {
                    article[8] = "false";
                }
                // System.out.println(article[8]);
            }
        }
    }
//------------------------------------------------------------------------------
private void comprobationNameM(){
        if(tf_Name.getText().length()>2){
            for (String[] article : data.getMagazines()) {
                if (article[1].toUpperCase().contains(tf_Name.getText().toUpperCase())) {
                    article[8] = "true";
                } else {
                    article[8] = "false";
                }
            }
        }
    }     
//------------------------------------------------------------------------------
private void comprobationAuthorB(){
        if(tf_Author.getText().length()>2){
            for (String[] article : data.getBooks()) {
                if (article[2].toUpperCase().contains(tf_Author.getText().toUpperCase())) {
                    article[8] = "true";
                } else {
                    article[8] = "false";
                }
                // System.out.println(article[8]);
            }
        }
    }
//------------------------------------------------------------------------------
private void comprobationAuthorM(){
        if(tf_Author.getText().length()>2){
            for (String[] article : data.getMagazines()) {
                if (article[2].toUpperCase().contains(tf_Author.getText().toUpperCase())) {
                    article[8] = "true";
                } else {
                    article[8] = "false";
                }
            }
        }
    }
//------------------------------------------------------------------------------
private void comprobationStateB(){
        
            for (String[] article : data.getBooks()) {
                if (article[4].toUpperCase().contains((""+cb_Available.getSelectedItem()).toUpperCase())) {
                    article[8] = "true";
                } else {
                    article[8] = "false";
                }
                // System.out.println(article[8]);
            }
        
    }
//------------------------------------------------------------------------------
private void comprobationStateM(){
        
            for (String[] article : data.getMagazines()) {
                if (article[4].toUpperCase().contains((""+cb_Available.getSelectedItem()).toUpperCase())) {
                    article[8] = "true";
                } else {
                    article[8] = "false";
                }
                // System.out.println(article[8]);
            }
        
    }
//------------------------------------------------------------------------------
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jl_Code = new javax.swing.JLabel();
        jl_Author = new javax.swing.JLabel();
        jl_Name = new javax.swing.JLabel();
        jl_State = new javax.swing.JLabel();
        cb_Articles = new javax.swing.JComboBox<>();
        cb_Available = new javax.swing.JComboBox<>();
        tf_Name = new javax.swing.JTextField();
        tf_Code = new javax.swing.JTextField();
        tf_Author = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_Articles = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setVisible(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Books and Magazines");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(405, 405, 405))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jl_Code.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl_Code.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_Code.setText("Code");

        jl_Author.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl_Author.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_Author.setText("Author");

        jl_Name.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl_Name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_Name.setText("Name");

        jl_State.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl_State.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_State.setText("State");

        cb_Articles.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cb_Articles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Books", "Magazines" }));

        cb_Available.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cb_Available.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Available", "Not Available" }));
        cb_Available.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_AvailableActionPerformed(evt);
            }
        });

        tf_Name.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tf_Name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_NameKeyReleased(evt);
            }
        });

        tf_Code.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tf_Code.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_CodeKeyReleased(evt);
            }
        });

        tf_Author.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tf_Author.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_AuthorKeyReleased(evt);
            }
        });

        tb_Articles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Code", "Name", "Author", "State"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tb_Articles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_ArticlesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_Articles);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jl_State, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_Author, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jl_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addGap(59, 59, 59)
                                    .addComponent(jl_Code, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cb_Available, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_Name)
                            .addComponent(tf_Code)
                            .addComponent(tf_Author)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(cb_Articles, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(cb_Articles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jl_Code, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jl_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jl_Author, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_Author, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jl_State, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cb_Available, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(tf_Code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(379, 379, 379)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//------------------------------------------------------------------------------
    private void tf_CodeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_CodeKeyReleased
        if ((""+cb_Articles.getSelectedItem()).equals("Books")) {
             comprobationStateB();
            comprobationAuthorB();
            comprobationCodeB();
            comprobationNameB();
        }else{
             comprobationStateM();
            comprobationAuthorM();
            comprobationCodeM();
            comprobationNameM();
        }
        refresh();
    }//GEN-LAST:event_tf_CodeKeyReleased
//------------------------------------------------------------------------------
    private void tf_NameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_NameKeyReleased
         
        if ((""+cb_Articles.getSelectedItem()).equals("Books")) {
            comprobationStateB();
            comprobationAuthorB();
            comprobationCodeB();
            comprobationNameB();
        }else{
            comprobationStateM();
            comprobationAuthorM();
            comprobationCodeM();
            comprobationNameM();
        }
         refresh();
    }//GEN-LAST:event_tf_NameKeyReleased
//------------------------------------------------------------------------------
    private void tf_AuthorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_AuthorKeyReleased
         if ((""+cb_Articles.getSelectedItem()).equals("Books")) {
              comprobationStateB();
            comprobationAuthorB();
            comprobationCodeB();
            comprobationNameB();
        }else{
            comprobationStateM();
            comprobationAuthorM();
            comprobationCodeM();
            comprobationNameM();
        }
          refresh();
    }//GEN-LAST:event_tf_AuthorKeyReleased
//------------------------------------------------------------------------------
    private void cb_AvailableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_AvailableActionPerformed
        if ((""+cb_Articles.getSelectedItem()).equals("Books")) {
            comprobationStateB();
            comprobationAuthorB();
            comprobationCodeB();
            comprobationNameB();
        }else{
             comprobationStateM();
            comprobationAuthorM();
            comprobationCodeM();
            comprobationNameM();
        }
         refresh();
    }//GEN-LAST:event_cb_AvailableActionPerformed

    private void tb_ArticlesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_ArticlesMouseClicked
        int rowSelected =  tb_Articles.getSelectedRow();
        tf_Code.setText(tb_Articles.getModel().getValueAt(rowSelected, 0).toString());
        tf_Name.setText(tb_Articles.getModel().getValueAt(rowSelected, 1).toString());
        tf_Author.setText(tb_Articles.getModel().getValueAt(rowSelected, 2).toString());
        if(tb_Articles.getModel().getValueAt(rowSelected, 3).toString().equals("Available")){
             cb_Available.setSelectedIndex(0);
        }else{
             cb_Available.setSelectedIndex(1);
        }
       
    }//GEN-LAST:event_tb_ArticlesMouseClicked
//------------------------------------------------------------------------------
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       if(!"".equals(tf_Code.getText())&& data.codeValidation(tf_Code.getText(), (""+cb_Articles.getSelectedItem()))){
            ArticleProfile aProfile = new ArticleProfile(data, this, tf_Code.getText(), ""+cb_Articles.getSelectedItem());
        main.getDpi_main().add(aProfile);
       }else{
           JOptionPane.showMessageDialog(null, "First you have to choose a book or magazine");
       }
       
    }//GEN-LAST:event_jButton1ActionPerformed
//------------------------------------------------------------------------------
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb_Articles;
    private javax.swing.JComboBox<String> cb_Available;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jl_Author;
    private javax.swing.JLabel jl_Code;
    private javax.swing.JLabel jl_Name;
    private javax.swing.JLabel jl_State;
    private javax.swing.JTable tb_Articles;
    private javax.swing.JTextField tf_Author;
    private javax.swing.JTextField tf_Code;
    private javax.swing.JTextField tf_Name;
    // End of variables declaration//GEN-END:variables
}
