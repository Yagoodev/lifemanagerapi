package com.example.lifemanagerapi.users;

import com.example.lifemanagerapi.users.dto.LoginUserDTO;
import com.example.lifemanagerapi.users.dto.RegisterUserDTO;
import com.example.lifemanagerapi.users.services.UsersServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UsersController {

  @Autowired
  private UsersServices usersServices;

  @PostMapping("/login")
  public ResponseEntity login(@RequestBody @Validated LoginUserDTO data) {
    return this.usersServices.login(data);
  }

  @PostMapping("/register")
  public ResponseEntity register(@RequestBody @Validated RegisterUserDTO data) {
    return this.usersServices.register(data);
  }
}
