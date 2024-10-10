package kg.example.userbank.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Представляет криптовалютный кошелек.
 * Криптовалюталык капчыкты көрсөтөт.
 */
@AllArgsConstructor
@Data
@NoArgsConstructor
public class CryptoWallet {
    /** Уникальный идентификатор кошелька.
     * Капчыктын уникалдуу идентификатору. */
    private Long walletId;

    /** Связанный пользователь, владеющий кошельком.
     * Капчыкты ээлеген колдонуучу. */
    private User userId;

    /** Тип кошелька (например, горячий, холодный).
     * Капчыктын типи (мисалы, ысык, суу). */
    private String type;

    /** Публичный ключ кошелька.
     * Капчыктын коомдук ачкычы. */
    private Long publicKey;

    /** Приватный ключ кошелька.
     * Капчыктын жеке ачкычы. */
    private Long privateKey;
}
