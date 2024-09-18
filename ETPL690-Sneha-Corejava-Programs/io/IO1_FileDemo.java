package com.evergent.corejava.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class IO1_FileDemo {
    public static void main(String[] args) {
        try {
            // Attempt to open a file that doesn't exist
            File file = new File("C:\\Users\\sneha.dornala\\Downloads\\program.txt");
        	
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            // Handle the FileNotFoundException
            System.out.println("File not found: " + e.getMessage());
        }
    }
} 
 
