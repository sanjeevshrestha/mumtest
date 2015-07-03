/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mumtest;

/**
 *
 * @author sanjeev
 */
public class counter {

    /**
     * 
     * @param a
     * @param n
     * @return 
     */
    public static int nUpCount(int[] a, int n) {
        int count = 0;

        int pSum = 0, prevSum = 0;
        for (int i = 0; i < a.length; i++) {
            pSum += a[i];
            if (prevSum <= n && pSum > n) {
                count++;
            }
            prevSum = pSum;
        }

        return count;
    }

    /**
     * 
     * @param a
     * @return 
     */
    public static int countSquarePairs(int[] a) {
        int count = 0;

        int tmp;
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                if (a[j] < a[i]) {
                    tmp = a[j];
                    a[j] = a[i];
                    a[i] = tmp;

                }
            }
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] <= 0) {
                continue;
            }
            for (int j = i + 1; j < a.length; j++) {

                int xSum = a[i] + a[j];
                double tSq, sq = xSum / 2;

                do {
                    tSq = sq;
                    sq = (tSq + (xSum / tSq)) / 2;
                } while ((tSq - sq) != 0);

                int psq = (int) sq;
                if (psq == sq) {
                    count++;
                }

            }
        }

        return count;
    }

}
