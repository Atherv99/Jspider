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
public class Sum_ofprime_number {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter the range of prime number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            int c=0;
            for(int j=2;j<=i;j++)
            {
                if(i%j==0)
                {
                    c++;
                }
            }    
                if(c==1)
                {
                  sum=sum+i; 
                  
                }
            
            
        }
        
        System.out.println("sum of prime number = "+sum);
    }
    
}
