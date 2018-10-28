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
public class Range_perfect {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter the range of perfect number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<n;i++)
        {
            int sum=0;
            for(int j=1;j<i;j++)
            {
                if(i%j==0)
                {
                    sum=sum+i;
                }
            }
            if(sum==i)
            {
                System.out.print(sum+" is perfect number");
            }
        }
    }
    
}
