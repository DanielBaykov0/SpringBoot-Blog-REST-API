package baykov.daniel.springbootblogrestapi.services;

import baykov.daniel.springbootblogrestapi.payload.LoginDto;

public interface AuthService {

    String login(LoginDto loginDto);
}
