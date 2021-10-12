/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Harmin Jeong
 */
package ex41;

import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;

public class App
{
    public static void main( String[] args ) throws Exception
    {
        File file = new File("src/main/java/ex41/exercise41_input.txt");
        Scanner sc = new Scanner(file);

        ArrayList<String> newArr = new ArrayList<String>();

        while (sc.hasNextLine())
            newArr.add(sc.nextLine());

        sortArray(newArr);
        System.out.println("Total of 7 names");
        System.out.println("-----------------");
        for(String str : newArr) {
            System.out.println(str);
        }

        }
    public static void sortArray(ArrayList<String> newArr){
        Collections.sort(newArr);
    }

    }



