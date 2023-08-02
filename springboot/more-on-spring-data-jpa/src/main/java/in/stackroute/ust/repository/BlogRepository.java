package in.stackroute.ust.repository;

import in.stackroute.ust.domain.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "blogs", path = "blogs")
public interface BlogRepository extends JpaRepository<Blog, Integer> {
}
