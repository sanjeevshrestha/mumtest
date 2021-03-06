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

    /**
     *
     * @param a
     * @param divisor
     * @return
     */
    public static int isDivisible(int[] a, int divisor) {
        int divisible = 1;
        for (int val : a) {
            if (val % divisor == 0) {
                divisible = divisible * 1;
            } else {
                divisible = 0;
            }
        }

        return divisible;
    }

    /**
     *
     * @param a
     * @param n
     * @return
     */
    public static int isNUnique(int[] a, int n) {
        int sums = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == n) {
                    sums++;
                }

            }
        }

        return sums == 1 ? 1 : 0;
    }

    /**
     *
     * @param n
     * @return
     */
    public static int computeDepth(int n) {
        int depth = 0;
        int[] numlist = new int[]{};
        boolean foundAll = false;
        while (!foundAll) {
            depth++;
            int multiple = n * depth;
            int newsize;
            while (multiple > 0) {
                int newnum = multiple % 10;
                multiple = multiple / 10;
                boolean duplicate = false;
                for (int j : numlist) {
                    if (j == newnum) {
                        duplicate = true;
                        break;
                    }
                }

                if (!duplicate) {
                    newsize = numlist.length + 1;
                    int[] tmplist = new int[newsize];
                    System.arraycopy(numlist, 0, tmplist, 0, numlist.length);
                    tmplist[numlist.length] = newnum;
                    numlist = tmplist;
                }
            }

            if (numlist.length == 10) {
                foundAll = true;
            }
        }

        return depth;
    }

    /**
     *
     * @param n
     * @return
     */
    public static int isStacked(int n) {
        int sum = 0;
        int stacked = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
            if (sum == n) {
                stacked = 1;
                break;
            } else {
                stacked = 0;
            }

        }

        return stacked;

    }

    /**
     *
     * @param n
     * @return
     */
    public static int isIsolated(long n) {
        if (n > 2097151) {
            return -1;
        }

        long sq = n * n;
        long cube = n * n * n;

        while (sq > 0) {
            int sNumber = (int) (sq % 10);
            sq = sq / 10;
            while (cube > 0) {
                int cNumber = (int) (cube % 10);
                cube = cube / 10;
                if (cNumber == sNumber) {
                    return 0;
                }
            }
        }
        return 1;

    }

    /**
     *
     * @param n
     * @return
     */
    public static int countRepresentations(int n) {
        int count = 0;
        int loopcounter = 0;
        for (int rupee20 = 0; rupee20 <= n / 20; rupee20++) {
            for (int rupee10 = 0; rupee10 <= n / 10; rupee10++) {
                for (int rupee5 = 0; rupee5 <= n / 5; rupee5++) {
                    for (int rupee2 = 0; rupee2 <= n / 2; rupee2++) {
                        for (int rupee1 = 0; rupee1 <= n; rupee1++) {
                            loopcounter++;
                            if ((rupee20 * 20) + (rupee10 * 10) + (rupee5 * 5) + (rupee2 * 2) + rupee1 == n) {
                                count++;

                            }
                        }
                    }
                }
            }
        }

        return count;

    }

    /**
     * 
     * @param n
     * @return 
     */
    public static int smallest(int n) {
        boolean found = false;
        int i = 2;

        while (!found) {
            i++;
            int checknum;
            boolean allHas2 = true;

            for (int x = 1; x <= n; x++) {
                checknum = i * x;

                boolean found2 = false;
                while (checknum > 0) {
                    int r = checknum % 10;
                    checknum = checknum / 10;
                    if (r == 2) {
                        found2 = true;
                        break;
                    } else {
                        found2 = false;
                    }
                }
                
                allHas2 = allHas2 && found2;

            }

            if (allHas2) {
                found = true;
            }

        }

        return i;
    }
    
    
    public static int fibonacci(int n)
    {
       if(n<2) 
       {
           return n;
       }
       else
       {
           return fibonacci(n-1)+fibonacci(n-2);
       }
       
    }
    
    
    public static int getExponent(int n, int p)
    {
        int maxE=0;
        
        return 0;
    }
    
    
    
    public static int gcd(int a, int b)
    {
       while(b>0)
       {
           int temp=b;
           b=a%b;
           a=temp;
       };
       
       return a;
    }
    
    
    public static int checkConcatenatedSum(int n, int catlen)
    {
        int sum=0;
        
        int isConcat=0;
        int orign=n;
        
        while(n>0)
        {
            int rem=n%10;
            n=n/10;
            
            int p=1;
            int concatnum=0;
            for(int i=0;i<catlen;i++)
            {
                concatnum=concatnum*10+rem;   
            }
            
            sum+=concatnum;
            
        }
        
        return (sum==orign)?1:0;
    }
    
    
    public static int findSmallestBEQnumber()
    {
        int sBEQ=0;
        boolean found=false;
        while(!found)
        {
            
            sBEQ++;
            long cube=1;
            for(int i=0;i<3;i++)
            {
                cube=cube*sBEQ;
            }

            int count6=0;
           while(cube>0)
           {
               int rem=(int)(cube%10);
               cube=cube/10;
               if(rem==6)
               {
                   count6++;
               }
           }
           if(count6==4)
           {
               
               found=true;
           }
        }
        
        return sBEQ;
    }
   

}
