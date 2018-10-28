/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jspider.program;

/**
 *
 * @author Ashwani Kumar
 */
public class Merge_two_array {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a[]={1,5,7,8,9};
        int b[]={4,6,11,13,15};
        int j=0;
        System.out.println("Merge array");
        int c[]=new int[a.length+b.length];
        for(int i=0;i<a.length;i++,j++);
        {
            int i = 0;
            c[j]=a[i];
        
        }
         for(int i=0;i<b.length;i++,j++);
        {
            int i = 0;
            c[j]=a[i];
        }
        for(int i=0;i<j;i++)
        {
            System.out.print(c[i]+" ");
        }
    }
    
}
