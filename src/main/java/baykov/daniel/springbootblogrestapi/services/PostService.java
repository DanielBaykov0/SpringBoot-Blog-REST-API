package baykov.daniel.springbootblogrestapi.services;

import baykov.daniel.springbootblogrestapi.payload.PostDto;
import baykov.daniel.springbootblogrestapi.payload.PostResponse;

public interface PostService {

    PostDto createPost(PostDto postDto);

    PostResponse getAllPosts(int pageNo, int pageSize, String sortBy);

    PostDto getPostById(long id);

    PostDto updatePostById(PostDto postDto, long id);

    void deletePostById(long id);
}
