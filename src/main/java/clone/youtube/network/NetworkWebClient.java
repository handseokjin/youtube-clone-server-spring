package clone.youtube.network;

import clone.youtube.domain.dto.MovieDetailDto;
import clone.youtube.domain.dto.MovieDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class NetworkWebClient implements NetworkWebClientInterface {
    @Value("${themoviedb.api.key}")
    private String API_KEY;
    private WebClient webClient;

    public NetworkWebClient() {
        webClient = WebClient
                .builder()
                .baseUrl("https://api.themoviedb.org/3")
                .build();
    }

    // 영화 목록 출력
    @Override
    public MovieDto getMovieData(String requestUrl) {
        return webClient.
                get()
                .uri(uriBuilder ->
                        uriBuilder
                                .path(requestUrl)
                                .queryParam("api_key", API_KEY)
                                .queryParam("language", "ko-KR")
                                .build()
                )
                .header("Access-Control-Allow-Origin", "*")
                .retrieve()
                .bodyToMono(MovieDto.class)
                .block();
    }

    // 영화 상세 데이터 출력
    @Override
    public MovieDetailDto getMovieDetail(int movieId) {
        return webClient.
                get()
                .uri(uriBuilder ->
                        uriBuilder
                                .path("/movie/" + movieId)
                                .queryParam("api_key", API_KEY)
                                .queryParam("language", "ko-KR")
                                .build()
                )
                .header("Access-Control-Allow-Origin", "*")
                .retrieve()
                .bodyToMono(MovieDetailDto.class)
                .block();
    }

    // 검색된 영화 정보 데이터 출력
    @Override
    public MovieDto getSearchedMovie(String searchedQuery) {
        return webClient.
                get()
                .uri(uriBuilder ->
                        uriBuilder
                                .path("/search/multi")
                                .queryParam("include_adult", false)
                                .queryParam("query", searchedQuery)
                                .queryParam("api_key", API_KEY)
                                .queryParam("language", "ko-KR")
                                .build()
                )
                .header("Access-Control-Allow-Origin", "*")
                .retrieve()
                .bodyToMono(MovieDto.class)
                .block();
    }
}
