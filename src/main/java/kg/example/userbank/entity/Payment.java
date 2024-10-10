package kg.example.userbank.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


/**
 * Представляет платеж.
 * Платежди көрсөтөт.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
    /** Уникальный идентификатор платежа.
     * Платеждин уникалдуу идентификатору. */
    private Long paymentId;

    /** Дата и время платежа.
     * Платеждин датасы жана убактысы. */
    private LocalDateTime dateAndTime;

    /** Сумма платежа.
     * Платеждин суммасы. */
    private Long amount;

    /** Тип платежа (например, кредитный, дебетовый).
     * Платеждин типи (мисалы, кредиттик, дебеттик). */
    private String paymentType;

    /** Связанный пользователь, совершивший платеж.
     * Платежди жүргүзгөн колдонуучу. */
    private User associatedId;

    /** Связанный счет, на который произведен платеж.
     * Платеж жүргүзүлгөн эсеп. */
    private User linkedAccountId;
}
