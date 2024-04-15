package com.example.lifemanagerapi.earnings.enums;

import lombok.Getter;

@Getter
public enum EarningsType {
  SALARY("salary");

  private final String earningType;

  EarningsType(String earningType) {
    this.earningType = earningType;
  }

}
