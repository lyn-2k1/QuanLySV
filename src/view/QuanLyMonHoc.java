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
import model.Subject;
import service.SubjectService;

/**
 *
 * @author Linh
 */
public class QuanLyMonHoc extends javax.swing.JFrame {
    private static DefaultTableModel defaultTableModel;
    private static SubjectService subjectService;
    /**
     * Creates new form ListStudent
     */
    public QuanLyMonHoc() {
        
        initComponents();
        defaultTableModel = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; //To change body of generated methods, choose Tools | Templates.
            }            
        };
        subjectService = new SubjectService();
        defaultTableModel = (DefaultTableModel) TableSubject.getModel();     
        setDataTableSubject(subjectService.getAllSubjects());
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
        cbTheoTenKhoa = new javax.swing.JComboBox<>();
        btnRefresh = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableSubject = new javax.swing.JTable();
        btnExit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        btnAdd = new javax.swing.JMenu();
        btnAddThemSV = new javax.swing.JMenuItem();
        btnEdit = new javax.swing.JMenu();
        btnEditSuaThongTinSV = new javax.swing.JMenuItem();
        btnDelete = new javax.swing.JMenu();
        btnXoaMonHoc = new javax.swing.JMenuItem();
        btnSort = new javax.swing.JMenu();
        btnSortMaMH = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Quản lý môn học");
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
        btnTimKiem.setBounds(266, 11, 90, 30);

        cbTheoTenKhoa.setBackground(new java.awt.Color(255, 0, 51));
        cbTheoTenKhoa.setForeground(new java.awt.Color(255, 0, 51));
        cbTheoTenKhoa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Theo tên môn học", "Theo khoa" }));
        cbTheoTenKhoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTheoTenKhoaActionPerformed(evt);
            }
        });
        getContentPane().add(cbTheoTenKhoa);
        cbTheoTenKhoa.setBounds(360, 10, 160, 30);

        btnRefresh.setBackground(new java.awt.Color(255, 0, 51));
        btnRefresh.setForeground(new java.awt.Color(255, 255, 255));
        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        getContentPane().add(btnRefresh);
        btnRefresh.setBounds(1390, 10, 73, 30);

        TableSubject.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã Môn học", "Tên Môn học", "Số tín chỉ", "Gía tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TableSubject);
        if (TableSubject.getColumnModel().getColumnCount() > 0) {
            TableSubject.getColumnModel().getColumn(4).setResizable(false);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 45, 1510, 740);

        btnExit.setBackground(new java.awt.Color(255, 0, 51));
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit);
        btnExit.setBounds(1470, 10, 51, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/add1.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1570, 810);

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
        btnAddThemSV.setText("Thêm Môn Học");
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

        btnEditSuaThongTinSV.setText("Sửa thông tin Môn học");
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

        btnXoaMonHoc.setText("Xóa môn học");
        btnXoaMonHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaMonHocActionPerformed(evt);
            }
        });
        btnDelete.add(btnXoaMonHoc);

        jMenuBar1.add(btnDelete);

        btnSort.setBackground(new java.awt.Color(255, 102, 102));
        btnSort.setBorder(null);
        btnSort.setForeground(new java.awt.Color(255, 102, 102));
        btnSort.setText("Sắp xếp");
        btnSort.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btnSortMaMH.setText("Theo mã môn học");
        btnSortMaMH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortMaMHActionPerformed(evt);
            }
        });
        btnSort.add(btnSortMaMH);

        jMenuBar1.add(btnSort);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddThemSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddThemSVActionPerformed
        // TODO add your handling code here:
        AddSubjectFormDialog addSubjectFormDialog = new AddSubjectFormDialog(this, true);
        addSubjectFormDialog.setVisible(true);
    }//GEN-LAST:event_btnAddThemSVActionPerformed

    private void btnEditSuaThongTinSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditSuaThongTinSVActionPerformed
        // TODO add your handling code here:
        int indexWantEdit = TableSubject.getSelectedRow();
        if(indexWantEdit == -1){
            JOptionPane.showMessageDialog(this, "Bạn chưa chọn thông tin người muốn sửa","Lỗi",JOptionPane.ERROR_MESSAGE);
        }
        else{
            Subject sub = subjectService.getAllSubjects().get(indexWantEdit);
            EditSubjectFormDialog e = new EditSubjectFormDialog(this, true, sub);
            e.setVisible(true);
        }
    }//GEN-LAST:event_btnEditSuaThongTinSVActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        setDataTableSubject(subjectService.getAllSubjects());
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        // TODO add your handling code here:
        if(!txtFind.getText().isEmpty()){
            
            String tuTimKiem = txtFind.getText();
            int objectFind = cbTheoTenKhoa.getSelectedIndex();
            List<Subject> list = new ArrayList<>();
            if(objectFind == 0){
                list = subjectService.TimTheoTen(tuTimKiem, subjectService.getAllSubjects());
                
            }
            else if(objectFind == 1){
                list = subjectService.TimTheoKhoa(tuTimKiem, subjectService.getAllSubjects());
                
            }

            setDataTableSubject(list);
        }
        else{
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập đối tượng muốn tìm", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
        
        
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void btnXoaMonHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaMonHocActionPerformed
        // TODO add your handling code here:
        int indexWantDelete = TableSubject.getSelectedRow();
        if(indexWantDelete == -1){
            JOptionPane.showMessageDialog(this, "Bạn chưa chọn thông tin người muốn xóa","Lỗi",JOptionPane.ERROR_MESSAGE);
        }
        else{
            
            Subject sub = subjectService.getAllSubjects().get(indexWantDelete);
            int option = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa");
            System.out.println("option : " + option);
            
            if(option == 0) {
                subjectService.deleteSubject(sub.getMa());
                setDataTableSubject(subjectService.getAllSubjects());
            }
            
        }
    }//GEN-LAST:event_btnXoaMonHocActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:        
            
            this.dispose();       
    }//GEN-LAST:event_btnExitActionPerformed

    private void cbTheoTenKhoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTheoTenKhoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTheoTenKhoaActionPerformed

    private void btnSortMaMHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortMaMHActionPerformed
        // TODO add your handling code here:
        List<Subject> list = new ArrayList<>();
        for(int i = 0; i<TableSubject.getRowCount();i++){
            Subject sub = getRowDataTableSubject(i);
            list.add(sub);
        }
        List lista = subjectService.SapXepMaMonHoc(list);
        setDataTableSubject(lista);
    }//GEN-LAST:event_btnSortMaMHActionPerformed

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
                QuanLyMonHoc quanLyMonHoc = new QuanLyMonHoc();
                quanLyMonHoc.setVisible(true);
                //listStudent.setLocationRelativeTo(null);
                quanLyMonHoc.setExtendedState(JFrame.MAXIMIZED_BOTH);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableSubject;
    private javax.swing.JMenu btnAdd;
    private javax.swing.JMenuItem btnAddThemSV;
    private javax.swing.JMenu btnDelete;
    private javax.swing.JMenu btnEdit;
    private javax.swing.JMenuItem btnEditSuaThongTinSV;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JMenu btnSort;
    private javax.swing.JMenuItem btnSortMaMH;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JMenuItem btnXoaMonHoc;
    private javax.swing.JComboBox<String> cbTheoTenKhoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtFind;
    // End of variables declaration//GEN-END:variables
    public static void setDataTableSubject(List<Subject> list){
        defaultTableModel.setRowCount(0);
        int stt = 1;
        for(Subject sub:list){
            defaultTableModel.addRow(new Object[]{
                stt,
                sub.getMa(),
                sub.getTen(),
                sub.getTinchi(),
                sub.getGiatien(),    
            });
            stt++;
        }
    }
    public Subject getRowDataTableSubject(int i){
        Subject sub = new Subject(TableSubject.getValueAt(i, 1).toString(),
                TableSubject.getValueAt(i, 2).toString(),
                Integer.valueOf(TableSubject.getValueAt(i, 3).toString()));             
        return sub;
    }
}
