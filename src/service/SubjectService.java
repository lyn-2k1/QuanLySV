/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import control.TableStudentSubject;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import model.Subject;

/**
 *
 * @author linh
 */
public class SubjectService {
    private TableStudentSubject tableStudentSubject;
    
    public SubjectService(){
        tableStudentSubject = new TableStudentSubject();
    }
    
    public List<Subject> getAllSubjects() {
        return tableStudentSubject.getAllSubject();
    }
    
    public Subject getSubject(String ma) {
        return tableStudentSubject.getSubject(ma);
    }
    
    public void addSubject(Subject sub) {
        tableStudentSubject.addSubject(sub);
    }
    
    public void editSubject(Subject sub) {
        tableStudentSubject.editSubject(sub);
    }
    
    public void deleteSubject(String ma) {
        tableStudentSubject.deleteSubject(ma);
    }
    public List<Subject> SapXepMaMonHoc(List<Subject> list) {
        list.sort(new Comparator<Subject>() {
            @Override
            public int compare(Subject o1, Subject o2) {
                return o1.getMa().compareTo(o2.getMa());
            }
        });
        return list;
    }
    public List<Subject> TimTheoTen(String str, List<Subject> list){
        List<Subject> list_rs = new ArrayList<>();
        for (Subject subject : list) {
            if(subject.getTen().toLowerCase().contains(str.toLowerCase())){
                list_rs.add(subject);
            }
        }
        return list_rs;
    }
    public List<Subject> TimTheoKhoa(String str, List<Subject> list){
        
        List<Subject> list_rs = new ArrayList<>();
        for (Subject subject : list) {
            if(chuanHoaMa(subject.getMa()).toLowerCase().contains(str.toLowerCase())){
                list_rs.add(subject);
            }
        }
        return list_rs;
    }
    public String chuanHoaMa(String s){
        if(s.substring(0, 4).equals("CNTT")){
            return "c??ng ngh??? th??ng tin";
        }
        else if(s.substring(0, 4).equals("ATTT")){
            return "an to??n th??ng tin";
        }
        else if(s.substring(0, 2).equals("DT")){
            return "k??? thu???t ??i???n - ??i???n t???";
        }
        else if(s.substring(0, 4).equals("DTVT")){
            return "??i???n t??? vi???n th??ng";
        }
        else if(s.substring(0, 5).equals("CNDPT")){
            return "c??ng ngh??? ??a ph????ng ti???n";
        }
        else if(s.substring(0, 3).equals("MAR")){
            return "marketing";
        }
        else if(s.substring(0, 2).equals("KT")){
            return "k??? to??n";
        }
        else if(s.substring(0, 4).equals("QTKD")){
            return "qu???n tr??? kinh doanh";
        }
        else if(s.substring(0, 4).equals("TMDT")){
            return "th????ng m???i ??i???n t???";
        }
        else{
            return "c?? b???n";
        }
    }
}
