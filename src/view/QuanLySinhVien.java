/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Frame;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Student;
import service.StudentService;

/**
 *
 * @author Linh
 */
public class QuanLySinhVien extends javax.swing.JFrame {
    private static DefaultTableModel defaultTableModel;
    private static StudentService studentService;
    /**
     * Creates new form ListStudent
     */
    public QuanLySinhVien() {
        
        initComponents();
        defaultTableModel = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; //To change body of generated methods, choose Tools | Templates.
            }            
        };
        studentService = new StudentService();
        defaultTableModel = (DefaultTableModel) TableStudent.getModel();     
        setDataTableStudent(studentService.getAllStudent());
//        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtFind = new javax.swing.JTextField();
        btnTimKiem = new javax.swing.JButton();
        cbTheoTenNganhDiem = new javax.swing.JComboBox<>();
        btnRefresh = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableStudent = new javax.swing.JTable();
        btnExit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        btnAdd = new javax.swing.JMenu();
        btnAddThemSV = new javax.swing.JMenuItem();
        btnEdit = new javax.swing.JMenu();
        btnEditSuaThongTinSV = new javax.swing.JMenuItem();
        btnDelete = new javax.swing.JMenu();
        btnDeleteSinhVien = new javax.swing.JMenuItem();
        btnSort = new javax.swing.JMenu();
        btnSortDiemTang = new javax.swing.JMenuItem();
        btnSortDiemGiam = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Quản lý sinh viên");
        getContentPane().setLayout(null);

        txtFind.setBackground(new java.awt.Color(255, 204, 204));
        getContentPane().add(txtFind);
        txtFind.setBounds(10, 12, 250, 30);

        btnTimKiem.setBackground(new java.awt.Color(255, 0, 51));
        btnTimKiem.setForeground(new java.awt.Color(255, 255, 255));
        btnTimKiem.setText("Tìm kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });
        getContentPane().add(btnTimKiem);
        btnTimKiem.setBounds(266, 11, 100, 30);

        cbTheoTenNganhDiem.setBackground(new java.awt.Color(255, 102, 102));
        cbTheoTenNganhDiem.setForeground(new java.awt.Color(255, 102, 102));
        cbTheoTenNganhDiem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Theo tên", "Theo ngành", "Theo điểm" }));
        getContentPane().add(cbTheoTenNganhDiem);
        cbTheoTenNganhDiem.setBounds(380, 10, 140, 30);

        btnRefresh.setBackground(new java.awt.Color(255, 0, 51));
        btnRefresh.setForeground(new java.awt.Color(255, 255, 255));
        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        getContentPane().add(btnRefresh);
        btnRefresh.setBounds(1370, 10, 73, 30);

        TableStudent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã SV", "Họ tên", "Số CMND/TCC", "Ngày sinh", "Giới tính", "Điểm xét tuyển", "Email", "Địa chỉ", "SĐT", "Ngành học", "Học bổng"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false, true, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TableStudent);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 45, 1500, 740);

        btnExit.setBackground(new java.awt.Color(255, 0, 51));
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit);
        btnExit.setBounds(1460, 10, 51, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/add1.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-10, 0, 1630, 850);

        jMenuBar1.setBackground(new java.awt.Color(204, 204, 255));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 255), new java.awt.Color(153, 153, 255)));
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(146, 40));

        btnAdd.setBackground(new java.awt.Color(204, 204, 204));
        btnAdd.setBorder(null);
        btnAdd.setForeground(new java.awt.Color(255, 102, 102));
        btnAdd.setText("Thêm");
        btnAdd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btnAddThemSV.setBackground(new java.awt.Color(204, 204, 204));
        btnAddThemSV.setText("Thêm SV");
        btnAddThemSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddThemSVActionPerformed(evt);
            }
        });
        btnAdd.add(btnAddThemSV);

        jMenuBar1.add(btnAdd);

        btnEdit.setBorder(null);
        btnEdit.setForeground(new java.awt.Color(255, 102, 102));
        btnEdit.setText("Sửa");
        btnEdit.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btnEditSuaThongTinSV.setText("Sửa thông tin SV");
        btnEditSuaThongTinSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditSuaThongTinSVActionPerformed(evt);
            }
        });
        btnEdit.add(btnEditSuaThongTinSV);

        jMenuBar1.add(btnEdit);

        btnDelete.setBorder(null);
        btnDelete.setForeground(new java.awt.Color(255, 102, 102));
        btnDelete.setText("Xóa");
        btnDelete.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btnDeleteSinhVien.setText("Xóa sinh viên");
        btnDeleteSinhVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteSinhVienActionPerformed(evt);
            }
        });
        btnDelete.add(btnDeleteSinhVien);

        jMenuBar1.add(btnDelete);

        btnSort.setBackground(new java.awt.Color(255, 102, 102));
        btnSort.setBorder(null);
        btnSort.setForeground(new java.awt.Color(255, 102, 102));
        btnSort.setText("Sắp xếp");
        btnSort.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btnSortDiemTang.setText("Theo điểm tăng");
        btnSortDiemTang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortDiemTangActionPerformed(evt);
            }
        });
        btnSort.add(btnSortDiemTang);

        btnSortDiemGiam.setText("Theo điểm giảm");
        btnSortDiemGiam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortDiemGiamActionPerformed(evt);
            }
        });
        btnSort.add(btnSortDiemGiam);

        jMenuBar1.add(btnSort);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddThemSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddThemSVActionPerformed
        // TODO add your handling code here:
        AddStudentFormDialog a = new AddStudentFormDialog(this, true);
        a.setVisible(true);
    }//GEN-LAST:event_btnAddThemSVActionPerformed

    private void btnEditSuaThongTinSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditSuaThongTinSVActionPerformed
        // TODO add your handling code here:
        int indexWantEdit = TableStudent.getSelectedRow();
        if(indexWantEdit == -1){
            JOptionPane.showMessageDialog(this, "Bạn chưa chọn thông tin người muốn sửa","Lỗi",JOptionPane.ERROR_MESSAGE);
        }
        else{
            Student stu = studentService.getAllStudent().get(indexWantEdit);
            EditStudentFormDialog e = new EditStudentFormDialog(this, true,stu);
            e.setVisible(true);
        }
    }//GEN-LAST:event_btnEditSuaThongTinSVActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        setDataTableStudent(studentService.getAllStudent());
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        // TODO add your handling code here:
        if(!txtFind.getText().isEmpty()){
            
            String tuTimKiem = txtFind.getText();
            int objectFind = cbTheoTenNganhDiem.getSelectedIndex();
            List<Student> dstk = new ArrayList<>();
            if(objectFind == 0){
                dstk = studentService.TimTheoTen(tuTimKiem, studentService.getAllStudent());
                
            }
            else if(objectFind == 1){
                dstk = studentService.TimTheoNganh(tuTimKiem, studentService.getAllStudent());
                
            }
            else{
                if(!Pattern.matches("(^-)*\\d+(.\\d+)*", tuTimKiem)){
                    JOptionPane.showMessageDialog(this, "Định dạng tìm kiếm điểm phải là số thực", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
                else{
                    dstk = studentService.TimTheoDiem(Float.valueOf(tuTimKiem), studentService.getAllStudent());
                }
            }
            setDataTableStudent(dstk);
        }
        else{
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập đối tượng muốn tìm", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
        
        
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void btnDeleteSinhVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteSinhVienActionPerformed
        // TODO add your handling code here:
        int indexWantDelete = TableStudent.getSelectedRow();
        if(indexWantDelete == -1){
            JOptionPane.showMessageDialog(this, "Bạn chưa chọn thông tin người muốn xóa","Lỗi",JOptionPane.ERROR_MESSAGE);
        }
        else{
            
            Student stu = studentService.getAllStudent().get(indexWantDelete);
            int option = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa");
            System.out.println("option : " + option);
            
            if(option == 0) {
                studentService.deleteStudent(stu.getId());
                setDataTableStudent(studentService.getAllStudent());
            }
            
        }
    }//GEN-LAST:event_btnDeleteSinhVienActionPerformed

    private void btnSortDiemTangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortDiemTangActionPerformed
        // TODO add your handling code here:
        List<Student> dsSapXepTang = new ArrayList<>();
        for(int i = 0; i<TableStudent.getRowCount();i++){
            Student stu = getRowDataTableStudent(i);
            dsSapXepTang.add(stu);
        }
        dsSapXepTang = studentService.SapXepDiemTang(dsSapXepTang);
        setDataTableStudent(dsSapXepTang);
    }//GEN-LAST:event_btnSortDiemTangActionPerformed

    private void btnSortDiemGiamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortDiemGiamActionPerformed
        // TODO add your handling code here:
        List<Student> dsSapXepGiam = new ArrayList<>();
        for(int i = 0; i<TableStudent.getRowCount();i++){
            Student stu = getRowDataTableStudent(i);
            dsSapXepGiam.add(stu);
        }
        dsSapXepGiam = studentService.SapXepDiemGiam(dsSapXepGiam);
        setDataTableStudent(dsSapXepGiam);
    }//GEN-LAST:event_btnSortDiemGiamActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:        
            this.dispose();
        
    }//GEN-LAST:event_btnExitActionPerformed

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
            java.util.logging.Logger.getLogger(QuanLySinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLySinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLySinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLySinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                QuanLySinhVien listStudent = new QuanLySinhVien();
                listStudent.setVisible(true);
                //listStudent.setLocationRelativeTo(null);
                listStudent.setExtendedState(JFrame.MAXIMIZED_BOTH);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableStudent;
    private javax.swing.JMenu btnAdd;
    private javax.swing.JMenuItem btnAddThemSV;
    private javax.swing.JMenu btnDelete;
    private javax.swing.JMenuItem btnDeleteSinhVien;
    private javax.swing.JMenu btnEdit;
    private javax.swing.JMenuItem btnEditSuaThongTinSV;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JMenu btnSort;
    private javax.swing.JMenuItem btnSortDiemGiam;
    private javax.swing.JMenuItem btnSortDiemTang;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JComboBox<String> cbTheoTenNganhDiem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtFind;
    // End of variables declaration//GEN-END:variables
    public static void setDataTableStudent(List<Student> list){
        defaultTableModel.setRowCount(0);
        int stt = 1;
        for(Student a:list){
            defaultTableModel.addRow(new Object[]{
                stt,
                a.getId(),
                a.getName(),
                a.getCard_number(),
                a.getBirthday(),             
                a.getGender(),
                a.getTest_score(),
                a.getEmail(),
                a.getAddress(),
                a.getPhone_number(),
                a.getMajors(),
                a.isScholarship()
            });
            stt++;
        }
    }
    public Student getRowDataTableStudent(int i){
        Student stu = new Student(TableStudent.getValueAt(i, 1).toString(),
                TableStudent.getValueAt(i, 2).toString(),
                TableStudent.getValueAt(i, 3).toString(),
                TableStudent.getValueAt(i, 4).toString(),
                TableStudent.getValueAt(i, 5).toString(),
                Float.valueOf(TableStudent.getValueAt(i, 6).toString()),
                TableStudent.getValueAt(i, 7).toString(),
                TableStudent.getValueAt(i, 8).toString(),
                TableStudent.getValueAt(i, 9).toString(),
                TableStudent.getValueAt(i, 10).toString(),
                Boolean.valueOf(TableStudent.getValueAt(i, 11).toString()));
        return stu;
    }
}
