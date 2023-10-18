package ru.mirea.lab32;

import java.io.Serializable;

public class Address implements Serializable {
    private String cityName;
    private int zipCode;
    private String streetName;
    private int buildingNumber;
    private char buildingLetter;
    private Address EMPTY_ADRESS;

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public int getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(int buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    public char getBuildingLetter() {
        return buildingLetter;
    }

    public void setBuildingLetter(char buildingLetter) {
        this.buildingLetter = buildingLetter;
    }

    public Address getEMPTY_ADRESS() {
        return EMPTY_ADRESS;
    }

    public void setEMPTY_ADRESS(Address EMPTY_ADRESS) {
        this.EMPTY_ADRESS = EMPTY_ADRESS;
    }
}
