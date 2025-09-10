package com.example.carins.web.dto;

import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record InsurancePolicyDto(
        Long carId,
        String provider,
        LocalDate startDate,
        @NotNull
        LocalDate endDate
) {
}
