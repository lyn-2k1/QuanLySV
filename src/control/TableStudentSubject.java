/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;


import java.util.ArrayList;
import java.util.List;
import model.Subject;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
/**
 *
 * @author linh
 */
public class TableStudentSubject {
    public List<Subject> getAllSubject() {
        List<Subject> list_subject = new ArrayList<>();
        Connection conn =  DBconnection.getConnection();
        String sql = "SELECT * FROM student.t_monhoc";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()){
                Subject sub = new Subject();
                sub.setMa(rs.getString("ma"));
                sub.setTen(rs.getString("ten"));
                sub.setTinchi(rs.getInt("tin_chi"));
                sub.setGiatien(rs.getLong("gia_tien"));
                list_subject.add(sub);
            }
            return list_subject;
        } catch (SQLException ex) {
            Logger.getLogger(TableStudentConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public Subject getSubject(String ma) {
        Connection conn = DBconnection.getConnection();
        String sql = "SELECT * FROM student.t_monhoc WHERE ma = ?";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, ma);
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()){
                Subject sub = new Subject();
                sub.setMa(rs.getString("ma"));
                sub.setTen(rs.getString("ten"));
                sub.setTinchi(rs.getInt("tin_chi"));
                sub.setGiatien(rs.getLong("gia_tien"));
                return sub;
            }
        } catch (SQLException ex) {
            Logger.getLogger(TableStudentConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public void addSubject(Subject sub) {
        Connection conn = DBconnection.getConnection();
        String sql = "INSERT INTO `student`.`t_monhoc`"
                + "(`ma`, `ten`, `tin_chi`,`gia_tien`)"
                + "VALUES (?, ?, ? , ?);";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            
            preparedStatement.setString(1, sub.getMa());
            preparedStatement.setString(2, sub.getTen());
            preparedStatement.setInt(3, sub.getTinchi());
            preparedStatement.setLong(4, sub.getGiatien());
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(TableStudentConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void editSubject(Subject sub) {
        Connection conn = DBconnection.getConnection();
        String sql = "UPDATE student.t_monhoc SET ten = ?, tin_chi = ?, gia_tien = ?  WHERE ma = ?";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            
            preparedStatement.setString(1, sub.getTen());
            preparedStatement.setInt(2, sub.getTinchi());
            preparedStatement.setLong(3, sub.getGiatien());
            preparedStatement.setString(4, sub.getMa());
            
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(TableStudentConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void deleteSubject(String ma) {
        Connection conn = DBconnection.getConnection();
        String sql = "DELETE FROM student.t_monhoc WHERE ma = ?";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, ma);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(TableStudentConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
