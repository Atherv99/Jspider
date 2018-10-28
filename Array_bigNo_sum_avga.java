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
public class Array_bigNo_sum_avga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter the size of array");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int max=Integer.MIN_VALUE;
        System.out.println("Enter the element of an array");
        int a[]=new int[n];
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Entered number in array");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+",");
            sum=sum+a[i];
        }
        System.out.println();
        for(int i=0;i<a.length;i++)
        {
           if(a[i]>max)
           {
               max=a[i];
           }
        }
        System.out.println("Largest value in array=:"+max);
        System.out.println("Sum of array=:"+sum);
        System.out.println("Average value of array=:"+sum/a.length);
    }
    
}
