package com.facebook.iljasstan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MAIN {
    public static void main(String[] args) throws IOException {
        FlatForRent flat1 = new FlatForRent("Moscow, Red Square", 10000, 5, true, true);
        FlatForRent flat2 = new FlatForRent("Moscow, Butovo", 200, 1, true, false);
        FlatForRent flat3 = new FlatForRent("Khimki", 300, 3, true, true);
        FlatForRent flat4 = new FlatForRent("Moscow, Preobrazhenskoye", 500, 2, true, true);
        FlatForRent flat5 = new FlatForRent("New Moscow, Sosenskoye", 150, 3, false, true);
        FlatForRent[] arrFlats = {flat1, flat2, flat3, flat4, flat5};

        System.out.println("If you have family, enter 1; if you are a programmer, enter 2; if you are a programmer with a family, enter 3");
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(r.readLine());
        if (count == 1) {
            for (int i = 0; i < arrFlats.length; i++) {
                if (arrFlats[i].isGoodForFamilies()) {
                    System.out.println("The flat \"" + arrFlats[i].address + "\" is good for you!");
                    arrFlats[i].rent();
                }
            }
        }
        else if (count == 2) {
            for (FlatForRent arrFlat : arrFlats) {
                if (arrFlat.isGoodForProgrammers()) {
                    System.out.println("The flat \"" + arrFlat.address + "\" is good for you!");
                    arrFlat.rent();
                }
            }
        }
        else if (count == 3) {
            for (FlatForRent arrFlat : arrFlats) {
                if (arrFlat.isGoodForFamilies() && arrFlat.isGoodForProgrammers()) {
                    System.out.println("The flat \"" + arrFlat.address + "\" is good for you!");
                    arrFlat.rent();
                }
            }

        }

    }
}
