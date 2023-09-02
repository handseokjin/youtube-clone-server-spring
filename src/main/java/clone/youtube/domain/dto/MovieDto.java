package clone.youtube.domain.dto;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;

@Slf4j
@Data
public class MovieDto {
    private int page;
    private ArrayList<MovieResultDto> results;
    private int total_pages;
    private int total_results;
}
