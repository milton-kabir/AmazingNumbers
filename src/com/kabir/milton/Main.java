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
            if(n%2==0){
                System.out.println("This number is Even.");
            }
            else{
                System.out.println("This number is Odd.");
            }
            if(n%7!=0&&n%10!=7){
                System.out.println("It is not a Buzz number.\nExplanation:\n"+n+" is neither divisible by 7 nor does it end with 7.");

            }
            else if(n%7==0&&n%10==7){
                System.out.println("It is a Buzz number.\nExplanation:\n"+n+" is divisible by 7 and ends with 7.");
            }
            else if(n%7==0){
                System.out.println("It is a Buzz number.\nExplanation:\n"+n+" is divisible by 7");
            }
            else{
                System.out.println("It is a Buzz number.\nExplanation:\n"+n+" ends with 7.");
            }

        }
    }
}
