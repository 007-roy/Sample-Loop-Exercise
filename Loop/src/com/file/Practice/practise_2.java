package com.file.Practice;


public class practise_2 {

    public static void main(String[] args){

        int a1,a2,a3;

        int temp = 12233;
        int armstrong = 0;

        for (int i = 1; i < temp; i++){

            a1 = temp % 10;
            armstrong += a1 * a1 * a1;
            temp--;

            System.out.println(armstrong);

        }

    }

}
