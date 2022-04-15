package co.com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Integer limit = reader.nextInt();
        Integer number = reader.nextInt();
        Succession succession = new Succession(limit, number);
        System.out.printf("%.2f", succession.calculateSuccession());
    }
}



