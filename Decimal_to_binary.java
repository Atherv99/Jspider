//WAP to Decimal to binay
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
public class Decimal_to_binary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter the size of pattern");
        Scanner sc=new Scanner(System.in);
        String c="";
        int n=sc.nextInt();
        while(n>0)
        {
            int k=n%2;
            c=c+k;
            n=n/2;
            
        }
        System.out.println("Binary number=:"+c);
    }
    
}
