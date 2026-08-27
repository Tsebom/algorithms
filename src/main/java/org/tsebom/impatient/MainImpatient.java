package org.tsebom.impatient;

import java.io.Console;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class MainImpatient {
    public static void main(String[] args) {
//        String s = String.join(", ", "Peter", "Poul", "Mary");
//        System.out.println(s);
//
//        String ss = " are all the java programmers";
//
//        var builder = new StringBuilder();
//
//        builder.append(s).append(ss);
//
//        String result = builder.toString();
//
//        System.out.println(result);
//
//        String[] spl = result.split(" ");
//
//        System.out.println(Arrays.toString(spl));
//
//        System.out.println("Word".equalsIgnoreCase("word"));
//        System.out.println("word".compareTo("Word"));
//
//        char ch1 = 'd';
//        char ch2 = 'l';
//
//        System.out.println((int) ch1 - (int) ch2);
//
//        int num = 42;
//        String snum = Integer.toString(num, 2);
//        System.out.println(Integer.toString(num));
//        System.out.println(snum);
//        System.out.println(Integer.parseInt(snum, 2));
//
//        System.out.println(snum.indexOf("0"));
//
//        String text = """
//            Hello, my name is Hal.
//            Please enter your name:  \s""";
//        System.out.println(text);
//
//        var d1 = BigDecimal.valueOf(2.0);
//        var d2 = BigDecimal.valueOf(1.7);
//        System.out.println(d1.subtract(d2));

        Console term = System.console();
        String name = term.readLine("User name: ");
        char[] pass = term.readPassword("Password: ");
    }
}
