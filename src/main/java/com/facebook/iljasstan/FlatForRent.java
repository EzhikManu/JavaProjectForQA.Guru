package com.facebook.iljasstan;

public class FlatForRent {
    int coastPerMonth;
    int numberOfRooms;
    String address;
    boolean hasInternet;
    boolean hasBalcony;

    public FlatForRent(String address, int coastPerMonth, int numberOfRooms, boolean hasInternet, boolean hasBalcony) {
        this.address = address;
        this.coastPerMonth = coastPerMonth;
        this.numberOfRooms = numberOfRooms;
        this.hasInternet = hasInternet;
        this.hasBalcony = hasBalcony;
        if (isGoodForFamilies() == true) {
            System.out.println("The flat " + address + " is good for Families.");
        }
        if (isGoodForProgrammers() == true) {
            System.out.println("The flat " + address + " is good for Programmers.");
        }
    }

    public void rent() {
        System.out.println("Pay " + coastPerMonth + "$ and live!");
    }
    public boolean isGoodForFamilies() {
        if (numberOfRooms >= 2) {
            return true;
        }
        else return false;
    }
    public boolean isGoodForProgrammers() {
        if (hasInternet == true) {
            return true;
        }
        else return false;
    }
}
