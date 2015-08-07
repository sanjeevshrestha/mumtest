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
public class MumArray {

    public static int arrayHasNoZeroes(int[] a) {
        for (int val : a) {
            if (val == 0) {
                return 0;
            }
        }
        return 1;
    }

    /**
     *
     * @param a
     * @return
     */
    public static int isSumSafe(int[] a) {
        int sum = 0;

        for (int val : a) {
            sum += val;
        }

        for (int val : a) {
            if (val == sum) {
                return 0;
            }
        }
        return 1;
    }

    /**
     *
     * @param a
     * @return
     */
    public static int isVanilla(int[] a) {
        if (a.length > 0) {
            int num = a[0];
            for (int val : a) {
                if (val < 0) {
                    val *= -1;
                }

                while (val > 0) {
                    int xNum = val % 10;
                    val = val / 10;

                    if (xNum != num) {
                        return 0;
                    }
                }
            }
        }
        return 1;

    }

    /**
     *
     * @param a
     * @return
     */
    public static int isTrivalent(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                if (a[j] < a[i]) {
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }

        int count = 0;
        int prevnum = 0;
        for (int val : a) {
            if (val != prevnum || count == 0) {
                prevnum = val;
                count++;
            }
        }

        if (count == 3) {
            return 1;
        } else {
            return 0;
        }
    }

    /**
     *
     * @param a
     * @return
     */
    public static int isSequentiallyBounded(int[] a) {
        int isSqBounded = 0;
        if (a.length > 0) {
            int count = 1;
            int prevNumber = a[0];
            for (int i = 1; i < a.length; i++) {

                if (prevNumber <= a[i]) {
                    if (prevNumber == a[i]) {
                        count++;
                    } else {
                        if (count < prevNumber) {
                            prevNumber = a[i];
                            count = 1;

                        } else {
                            return 0;

                        }
                    }

                } else {
                    return 0;
                }
            }
            return 1;
        }
        return 0;

    }

    /**
     *
     * @param a
     * @return
     */
    public static int[] clusterCompression(int[] a) {

        int[] cCluster = new int[]{};

        int count = 0;
        int prevNumber = 0;
        for (int val : a) {
            if (prevNumber != val || count == 0) {
                prevNumber = val;
                count++;
                int[] tmpAr = new int[count];

                System.arraycopy(cCluster, 0, tmpAr, 0, count - 1);
                tmpAr[count - 1] = val;
                cCluster = tmpAr;
            }

        }

        return cCluster;

    }

    /**
     *
     * @param a
     * @return
     */
    public static int isRailroadTie(int[] a) {

        if (a.length > 1) {
            for (int i = 0; i < a.length; i++) {
                int x = a[i];
                if (a[i] == 0 && i != 0) {

                    if (i < a.length - 1) {
                        if (a[i - 1] == 0 || a[i + 1] == 0) {
                            return 0;
                        }
                    } else {
                        return 0;
                    }

                } else if (a[i] != 0) {
                    if (i > 0) {
                        if (i < a.length - 1) {
                            if (a[i - 1] != 0 && a[i + 1] != 0) {
                                return 0;
                            }
                        } else {
                            if (a[i - 1] == 0) {
                                return 0;
                            }
                        }
                    } else {
                        if (a[i + 1] == 0) {
                            return 0;
                        }
                    }

                } else {
                    return 0;
                }

            }
        } else {
            return 0;
        }
        return 1;

    }

    public static int isPacked(int[] a) {

        int prevNumber = 0;
        int count = 0;
        for (int val : a) {
            if (val != prevNumber || count == 0) {

                if (count != prevNumber) {
                    return 0;
                } else {
                    count = 0;
                }
                prevNumber = val;

            }
            count++;
        }

        return 1;
    }

    /**
     *
     * @param a
     * @param p
     * @return
     */
    public static int matches(int[] a, int[] p) {

        for (int num : p) {
            for (int x = 0; x < num; x++) {
                if (num < 0 != a[x] < 0) {
                    return 0;
                }
            }
        }
        return 0;
    }

