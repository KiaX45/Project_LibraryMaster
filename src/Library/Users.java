package Library;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Users extends javax.swing.JInternalFrame {

    private Data data;
    private Main main;
    private ArrayList<String[]> visibleUsers = new ArrayList<>();

    public Users(Data d, Main main) {
        initComponents();
        this.data = d;
        this.main = main;
        int number = rowCount();
        System.out.println(number);
    }
//------------------------------------------------------------------------------
//this method counts how many users are going to be displayed

    private int rowCount() {
        visibleUsers.clear();
        int rowCount = 0;
        for (String[] fields : data.getUsers()) {
            if (fields[4].equals("true")) {
                rowCount++;
                visibleUsers.add(fields);
            }
        }
        return rowCount;
    }
//------------------------------------------------------------------------------
    private void refresh() {

        tb_users.setModel(new TableModel() {
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
                        return "Id";
                    case 1:
                        return "Name";
                    case 2:
                        return "Telephone";
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
//                if (columnIndex == 3) {
//                     System.out.println(data.getUsers().get(rowIndex)[columnIndex]);
//                    if (data.getUsers().get(rowIndex)[columnIndex].equals("1")) {
//                        return "Activo";
//                    }else if (data.users.get(rowIndex)[columnIndex].equals("0")) {
//                        return "Inactivo";
//                    }
//                }

                return visibleUsers.get(rowIndex)[columnIndex];
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jl_ID = new javax.swing.JLabel();
        jl_telephone = new javax.swing.JLabel();
        jl_state = new javax.swing.JLabel();
        jl_name = new javax.swing.JLabel();
        jt_id = new javax.swing.JTextField();
        jt_telephone = new javax.swing.JTextField();
        jt_name = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_users = new javax.swing.JTable();
        cb_state = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jb_add = new javax.swing.JButton();
        jb_LoandsAndReturns = new javax.swing.JButton();
        jb_lend = new javax.swing.JButton();
        jb_search = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Students");
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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Students");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(381, 381, 381)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jl_ID.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl_ID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_ID.setText("ID");

        jl_telephone.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl_telephone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_telephone.setText("Telephone");

        jl_state.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl_state.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_state.setText("State");

        jl_name.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl_name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_name.setText("Name");

        jt_id.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jt_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jt_idKeyReleased(evt);
            }
        });

        jt_telephone.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jt_telephone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jt_telephoneKeyReleased(evt);
            }
        });

        jt_name.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jt_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jt_nameKeyReleased(evt);
            }
        });

        tb_users.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Student ID", "Name", "Telephone", "State"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tb_users.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_usersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_users);

        cb_state.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cb_state.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Debt free", "Indebted" }));
        cb_state.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_stateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jl_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jl_name, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jl_state, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_state, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jl_telephone, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jt_telephone, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jt_id))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_name, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jt_name))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_telephone, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jt_telephone))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jl_state, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cb_state)
                        .addGap(5, 5, 5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jb_add.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jb_add.setText("Add users");
        jb_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_addActionPerformed(evt);
            }
        });

        jb_LoandsAndReturns.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jb_LoandsAndReturns.setText("Loands and returns");
        jb_LoandsAndReturns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_LoandsAndReturnsActionPerformed(evt);
            }
        });

        jb_lend.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jb_lend.setText("Lend");

        jb_search.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jb_search.setText("Search user");
        jb_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_searchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jb_search, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jb_add, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(jb_LoandsAndReturns, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jb_lend, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_add, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_LoandsAndReturns, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_lend, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_search, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_addActionPerformed
        AddStudent addS = new AddStudent(data, this);
        main.getDpi_main().add(addS);
    }//GEN-LAST:event_jb_addActionPerformed
//------------------------------------------------------------------------------
    private void jt_idKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_idKeyReleased
        comprobationId();
        comprobationName();
        comprobationTelephone();
        refresh();
    }//GEN-LAST:event_jt_idKeyReleased
