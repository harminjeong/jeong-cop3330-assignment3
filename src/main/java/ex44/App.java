/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Harmin Jeong
 */
package ex44;

import java.io.*;
import java.util.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


public class App {
    static class Product {
        String name;
        double price;
        long quantity;

        Product(String name, double price, long quantity){
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        static Product[] findProducts() throws Exception{
            Product[] items = new Product[3];
            Object obj = new JSONParser().parse(new FileReader("src/main/java/ex44/exercise44_input.json"));
            JSONObject main = (JSONObject) obj;
            JSONArray products = (JSONArray) main.get("products");
            for(int i = 0; i < products.size(); i++){
                JSONObject item = (JSONObject) products.get(i);
                String name = (String) item.get("name");
                Double price = (Double) item.get("price");
                long quantity = (long) item.get("quantity");
                items[i] = new Product(name, price, quantity);

            }
            return items;
        }
    }
    static int search(String key, Product[] items){

        for(int i = 0; i < items.length; i++){
            if(key.equalsIgnoreCase(items[i].name)){
                System.out.println("Name: " + items[i].name);
                System.out.printf("Price: %.2f\n", items[i].price);
                System.out.println("Quantity: " + items[i].quantity);
                return 1;
            }
        }
        System.out.println("Sorry, that product was not found in our inventory.");
        return 0;
    }

    static void prompt(Product[] items){
        Scanner sc = new Scanner(System.in);

        int val = 0;
        while(val == 0){
            System.out.format("What is the product name? ");
            String key = sc.next();
            val = search(key, items);
        }
    }
    public static void main(String[] args) throws Exception {
        Product[] items = Product.findProducts();
        prompt(items);
    }
}

