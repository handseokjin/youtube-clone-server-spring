package clone.youtube.domain.dto;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
public class MovieSpokenLanguage {
    private String english_name;
    private String iso_639_1;
    private String name;
}
