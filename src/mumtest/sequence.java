/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mumtest;

/**
 *
 * @author sanjeev
 */
public class sequence {

    /**
     * 
     * @param a
     * @return 
     */
    public static boolean isGuithireSequence(int[] a) {
        boolean isGS = true;

        int n = a[0];
        int index = 0;
        while (n != 1) {
            index++;
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = n * 3 + 1;
            }

            if (index >= a.length) {
                isGS = false;
                break;
            }

            if (n != a[index]) {
                isGS = false;
                break;
            }
        }

        return isGS;

    }

    public static int guithireIndex(int n) {
        int index = 0;

        if (n < 0) {
            return 0;
        }
        while (n != 1) {
            index++;
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = n * 3 + 1;
            }
        }


        return index;
    }
}
