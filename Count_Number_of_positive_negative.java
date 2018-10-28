/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jspider.program;
import java.util.*;
/**
 *
 * @author Ashwani Kumar
 */
public class Count_Number_of_positive_negative {

    public int getNegative(int[] b)
{
  int count=0;
  
  for(int i=0;i<b.length; i++)
  {
      if(b[i]<0)
      {
          count++;
      }
  }
    
    return count;
}
    public int getPositive(int []c)
    {
        int count1=0;
        for(int i=0;i<c.length;i++)
        {
            if(c[i]>0)
            {
                count1++;
            }
        }
      
        return count1;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter the size of array");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter the element of array ");
        int a[]=new int[n];
        Count_Number_of_positive_negative t=new Count_Number_of_positive_negative();
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int count=t.getNegative(a);
        System.out.println("Negative value="+count);
        int count1=t.getPositive(a);
        System.out.println("positive=:"+count1);
        
    }
    
}
