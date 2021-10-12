/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Harmin Jeong
 */
package ex45;

import java.util.*;
import java.io.*;

public class App {

    static void newFile(String text) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("What would you like to name the new file?");
        String outputFile = sc.next();
        PrintStream output = new PrintStream(new File("src/main/java/ex45/" + outputFile + ".txt"));
        System.setOut(output);
        System.out.format(text);
    }

    static String readFile() throws Exception{
        String paragraph = "";
        Scanner sc = new Scanner(new File("src/main/java/ex45/exercise45_input.txt")); {
            while (sc.hasNextLine()) {
                paragraph = paragraph + sc.nextLine() + "\n";
            }
        }
        return paragraph;
    }

    static String replace(String text, String old, String modified) {
        return text.replace(old, modified);
    }

    public static void main(String[] args) throws Exception{
        String text = readFile();
        text = replace(text, "utilize", "use");
        newFile(text);
    }
}