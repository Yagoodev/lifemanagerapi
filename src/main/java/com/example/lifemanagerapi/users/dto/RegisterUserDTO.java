package com.example.lifemanagerapi.users.dto;

import com.example.lifemanagerapi.users.UserRoles;

public record RegisterUserDTO(String username, String name, String password, UserRoles role) {

}
