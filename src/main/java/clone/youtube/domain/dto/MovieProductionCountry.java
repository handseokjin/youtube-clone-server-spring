package clone.youtube.domain.dto;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
public class MovieProductionCountry {
    private String iso_3166_1;
    private String name;
}
