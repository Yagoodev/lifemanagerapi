package com.example.lifemanagerapi.users.services;

import com.example.lifemanagerapi.domains.UsersDomain;
import com.example.lifemanagerapi.repositories.UsersRepository;
import com.example.lifemanagerapi.users.dto.LoginUserDTO;
import com.example.lifemanagerapi.users.dto.RegisterUserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UsersServicesImp implements UsersServices {

  @Autowired
  private UsersRepository usersRepository;

  public ResponseEntity login(LoginUserDTO data) {
    var user = this.usersRepository.findByUsername(data.username());

    return ResponseEntity.status(HttpStatus.OK).body(user);
  }

  @Override
  public ResponseEntity register(RegisterUserDTO data) {
    boolean alreadyExistsUsername = this.usersRepository.findByUsername(data.username()) != null;

    if (alreadyExistsUsername) return ResponseEntity.badRequest().build();

    String encryptedPassword = new BCryptPasswordEncoder().encode(data.password());

    UsersDomain user = new UsersDomain(data.username(), data.name(), encryptedPassword, data.role());

    this.usersRepository.save(user);

    return ResponseEntity.ok().build();
  }
}
