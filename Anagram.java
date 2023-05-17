/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lcarrays;

import java.util.Arrays;

/**
 *
 * @author gayatrisk
 */
public class LCArrays {

    /**
     * @param args the command line arguments
     * Java Program to Check if two
     * strings are anagram
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String s1 = "Sea";
        String s2 = "sah";
        
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        char[] s1String = s1.toCharArray();
        char[] s2String = s2.toCharArray();

        Arrays.sort(s1String);
        Arrays.sort(s2String);

        if (s1.length() != s2.length()) {
            System.out.println("Not anagram");
            System.exit(0);
        }

        if (Arrays.equals(s1String, s2String)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not anagram");

        }

    }

}