    public static int isRailRoadTie2(int a[]) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                if (a[i + 1] != 0) {

                }
            } else {

            }
        }

        return 0;
    }

    public static int isOddHeavy(int a[]) {
        int maxEven = -32767;
        int minOdd = 32767;
        boolean hasOdd = false;
        for (int x : a) {
            if (x % 2 == 0) {
                if (x > maxEven) {
                    maxEven = x;
                }
            } else {
                if (x < minOdd) {
                    minOdd = x;
                }
                hasOdd = true;
            }
        }

        return ((maxEven < minOdd) && hasOdd) ? 1 : 0;
    }

    public static int[] filterArray(int a[], int n) {
        int[] bRep = new int[]{};
        int countlength = 0;
        int[] filteredArray = new int[]{};

        while (n > 0) {
            int bDigit = n % 2;
            n = n / 2;

            int[] temparray = new int[bRep.length + 1];
            System.arraycopy(bRep, 0, temparray, 0, bRep.length);
            temparray[bRep.length] = bDigit;
            bRep = temparray;
            if (bDigit != 0) {
                countlength++;
            }

        }

        if (countlength > a.length) {
            return null;
        }

        for (int i = 0; i < bRep.length; i++) {
            if (bRep[i] != 0) {
                int result = bRep[i] * a[i];

                int[] tmp = new int[filteredArray.length + 1];
                System.arraycopy(filteredArray, 0, tmp, 0, filteredArray.length);
                tmp[filteredArray.length] = result;
                filteredArray = tmp;
            }
        }

        return filteredArray;
    }

    public static int largestAdjancetSum(int a[]) {
        int sum = 0;

        for (int i = 1; i < a.length; i++) {
            int tsum = a[i - 1] + a[i];
            if (tsum > sum) {
                sum = tsum;
            }
        }

        return sum;
    }

    public static int isSequencedArray(int a[], int m, int n) {

        int prevnum = m;
        int isSeq = 1;
        int lastnum = 0;
        for (int x : a) {

            if (x < m) {
                isSeq = 0;
            } else if (x > n) {
                isSeq = 0;
            }

            if (x > prevnum && (x - prevnum) == 1) {
                isSeq = isSeq * 1;
                prevnum = x;

            } else if (x - prevnum != 1 && x < prevnum) {
                isSeq = 0;
            }
            lastnum = x;

        }

        if (lastnum < n) {
            isSeq = 0;
        }

        return isSeq;

    }

    public static int isZeroLimited(int[] a) {
        int isZL = 1;

        int nextIndex = 0;
        int zeroindex=0;

        for (int i = 0; i < a.length; i++) {
            
             if(a[i]==0&&i!=nextIndex)
            {
                return 0;
            }
            if(i==nextIndex)
            {
                nextIndex=3*zeroindex+1;
                zeroindex++;
               if(nextIndex<a.length)
               {
                   if(a[nextIndex]!=0)
                   {
                       return 0;
                   }
                  
               }
            }
            
           

        }

        return 1;
    }
    
    public static int isBeanArray(int []a)
    {
        int sum1=0;
        int sum2=0;
        
        for(int i=0;i<a.length;i++)
        {
            int x=a[i];
            if(a[i]==9||a[i]==13)
            {
                sum1=sum1+a[i];
                if(sum1!=22&&sum1>9)
                {
                    sum1-=a[i];
                }
            }
            
            if(a[i]==7||a[i]==16)
            {
                sum2=sum2+a[i];
                if(sum2==14)
                {
                    sum2-=a[i];
                }
            }
        }
        
      
        if((sum1==0||sum1==22)&&(sum2==0||sum2==7))
        {
            return 1;
        }
      
        return 0;
        
        
    }
    
    public static int allEven(int []a)
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2!=0)
                return 0;
        }
        
        return 1;
    }

}
