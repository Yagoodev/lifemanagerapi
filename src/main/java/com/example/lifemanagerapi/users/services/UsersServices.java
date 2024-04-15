package com.example.lifemanagerapi.users.services;

import com.example.lifemanagerapi.users.dto.LoginUserDTO;
import com.example.lifemanagerapi.users.dto.RegisterUserDTO;
import org.springframework.http.ResponseEntity;

public interface UsersServices {

  public ResponseEntity login(LoginUserDTO data);
  public ResponseEntity register(RegisterUserDTO data);

}
