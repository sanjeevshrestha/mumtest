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

    public static int isRailroadTie(int[] a) {

        if (a.length > 1) {
            for (int i = 0; i < a.length; i++) {
                int x = a[i];
                if (a[i] == 0 && i != 0) {

                    if (i < a.length - 1) {
                        if (a[i - 1] == 0 || a[i + 1] == 0) {
                            return 0;
                        }
                    } 
                    else
                    {
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
    
    
    public static int matches(int []a,int[]p)
    {
       
        for(int num: p)
        {
            for(int x=0;x<num;x++)
            {
                if(num<0!=a[x]<0)
                {
                    return 0;
                }
            }
       }
        return 0;       
    }
}
