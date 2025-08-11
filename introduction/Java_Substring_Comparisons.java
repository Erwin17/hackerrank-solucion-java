package com.app.introduccion;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Java_Substring_Comparisons {

    public static String getSmallestAndLargest (String cadena, int k){
        List<String> elements = new ArrayList<>();

        for(int i = 0; i<=cadena.length()-k; i++){
            elements.add(cadena.substring(i, k+i));
        }

        List<String> elementOrder = elements.stream()
                .sorted((a, b) -> a.compareTo(b))
                .toList();

        return elementOrder.get(0) + "\n" + elementOrder.get(elementOrder.size()-1);
    }

    public static void main(String[] args) {
        String input = "welcometojava\n3";
        ByteArrayInputStream bais = new ByteArrayInputStream(input.getBytes());
        System.setIn(bais);

        Scanner scanner = new Scanner(System.in);

        String cadena = scanner.next();
        int k = scanner.nextInt();

        System.out.println(getSmallestAndLargest(cadena, k));


    }
}
