package clone.youtube.domain.dto;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;

@Slf4j
@Data
public class MovieResultDto {
    private boolean adult;
    private String backdrop_path;
    private int id;
    private String title;
    private String original_language;
    private String original_title;
    private String overview;
    private String poster_path;
    private String media_type;
    private ArrayList<Integer> genre_ids;
    private double popularity;
    private String release_date;
    private boolean video;
    private double vote_average;
    private int vote_count;
}
