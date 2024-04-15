package com.example.lifemanagerapi.domains;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

import com.example.lifemanagerapi.users.UserRoles;
import jakarta.persistence.*;
import lombok.Getter;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.Data;

@Data
@Table(name = "tb_users")
@Entity(name = "tb_users")
@Getter
public class UsersDomain implements UserDetails {

  public UsersDomain() {
  }

  public UsersDomain(String username, String name, String password, UserRoles role) {
    this.username = username;
    this.name = name;
    this.password = password;
    this.role = role;
  }

  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;

  private String username;

  private String name;

  private String password;

  private UserRoles role;

  @CreationTimestamp
  private LocalDateTime createdAt;

  @OneToMany
  private List<EarningsDomain> earnings;

  @OneToMany
  private List<ExpensesDomain> expenses;

  @Override
  public String getUsername() {
    return username;
  }

  @Override
  public Collection<? extends GrantedAuthority> getAuthorities() {
    if (this.role == UserRoles.ADMIN)
      return List.of(new SimpleGrantedAuthority("ROLE_ADMIN"), new SimpleGrantedAuthority("ROLE_USER"));

    return List.of(new SimpleGrantedAuthority("ROLE_USER"));
  }

  @Override
  public boolean isAccountNonExpired() {
    return true;
  }

  @Override
  public boolean isAccountNonLocked() {
    return true;
  }

  @Override
  public boolean isCredentialsNonExpired() {
    return true;
  }

  @Override
  public boolean isEnabled() {
    return true;
  }
}
