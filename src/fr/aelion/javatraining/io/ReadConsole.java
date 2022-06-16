package fr.aelion.javatraining.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadConsole {

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // sc.nextLine();

        System.out.println("Saisir:");
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        try {
            System.out.println(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
