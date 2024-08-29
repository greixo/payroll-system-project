/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.payrollsystem.component;

import com.mycompany.payrollsystem.cell.PanelGroupAction;
import com.mycompany.payrollsystem.cell.TableActionCellEditor;
import com.mycompany.payrollsystem.cell.TableActionCellRender;
import com.mycompany.payrollsystem.cell.TableGroupActionEvent;
import java.awt.Font;
import javax.swing.table.JTableHeader;
import com.mycompany.payrollsystem.modals.AddEmployeeModal;
import com.mycompany.payrollsystem.modals.CreatePayrollModal;
import java.awt.Dimension;

import javax.swing.JOptionPane;


/**
 *
 * @author Paul
 */
public class PayrollMagementComponent extends javax.swing.JPanel {
 
    /**
     * Creates new form Dashboard
     */   
    private final Font headerFont;
    private final static String[] OPTIONS = {"Yes", "No"};
    private JTableHeader tableHeader;
    
    
    public PayrollMagementComponent() {
        this.headerFont = new Font("Arial", Font.BOLD, 20);
        initComponents();
        setOpaque(false);
        setPreferredSize(new Dimension(900, 1200));
        init();
    }
    
    private void init() {
        breadcrumb.setupBreadcrumb("Payroll Management");     
        tableHeader = payroll_management_table.getTableHeader();
        tableHeader.setFont(headerFont);
        
        TableGroupActionEvent event = new TableGroupActionEvent() {
            @Override
            public void onAddEmployee(int row) {
                System.out.println("Add Employee Row: " + row);
                AddEmployeeModal addEmployeeModal = new AddEmployeeModal();
                addEmployeeModal.setVisible(true);
            }

            @Override
            public void onProcessTimecard(int row) {
                System.out.println("Process Timecard Row: " + row);
                int choice;
                choice = JOptionPane.showOptionDialog(PayrollMagementComponent.this,
                        "Process Timecard?", 
                        "Payroll", 
                        JOptionPane.DEFAULT_OPTION, 
                        JOptionPane.PLAIN_MESSAGE, 
                        null, 
                        OPTIONS, 
                        null);
                
                if (choice == 0) {
                    System.out.println("User clicks yes");
                }
            }

            @Override
            public void onProcessPayroll(int row) {
                System.out.println("Process Payroll Row: " + row);
                                int choice;
                choice = JOptionPane.showOptionDialog(PayrollMagementComponent.this,
                        "Process Payroll?", 
                        "Payroll", 
                        JOptionPane.DEFAULT_OPTION, 
                        JOptionPane.PLAIN_MESSAGE, 
                        null, 
                        OPTIONS, 
                        null);
                
                if (choice == 0) {
                    System.out.println("User clicks yes");
                }
                
            }

            @Override
            public void onPostForApproval(int row) {
                System.out.println("Post For Approval Row: " + row);
                                int choice;
                choice = JOptionPane.showOptionDialog(PayrollMagementComponent.this,
                        "Process For Approval?", 
                        "Payroll", 
                        JOptionPane.DEFAULT_OPTION, 
                        JOptionPane.PLAIN_MESSAGE, 
                        null, 
                        OPTIONS, 
                        null);
                
                if (choice == 0) {
                    System.out.println("User clicks yes");
                }
            }

            @Override
            public void onPayrollReport(int row) {
                System.out.println("Payroll Report Row: " + row);
            }

            @Override
            public void onEdit(int row) {
                System.out.println("Edit Row: " + row);
                CreatePayrollModal createPayrollModal = new CreatePayrollModal();
                createPayrollModal.setVisible(true);
            }
        };
        
        TableActionCellRender tableActionCellRender = new TableActionCellRender(new PanelGroupAction());
        payroll_management_table.getColumnModel().getColumn(5).setCellRenderer(tableActionCellRender);
        payroll_management_table.getColumnModel().getColumn(5).setCellEditor(new TableActionCellEditor<>(new PanelGroupAction(), event));
        
    }
     
    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this
     * code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        breadcrumb = new com.mycompany.payrollsystem.component.Breadcrumb();
        department_panel = new javax.swing.JPanel();
        roundedCornersPanel7 = new com.mycompany.payrollsystem.swing.RoundedCornersPanel();
        jLabel14 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        roundedCornersPanel8 = new com.mycompany.payrollsystem.swing.RoundedCornersPanel();
        jLabel25 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        payroll_management_table = new javax.swing.JTable();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        topLeftAndTopRightRoundedCornersPanel1 = new com.mycompany.payrollsystem.swing.TopLeftAndTopRightRoundedCornersPanel();
        card_header_name = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(900, 935));

        department_panel.setBackground(new java.awt.Color(255, 255, 255));

        roundedCornersPanel7.setBackground(new java.awt.Color(245, 247, 248));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel14.setText("Payroll Management");

        javax.swing.GroupLayout roundedCornersPanel7Layout = new javax.swing.GroupLayout(roundedCornersPanel7);
        roundedCornersPanel7.setLayout(roundedCornersPanel7Layout);
        roundedCornersPanel7Layout.setHorizontalGroup(
            roundedCornersPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedCornersPanel7Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel14)
                .addContainerGap(166, Short.MAX_VALUE))
        );
        roundedCornersPanel7Layout.setVerticalGroup(
            roundedCornersPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedCornersPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        jButton3.setBackground(new java.awt.Color(0, 102, 0));
        jButton3.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/payrollsystem/icons/add_icon_button.png"))); // NOI18N
        jButton3.setText("Create Position");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        roundedCornersPanel8.setBackground(new java.awt.Color(245, 247, 248));

        jLabel25.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(51, 51, 51));
        jLabel25.setText("Show");

        jComboBox4.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10", "25", "50", "100" }));

        jLabel26.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(51, 51, 51));
        jLabel26.setText("entries");

        jLabel27.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(51, 51, 51));
        jLabel27.setText("Search:");

        jTextField4.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N

        payroll_management_table.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        payroll_management_table.setForeground(new java.awt.Color(51, 51, 51));
        payroll_management_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Code", "Name", "Info", "Coverage", "Status", "Action"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        payroll_management_table.setRowHeight(270);
        payroll_management_table.setSelectionBackground(new java.awt.Color(204, 204, 204));
        payroll_management_table.setShowGrid(true);
        jScrollPane4.setViewportView(payroll_management_table);

        jLabel28.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(51, 51, 51));
        jLabel28.setText("Showing 1 to 9 of 9 entries");

        jLabel29.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(51, 51, 51));
        jLabel29.setText("Previous");

        jLabel30.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("1");
        jLabel30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel38.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(51, 51, 51));
        jLabel38.setText("Next");

        javax.swing.GroupLayout roundedCornersPanel8Layout = new javax.swing.GroupLayout(roundedCornersPanel8);
        roundedCornersPanel8.setLayout(roundedCornersPanel8Layout);
        roundedCornersPanel8Layout.setHorizontalGroup(
            roundedCornersPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedCornersPanel8Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(roundedCornersPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundedCornersPanel8Layout.createSequentialGroup()
                        .addComponent(jScrollPane4)
                        .addContainerGap())
                    .addGroup(roundedCornersPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
            .addGroup(roundedCornersPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel38)
                .addGap(21, 21, 21))
        );
        roundedCornersPanel8Layout.setVerticalGroup(
            roundedCornersPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedCornersPanel8Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(roundedCornersPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(roundedCornersPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundedCornersPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                    .addComponent(jLabel38, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63))
        );

        javax.swing.GroupLayout department_panelLayout = new javax.swing.GroupLayout(department_panel);
        department_panel.setLayout(department_panelLayout);
        department_panelLayout.setHorizontalGroup(
            department_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(department_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(department_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(roundedCornersPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(department_panelLayout.createSequentialGroup()
                        .addComponent(roundedCornersPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        department_panelLayout.setVerticalGroup(
            department_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(department_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(department_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(roundedCornersPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(roundedCornersPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        topLeftAndTopRightRoundedCornersPanel1.setBackground(new java.awt.Color(47, 71, 186));

        card_header_name.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        card_header_name.setForeground(new java.awt.Color(255, 255, 255));
        card_header_name.setText("Payroll Management");

        javax.swing.GroupLayout topLeftAndTopRightRoundedCornersPanel1Layout = new javax.swing.GroupLayout(topLeftAndTopRightRoundedCornersPanel1);
        topLeftAndTopRightRoundedCornersPanel1.setLayout(topLeftAndTopRightRoundedCornersPanel1Layout);
        topLeftAndTopRightRoundedCornersPanel1Layout.setHorizontalGroup(
            topLeftAndTopRightRoundedCornersPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topLeftAndTopRightRoundedCornersPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(card_header_name)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        topLeftAndTopRightRoundedCornersPanel1Layout.setVerticalGroup(
            topLeftAndTopRightRoundedCornersPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topLeftAndTopRightRoundedCornersPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(card_header_name, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(department_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(topLeftAndTopRightRoundedCornersPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(breadcrumb, javax.swing.GroupLayout.DEFAULT_SIZE, 876, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(breadcrumb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(topLeftAndTopRightRoundedCornersPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(department_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        CreatePayrollModal createPayrollModal = new CreatePayrollModal();
        createPayrollModal.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.mycompany.payrollsystem.component.Breadcrumb breadcrumb;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel card_header_name;
    private javax.swing.JPanel department_panel;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTable payroll_management_table;
    private com.mycompany.payrollsystem.swing.RoundedCornersPanel roundedCornersPanel7;
    private com.mycompany.payrollsystem.swing.RoundedCornersPanel roundedCornersPanel8;
    private com.mycompany.payrollsystem.swing.TopLeftAndTopRightRoundedCornersPanel topLeftAndTopRightRoundedCornersPanel1;
    // End of variables declaration//GEN-END:variables
}
