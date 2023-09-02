package clone.youtube.network;

import clone.youtube.domain.dto.MovieDetailDto;
import clone.youtube.domain.dto.MovieDto;

public interface NetworkWebClientInterface {
    public MovieDto getMovieData(String movieGenreGbn);
    public MovieDetailDto getMovieDetail(int movieId);
    public MovieDto getSearchedMovie(String searchedQuery);
}