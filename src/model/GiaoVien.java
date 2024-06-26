/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author hoan6
 */
public class GiaoVien {
    private int idGV, phoneNumberGV;
    private String nameGV, addressGV;

    public GiaoVien(int idGV , String nameGV,  int phoneNumberGV, String addressGV) {
        this.idGV = idGV;
        this.phoneNumberGV = phoneNumberGV;
        this.nameGV = nameGV;
        this.addressGV = addressGV;
    }

    public int getIdGV() {
        return idGV;
    }

    public void setIdGV(int idGV) {
        this.idGV = idGV;
    }

    public int getPhoneNumberGV() {
        return phoneNumberGV;
    }

    public void setPhoneNumberGV(int phoneNumberGV) {
        this.phoneNumberGV = phoneNumberGV;
    }

    public String getNameGV() {
        return nameGV;
    }

    public void setNameGV(String nameGV) {
        this.nameGV = nameGV;
    }

    public String getAddressGV() {
        return addressGV;
    }

    public void setAddressGV(String addressGV) {
        this.addressGV = addressGV;
    }

    @Override
    public String toString() {
        return "GiaoVien{" + "idGV = " + idGV +  ", nameGV = " + nameGV + ", phoneNumberGV = " + phoneNumberGV + ", addressGV = " + addressGV + '}';
    }
    
    
}
