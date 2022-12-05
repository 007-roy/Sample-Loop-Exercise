package com.file.Practice;


public class Practise1 {

    public static void main(String[] args){

        int[] num = {-12,-10,-8,-5,0,23,34,56,67};

        int[] positive = new int[0];
        int[] negative = new int[0];
        int[] zero = new int[0] ;

        int n= num.length;

        for (int j = 0 ; j < n ;j++ ){

            if (num[j] >= 1){
                positive[j] = num[j];
            } else if (num[j] < -1) {
                negative[j] = num[j] ;
            } else if (num[j] == 0) {
                zero[j] = num[j];
            }

        }

        System.out.println("Length of Positive numbers : " + positive.length);

        System.out.println("Length of Negative numbers : " + negative.length);

        System.out.println("Length of Zeros : " + zero.length);

    }

}