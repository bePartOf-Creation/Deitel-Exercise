package com.myFirstTest;

import java.util.Scanner;
public class TelevisionTest {
        public static void main(String[] args) {
            int power;
            int button;

            Scanner userInput = new Scanner(System.in);

            Television tv = new Television("Toshiba", 220.0);
            System.out.println("Thank you purchasing " + tv.getName());

//Trying to check the power supplied into my TV before going ahead to switching on the device.
            if(tv.getPowerMode() > 241){// if PowerMode is BAD. Then Turn OFF.
                System.out.println("GoodBye!!!");
            }
            if(tv.getPowerMode() > 219 && tv.getPowerMode() < 241  ){// if PowerMode is Ok. Then Turn On.
                System.out.println("Do you want Turn ON your TV. Press 1 and 0 to Turn OFF");
                power = userInput.nextInt();

                if (power == 0) {
                    tv.setOn(false);
                    System.out.println("Tv is Turned is Turning off");
                }
                if (power == 1) {
                    tv.setOn(true);
                    System.out.println("To Operate your TV. Select this options\n1 - Check your Current Power Supplied In\n2 - Select your channel\n3 - Increase your Channel\n4 - Decrease your Channel\n5 - Increase your Volume\n6 - Decrease your Volume\n");
                    button = userInput.nextInt();// Creating Operational Buttons...
                    if (button == 1) {//button 1 to check power status
                        System.out.println("Your Power Supply is currently at " + tv.getPowerMode());

                    }
                }


            }


        }
}