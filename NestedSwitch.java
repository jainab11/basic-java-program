package com.Jainab;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println(" enter emp id");

        int empID=in.nextInt();
        System.out.println(" enter a string");

        String dep= in.next();

        switch (empID){
            case 1:
                System.out.println(" kunal");
                break;
            case 2:
                System.out.println("harry");
                break;
            case 3:
                System.out.println("love babbar");
                break;
            default:
                System.out.println("enter correct emp ID ");
            case 4: // nested switch
                System.out.println(" emp 4");
                switch (dep){
                    case "IT":
                        System.out.println("IT");
                        break;
                    case "Management":
                        System.out.println("Management dept");
                        break;
                    default:
                        System.out.println("No department");

                }



        }
    }
}
