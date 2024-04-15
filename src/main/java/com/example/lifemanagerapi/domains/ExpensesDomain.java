package com.example.lifemanagerapi.domains;

import com.example.lifemanagerapi.expenses.enums.ExpensesType;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Table(name = "tb_expenses")
@Entity(name = "tb_expenses")
public class ExpensesDomain {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;

  @CreationTimestamp
  private LocalDateTime createdAt;

  @UpdateTimestamp
  private Instant updatedAt;

  @Column
  private ExpensesType type;

  @ManyToOne
  private UsersDomain userId;
}
