// https://www.hackerrank.com/challenges/java-currency-formatter

package com.app.introduccion;

import java.io.ByteArrayInputStream;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Java_Currency_Formatter {

    public static void main(String[] args) {
        String input = "12324.134";

        System.setIn(new ByteArrayInputStream(input.getBytes()));

        // Si estas en LATAM
        //Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        NumberFormat format1 = NumberFormat.getCurrencyInstance(Locale.US);
        String formatUS = format1.format(payment);

        Locale localIndia = new Locale("EN", "IN");
        NumberFormat format2 = NumberFormat.getCurrencyInstance(localIndia);
        String formatIndia = format2.format(payment);

        NumberFormat format3 = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String formarChina = format3.format(payment);

        NumberFormat format4 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String formatFrance = format4.format(payment);

        System.out.println("US: " + formatUS);
        System.out.println("India: " + formatIndia);
        System.out.println("China: " + formarChina);
        System.out.println("France: " + formatFrance);
    }
}
