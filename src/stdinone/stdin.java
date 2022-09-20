package stdinone;

import java.util.*;

//https://www.hackerrank.com/challenges/java-stdin-and-stdout-1/problem

public class stdin {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
   
        for(int i=0; i<3; i++){
          int a = scan.nextInt();
          System.out.println(a);
       
        }
    }

}

