package com.app.introduccion;

import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.util.Scanner;

public class Java_Primality_Test {

    public static void main(String[] args) {
        String input = "3093215881333057";
        ByteArrayInputStream bais = new ByteArrayInputStream(input.getBytes());
        System.setIn(bais);
        Scanner scanner = new Scanner(System.in);


        String number = scanner.next();
        BigInteger numberPrime = new BigInteger(number);

        if(numberPrime.isProbablePrime(10)){
            System.out.println("prime");
        }else {
            System.out.println("not prime");
        }
    }
}
