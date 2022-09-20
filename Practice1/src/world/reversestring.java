package world;
import java.io.*;
import java.util.Scanner;
  
class reversestring {
    public static void main (String[] args) {
        
        String str= "n i s h a d", rvrs="";
        char ch;
        
      System.out.print("Original word: ");
      System.out.println(str);
        
      for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i);
        rvrs= ch+rvrs;
      }
      System.out.println("Reversed word: "+ rvrs);
    }
}