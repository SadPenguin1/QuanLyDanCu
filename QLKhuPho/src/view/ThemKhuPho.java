/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.DAOHoDan;
import control.DAOKhuPho;
import control.DAONguoi;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.HoDan;
import model.KhuPho;
import model.Nguoi;


public class ThemKhuPho extends javax.swing.JFrame {

    /**
     * Creates new form ThemKhuPho
     */
    public ThemKhuPho() {
        initComponents();
    }
    public int soThanhVien;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtMHD = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtMN = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtHVT = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtTuoi = new javax.swing.JTextField();
        txtNS = new javax.swing.JTextField();
        txtNgheNhiep = new javax.swing.JTextField();
        btnAddNguoi = new javax.swing.JButton();
        txtSN = new javax.swing.JTextField();
        btnAddHoDan = new javax.swing.JButton();
        txtTKP = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMKP = new javax.swing.JTextField();
        btnaddKhuPho = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Mã Hộ Dân");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Số Nhà");

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Mã Người");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Họ Và Tên");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Tuổi");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Năm Sinh");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Nghề nghiệp");

        btnAddNguoi.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnAddNguoi.setText("Tiếp tục nhập thành viên");
        btnAddNguoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNguoiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAddNguoi))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addComponent(txtNgheNhiep, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtNS, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTuoi, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMN, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHVT, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(34, 34, 34))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtMN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtHVT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtTuoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtNS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtNgheNhiep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAddNguoi))
        );

        btnAddHoDan.setText("Tiếp tục nhập Hộ Dân");
        btnAddHoDan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddHoDanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtMHD, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSN, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAddHoDan, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(btnAddHoDan))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Mã Khu Phố");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Tên Khu Phố");

        btnaddKhuPho.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnaddKhuPho.setText("Thêm Thông Tin Vừa nhập");
        btnaddKhuPho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddKhuPhoActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton4.setText("Thoát");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTKP)
                            .addComponent(txtMKP, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnaddKhuPho)
                        .addGap(49, 49, 49)
                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(9, 9, 9)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMKP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTKP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(19, 19, 19)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnaddKhuPho)
                    .addComponent(jButton4))
                .addGap(36, 36, 36))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã khu Phố", "Tên Khu Phố", "Mã hộ dân", "Số Nhà", "mã người", "Họ và tên", "Tuổi", "Năm sinh", "Nghề nghiệp"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Thông tin vừa nhập");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Insert into DataBase");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 748, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
          // mainFrame m = new mainFrame();
            this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnaddKhuPhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddKhuPhoActionPerformed
        String makhupho = txtMKP.getText();
        String tenkhupho = txtTKP.getText();
        String mahoda = txtMHD.getText();
        String sonha = txtSN.getText();
        String manguoi = txtMN.getText();
        String Hoten = txtHVT.getText();
        int tuoi = Integer.parseInt(txtTuoi.getText());
        int namsinh = Integer.parseInt(txtNS.getText());
        String nghenghiep = txtNgheNhiep.getText();
        int soThanhvien = new DAOHoDan().GetSoThanhVien(mahoda);

        if (makhupho.equals("") || tenkhupho.equals("") || mahoda.equals("") || sonha.equals("")
                || manguoi.equals("") || Hoten.equals("")
                || txtTuoi.getText().equals("") || txtNS.getText().equals("") || nghenghiep.equals("")) {
            JOptionPane.showMessageDialog(this, "Làm ơn nhập tất cả các trường dữ liệu!");
        } else {
            if (new DAOKhuPho().checkDuplicateKhuPho(makhupho)|| checkDuplicateTableKhuPho(makhupho)) {
                JOptionPane.showMessageDialog(this, "Mã khu phố đang bị trùng lặp vui lòng nhập lại ");
            } else if (new DAOHoDan().checkDuplicateHoDan(mahoda) || checkDuplicateTableHoDan(mahoda)) {
                JOptionPane.showMessageDialog(this, "Mã khu phố đang bị trùng lặp vui lòng nhập lại ");
            } else if (new DAONguoi().checkDuplicateNguoi(manguoi) || checkDuplicateTable(manguoi)) {
                JOptionPane.showMessageDialog(this, "Mã khu phố đang bị trùng lặp vui lòng nhập lại ");
            } else {
                // add into table
                String data[] = {makhupho, tenkhupho, mahoda, sonha, manguoi, Hoten, txtTuoi.getText(), txtNS.getText(), nghenghiep};
                DefaultTableModel tblmodel = (DefaultTableModel) jTable1.getModel();
                tblmodel.addRow(data);
                txtMKP.setText("");
                txtTKP.setText("");
                txtMHD.setText("");
                txtSN.setText("");
                txtMN.setText("");
                txtHVT.setText("");
                txtTuoi.setText("");
                txtNS.setText("");
                txtNgheNhiep.setText("");
            }
        }
    }//GEN-LAST:event_btnaddKhuPhoActionPerformed

    private void btnAddNguoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNguoiActionPerformed
        String makhupho = txtMKP.getText();
        String tenkhupho = txtTKP.getText();
        String mahoda = txtMHD.getText();
        String sonha = txtSN.getText();
        String manguoi = txtMN.getText();
        String Hoten = txtHVT.getText();
        int tuoi = Integer.parseInt(txtTuoi.getText());
        int namsinh = Integer.parseInt(txtNS.getText());
        String nghenghiep = txtNgheNhiep.getText();
        int soThanhvien = new DAOHoDan().GetSoThanhVien(mahoda);
        
        if (makhupho.equals("") || tenkhupho.equals("") || mahoda.equals("") || sonha.equals("")
                || manguoi.equals("") || Hoten.equals("")
                || txtTuoi.getText().equals("") || txtNS.getText().equals("") || nghenghiep.equals("")) {
            JOptionPane.showMessageDialog(this, "Làm ơn nhập tất cả các trường dữ liệu!");
        } else {
            if (new DAONguoi().checkDuplicateNguoi(manguoi)||checkDuplicateTable(manguoi)) {
                JOptionPane.showMessageDialog(this, "Mã người đang bị trùng lặp vui lòng nhập lại ");
            } else {
                String data1[] = {makhupho, tenkhupho, mahoda, sonha, manguoi, Hoten, txtTuoi.getText(), txtNS.getText(), nghenghiep};
                DefaultTableModel tblmodel = (DefaultTableModel) jTable1.getModel();
                tblmodel.addRow(data1);
                txtMN.setText("");
                txtHVT.setText("");
                txtTuoi.setText("");
                txtNS.setText("");
                txtNgheNhiep.setText("");
            }
        }
    }//GEN-LAST:event_btnAddNguoiActionPerformed

    private void btnAddHoDanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddHoDanActionPerformed
        String makhupho = txtMKP.getText();
        String tenkhupho = txtTKP.getText();
        String mahoda = txtMHD.getText();
        String sonha = txtSN.getText();
        String manguoi = txtMN.getText();
        String Hoten = txtHVT.getText();
        int tuoi = Integer.parseInt(txtTuoi.getText());
        int namsinh = Integer.parseInt(txtNS.getText());
        String nghenghiep = txtNgheNhiep.getText();
        int soThanhvien = new DAOHoDan().GetSoThanhVien(mahoda);
        if (makhupho.equals("") || tenkhupho.equals("") || mahoda.equals("") || sonha.equals("")
                || manguoi.equals("") || Hoten.equals("")
                || txtTuoi.getText().equals("") || txtNS.getText().equals("") || nghenghiep.equals("")) {
            JOptionPane.showMessageDialog(this, "Làm ơn nhập tất cả các trường dữ liệu!");
        } else {
            if (new DAOHoDan().checkDuplicateHoDan(mahoda) || checkDuplicateTableHoDan(mahoda)) {
                JOptionPane.showMessageDialog(this, "Mã hộ dân đang bị trùng lặp vui lòng nhập lại ");
            } else if (new DAONguoi().checkDuplicateNguoi(manguoi) || checkDuplicateTable(manguoi)) {
                JOptionPane.showMessageDialog(this, "Mã người đang bị trùng lặp vui lòng nhập lại ");
            } else {
                String data1[] = {makhupho, tenkhupho, mahoda, sonha, manguoi, Hoten, txtTuoi.getText(), txtNS.getText(), nghenghiep};
                DefaultTableModel tblmodel = (DefaultTableModel) jTable1.getModel();
                tblmodel.addRow(data1);
                txtMHD.setText("");
                txtSN.setText("");
                txtMN.setText("");
                txtHVT.setText("");
                txtTuoi.setText("");
                txtNS.setText("");
                txtNgheNhiep.setText("");
            }
        }
    }//GEN-LAST:event_btnAddHoDanActionPerformed

    public boolean checkDuplicateTable(String manguoi) {
        boolean check = false;
        DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();
        for (int i = 0; i < tblModel.getRowCount(); i++) {
            String Manguoi = tblModel.getValueAt(i, 4).toString();
            if(Manguoi.equals(manguoi)){
                check = true;
            }
        }
        return check;
    }
    public boolean checkDuplicateTableHoDan(String mahodan) {
        boolean check = false;
        DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();
        for (int i = 0; i < tblModel.getRowCount(); i++) {
            String MaHodan = tblModel.getValueAt(i, 2).toString();
            if(MaHodan.equals(mahodan)){
                check = true;
            }
        }
        return check;
    }
    public boolean checkDuplicateTableKhuPho(String makhupho) {
        boolean check = false;
        DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();
        for (int i = 0; i < tblModel.getRowCount(); i++) {
            String MaKhuPho = tblModel.getValueAt(i, 0).toString();
            if(MaKhuPho.equals(makhupho)){
                check = true;
            }
        }
        return check;
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // insert data to table into database
        DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();
        if (tblModel.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "table is empty!");
        } else {
            String makhupho, tenkhupho, mahodan, sonha, manguoi, ten, nghenghiep;
            int tuoi, namsinh;
            for (int i = 0; i < tblModel.getRowCount(); i++) {
                makhupho = tblModel.getValueAt(i, 0).toString();
                tenkhupho = tblModel.getValueAt(i, 1).toString();
                DAOKhuPho daokp = new DAOKhuPho();
                daokp.addKhuPho(new KhuPho(makhupho, tenkhupho));
                mahodan = tblModel.getValueAt(i, 2).toString();
                sonha = tblModel.getValueAt(i, 3).toString();
                DAOHoDan daohd = new DAOHoDan();
                int soThanhvien = 0;
                daohd.addHoDan(new HoDan(mahodan, sonha, soThanhvien, makhupho));
                manguoi = tblModel.getValueAt(i, 4).toString();
                ten = tblModel.getValueAt(i, 5).toString();
                tuoi = Integer.parseInt(tblModel.getValueAt(i, 6).toString());
                namsinh = Integer.parseInt(tblModel.getValueAt(i, 7).toString());
                nghenghiep = tblModel.getValueAt(i, 8).toString();
                DAONguoi daon = new DAONguoi();
                daon.addNguoi(new Nguoi(manguoi, tuoi, namsinh, ten, nghenghiep, mahodan));
                
                soThanhvien = new DAOHoDan().GetSoThanhVien(mahodan);
                daohd.UpdateSoThanhVien(mahodan, soThanhvien);
            }
            //success msg
            JOptionPane.showMessageDialog(this, "Data insert successfully...");
            //clear table
            tblModel.setRowCount(0);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ThemKhuPho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThemKhuPho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThemKhuPho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThemKhuPho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThemKhuPho().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddHoDan;
    private javax.swing.JButton btnAddNguoi;
    private javax.swing.JButton btnaddKhuPho;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtHVT;
    private javax.swing.JTextField txtMHD;
    private javax.swing.JTextField txtMKP;
    private javax.swing.JTextField txtMN;
    private javax.swing.JTextField txtNS;
    private javax.swing.JTextField txtNgheNhiep;
    private javax.swing.JTextField txtSN;
    private javax.swing.JTextField txtTKP;
    private javax.swing.JTextField txtTuoi;
    // End of variables declaration//GEN-END:variables
}
