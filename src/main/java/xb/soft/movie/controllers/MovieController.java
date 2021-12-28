package xb.soft.movie.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xb.soft.movie.entities.Movie;
import xb.soft.movie.services.MoviesService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/v1/movies")
public class MovieController {


    @Autowired
    MoviesService moviesService;

    @GetMapping("info")
    public String info() {
        return "Movies API - version 1";
    }

    @GetMapping("info/full")
    public HashMap<String, String> infoFull() {
        HashMap<String, String> data = new HashMap<>();
        data.put("name", "Movie");
        data.put("version", "v1");
        data.put("developer", "Xb Team Learning");
        return data;
    }

    @GetMapping("info/full2")
    public ArrayList<String> infoFull2() {
        ArrayList<String> listData = new ArrayList<>();
        listData.add("Movie");
        listData.add("v1");
        listData.add("Xb Team Learning");
        return listData;
    }


    @GetMapping("")
    public List<Movie> getAll() {
        return moviesService.getAll();
    }

    @GetMapping("/{id}")
    public Movie getOne(@PathVariable Long id) throws Exception {
        return moviesService.getOne(id);
    }

}
