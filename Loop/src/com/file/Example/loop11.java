package com.file.Example;
import java.util.Scanner;

public class loop11 {

    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        int positive = 0;
        int zero = 0;
        int negative = 0;

        char choice;

        do {

            for(int j = 5; j >0; j--){
                System.out.println("Input your desired numbers : ");
                int number = scn.nextInt();

                    if (number > 0) {
                        positive++;
                    }if (number < 0) {
                        negative++;
                    }
                    if (number == 0){
                        zero++;
                }

            }
            System.out.println("Do You Want to Continue? Y/N");
            choice = scn.next().charAt(0);

        }while(choice == 'Y' || choice == 'y');

        System.out.println("The Positive Numbers Are: " + positive );
        System.out.println("The Negative Numbers Are: " + negative);
        System.out.println("The Zero's Are: " + zero);

    }

}