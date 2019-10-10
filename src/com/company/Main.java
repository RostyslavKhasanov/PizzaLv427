package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        boolean flag = true;
        System.out.println("Welcome to our cafe");

        Pizza pizza = new Pizza();
        while (flag) {
            System.out.println("Menu \n" +
                "0 - take only dough \n" +
                "1 - add cucumber \n" +
                "2 - add tomato \n" +
                "3 - add salami \n" +
                "4 - add mayonez \n" +
                "5 - add cheese \n" +
                "6 - cook \n");
            n = sc.nextInt();
            switch (n) {
                case 0: {
                    flag = false;
                } break;
                case 1: {
                    pizza.addNachinka(new Cucumber());
                } break;
                case 2: {
                    pizza.addNachinka(new Tomato());
                } break;
                case 3: {
                    pizza.addNachinka(new Salami());
                } break;
                case 4: {
                    pizza.addNachinka(new Mayonez());
                } break;
                case 5: {
                    pizza.addNachinka(new Cheese());
                } break;
                case 6: {
                    flag = false;
                }
            }
        }
        System.out.println("Price of pizza: " + pizza.getPrice());
    }
}
