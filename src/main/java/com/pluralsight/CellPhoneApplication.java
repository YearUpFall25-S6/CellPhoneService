package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        CellPhone myPhone = new CellPhone();

        //serial number
        System.out.print("What is the serial number?: ");
        int sn = scanner.nextInt();
        scanner.nextLine();

        myPhone.setSerialNumber(sn);

        //model
        System.out.print("What is the model?: ");
        String model = scanner.nextLine();

        myPhone.setModel(model);

        //carrier
        System.out.print("What is the carrier?: ");
        String carrier = scanner.nextLine();

        myPhone.setCarrier(carrier);

        //phone number
        System.out.print("What is the phone number?: ");
        String phoneNumber = scanner.nextLine();

        myPhone.setPhoneNumber(phoneNumber);

        //owner
        System.out.print("What is the owner?: ");
        String owner = scanner.nextLine();

        myPhone.setModel(owner);

    }
}
