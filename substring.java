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
public class substring {

   static void substring(char[]b,int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<=n-i;j++)
            {
               int k=j+i-1;
               for(int c=j;c<=k;c++)
               {
                   System.out.print(b[c]);
               }
               System.out.println();
            }
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str="abc";
        char []a=str.toCharArray();
        substring(a,str.length());
    }
    
}
