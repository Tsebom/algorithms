package org.tsebom.let_code.easy;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        if (x < 10) return true;
        if (x % 10 == 0) return false;

        int revers = 0;
        int decimal = x;
        while (decimal != 0) {
            revers = revers * 10 + (decimal % 10);
            decimal /= 10;
        }

        return revers == x;
    }
}
