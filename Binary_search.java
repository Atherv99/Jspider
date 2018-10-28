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
public class Binary_search {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i,first,last,middle;
        System.out.println("Enter the size of an array");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter the element of array");
        int a[]=new int[n];
        for( i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the element to be search");
        int k=sc.nextInt();
        first=0;
        last=n-1;
        middle=(first+last)/2;
        while(first<=last)
        {
           if(a[middle]<=k)
           {
               first=middle+1;
           }
           else if(a[middle]==k)
           {
               System.out.println(k+" found at location"+middle);
           }
           else
           {
               last=middle-1;
           }
           middle=(first+last)/2;
        }
        if(first>last)
        {
            System.out.println(k+" Not found");
        }
    }
    
}
