package org.example;

import java.util.Scanner;

public class rashod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число(пока только 1)");
        int number = scanner.nextInt();
        switch (number){
            case 1: ras();
        }

    }

    public static void ras() {
        System.out.println(capuchino.waterRashod);
        System.out.println(capuchino.milkRashod);
        System.out.println(capuchino.coffeeRashod);
    }

}
