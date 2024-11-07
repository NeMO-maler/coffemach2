package org.example;

import java.util.Scanner;
import static org.example.MainMenu.main;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main() {
        System.out.println("Статус кофемашины: выключена");
        Scanner scanner = new Scanner(System.in);

        int in = -1;
        while (in != 1) {
            System.out.println("Нажмите 1, чтобы включить кофемашину:");
            System.out.println("Включите кофе машину");
            try {
                String input = scanner.nextLine();
                in =Byte.parseByte(input);
                if (in != 1) {
                    System.out.println("Ошибка ввода. Введите 1");
                }
            } catch (NumberFormatException e) {
                System.out.println("Введите корректное значение");
            }
        }
        MainMenu.main();



    }
}