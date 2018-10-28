//WAP to find out second largest value in array
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

public class Secondlargest_number {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Enter the size of array");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int s;
        int f=s=Integer.MIN_VALUE;
        System.out.println("Enter the element of an array");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++)
        {
          if(a[i]>f)
          {
             
              s=f;
              f=a[i];
          }
          else if(a[i]>s && a[i]!=f)
          {
              s=a[i];
          }
        }
        System.out.println("Seconf largest =:"+s);
    }
    
}
