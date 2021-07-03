package com.kabir.milton;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Welcome to Amazing Numbers!");
        System.out.println("Supported requests:\n" +
                "- enter a natural number to know its properties;\n" +
                "- enter 0 to exit.");
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("Enter a request:");
            Long n=sc.nextLong();
            if(n==0){
                System.out.println("Goodbye!");
                break;
            }
            if(n<1){
                System.out.println("The first parameter should be a natural number or zero.");
            }
            else{
                boolean ev=false,od=false,buz=false,dk=false,pl=false;
                if(n%2==0){
                    ev=true;
                }
                else{
                    od=true;
                }
                if(n%7==0||n%10==7){
                    buz=true;
                }
                Long k=n;
                while(n>0){
                    if(n%10==0){
                        dk=true;
                    }
                    n/=10;
                }
                n=k;
                Long r;
                Long rr= Long.valueOf(0);
                while(n!=0){
                    r=n%10;
                    rr=rr*10+r;
                    n/=10;
                }
                if(rr==k){
                    pl=true;
                }

                System.out.println("Properties of "+k);
                System.out.println("even: "+ev);
                System.out.println("odd: "+od);
                System.out.println("buzz: "+buz);
                System.out.println("duck: "+dk);
                System.out.println("palindromic: "+pl);
            }
        }
    }
}
