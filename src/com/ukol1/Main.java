package com.ukol1;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String name = "Jan";
        String surname = "Novák";
        int numberOfPurchase = 10;
        String town = "Ostrava";
        double fuel = 8.75;
        double lenghtOfCable = 716.55;
        LocalDate dateOfBirth = LocalDate.of(1980, 3,3);
        String spz = "1T6 6132";
        String ip = "192.168.1.1";

    System.out.println(name+"\n"+surname+"\n"+numberOfPurchase+"\n"+town+"\n"+fuel+"\n"+lenghtOfCable+"\n"+dateOfBirth+"\n"+spz+"\n"+ip );
    }
}
