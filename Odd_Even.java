// write a program to check no is even or odd without using loop

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
public class Odd_Even {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter any number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String str[]={"Even","Odd"};
        System.out.println(n+" is "+str[n%2]+" number");
    }
    
}
