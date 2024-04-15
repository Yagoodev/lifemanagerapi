package com.example.lifemanagerapi.expenses.enums;

import lombok.Getter;

@Getter
public enum ExpensesType {
  CREDIT_CARD("credit_card");

  private final String expensesType;

  ExpensesType(String expensesType) {
    this.expensesType = expensesType;
  }
}
