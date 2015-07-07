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
}
