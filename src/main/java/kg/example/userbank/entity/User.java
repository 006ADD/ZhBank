package kg.example.userbank.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;;

/**
 * Представляет пользователя.
 * Колдонуучуну көрсөтөт.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {/** Пользователь */
    /** Уникальный идентификатор пользователя.
     * Колдонуучунун уникалдуу идентификатору. */
    private Long userId;

    /** Имя пользователя.
     * Колдонуучунун аты. */
    private String firstname;

    /** Фамилия пользователя.
     * Колдонуучунун фамилиясы. */
    private String lastname;

    /** Электронная почта пользователя.
     * Колдонуучунун электрондук почтасы. */
    private String email;

    /** Адрес пользователя.
     * Колдонуучунун дареги. */
    private String address;

    /** Пароль пользователя.
     * Колдонуучунун пароли. */
    private String password;

    /** Дата рождения пользователя.
     * Колдонуучунун туулган күнү. */
    private LocalDate dateOfBirth;
}
