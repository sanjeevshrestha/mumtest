/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mumtest;

/**
 *
 * @author sanjeev
 */
public class prime {

    /**
     * 
     * @param n
     * @return 
     */
    public static boolean isPrime(int n) {
        if (n <= 0) {
            return false;
        }

        boolean flag = false;
        if (n > 2) {

            double x, limit = n / 2;
            do {
                x = limit;
                limit = (x + (n / x)) / 2;
            } while ((x - limit) != 0);



            if (n % 2 == 0) {
                return false;
            }

            for (int i = 3; i < limit; i += 2) {
                if (n % i == 0) {
                    flag = true;
                    break;
                }
            }
        }

        return !flag;

    }

    /**
     * 
     * @param n
     * @return 
     */
    public static int nextPrime(int n) {
        n++;
        while (!isPrime(n)) {
            n++;
        }

        return n;

    }

    /**
     * 
     * @param n
     * @return 
     */
    public static int findPorcupineNumber(int n) {
        n++;
        int pn = n, npn = n;
        boolean found = false;

        while (!found) {
            npn++;
            if (isPrime(npn)) {
                if (pn % 10 == 9 && npn % 10 == 9) {
                    found = true;
                } else {
                    pn = npn;
                }

            }


        }

        return pn;
    }

    /**
     * 
     * @param s
     * @param e
     * @return 
     */
    public static int primeCount(int s, int e) {
        int count = 0;
        
        for(int i=s;i<=e;i++)
        {
            if(isPrime(i))
            {
                count++;
            }
        }

        return count;
    }
}
