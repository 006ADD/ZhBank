package kg.example.userbank.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

/**
 * Представляет счет пользователя в банке.
 * Колдонуучунун банктагы эсепти көрсөтөт.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account { /** Счет */
    /** Уникальный идентификатор счета.
     * Эсептин уникалдуу идентификатору. */
    private Long accountId;

    /** Номер счета.
     * Эсептин номери. */
    private Long accountNumber;

    /** Тип счета (например, текущий, сберегательный).
     * Эсептин типи (мисалы, учурдагы, жыйноочу). */
    private String accountType;

    /** Баланс счета в денежной единице.
     * Эсептеги баланс, акча бирдигинде. */
    private Long balance;

    /** Дата открытия счета.
     * Эсептин ачылган күнү. */
    private LocalDate openingDate;

    /** Связанный пользователь, владеющий счетом.
     * Эсепти ээлеген колдонуучу. */
    private User userId;
}
