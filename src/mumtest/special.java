/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mumtest;

import java.util.Arrays;

/**
 *
 * @author sanjeev
 */
public class special {

    public static int isMadhavArray(int[] a) {
        int mA = 0;

        int l = a.length;
        int n = 0;
        for (int i = 0; i < l; i++) {
            double sq = sqrt.sqrt(2 * l - i);
            if (i == sq) {
                n = i;
            }
        }

        if (n > 0) {
            int index = 1;
            for (int j = index; j < n; j++) {
                int msum = 0;
                for (int k = 0; k <= j; k++) {
                    if (index >= l) {
                        break;
                    }

                    msum += a[index];
                    index++;

                }

                if (msum != a[0]) {
                    mA = 0;
                    break;
                } else {
                    mA = 1;
                }
            }
        }

        return mA;
    }

    public static int isInertial(int[] a) {
        int inertial;
        boolean hasOdd = false, hasMaxEven = false, isOddMax = false;
        int evenMax = 0;
        int sEvenMax = 0;

        int tmp = 0;
        for (int x = 0; x < a.length; x++) {
            for (int y = x; y < a.length; y++) {
                if (a[y] < a[x]) {
                    tmp = a[x];
                    a[x] = a[y];
                    a[y] = tmp;
                }
            }
        }

        int oddMin = a[a.length - 1];

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                hasOdd = true;
                if (a[i] < oddMin) {
                    oddMin = a[i];
                }
            } else {
                if (a[i] > evenMax) {

                    sEvenMax = evenMax;
                    evenMax = a[i];
                }
            }

        }

        if (a[a.length - 1] % 2 == 0) {
            hasMaxEven = true;
        }

        if (oddMin > sEvenMax) {
            isOddMax = true;
        }

        if (hasMaxEven && isOddMax && hasOdd) {
            inertial = 1;
        } else {
            inertial = 0;
        }

        return inertial;
    }

    /**
     *
     * @param a
     * @return
     */
    public static int stantonMeasure(int[] a) {
        int count = 0;

        int count_1 = 0;

        for (int val : a) {
            if (val == 1) {
                count_1++;
            }
        }

        for (int val : a) {

            if (val == count_1) {
                count++;
            }
        }

        return count;

    }

    /**
     *
     * @param a
     * @return
     */
    public static int sumFactor(int[] a) {
        int sumFactor = 0;

        int sum = 0;
        for (int val : a) {
            sum += val;
        }

        for (int val : a) {
            if (val == sum) {
                sumFactor++;
            }
        }

        return sumFactor;
    }

    /**
     *
     * @param a
     * @param n
     * @return
     */
    public static int repsEqual(int[] a, int n) {
        int x = 1;

        int l = a.length;

        int val;
        int tpow = 0;

        for (int i = 0; i < l; i++) {
            tpow = (int) factorial.pow(10, (l - i - 1));
            val = n / tpow;
            n = n % tpow;

            if (val != a[i]) {
                x = 0;
                break;
            }

        }

        return x;
    }

    public static int isCentered15(int[] a) {
        int x = 0;
        int sum = 0;
        int l = a.length;

        int si = 0, ei = 0;

        for (int i = 0; i < l; i++) {
            ei = i;
            sum += a[i];
            if (sum > 15) {
                while (sum > 15) {
                    sum -= a[si];
                    si++;
                }
            }
            if (sum == 15) {
                if (si == l - ei - 1) {
                    x = 1;
                    break;
                } else {
                    x = 0;
                }
            }
        }
        return x;
    }

    /**
     * 
     * @param i
     * @param j
     * @return 
     */
    public static int henry(int i, int j) {

        int iPNumber = 0, jPNumber = 0;
        int pNumber = 0;
        int x = 0;
        int limit = i > j ? i : j;
        while (x < limit) {
            pNumber++;
            int factor = 1;
            int pNumberSum = 0;
            while (pNumber > factor) {
                if (pNumber % factor == 0) {
                    pNumberSum += factor;
                }
                factor++;
            }

            if (pNumber == pNumberSum) {
                x++;
            }

            if (x == i) {
                iPNumber = pNumber;
            }

            if (x == j) {
                jPNumber = pNumber;
            }

        }
        return iPNumber + jPNumber;
    }

    /**
     * 
     * @param n
     * @return 
     */
    public static int perfectNumber(int n) {
        int pNumber = 0;

        int x = 0;
        while (x < n) {
            pNumber++;
            int factor = 1;
            int pNumberSum = 0;
            while (pNumber > factor) {
                if (pNumber % factor == 0) {
                    pNumberSum += factor;
                }
                factor++;
            }
            if (pNumber == pNumberSum) {
                x++;

            }
            if (x == n) {
                break;
            }
        }

        return pNumber;

    }

}
