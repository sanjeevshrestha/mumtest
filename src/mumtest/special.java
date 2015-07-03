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

}
