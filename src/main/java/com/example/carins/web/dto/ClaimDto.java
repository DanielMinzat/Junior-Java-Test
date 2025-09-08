package com.example.carins.web.dto;

import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public record ClaimDto (
        @PastOrPresent(message = "Date must not exceed the current day")
        LocalDate claimDate,
        @Size(max = 255, message = "Please keep the description under 255 characters")
        String description,
        @Positive(message = "Please enter a value above 0")
        float amount
){
}
