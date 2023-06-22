package baykov.daniel.springbootblogrestapi.services;

import baykov.daniel.springbootblogrestapi.payload.CommentDto;

public interface CommentService {

    CommentDto createComment(Long postId, CommentDto commentDto);
}
