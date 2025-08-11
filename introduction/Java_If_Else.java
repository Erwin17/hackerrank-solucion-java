package com.app.introduccion;

// https://www.hackerrank.com/challenges/java-if-else/problem
import java.util.Scanner;

public class Java_If_Else {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if(n%2 != 0){
            System.out.println("Weird");
        }else{
            if((n>=2 && n<=5) || n> 20){
                System.out.println("Not Weird");
            }else if(n>=6) {
                System.out.println("Weird");
            }
        }
        scanner.close();
    }
}
