package com.app.introduccion;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class Java_Strings_Introduction {


    public static void main(String[] args) {
        String input = "hello\njava";

        ByteArrayInputStream  bais = new ByteArrayInputStream(input.getBytes());
        System.setIn(bais);

        Scanner scanner = new Scanner(System.in);

        String A = scanner.next();
        String B = scanner.next();

        System.out.println(A.length() + B.length());
        System.out.println(A.compareTo(B)>0 ? "Yes" : "No");

        String capitalA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String capitalB = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(capitalA + " "+ capitalB);
    }
}
