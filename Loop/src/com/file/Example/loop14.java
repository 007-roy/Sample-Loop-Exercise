package com.file.Example;


public class loop14 {
    
    public static void main(String[] args){
        
        int fiba,fibb,fib ;
        int n = 0;
        fiba = n;
        fibb = n + 1;
        fib = fiba + fibb;


        for(int i = 0; i < 1000; i++){

            fiba = fibb;
            fibb = fib;
            fib = fiba + fibb;
            System.out.println(fib);

            if (fib > 100000){
                break;
            }

        }

    }
    
}
