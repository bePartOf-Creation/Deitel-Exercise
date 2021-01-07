package com.javaChapter2;

import java.security.SecureRandom;

public class Craps {
    //Always generate random values secretly.
    private static final SecureRandom random = new SecureRandom();


    //Provide 3 game Status Messages as Enum Constants secretly.
    private  enum  Status { WON, LOSE, CONTINUE}

    //Assign a Constants Value to each dice FaceName secretly
    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

    /* Methods to add face value of each Dice called ROll Dice to be used
    in the Same class Main"s method.**/
     private static int rollDice(){
         int sum;
         int firstDice = 1 + random.nextInt(6);
         int secondDice = 1 + random.nextInt(6);
//         System.out.println(firstDice);
//         System.out.println(secondDice);
         sum= firstDice + secondDice;
         return sum;
     }

/* ------------------- Main Method ------------------------------ */
public static void main(String[] args) {
    int myPoint = 0;
    Status gameStatus;

    // Store sum of dice face values from rollDice() in sumOdfDice;
    int sumOfDice = rollDice();
/*Display each dice FaceName according to the sumValue from rollDice(), stored in
sumOfDice using Switch.*/
    switch (sumOfDice) {
        case SEVEN, YO_LEVEN -> gameStatus = Status.WON;
        case SNAKE_EYES, TREY, BOX_CARS -> gameStatus = Status.LOSE;
        default -> {
            gameStatus = Status.CONTINUE;
            myPoint = sumOfDice;
            System.out.printf("your point is %d%n.", myPoint);
        }
    }
    while(gameStatus == Status.CONTINUE){
          sumOfDice = rollDice();

          if(sumOfDice == myPoint){
              gameStatus = Status.WON;
          }
          else
              if(sumOfDice == SEVEN){
             gameStatus = Status.LOSE;
          }
    }

    if(gameStatus == Status.WON){
        System.out.println("Player WINS");
    }
    else {
        System.out.println("Player LOSES");
    }
  }
}
