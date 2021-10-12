/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Harmin Jeong
 */
package ex42;

import java.io.*;
import java.util.Scanner;

public class App {
    public void processRecords(String exercise42_input)throws Exception{

        File file = new File("src/main/java/ex42/exercise42_input.txt");
        Scanner sc = new Scanner(file);

        while (sc.hasNext()) {
            String s = sc.nextLine();
            String[] temp = s.split(",");
            System.out.printf("%-10s%-10s%-10s\n", temp[0], temp[1], temp[2]);
        }
    }
    public static void main(String[] args)throws Exception{
        App emp = new App();
        System.out.printf("%-10s%-10s%-10s\n", "Last", "First", "Salary");
        System.out.println("--------------------------");
        emp.processRecords("exercise42_input.txt");
    }
}

