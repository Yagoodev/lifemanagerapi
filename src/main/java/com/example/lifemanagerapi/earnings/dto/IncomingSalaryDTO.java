package com.example.lifemanagerapi.earnings.dto;

import com.example.lifemanagerapi.earnings.enums.EarningsType;

import java.util.UUID;

public record IncomingSalaryDTO(EarningsType type, UUID userId, int value) {
}
