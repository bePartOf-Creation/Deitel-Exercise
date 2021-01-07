package com.javaChapter1;

import java.util.Scanner;

public class TablesOfSquaresAndCubes {
   public static void main(String[] args) {
            int zero = 0;
            int one = 1;
            int two = 2;
            int three = 3;
            int four = 4;
            int five = 5;
            int six = 6;
            int seven =7 ;
            int eight = 8;
            int nine = 9;
            int ten = 10;
     Scanner userInput = new Scanner(System.in);
      System.out.println("Enter Digits from 0 to 10");
      if(userInput.hasNextInt()){
         int newInput = userInput.nextInt();
            System.out.printf("%6s %6s %6s%n", "numbers","square","cube");
            System.out.printf("%6d%6d%6d%n", (zero),(zero*zero),(zero*zero*zero));
            System.out.printf("%6d%6d%6d%n", (one),(one*one),(one*one*one));
            System.out.printf("%6d%6d%6d%n", (two),(two*two),(two*two*two));
            System.out.printf("%6d%6d%6d%n", (three),(three*three),(three*three*three));
            System.out.printf("%6d%6d%6d%n", (four),(four*four),(four*four*four));
            System.out.printf("%6d%6d%6d%n", (five),(five*five),(five*five*five));
            System.out.printf("%6d%6d%6d%n", (six),(six*six),(six*six*six));
            System.out.printf("%6d%6d%6d%n", (seven),(seven*seven),(seven*seven*seven));
            System.out.printf("%6d%6d%6d%n", (eight),(eight*eight),(eight*eight*eight));
            System.out.printf("%6d%6d%6d%n", (nine),(nine*nine),(nine*nine*nine));
            System.out.printf("%6d%6d%6d%n", (ten),(ten*ten),(ten*ten*ten));
         }
        else{
            System.out.println("Your Input Is Invalid");
        }
   }

}
