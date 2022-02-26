/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Duc Thanh
 */
public class Student {
    private String id;
    private String name;
    private String card_number;
    private String birthday;
    private String gender;
    private float test_score;
    private String email;
    private String address;
    private String phone_number;
    private String majors;
    private boolean scholarship;
    private String password;

    public Student() {
    }

    public Student(String id, String name, String cmt, String ns,
            String gt, float diemXT, String email, String address,
            String phone_number, String majors, boolean scholarship) {
        this.id = id;
        this.name = name;
        this.card_number = cmt;
        this.birthday = ns;
        this.gender = gt;
        this.test_score = diemXT;
        this.email = email;
        this.address = address;
        this.phone_number = phone_number;
        this.majors = majors;
        this.scholarship = scholarship;
    }

    public Student(String name, String ns, String cmt, String gioiTinh, Float diemXT, String email, String diachi,String sdt, String nganhHoc, boolean hocBong) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.name = name;
        this.card_number = cmt;
        this.birthday = ns;
        this.gender = gioiTinh;
        this.test_score = diemXT;
        this.email = email;
        this.address = diachi;
        this.phone_number = sdt;
        this.majors = nganhHoc;
        this.scholarship = hocBong;
    }
    public Student(String name,String cmt,String email,String pass){
        this.name = name;
        this.card_number = cmt;
        this.birthday = null;
        this.gender = null;
        this.test_score = 0;
        this.email = email;
        this.address = null;
        this.phone_number = null;
        this.majors = null;
        this.scholarship = false;
        this.password = pass;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCard_number() {
        return card_number;
    }

    public void setCard_number(String card_number) {
        this.card_number = card_number;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public float getTest_score() {
        return test_score;
    }

    public void setTest_score(float test_score) {
        this.test_score = test_score;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public boolean isScholarship() {
        return scholarship;
    }

    public void setScholarship(boolean scholarship) {
        this.scholarship = scholarship;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }
    
}
