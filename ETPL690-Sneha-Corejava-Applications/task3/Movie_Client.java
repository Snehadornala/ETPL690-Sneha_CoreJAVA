package com.evergent.corejava.sneha.task3;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Movie_Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MovieInterface movieInterface = new MovieImpl();
        while (true) {
            System.out.println("1. Add Movie 2. Search by ID 3. Display All 4. Exit");
            int choice = 0;
            try {
                choice = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                sc.next(); // Clear the invalid input
                continue;
            }
            switch (choice) {
                case 1:
                    System.out.println("Enter the Movie ID:");
                    String id = sc.next();
                    System.out.println("Enter the Movie Title:");
                    String title = sc.next();
                    System.out.println("Enter the Movie Genre:");
                    String genre = sc.next();
                    Movie movie = new Movie();
                    movie.setId(id);
                    movie.setTitle(title);
                    movie.setGenre(genre);
                    System.out.println(movieInterface.addMovie(movie));
                    break;
                case 2:
                    System.out.println("Enter the Movie ID:");
                    String searchId = sc.next();
                    System.out.println(movieInterface.searchById(searchId));
                    break;
                case 3:
                    movieInterface.getAllMovies();
                    break;
                case 4:
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}