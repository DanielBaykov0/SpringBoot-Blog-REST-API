package baykov.daniel.springbootblogrestapi.repositories;

import baykov.daniel.springbootblogrestapi.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.nio.file.LinkOption;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
