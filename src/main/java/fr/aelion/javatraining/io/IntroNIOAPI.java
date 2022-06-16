package fr.aelion.javatraining.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.function.Consumer;

public class IntroNIOAPI {
    public static void main(String[] args) {
        try {
            Files.walk(Paths.get("out")).forEach(path -> {
                System.out.println(path);
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
