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
public class Ocuurence_of_element_array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter  the size od array");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the element of array");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++)
        {
            int c=1;
            for(int j=i+1;j<a.length-1;j++)
            {
                if(a[i]==a[j])
                {
                  c++;
                  i=j;
                }
            }
            System.out.println(a[i]+" occurence in :"+c+" times");
        }
        
        
    }
    
}
