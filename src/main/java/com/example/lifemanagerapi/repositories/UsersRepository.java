package com.example.lifemanagerapi.repositories;

import com.example.lifemanagerapi.domains.UserDomain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.UUID;

public interface UsersRepository extends JpaRepository<UserDomain, UUID> {
  UserDetails findByUsername(String username);

}
