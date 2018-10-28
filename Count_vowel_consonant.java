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
public class Count_vowel_consonant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str="Kamlesh";
        char[]a=str.toCharArray();
        int c=0;
        int v=0;
        for(int i=0;i<str.length();i++)
        {
            if(a[i]=='a'||a[i]=='A'||a[i]=='i'||a[i]=='I'||a[i]=='o'||a[i]=='O'||a[i]=='u'||a[i]=='U'||a[i]=='e'||a[i]=='E')
            {
             v++;   
            }
            else
            {
                c++;
            }
        }
    System.out.println("constonant=:"+c+" Vowel=:"+v);
    }
    
}
