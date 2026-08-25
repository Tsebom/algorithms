package org.tsebom.let_code.easy;

public class RomanToInteger {

    public int romanToInt(String s) {
        int result = 0;
        for (int i = s.length() - 1; i >= 0; i--) {

            int d = decimal(s.charAt(i));
            if (i + 1 < s.length() && d < decimal(s.charAt(i + 1))) {
                result -= d;
                continue;
            }
            result += d;
        }
        return result;
    }

    private int decimal(char c) {
        int dec = switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
        return dec;
    }

    public static void main(String[] args) {
        RomanToInteger romanToInteger = new RomanToInteger();

        System.out.println(romanToInteger.romanToInt("DCXXI"));
    }
}
