package sgr.compliance.sgr_backend.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sgr.compliance.sgr_backend.entities.SgrEntity;

@Repository
public interface SgrRepository extends CrudRepository<SgrEntity, Long> {
}
