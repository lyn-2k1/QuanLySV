/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import control.TableStudentConnection;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import model.Student;

/**
 *
 * @author Duc Thanh
 */
public class StudentService {
    private TableStudentConnection tableStudentConnection;
    
    public StudentService(){
        tableStudentConnection = new TableStudentConnection();
    }
    
    public List<Student> getAllStudent() {
        return tableStudentConnection.getAllStudent();
    }
    
    public Student getStudent(String id) {
        return tableStudentConnection.getStudent(id);
    }
    
    public void addStudent(Student st) {
        tableStudentConnection.addStudent(st);
    }
    
    public void editStudent(Student st) {
        tableStudentConnection.editStudent(st);
    }
    
    public void deleteStudent(String id) {
        tableStudentConnection.deleteStudent(id);
    }
    
    public List<Student> SapXepDiemTang(List<Student> list) {
        list.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.getTest_score() > o2.getTest_score()) return 1;
                else if(o1.getTest_score() < o2.getTest_score()) return -1;
                else return 0;
            }
        });
        return list;
    }
    
    public List<Student> SapXepDiemGiam(List<Student> list) {
        list.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o2.getTest_score() > o1.getTest_score()) return 1;
                else if(o2.getTest_score() < o1.getTest_score()) return -1;
                else return 0;
            }
        });
        return list;
    }
    
    public List<Student> TimTheoTen(String str, List<Student> list){
        List<Student> list_rs = new ArrayList<>();
        for (Student student : list) {
            if(student.getName().toLowerCase().contains(str.toLowerCase())){
                list_rs.add(student);
            }
        }
        return list_rs;
    }
    
    public List<Student> TimTheoNganh(String str, List<Student> list) {
        List<Student> list_rs = new ArrayList<>();
        for (Student student : list) {
            if(student.getMajors().toLowerCase().contains(str.toLowerCase())){
                list_rs.add(student);
            }
        }
        return list_rs;
    }
    
    public List<Student> TimTheoDiem(float diem, List<Student> list) {
        List<Student> list_rs = new ArrayList<>();
        for (Student student : list) {
            if(student.getTest_score() == diem){
                list_rs.add(student);
            }
        }
        return list_rs;
    }

    
}
