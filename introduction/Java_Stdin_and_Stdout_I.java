package com.app.introduccion;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

// https://www.hackerrank.com/challenges/java-stdin-and-stdout-1/problem
public class Java_Stdin_and_Stdout_I {

    public static void main(String[] args) {
        String entrada = "42\n100\n125\n";
        ByteArrayInputStream bais = new ByteArrayInputStream(entrada.getBytes());
        System.setIn(bais);

        Scanner input = new Scanner(System.in);
        while(input.hasNext()){
            int a = input.nextInt();
            System.out.println(a);
        }

    }
}
