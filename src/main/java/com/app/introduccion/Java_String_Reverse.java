package com.app.introduccion;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class Java_String_Reverse {




    public static void main(String[] args) {
        String input = "madam";

        ByteArrayInputStream bais = new ByteArrayInputStream(input.getBytes());
        System.setIn(bais);

        Scanner scanner = new Scanner(System.in);
        String reverse =  new StringBuilder(scanner.next())
                .reverse()
                .toString();

        if(reverse.equals(input)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        scanner.close();
    }

}
