package Library;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class LoansAndReturns extends javax.swing.JInternalFrame {

    private Data data;
    private String idStudent;
    private Users users;
    private ArrayList<String[]> visibleArticles = new ArrayList<>();
    public LoansAndReturns(Data d, String id, Users user) {
        initComponents();
        this.data = d;
        this.idStudent = id;
        this.users = user;
        users.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jl_Code = new javax.swing.JLabel();
        cb_Articles = new javax.swing.JComboBox<>();
        jl_IDStudent = new javax.swing.JLabel();
        jl_NameStudent = new javax.swing.JLabel();
        tf_Code = new javax.swing.JTextField();
        jl_Name = new javax.swing.JLabel();
        jl_NumberOfPages = new javax.swing.JLabel();
        jl_Author = new javax.swing.JLabel();
        tf_NumberPages = new javax.swing.JTextField();
        tf_Author = new javax.swing.JTextField();
        tf_Name = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_Articles = new javax.swing.JTable();
        jl_State = new javax.swing.JLabel();
        cb_Available = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jb_return = new javax.swing.JButton();
        jb_Borrow = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Loans and Returns");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(401, 401, 401))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jl_Code.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl_Code.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_Code.setText("Code");

        cb_Articles.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cb_Articles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Books", "Magazines" }));

        jl_IDStudent.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl_IDStudent.setText("ID: Student");

        jl_NameStudent.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl_NameStudent.setText("Name: Student");

        tf_Code.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tf_Code.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_CodeKeyReleased(evt);
            }
        });

        jl_Name.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl_Name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_Name.setText("Name");

        jl_NumberOfPages.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl_NumberOfPages.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_NumberOfPages.setText("Number of pages");

        jl_Author.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl_Author.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_Author.setText("Author");

        tf_NumberPages.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tf_NumberPages.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_NumberPagesKeyReleased(evt);
            }
        });

        tf_Author.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tf_Author.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_AuthorKeyReleased(evt);
            }
        });

        tf_Name.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tf_Name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_NameKeyReleased(evt);
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
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tb_Articles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_ArticlesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_Articles);

        jl_State.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl_State.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_State.setText("State");

        cb_Available.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cb_Available.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Available", "Not Available" }));
        cb_Available.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_AvailableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jl_IDStudent)
                        .addGap(108, 108, 108)
                        .addComponent(jl_NameStudent))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jl_State, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jl_NumberOfPages)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jl_Code, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cb_Articles, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jl_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jl_Author, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(28, 28, 28)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_Code)
                            .addComponent(tf_Name)
                            .addComponent(tf_Author)
                            .addComponent(tf_NumberPages)
                            .addComponent(cb_Available, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_IDStudent)
                            .addComponent(jl_NameStudent))
                        .addGap(29, 29, 29)
                        .addComponent(cb_Articles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_Code)
                            .addComponent(tf_Code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl_Name)
                            .addComponent(tf_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl_Author)
                            .addComponent(tf_Author, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_NumberOfPages)
                            .addComponent(tf_NumberPages, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cb_Available, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_State))))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jb_return.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jb_return.setText("Return");

        jb_Borrow.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jb_Borrow.setText("Borrow");
        jb_Borrow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_BorrowActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(jb_Borrow, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jb_return, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(132, 132, 132))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_return, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_Borrow, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
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
                //  System.out.println(article[4]);
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
    private void jb_BorrowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_BorrowActionPerformed
        if (!"".equals(tf_Code.getText())) {
            if (("" + cb_Articles.getSelectedItem()).equals("Books")) {
                System.out.println("Este");
                String[] field = data.getBook(tf_Code.getText());
                String[] fieldStudent = data.getUser(idStudent);
                if (field[4].equals("Available")) {
                    //id student
                    field[9] = idStudent;
                    //state
                    field[4] = "Not Available";
                    //time 
                    DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("yyyy/MMMM/dd HH:mm:ss");
                    System.out.println("yyyy/MMMM/dd HH:mm:ss-> " + dtf3.format(LocalDateTime.now()));
                    field[6] = dtf3.format(LocalDateTime.now());
                    //number of times 
                    String nTimes = field[5];
                    int numberofTimes = Integer.parseInt(nTimes);
                    numberofTimes++;
                    field[5] = "" + numberofTimes;
                    //state student
                    fieldStudent[3] = "Indebted";
                    //amount books student
                    int amount = Integer.parseInt(fieldStudent[5]);
                    amount++;
                    fieldStudent[5] = "" + amount;
                    JOptionPane.showMessageDialog(null, "Sucess");
                }

            } else {
                String[] field = data.getMagazine(tf_Code.getText());

                String[] fieldStudent = data.getUser(idStudent);
                if (field[4].equals("Available")) {
                    //id student
                    field[9] = idStudent;
                    //state
                    field[6] = "Not Available";
                    //time 
                    DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("yyyy/MMMM/dd HH:mm:ss");
                    System.out.println("yyyy/MMMM/dd HH:mm:ss-> " + dtf3.format(LocalDateTime.now()));
                    field[6] = dtf3.format(LocalDateTime.now());
                    //number of times 
                    String nTimes = field[5];
                    int numberofTimes = Integer.parseInt(nTimes);
                    numberofTimes++;
                    field[5] = "" + numberofTimes;
                    //state student
                    fieldStudent[3] = "Indebted";
                    //amount books student
                    int amount = Integer.parseInt(fieldStudent[5]);
                    amount++;
                    fieldStudent[5] = "" + amount;
                }
            }
        }
    }//GEN-LAST:event_jb_BorrowActionPerformed
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
    private void tf_NumberPagesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_NumberPagesKeyReleased
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
    }//GEN-LAST:event_tf_NumberPagesKeyReleased
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
//------------------------------------------------------------------------------
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

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        users.setVisible(true);
    }//GEN-LAST:event_formInternalFrameClosing
//------------------------------------------------------------------------------

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb_Articles;
    private javax.swing.JComboBox<String> cb_Available;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb_Borrow;
    private javax.swing.JButton jb_return;
    private javax.swing.JLabel jl_Author;
    private javax.swing.JLabel jl_Code;
    private javax.swing.JLabel jl_IDStudent;
    private javax.swing.JLabel jl_Name;
    private javax.swing.JLabel jl_NameStudent;
    private javax.swing.JLabel jl_NumberOfPages;
    private javax.swing.JLabel jl_State;
    private javax.swing.JTable tb_Articles;
    private javax.swing.JTextField tf_Author;
    private javax.swing.JTextField tf_Code;
    private javax.swing.JTextField tf_Name;
    private javax.swing.JTextField tf_NumberPages;
    // End of variables declaration//GEN-END:variables
}
