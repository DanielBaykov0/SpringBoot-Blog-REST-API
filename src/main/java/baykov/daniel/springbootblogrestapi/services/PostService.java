package baykov.daniel.springbootblogrestapi.services;

import baykov.daniel.springbootblogrestapi.payload.PostDto;

public interface PostService {

    PostDto createPost(PostDto postDto);
}
