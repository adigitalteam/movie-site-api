package xb.soft.movie.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xb.soft.movie.entities.Movie;
import xb.soft.movie.repositories.MoviesRepository;

import java.util.List;

@Service
public class MoviesService {

    @Autowired
    MoviesRepository moviesRepository;


    public List<Movie> getAll() {
        return moviesRepository.findAll();
    }

    public Movie getOne(Long id) throws Exception {
        return moviesRepository.findById(id).orElseThrow(() -> new Exception("Movie not found:" + id));
    }
}
