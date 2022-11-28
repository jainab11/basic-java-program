package com.Jainab;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in= new Scanner(System.in);

        String fruit = in.next();
        switch (fruit) {
            case "mango":
                System.out.println(" mango is king of fruit");
                break;
            case "orange":
                System.out.println("round fruit");
                break;
            case "apple":
                System.out.println("red sweet fruit");
                break;
            case "banana":
                System.out.println(" a yellow fruit");
                break;
            default:
                System.out.println("another fruit");
                break;
        }
 }
}
