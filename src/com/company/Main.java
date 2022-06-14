package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Box <String> boxes = new Box<>("Manchester", "City");
        Box <Double> boxer = new Box<>(3.7, 8.1);
        Box <Boolean> boxing = new Box<>(true, false);

        Box.genericMethod(boxer, boxes);
        Box.genericMethod(boxing, boxer);


    }
}
