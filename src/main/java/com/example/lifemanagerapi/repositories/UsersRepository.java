package com.example.lifemanagerapi.repositories;

import com.example.lifemanagerapi.domains.UsersDomain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.UUID;

public interface UsersRepository extends JpaRepository<UsersDomain, UUID> {
  UserDetails findByUsername(String username);

}
