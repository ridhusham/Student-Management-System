package com.example.StudentManagementSystem.entity;

public class Address {
    private String houseName;
    private String postOffice;
    private Integer pincode;
    private String district;

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    public String getPostOffice() {
        return postOffice;
    }

    public void setPostOffice(String postOffice) {
        this.postOffice = postOffice;
    }

    public Integer getPincode() {
        return pincode;
    }

    public void setPincode(Integer pincode) {
        this.pincode = pincode;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    @Override
    public String toString() {
        return "Address{" +
                "houseName='" + houseName + '\'' +
                ", postOffice='" + postOffice + '\'' +
                ", pincode=" + pincode +
                ", district='" + district + '\'' +
                '}';
    }
}
