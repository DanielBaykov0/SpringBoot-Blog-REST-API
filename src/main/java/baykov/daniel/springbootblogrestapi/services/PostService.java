package baykov.daniel.springbootblogrestapi.services;

import baykov.daniel.springbootblogrestapi.payload.PostDto;

import java.util.List;

public interface PostService {

    PostDto createPost(PostDto postDto);

    List<PostDto> getAllPosts();

    PostDto getPostById(long id);

    PostDto updatePost(PostDto postDto, long id);
}
