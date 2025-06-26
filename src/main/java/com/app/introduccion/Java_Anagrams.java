package com.app.introduccion;

import java.io.ByteArrayInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Java_Anagrams {

    public static void main(String[] args) {
        String input = "xyzw \nxyxy";
        ByteArrayInputStream bais = new ByteArrayInputStream(input.getBytes());
        System.setIn(bais);

        Scanner scanner = new Scanner(System.in);
        String input_a = scanner.next().toLowerCase().trim();
        String input_b = scanner.next().toLowerCase().trim();

        Map<Character,  Integer> anagram_1 = new HashMap<>();
        Map<Character, Integer> anagram_2 = new HashMap<>();


        if(input_a.length() != input_b.length()) {
            System.out.println("Not Anagrams");
            return;
        }

        int size = input_a.length();
        for(int i = 0; i<size; i++){

            char temp1 = input_a.charAt(i);
            char temp2 = input_b.charAt(i);

            if(anagram_1.containsKey(temp1)){
                anagram_1.compute(temp1, (k, v) -> (v=v+1));
            }else{
                anagram_1.put(temp1, 1);
            }

            if(anagram_2.containsKey(temp2)){
                anagram_2.compute(temp2, (k, v) -> (v=v+1));
            }else{
                anagram_2.put(temp2, 1);
            }
        }

        if(anagram_1.equals(anagram_2)){
            System.out.println("Anagrams");
        }else{
            System.out.println("Not Anagrams");
        }


    }
}
