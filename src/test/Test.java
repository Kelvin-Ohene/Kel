/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    //public static void main(String[] args) {
        // TODO code application logic here
    //}
    
    public int lengthOfLastWord(String a)
    {
        int len = 0;

        String n = a.trim();
 
        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) == ' ')
                len = 0;
            else
                len++;
        }
 
        return len;
    }
 
    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter string");
        String input = in.nextLine();
        //String input = "old man k  ";
        Test LastLen = new Test();
        System.out.println("The length of last word is " + LastLen.lengthOfLastWord(input));
    }
    
}
