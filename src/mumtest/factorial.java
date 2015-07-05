/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mumtest;


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

    /**
     * 
     * @return 
     */
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
    
    
   public static int pow(int x,int y)
   {
       int pow=1;
       
       for(int i =0;i<y;i++)
       {
           pow*=x;
       }
       
       return pow;
       
   }
}
