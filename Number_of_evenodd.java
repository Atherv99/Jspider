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
public class Number_of_evenodd {

    /**
     * @param args the command line arguments
     */
    int []readArr()
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter how many integer you want");
     int n=sc.nextInt();
     int arr[]=new int[n];
     System.out.println("Enter the element of array");
     for(int i=0;i<arr.length;i++)
     {
         arr[i]=sc.nextInt();
     } 
     return arr;
    }
    void display(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]);
            if(i<a.length-1)
                System.out.print(",");
        }
    }
    int []evenodd(int b[])
    {
        int count[] =new int[2];
        System.out.println("Even and odd values are");
        for(int i=0;i<b.length;i++)
        {
            count[b[i]%2]++;
        }
        return count;
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Number_of_evenodd obj=new Number_of_evenodd ();
        int arr[]=obj.readArr();
        int even[]=obj.evenodd(arr);
        obj.display(even);
        System.out.println();
                
    }
    
    
}
