/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Harmin Jeong
 */
package ex43;

import java.io.*;
import java.util.Scanner;

public class App{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String currentPath, author, siteName;

        char js = 'N';
        char css = 'N';

        System.out.print("Site name: ");
        siteName = sc.nextLine();
        System.out.print("Author: ");
        author = sc.nextLine();
        System.out.print("Do you want a folder for JavaScript? ");
        js = sc.next().charAt(0);
        System.out.print("Do you want a folder for CSS? ");
        css = sc.next().charAt(0);

        currentPath = "src/main/java/ex43"; //System.getProperty("user.dir");
        currentPath += "\\"+siteName;
        File website = new File(currentPath);
        boolean websiteCreated = website.mkdir();

        if(websiteCreated){
            System.out.println("Created " + currentPath);
            try{
                FileWriter generateSkeleton = new FileWriter(new File(currentPath+"\\index.html"));
                generateSkeleton.write("<!DOCTYPE html>\n<html lang=\"en\">\n<head>\n");
                generateSkeleton.write("\t<meta author=\""+author+"\">\n");
                generateSkeleton.write("\t<title>"+siteName+"</title>\n");
                generateSkeleton.write("</head>\n<body>\n\n</body>\n</html>");
                generateSkeleton.close();
                System.out.println("Created " + currentPath+"\\index.html");
                if(js == 'y' || js == 'Y'){
                    File jsFolder = new File(currentPath+"\\js");
                    boolean jsCreated = jsFolder.mkdir();
                    if(jsCreated){
                        System.out.println("Created " + jsFolder+"\\");
                    }
                    else{
                        System.out.println("JS folder not created!");
                    }
                }
                if(css == 'y' || css == 'Y'){
                    File cssFolder = new File(currentPath+"\\css");
                    boolean cssCreated = cssFolder.mkdir();
                    if(cssCreated){
                        System.out.println("Created " + cssFolder+"\\");
                    }
                    else{
                        System.out.println("CSS folder not created!");
                    }
                }
            }
            catch(IOException e){
                System.out.println("index.html not created as required!");
            }
        }
        else{
            System.out.println("Website folder not created!");
        }
        sc.close();
    }
}