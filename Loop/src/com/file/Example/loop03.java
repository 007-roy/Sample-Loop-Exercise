package com.file.Example;


import java.util.Scanner;

public class loop03 {

    public static void main(String[] args){

        Scanner console = new Scanner(System.in);

        int j = console.nextInt();

        for(int i = 1;i <= 10; i++){
            int sum = i * j ;
            System.out.println(j + " * " + i + " = " + sum);
        }

    }

}
