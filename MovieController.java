package com.xyz.moviebooking.controller;
import com.xyz.moviebooking.entity.Movie;
import com.xyz.moviebooking.service.MovieService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/movies")
public class MovieController{
 private final MovieService service;
 public MovieController(MovieService s){this.service=s;}
 @GetMapping
 public List<Movie> all(){return service.getAll();}
 @PostMapping
 public Movie create(@RequestBody Movie m){return service.save(m);} }
