package baykov.daniel.springbootblogrestapi.repositories;

import baykov.daniel.springbootblogrestapi.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {


}
