package kg.example.userbank.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * Представляет карту пользователя.
 * Колдонуучунун картасын көрсөтөт.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Card {
    /** Уникальный идентификатор карты.
     * Картанын уникалдуу идентификатору. */
    private Long cardId;

    /** Номер карты.
     * Картанын номери. */
    private Long cardNumber;

    /** Дата истечения карты.
     * Картанын мөөнөтү. */
    private LocalDateTime expirationDate;

    /** Код CVV карты.
     * Картанын CVV коду. */
    private Long cvvCode;

    /** Тип карты (например, кредитная, дебетовая).
     * Картанын типи (мисалы, кредиттик, дебеттик). */
    private String cardType;

    /** Связанный пользователь, владеющий картой.
     * Картаны ээлеген колдонуучу. */
    private User associatedId;

    /** Другой связанный пользователь.
     * Башка байланышкан колдонуучу. */
    private User linkedId;
}
