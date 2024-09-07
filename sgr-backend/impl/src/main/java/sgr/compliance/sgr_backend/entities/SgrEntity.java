package sgr.compliance.sgr_backend.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "SGR_ENTITY")
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SgrEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @Column(name = "SGR_STRING")
    private String sgrString;

}
