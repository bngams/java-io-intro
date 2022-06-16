package fr.aelion.javatraining.io;

import sun.security.util.IOUtils;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            readWithBytes();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readWithBytes() throws IOException {
        FileInputStream fileInput;
        FileOutputStream fileOuput;

        // Comment initialiser un FileInputStream
        fileInput = new FileInputStream("input.txt");
        fileOuput = new FileOutputStream("output2.txt");
        byte[] buffer = new byte[8 * 1024];
        int c;
        while ((c = fileInput.read(buffer)) != -1) {
             System.out.println(c);
             System.out.println(buffer);
             fileOuput.write(buffer, 0, c);
        }
        fileInput.close();
        fileOuput.close();
    }

    public static void readWithFileInputStream() {
        FileInputStream fileInput;
        FileOutputStream fileOuput;

        // Comment initialiser un FileInputStream
        try {
            fileInput = new FileInputStream("input.txt");
            fileOuput = new FileOutputStream("output.txt");
            int c;
            while((c = fileInput.read()) != -1) {
                System.out.println(c);
                fileOuput.write(c);
            }
            fileInput.close();
            fileOuput.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
