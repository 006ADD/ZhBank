package kg.example.userbank.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * Представляет транзакцию.
 * Транзакцияны көрсөтөт.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Transaction {/** Транзакция */
    /** Уникальный идентификатор транзакции.
     * Транзакциянын уникалдуу идентификатору. */
    private Long transactionId;

    /** Дата и время транзакции.
     * Транзакциянын датасы жана убактысы. */
    private LocalDateTime dateAndTime;

    /** Сумма транзакции.
     * Транзакциянын суммасы. */
    private Long amount;

    /** Тип транзакции (например, перевод, платеж).
     * Транзакциянын типи (мисалы, которуу, төлөм). */
    private String type;

    /** Исходный счет.
     * Багытталган эсеп. */
    private String sourceAccountId;

    /** Целевой счет.
     * Мақсатталган эсеп. */
    private String destinationAccountId;

    /** Описание транзакции.
     * Транзакциянын сүрөттөмөсү. */
    private String description;
}
