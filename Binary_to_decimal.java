//WAP to convert binary to decimal number
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jspider.program;
import java.util.*;
import java.math.*;
/**
 *
 * @author Ashwani Kumar
 */
public class Binary_to_decimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter the binary number");
        Scanner sc=new Scanner(System.in);
        int c=0;
        int p=0;
        int n=sc.nextInt();
        while(n>0)
        {
            int k=n%10;
            p=(int) (p+k*(Math.pow(2, c)));
            c++;
            n=n/10;
            
        }
        System.out.println("Decimal number=:"+p);
    }
    
}
