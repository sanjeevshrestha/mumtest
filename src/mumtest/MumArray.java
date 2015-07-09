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
    
    
    public static int arrayHasNoZeroes(int [] a)
    {
        for(int val:a)
        {
            if(val==0)
            {
                return 0;
            }
        }
        return 1;
    }
    
    
    public static int isSumSafe(int [] a)
    {
        int sum=0;
        
        for(int val:a)
        {
            sum+=val;
        }
        
        for(int val:a)
        {
            if(val==sum)
            {
                return 0;
            }
        }
        
        return 1;
    }
    
    
}
