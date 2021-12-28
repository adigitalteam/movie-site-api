package xb.soft.movie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import xb.soft.movie.entities.Movie;

public interface MoviesRepository extends JpaRepository<Movie, Long>, CrudRepository<Movie,Long> {

}
