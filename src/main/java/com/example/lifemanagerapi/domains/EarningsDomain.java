package com.example.lifemanagerapi.domains;

import lombok.Data;
import com.example.lifemanagerapi.earnings.enums.EarningsType;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Table(name = "tb_earnings")
@Entity(name = "tb_earnings")
public class EarningsDomain {

  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;

  @CreationTimestamp
  private LocalDateTime createdAt;

  @UpdateTimestamp
  private Instant updatedAt;

  @Column
  private EarningsType type;

  @ManyToOne
  private UsersDomain userId;

  @Column
  private int value;
}
