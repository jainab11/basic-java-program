package com.Jainab;

public class conditions {

    public static void main(String[] args) {
        // IF ELSE statement
        /*
        Syntax of if else statement
        if(boolean expression true or false){
        // body}else{
        // do this
        }
         */
        int sal = 21000;
//        if(sal>10000){
//            sal=sal+2000;
//        }else {
//            sal=sal+1000;
//        }
        if (sal > 1000) {
            sal += 2000;
        } else if (sal > 2000)
        {
            sal += 4000;
        }  else {
            sal+=1000;
        }
        System.out.println(sal);


    }
}