//------------------------------------------------------------------------------  
    private void comprobationId() {
        if (jt_id.getText().length() >= 2) {
            for (String[] article : data.getUsers()) {
                if (article[0].toUpperCase().contains(jt_id.getText().toUpperCase())) {
                    article[4] = "true";
                } else {
                    article[4] = "false";
                }
            }
        }
    }
//------------------------------------------------------------------------------
    private void jt_nameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_nameKeyReleased
        System.out.println("Si");
        comprobationId();
        comprobationName();
        comprobationTelephone();
        refresh();
    }//GEN-LAST:event_jt_nameKeyReleased
//------------------------------------------------------------------------------   
    private void comprobationName() {
        if (jt_name.getText().length() >= 2) {
            for (String[] article : data.getUsers()) {
                if (article[1].toUpperCase().contains(jt_name.getText().toUpperCase())) {
                    article[4] = "true";
                } else {
                    article[4] = "false";
                }
            }
        }
    }
//------------------------------------------------------------------------------    
    private void jt_telephoneKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_telephoneKeyReleased
        comprobationId();
        comprobationName();
        comprobationTelephone();
        refresh();
    }//GEN-LAST:event_jt_telephoneKeyReleased
//------------------------------------------------------------------------------
    private void comprobationTelephone() {
        if (jt_telephone.getText().length() >= 2) {
            for (String[] article : data.getUsers()) {
                if (article[2].toUpperCase().contains(jt_telephone.getText().toUpperCase())) {
                    article[4] = "true";
                } else {
                    article[4] = "false";
                }
            }
        }
    }
//------------------------------------------------------------------------------
    private void cb_stateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_stateActionPerformed

        String option = "" + cb_state.getSelectedItem();

        for (String[] article : data.getUsers()) {
            if (article[3].toUpperCase().contains(option.toUpperCase())) {
                article[4] = "true";
            } else {
                article[4] = "false";
            }
        }
        refresh();
    }//GEN-LAST:event_cb_stateActionPerformed
//------------------------------------------------------------------------------
    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        visibleUsers.clear();
       
    }//GEN-LAST:event_formInternalFrameClosing
//------------------------------------------------------------------------------
    private void tb_usersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_usersMouseClicked
       // DefaultTableModel model = (DefaultTableModel) tb_users.getModel();
        int selectedRow = tb_users.getSelectedRow();
        jt_id.setText(tb_users.getModel().getValueAt(selectedRow, 0).toString());
        jt_name.setText(tb_users.getModel().getValueAt(selectedRow, 1).toString());
        jt_telephone.setText(tb_users.getModel().getValueAt(selectedRow, 2).toString());
    }//GEN-LAST:event_tb_usersMouseClicked
//------------------------------------------------------------------------------
    private void jb_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_searchActionPerformed
        UserProfile profile = new UserProfile(this, data, jt_id.getText());
        main.getDpi_main().add(profile);
    }//GEN-LAST:event_jb_searchActionPerformed

    private void jb_LoandsAndReturnsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_LoandsAndReturnsActionPerformed
       if(!"".equals(jt_id.getText())&&data.exist(jt_id.getText())){
           LoansAndReturns loansAndReturns = new LoansAndReturns(data, jt_id.getText(), this);
           main.getDpi_main().add(loansAndReturns);
       }else{
           JOptionPane.showMessageDialog(null, "First you have to enter a valid id ");
       }
    }//GEN-LAST:event_jb_LoandsAndReturnsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb_state;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb_LoandsAndReturns;
    private javax.swing.JButton jb_add;
    private javax.swing.JButton jb_lend;
    private javax.swing.JButton jb_search;
    private javax.swing.JLabel jl_ID;
    private javax.swing.JLabel jl_name;
    private javax.swing.JLabel jl_state;
    private javax.swing.JLabel jl_telephone;
    private javax.swing.JTextField jt_id;
    private javax.swing.JTextField jt_name;
    private javax.swing.JTextField jt_telephone;
    private javax.swing.JTable tb_users;
    // End of variables declaration//GEN-END:variables
}
