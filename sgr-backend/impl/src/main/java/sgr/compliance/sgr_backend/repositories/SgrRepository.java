package sgr.compliance.sgr_backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sgr.compliance.sgr_backend.entities.SgrEntity;

@Repository
public interface SgrRepository extends JpaRepository<SgrEntity, Long> {
}
