package com.app.introduccion;

// https://www.hackerrank.com/challenges/java-substring

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class Java_Substring {

    public static void main(String[] args) {

        System.setIn(new ByteArrayInputStream("Helloworld\n3\n7".getBytes()));

        Scanner in = new Scanner(System.in);
        String s = in.next();
        int start = in.nextInt();
        int end = in.nextInt();

        if(s.length() < 1 || s.length()>100){
            return;
        }
        if(start < 0 || end >s.length() || start > end){
            return;
        }

        System.out.println(s.substring(start, end));
    }
}
