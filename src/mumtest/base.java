/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mumtest;

/**
 *
 * @author sanjeev
 */
public class base {

    /**
     *
     * @param a
     * @param base
     * @return
     */
    public static int isLegalNumber(int[] a, int base) {
        for (int val : a) {
            if (val > base) {
                return 0;
            }
        }
        return 1;
    }

    /**
     *
     * @param a
     * @param base
     * @return
     */
    public static int convertToBase10(int[] a, int base) {
        int sum = 0;
        if (isLegalNumber(a, base) == 1) {

            for (int i = 0; i < a.length; i++) {
                int baseval = 1;
                int bPow = a.length - (i + 1);
                for (int j = 0; j < bPow; j++) {
                    baseval *= base;
                }
                sum += a[i] * baseval;
            }
        }

        return sum;
    }

    /**
     *
     * @param n
     * @return
     */
    public static int fullnessQuotient(int n) {
        if (n < 0) {
            return -1;
        }
        int count = 0;
        for (int i = 2; i <= 9; i++) {
            int x = n;
            boolean flag = true;
            while (x > 0) {
                int rem = x % i;
                x = x / i;
                if (rem != 0) {
                    flag = flag && true;
                } else {
                    flag = false;
                }
            }
            if (flag) {
                count++;
            }
        }
        return count;
    }

    public static int fullnessQuotient2(int n) {
        if (n < 1) {
            return -1;
        }

        int fQ = 0;

        for (int i = 2; i <= 9; i++) {
            boolean flag = true;

            int x = n;
            while (x > 0) {
                int rem = x % i;
                x = x / i;

                if (rem != 0) {
                    flag = flag && true;
                } else {
                    flag = false;
                }
            }

            if (flag) {
                fQ++;
            }
        }

        return fQ;

    }

}
