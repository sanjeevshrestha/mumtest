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
public class base {
    
    public static int isLegalNumber(int [] a, int base)
    {
        for(int val:a)
        {
            if(val>base)
            {
                return 0;
            }
        }
        return 1;
    }
    
    public static int convertToBase10(int [] a, int base)
    { int sum=0;
        if(isLegalNumber(a,base)==1)
        {
           
            for(int i=0;i<a.length;i++)
            {
                int baseval=1;
                int bPow=a.length-(i+1);
                for(int j=0;j<bPow;j++)
                {
                    baseval*=base;
                }
                sum+=a[i]*baseval;
            }
        }
        
       return sum;
    }
    
}
