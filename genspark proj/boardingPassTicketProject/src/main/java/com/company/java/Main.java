package com.company.java;

import org.jsoup.Jsoup;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        InputData inputData = new InputData();
        ReceiveInput recieveInput = new ReceiveInput();
        SendInput sendInput = new SendInput();
       inputData.getInputs();
       sendInput.save();
//        recieveInput.getInfo();
       // recieveInput.getSpecificUser("[" +"jim");

        sendInput.saveForUser();
//        TripInformation tripInformation = new TripInformation();
//        tripInformation.getTripInformation("france", "england");
//        System.out.println(Jsoup.connect("https://www.travelmath.com/flying-time/from/Dallas,+TX/to/Oregon+City,+OR").get());
    }
}
