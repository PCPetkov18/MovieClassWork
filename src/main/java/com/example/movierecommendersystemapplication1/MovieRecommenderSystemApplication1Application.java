package com.example.movierecommendersystemapplication1;
import Classes1.RecommenderImplementation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Arrays;
@SpringBootApplication

public class MovieRecommenderSystemApplication1Application{

    public static void main(String[] args) {

        RecommenderImplementation recommender = new RecommenderImplementation();
        String[] results = recommender.recommendMovies("Finding Dory");
        System.out.println(Arrays.toString(results));
        SpringApplication.run(MovieRecommenderSystemApplication1Application.class, args);
    }

}
