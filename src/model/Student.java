/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package model;

/**
 *
 * @author hoan6
 */
public class Student {

    private int idS, phoneNumberS;
    private String addressS, gioitinhS;

    public Student(int idS, int phoneNumberS, String addressS, String gioitinhS) {
        this.idS = idS;
        this.phoneNumberS = phoneNumberS;
        this.addressS = addressS;
        this.gioitinhS = gioitinhS;
    }

    public int getIdS() {
        return idS;
    }

    public void setIdS(int idS) {
        this.idS = idS;
    }

    public int getPhoneNumberS() {
        return phoneNumberS;
    }

    public void setPhoneNumberS(int phoneNumberS) {
        this.phoneNumberS = phoneNumberS;
    }

    public String getAddressS() {
        return addressS;
    }

    public void setAddressS(String addressS) {
        this.addressS = addressS;
    }

    public String getGioitinhS() {
        return gioitinhS;
    }

    public void setGioitinhS(String gioitinhS) {
        this.gioitinhS = gioitinhS;
    }

    @Override
    public String toString() {
        return "Student{" + "idS = " + idS + ", phoneNumberS = " + phoneNumberS + ", addressS = " + addressS + ", gioitinhS = " + gioitinhS + '}';
    }
    
    
    
    
}
