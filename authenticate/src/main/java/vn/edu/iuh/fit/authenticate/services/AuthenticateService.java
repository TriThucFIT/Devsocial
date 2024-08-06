package vn.edu.iuh.fit.authenticate.services;

import vn.edu.iuh.fit.authenticate.dto.requests.AuthenticateRequest;

public interface AuthenticateService {
  String login(AuthenticateRequest authenticateRequest);



}
