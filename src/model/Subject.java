/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author linh
 */
public class Subject {
    private String ma,ten;
    private int tinchi;
    private long giatien;

    public Subject() {
    }

    public Subject(String ma, String ten, int tinchi) {
        this.ma = xuLy(ma,ten);
        this.ten = ten;
        this.tinchi = tinchi;
        this.giatien = 480000*tinchi;
    }
    
    public String xuLy(String ma, String ten){
        String res = ma;
        String s[] = ten.trim().toUpperCase().split("\\s+");
        for(int i = 0 ; i <s.length;i++){
            res += s[i].substring(0,1);
        }
        return res;
    }

    public long getGiatien() {
        return giatien;
    }

    public void setGiatien(long giatien) {
        this.giatien = giatien;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTinchi() {
        return tinchi;
    }

    public void setTinchi(int tinchi) {
        this.tinchi = tinchi;
    }
    
}
