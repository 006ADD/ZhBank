package kg.example.userbank.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * Представляет криптовалютную транзакцию.
 * Криптовалюталык транзакцияны көрсөтөт.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CryptoTransaction {
    /** Уникальный идентификатор крипто-транзакции.
     * Крипто-транзакциянын уникалдуу идентификатору. */
    private Long cryptoTransId;

    /** Дата и время транзакции.
     * Транзакциянын датасы жана убактысы. */
    private LocalDateTime dateAndTime;

    /** Сумма транзакции.
     * Транзакциянын суммасы. */
    private Long amount;

    /** Тип транзакции (например, отправка, получение).
     * Транзакциянын типи (мисалы, жиберүү, алуу). */
    private String type;

    /** Исходный крипто-счет.
     * Багытталган крипто-эсеп. */
    private Cryptocurrency sourceCryptoAccountId;

    /** Целевой крипто-счет.
     * Мақсатталган крипто-эсеп. */
    private Cryptocurrency destinationCryptoAccountId;

    /** Комиссия за транзакцию.
     * Транзакция үчүн комиссия. */
    private Long commission;
}
