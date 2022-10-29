package uz.ibrokhimoff.leetcode.math.medium;

import java.util.ArrayList;

public class P_2396  {
    public static void main(String[] args) {

        isStrictlyPalindromic(9);
    }

    /**
     * The java.lang.Integer.toString(int a, int base) is an inbuilt method in Java which is used to
     * return a string representation of the argument a in the base, specified by the second argument base.
     * If the radix/base is smaller than Character.MIN_RADIX or larger than Character.MAX_RADIX, then the base 10 is used.
     * The ASCII characters which are used as digits: 0 to 9 and a to z.
     * @param n
     * @return
     */
    public static boolean isStrictlyPalindromic(int n) {

        for (int j = 2; j <= n - 2; j++) {
            String str = Integer.toString(n, j);

            int i = 0, length = str.length() - 1;
            while (i <= length / 2) {
                if (str.charAt(i) != str.charAt(length)) {
                    return false;
                }
                i++;
                length--;
            }
        }
        return true;
    }
}
