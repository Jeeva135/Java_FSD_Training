package in.stackroute.ust.repository;

import in.stackroute.ust.domain.Magazine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "magazines", path = "magazines")
public interface MagazineRepository extends JpaRepository<Magazine, Integer> {
}
