/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import model.GiaoVien;
import model.MonHoc;
import model.Student;

/**
 *
 * @author hoan6
 */
public class Main {
    public static void main(String[] args) {
        model.GiaoVien gV = new GiaoVien(18, "Trang", 878, "Da Nang");
        model.Student sT = new Student(618, 1314, "Hue", "Nam");
        model.MonHoc mH = new MonHoc(102, "Pro");
        
        System.out.println(gV.getIdGV() + " : " + gV.getNameGV());
        System.out.println(sT.getIdS()+ " : " + sT.getGioitinhS());
        System.out.println(mH.getIdMonHoc()+" : "+ mH.getTenMonHoc());
        
        
    }
}
