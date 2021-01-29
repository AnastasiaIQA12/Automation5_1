package ru.netology;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;

@Data
@RequiredArgsConstructor
public class RegistrationByCardInfo {
    private final String city;
    private final LocalDate dateDelivery;
    private final String name;
    private final String phone;

}
