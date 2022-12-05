package com.file.Practice;


public class example2 {

    public static void main(String[] args){

        int s1;
        int temp = 1634;
        int sum = 0;

        while(temp != 0 ){

            if (temp < 1000){
                s1 = temp % 10;
                temp = temp / 10;
                sum += s1 * s1 * s1;
            } else if (temp > 1000 && temp < 10000){
                s1 = temp % 10;
                temp = temp / 10;
                sum += s1 * s1 * s1 * s1;
            } else if (temp > 10000 && temp < 100000) {
                s1 = temp % 10;
                temp = temp / 10;
                sum += s1 * s1 * s1 * s1 * s1;
            }

            if (temp == sum){
                System.out.println("It's an Armstrong number. " + temp );
            }else {
                System.out.println("Not an Armstrong Number.");
            }

        }

    }

}