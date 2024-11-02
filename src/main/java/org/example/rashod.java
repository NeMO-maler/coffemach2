package org.example;

import static org.example.Cofetachka.cofetachka;
import java.util.Scanner;

public class rashod {
    public static void main() {

    }

    public static void rascapuchino() {
        System.out.println("Состав капучино");
        System.out.println("вода:" + Capuchino.waterRashod);
        System.out.println("молоко:" + Capuchino.milkRashod);
        System.out.println("Зерно:" + Capuchino.coffeeRashod);
    }
    public static void rasespersso(){
        System.out.println("Состав эспрессо");
        System.out.println("вода:" + expreso.waterRashod);
        System.out.println("молоко:" + expreso.milkRashod);
        System.out.println("Зерно:" + expreso.coffeeRashod);
    }

}
