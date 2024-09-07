package sgr.compliance.sgr_backend.dtos;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class SgrDTO {

    private final Long id;
    private final String sgrString;
}
