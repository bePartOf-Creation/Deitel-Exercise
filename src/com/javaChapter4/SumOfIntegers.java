package com.javaChapter4;

public class SumOfIntegers {
    private int sum = 0;
    private int counter = 1;

/**----Constructor for Sum of Integers--------*/
    public SumOfIntegers(int sum, int counter) {
        this.sum = sum;
        this.counter = counter;
    }
/**----OnlyGetters Methods and No Setter method because Our
* Instance Variables has been initialised already.----*/
    public int getSum() {
        return sum;
    }

    public int getCounter() {
        return counter;
    }
/**----methods to add SUM and store the value to SUM--------*/
    public int addSumByOnes() {
        sum += getCounter();
        return  sum;
    }
/**----methods to increment Counter--------*/
    public void incrementCounter() {
        int count = 1;
        this.counter += count;
    }
/**----methods to reset counter after usage--*/
    public int resetCounter() {
        int resetValue = -1;
        if(getCounter() > resetValue){
           counter = 0;
        }else if(getCounter() != resetValue){
            incrementCounter();
        }
    return counter;
    }
}
