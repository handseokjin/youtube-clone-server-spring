package clone.youtube.domain.dto;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
public class MovieProductionCompanyDto {
    private int id;
    private String logo_path;
    private String name;
    private String origin_country;
}
