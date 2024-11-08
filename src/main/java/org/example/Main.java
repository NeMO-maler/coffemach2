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
            try {
                String input = scanner.nextLine();
                in =Byte.parseByte(input);
                if ((in != 1) && input.length() == 1 && input.matches("[\\p{L}\\p{N}]")) {
                    System.out.println("Ошибка ввода. Введите 1");
                }
            } catch (NumberFormatException e) {
                System.out.println("Введите ОДИН корректный символ");
            }
        }
        MainMenu.main();



    }
}
