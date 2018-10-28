//WAP to check number is happy number or not
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
public class JspiderProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter any number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        while(n>9)
        {
            int c=0;
            while(n!=0)
            {
                int k=n%10;
                c=c+k*k;
                n=n/10;
            }
            n=c;
        }
        if(n==1||n==7)
        {
            System.out.println("It is happy numbber");
        }
        else
        {
            System.out.println("It is not happy number");
        }
        
    }
    
}
