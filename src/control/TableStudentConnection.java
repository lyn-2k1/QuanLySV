/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import java.util.List;
import model.Student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;

/**
 *
 * @author Duc Thanh
 */
public class TableStudentConnection {

    public List<Student> getAllStudent() {
        List<Student> list_student = new ArrayList<>();
        Connection conn = DBconnection.getConnection();
        String sql = "SELECT * FROM student.t_student";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()){
                Student std = new Student();
                std.setId("SV" + String.format("%05d", rs.getInt("id")));
                std.setName(rs.getString("ten_sv"));
                std.setBirthday(rs.getString("ngay_sinh"));
                std.setCard_number(rs.getString("cmt_cccd"));
                std.setGender(rs.getString("gioi_tinh"));
                std.setTest_score(rs.getFloat("diem"));
                std.setEmail(rs.getString("email"));
                std.setAddress(rs.getString("dia_chi"));
                std.setPhone_number(rs.getString("sdt"));
                std.setMajors(rs.getString("nganh_hoc"));
                std.setScholarship(rs.getBoolean("hoc_bong"));
                std.setPassword(rs.getString("password"));
                list_student.add(std);
            }
            return list_student;
        } catch (SQLException ex) {
            Logger.getLogger(TableStudentConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public Student getStudent(String id) {
        Connection conn = DBconnection.getConnection();
        String sql = "SELECT * FROM student.t_student WHERE id = ?";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, Integer.parseInt(id.substring(2)));
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()){
                Student std = new Student();
                std.setId("SV" + String.format("%05d", rs.getInt("id")));
                std.setName(rs.getString("ten_sv"));
                std.setBirthday(rs.getString("ngay_sinh"));
                std.setCard_number(rs.getString("cmt_cccd"));
                std.setGender(rs.getString("gioi_tinh"));
                std.setTest_score(rs.getFloat("diem"));
                std.setAddress(rs.getString("dia_chi"));
                std.setEmail(rs.getString("email"));
                std.setPhone_number(rs.getString("sdt"));
                std.setMajors(rs.getString("nganh_hoc"));
                std.setScholarship(rs.getBoolean("hoc_bong"));
                std.setPassword(rs.getString("password"));
                return std;
            }
        } catch (SQLException ex) {
            Logger.getLogger(TableStudentConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public void addStudent(Student st) {
        Connection conn = DBconnection.getConnection();
        String sql = "INSERT INTO `student`.`t_student`"
                + "(`ten_sv`, `cmt_cccd`, `ngay_sinh`, `gioi_tinh`, `diem`,"
                + "`email`, `dia_chi`, `sdt`, `nganh_hoc`, `hoc_bong`,`password`)"
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?);";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            
            preparedStatement.setString(1, st.getName());
            preparedStatement.setString(2, st.getCard_number());
            preparedStatement.setString(3, st.getBirthday());
            preparedStatement.setString(4, st.getGender());
            preparedStatement.setFloat(5, st.getTest_score());
            preparedStatement.setString(6, st.getEmail());
            preparedStatement.setString(7, st.getAddress());
            preparedStatement.setString(8, st.getPhone_number());
            preparedStatement.setString(9, st.getMajors());
            preparedStatement.setBoolean(10, st.isScholarship());
            preparedStatement.setString(11, st.getPassword());
            
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(TableStudentConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void editStudent(Student st) {
        Connection conn = DBconnection.getConnection();
        String sql = "UPDATE student.t_student SET ten_sv = ?, cmt_cccd = ?, "
                + "ngay_sinh = ?, gioi_tinh = ?, diem = ?, email = ?, dia_chi ="
                + " ?, sdt = ?, nganh_hoc = ?, hoc_bong = ?, password = ?  WHERE id = ?";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            
            preparedStatement.setString(1, st.getName());
            preparedStatement.setString(2, st.getCard_number());
            preparedStatement.setString(3, st.getBirthday());
            preparedStatement.setString(4, st.getGender());
            preparedStatement.setFloat(5, st.getTest_score());
            preparedStatement.setString(6, st.getEmail());
            preparedStatement.setString(7, st.getAddress());
            preparedStatement.setString(8, st.getPhone_number());
            preparedStatement.setString(9, st.getMajors());
            preparedStatement.setBoolean(10, st.isScholarship());
            preparedStatement.setString(11, st.getPassword());
            preparedStatement.setInt(12, Integer.parseInt(st.getId().substring(2)));
            
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(TableStudentConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void deleteStudent(String id) {
        Connection conn = DBconnection.getConnection();
        String sql = "DELETE FROM student.t_student WHERE id = ?";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, Integer.parseInt(id.substring(2)));
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(TableStudentConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
//    public static void main(String[] args) {
//        List<Student> ds = new TableStudentConnection().getAllStudent();
//        for(Student a:ds){
//            System.out.println(a.getId());
//        }
//    }
}
