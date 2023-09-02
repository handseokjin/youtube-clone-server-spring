package clone.youtube.controller;

import clone.youtube.domain.dto.MovieDetailDto;
import clone.youtube.domain.dto.MovieDto;
import clone.youtube.domain.model.RequestMovieGenreUrl;
import clone.youtube.network.NetworkWebClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
@ResponseBody
public class MovieController {
    @Autowired
    private NetworkWebClient networkWebClient;

    @GetMapping("{movieGenreGbn}")
    public MovieDto getMovieData(@PathVariable String movieGenreGbn) {
        String requestUrl = "";

        switch (movieGenreGbn) {
            case "1":
                requestUrl = RequestMovieGenreUrl.trending;
                break;

            case "2":
                requestUrl = RequestMovieGenreUrl.topRated;
                break;

            case "3":
                requestUrl = RequestMovieGenreUrl.action;
                break;

            case "4":
                requestUrl = RequestMovieGenreUrl.comedy;
                break;

            case "5":
                requestUrl = RequestMovieGenreUrl.horror;
                break;

            case "6":
                requestUrl = RequestMovieGenreUrl.romance;
                break;

            case "7":
                requestUrl = RequestMovieGenreUrl.documentary;
                break;
        }

        return networkWebClient.getMovieData(requestUrl);
    }

    @GetMapping("movie/{movieId}")
    public MovieDetailDto getMovieDetail(@PathVariable int movieId) {
        return networkWebClient.getMovieDetail(movieId);
    }

    @GetMapping("movie")
    public MovieDto getSearchedMovie(@RequestParam("searchQuery") String searchQuery) {
        return networkWebClient.getSearchedMovie(searchQuery);
    }
}