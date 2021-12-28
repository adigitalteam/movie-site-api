package xb.soft.movie.entities;

import lombok.Getter;
import lombok.Setter;
import xb.soft.movie.enums.MovieStatusEnum;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "movies")
@Getter
@Setter
public class Movie {

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "release_date")
    private LocalDate releaseDate;

    @Column(name = "certification")
    private String certification;

    @Column(name = "runtime")
    private LocalTime runtime;

    @Column(name = "user_score")
    private Long userScore;

    @Column(name = "tagline")
    private String tagline;

    @Column(name = "overview")
    private String overview;

    @Column(name = "title_source")
    private String titleSource;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private MovieStatusEnum status;

    @Column(name = "lang")
    private String lang;

    @Column(name = "budget")
    private Double budget;

    @Column(name = "fees")
    private Double fees;
}
