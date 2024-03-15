package org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter13;

public class Palindrome {
    public static boolean isPalindrome(String value) {
        return isPalindrome(value, 0, value.length() - 1);
    }

    // Recursive helper
    private static boolean isPalindrome(String value, int start, int end) {
        // Terminating condition
        if (start >= end) {
            return true;
        }

        char first = Character.toLowerCase(value.charAt(start));
        char last = Character.toLowerCase(value.charAt(end));

        if (Character.isLetter(first) && Character.isLetter(last)) {
            if (first == last) {
                return isPalindrome(value, start + 1, end - 1);
            }
            return false;
        } else if (!Character.isLetter(last)) {
            return isPalindrome(value, start, end - 1);
        } else {
            return isPalindrome(value, start + 1, end);
        }
    }
}
