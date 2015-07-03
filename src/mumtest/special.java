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
    
    public static int isMadhavArray(int [] a)
    {
        int mA=0;
        
        int l=a.length;
        int n=0;
        for(int i=0;i<l;i++)
        {
            double sq=sqrt.sqrt(2*l-i);
            if(i==sq)
            {
                n=i;
            }
        }
        
        if(n>0)
        {
            int index=1;
            for(int j=index;j<n;j++)
            {
                int msum=0;
                for(int k=0;k<=j;k++)
                {
                    if(index>=l)
                    {
                        break;
                    }
                    
                    msum+=a[index];
                    index++;
                    
                }
                
                if(msum!=a[0])
                {
                    mA=0;
                    break;
                }
                else
                {
                    mA=1;
                }
            }
        }
        
        return mA;
    }
    
}
