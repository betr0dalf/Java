package ru.mirea.lab30;

public class Adress {
    private String cityName;
    private int zipCode;
    private String streetName;
    private int buildingNumber;
    private char buildingLetter;
    private Adress EMPTY_ADRESS;

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

    public Adress getEMPTY_ADRESS() {
        return EMPTY_ADRESS;
    }

    public void setEMPTY_ADRESS(Adress EMPTY_ADRESS) {
        this.EMPTY_ADRESS = EMPTY_ADRESS;
    }
}
