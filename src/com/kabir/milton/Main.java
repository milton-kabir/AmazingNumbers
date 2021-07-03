package com.kabir.milton;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Enter a natural number.");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<1){
            System.out.println("This number is not natural!");
        }
        else{
            boolean ev=false,od=false,buz=false,dk=false;
            if(n%2==0){
                ev=true;
            }
            else{
                od=true;
            }
            if(n%7==0||n%10==7){
                buz=true;
            }
            int k=n;
            while(n>0){
                if(n%10==0){
                    dk=true;
                }
                n/=10;
            }
            System.out.println("Properties of "+k);
            System.out.println("even: "+ev);
            System.out.println("odd: "+od);
            System.out.println("buzz: "+buz);
            System.out.println("duck: "+dk);
        }
    }
}
