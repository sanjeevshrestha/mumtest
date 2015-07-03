/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mumtest;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sanjeev
 */
public class factorial {

    public static int factorial(int n) {
        if (n <= 0) {
            return 1;
        }
        return n * factorial(n - 1);

    }

    public static int[] solve10() {
        int x = factorial(10);
        int[] s = new int[]{};
        boolean found = false;
        int i = 1;

        while (!found) {
            i++;
            for (int j = 1; j < i; j++) {
                if (i != j) {
                    if (factorial(i) + factorial(j) == x) {

                        found = true;
                        s = new int[]{i, j};
                        break;

                    }

                }
            }
        }
        return s;


    }
}
