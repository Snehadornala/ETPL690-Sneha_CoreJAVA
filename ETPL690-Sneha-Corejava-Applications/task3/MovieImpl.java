package com.evergent.corejava.sneha.task3;

import java.util.HashSet;
import java.util.Set;
public class MovieImpl implements MovieInterface {
    private Set<Movie> movieSet;
    public MovieImpl() {
        movieSet = new HashSet<>();
    }
    @Override
    public String addMovie(Movie m) {
        if (movieSet.add(m)) {
            return "Movie added successfully.";
        } else {
            return "Movie with this ID already exists.";
        }
    }
    @Override
    public String searchById(String id) {
        for (Movie movie : movieSet) {
            if (movie.getId().equals(id)) {
                return movie.toString();
            }
        }
        return "Movie not found.";
    }
    @Override
    public void getAllMovies() {
        if (movieSet.isEmpty()) {
            System.out.println("No movies are available.");
        } else {
            for (Movie movie : movieSet) {
                System.out.println(movie);
            }
        }
    }
}