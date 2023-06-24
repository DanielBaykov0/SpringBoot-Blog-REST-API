package baykov.daniel.springbootblogrestapi.repositories;

import baykov.daniel.springbootblogrestapi.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {

    List<Post> findByCategoryId(Long categoryId);
}
