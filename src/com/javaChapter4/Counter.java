package com.javaChapter4;

public class Counter {

    private int counter;
    public Counter(int counter) {
        this.counter = counter;
    }

    public int getCounter() {
        return  counter;
    }

    public void setCounter(int newCounter) {
        this.counter = newCounter;
    }

    public int displayCounter() {
          for( ; counter <= 10; counter++){
              System.out.println(counter);
          }
          return  counter;
        }

    public String isCountGreaterThanTen() {
        String message = "";
       if(counter > 10){
          message = "Count is greaterThan 10";
       }else {
           message = "Count is Lesser Than 10";
       }
       return  message;
    }
}

