package com.file.Practice;


public class Sqaure {

    public int method1(int x, int y){

        int z = 1;

        for (int i = y; i < 1000; i++ ){

            z *= x;

        }

        return z;
    }

    public static void main(String[] args){

        Sqaure sq1= new Sqaure();

        int b = sq1.method1(5,2);

        System.out.println("Sqaure of 5 is: " + b);

    }

}