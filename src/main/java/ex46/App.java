/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Harmin Jeong
 */
package ex46;

import java.util.*;
import java.io.*;

class App {
    public static void main(String args[]) throws Exception{
        Scanner sc = new Scanner(new File("src/main/java/ex46/exercise46_input.txt"));
        Map<String,Integer> hist=new TreeMap<String,Integer>();

        while(sc.hasNext()){
            String str = sc.next();
                if(hist.containsKey(str))
                    hist.put(str,hist.get(str)+1);
                else
                    hist.put(str,1);
        }
        for(String key:hist.keySet()){
            System.out.printf("%-10s",key+":");
                for(int i=hist.get(key);i>0;i--)
                    System.out.print("*");
            System.out.println();
        }

    }
}