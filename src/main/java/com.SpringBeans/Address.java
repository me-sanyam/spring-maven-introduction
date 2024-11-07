package com.SpringBeans;

public class Address {

    private String location;
    private String city;
    private String state;
    private int zipcode;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String toString(){
        return this.location+", "+this.city+", "+this.state+", zip : "+this.zipcode;
    }
}
