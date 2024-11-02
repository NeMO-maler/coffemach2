package org.example;

import java.util.Scanner;

class Prepare {



    public static void prepare(){
        System.out.println("____________________");
        System.out.println("Меню приготовления");
        System.out.println("Выберите напиток:");
        System.out.println("1.Капучино");
        System.out.println("2.Еспрессо");
        System.out.println("____________________");
        Scanner scanner = new Scanner(System.in);
        int ch = scanner.nextByte();
        if (ch == 1){
            System.out.println("Вы выбрали капучино");

        }
        else if (ch == 2) {
            System.out.println("Вы выбрали эспрессо");
        }
        else {
            System.out.println("нет такого варианта ответа");
        }

    }
}
