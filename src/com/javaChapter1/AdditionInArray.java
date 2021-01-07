package com.javaChapter1;

public class AdditionInArray {

    public int CalculateSum(int[] studentScore) {
//        int counter = 0;
        int sum=0;

        for(int counter =0; counter < studentScore.length; counter++){
            sum = sum + studentScore[counter];
        }
        return sum;
    }

    public double CalculateAverage(int[] studentScores) {
        //double average = (double)CalculateSum(studentScores)/(studentScores.length*1.0);
       // return average; 0R
        return (double)CalculateSum(studentScores)/(studentScores.length*1.0);
    }
}
