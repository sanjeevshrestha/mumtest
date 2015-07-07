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

    /**
     *
     * @param n
     * @return
     */
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

    /**
     *
     * @param n
     * @return
     */
    public static boolean isPerfectSquare(int n) {
        boolean perfect = false;

        double tmp = sqrt(n);
        int tmpInt = (int) tmp;
        if (tmpInt == tmp) {
            perfect = true;
        }

        return perfect;
    }

    public static int nextPerfectSquare(int n) {
        int number = (int) sqrt(n);
        number++;
        return number * number;
    }
    
    /**
     * 
     * @param n
     * @return 
     */
    public static int isSquare(int n)
    {
        if(n<0)
        {
            return 0;
            
        }
        
        double tmp,sq=n/2;
    
        do
        {
            tmp=sq;
            sq=(tmp+(n/tmp))/2;
        }
        while((tmp-sq)!=0);
        
        int xSq=(int)sq;
        if(xSq==sq)
        {
            return 1;
        }
        return 0;
        
    }
}
