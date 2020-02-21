package com.kodilla.good.patterns.challenges.movies;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MoviesApplication {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        Map<String, List<String>> movieMap = movieStore.getMovies();

        String movieTitles = movieMap.entrySet().stream()
                .map(m -> m.getValue())
                .flatMap(m -> m.stream())
                .collect(Collectors.joining(" ! ", "", ""));

        System.out.println(movieTitles);
    }
}
