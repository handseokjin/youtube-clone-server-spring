package clone.youtube.domain.dto;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;

@Slf4j
@Data
public class MovieDetailDto {
    private boolean adult;
    private String backdrop_path;
    private Object belongs_to_collection; // 결과가 널로 나오는데 나중에 api 문서 참고해 보던가 하기
    private int budget;
    private ArrayList<MovieGenreDto> genres;
    private String homepage;
    private int id;
    private String imdb_id;
    private String original_language;
    private String original_title;
    private String overview;
    private double popularity;
    private String poster_path;
    private ArrayList<MovieProductionCompanyDto> production_companies;
    private ArrayList<MovieProductionCountry> production_countries;
    private String release_date;
    private int revenue;
    private int runtime;
    private ArrayList<MovieSpokenLanguage> spoken_languages;
    private String status;
    private String tagline;
    private String title;
    private boolean video;
    private String vote_average;
    private int vote_count;
}
