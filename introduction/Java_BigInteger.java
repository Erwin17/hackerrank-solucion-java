package com.app.introduccion;

import com.app.Main;

import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.util.Scanner;

public class Java_BigInteger {

    public static void main(String[] args) {

        String input = "2323323\n2323343";

        ByteArrayInputStream bais = new ByteArrayInputStream(input.getBytes());
        System.setIn(bais);

        Scanner scanner = new Scanner(System.in);

        BigInteger number1 = new BigInteger(scanner.next());
        BigInteger number2 = new BigInteger(scanner.next());

        System.out.println(number1.add(number2));
        System.out.println(number1.multiply(number2));

    }
}
