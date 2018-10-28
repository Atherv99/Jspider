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
public class Number_of_prime {

    /**
     * @param args the command line arguments
     */
    int c=0;
      int countprime(int a[])
      {
        for(int i=0;i<a.length;i++)
        {
            if(isprime(a[i]))
             c++;   
           
        }
        return c;
      }
      static boolean isprime(int n)
      {
          int i=2;
          while(i<=n/2)
          {
              if(n%i==0)
              {
                  return false;
                 
              }
               i++;
              
          }
          return true;
      }
        
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter the size of array");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Number_of_prime b=new Number_of_prime();
        int a[]=new int[n];
        
        System.out.println("Enter the element of array");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        int c=b.countprime(a);
        System.out.println("Number of prime =:"+c);
        }
      
        
    }

    


    

