package kg.example.userbank.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Представляет банкомат.
 * Банкоматты көрсөтөт.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ATM {
    /** Уникальный идентификатор банкомата.
     * Банкоматтын уникалдуу идентификатору. */
    private Long atmId;

    /** Адрес банкомата.
     * Банкоматтын дареги. */
    private String address;

    /** Геолокация банкомата в виде строки (например, "широта, долгота").
     * Банкоматтын геолокациясы (мисалы, "широта, узундук"). */
    private String geolocation;
}
