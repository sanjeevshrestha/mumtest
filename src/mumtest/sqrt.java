/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mumtest;

/**
 *
 * @author sanjeev
 */
public class sqrt {
       public static double sqrt(int n) {
        if (n <= 0) {
            return 0;
        }

        double x, sq = n / 2;
        do {
            x = sq;
            sq = (x + (n / x)) / 2;
        } while ((x - sq) != 0);

        return sq;
    }
}
