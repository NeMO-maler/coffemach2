package org.example;

import java.util.List;

import static org.example.MainMenu.main;

public class msg {
    public static void msg() {
        List<String> logs = Logi.getLogMessages();
        for (String log : logs) {
            System.out.println(log);
        } main();
    }
}
