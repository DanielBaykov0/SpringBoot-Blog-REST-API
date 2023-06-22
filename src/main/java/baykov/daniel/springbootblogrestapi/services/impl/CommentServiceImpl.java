package baykov.daniel.springbootblogrestapi.services.impl;

import baykov.daniel.springbootblogrestapi.entity.Comment;
import baykov.daniel.springbootblogrestapi.entity.Post;
import baykov.daniel.springbootblogrestapi.exceptions.ResourceNotFoundException;
import baykov.daniel.springbootblogrestapi.payload.CommentDto;
import baykov.daniel.springbootblogrestapi.repositories.CommentRepository;
import baykov.daniel.springbootblogrestapi.repositories.PostRepository;
import baykov.daniel.springbootblogrestapi.services.CommentService;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService {

    private CommentRepository commentRepository;
    private PostRepository postRepository;

    public CommentServiceImpl(CommentRepository commentRepository, PostRepository postRepository) {
        this.commentRepository = commentRepository;
        this.postRepository = postRepository;
    }

    @Override
    public CommentDto createComment(Long postId, CommentDto commentDto) {
        Comment comment = new Comment();
        // retrieve post entity by id
        Post post = postRepository.findById(postId).orElseThrow(() -> new ResourceNotFoundException("Post", "id", postId));

        // set post to comment
        comment.setPost(post);

        // save comment entity to DB
        Comment newComment = commentRepository.save(comment);

        return mapToDTO(newComment);
    }

    private CommentDto mapToDTO(Comment comment) {
        CommentDto commentDto = new CommentDto();
        commentDto.setId(comment.getId());
        commentDto.setName(comment.getName());
        commentDto.setEmail(comment.getEmail());
        commentDto.setBody(comment.getBody());
        return commentDto;
    }

    private Comment mapToEntity(CommentDto commentDto) {
        Comment comment = new Comment();
        comment.setId(commentDto.getId());
        comment.setName(commentDto.getName());
        comment.setEmail(commentDto.getEmail());
        comment.setBody(commentDto.getBody());
        return comment;
    }
}
