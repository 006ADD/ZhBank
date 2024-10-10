package kg.example.userbank.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Представляет крипто-счет пользователя.
 * Колдонуучунун крипто-эсебин көрсөтөт.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CryptoAccount {
    /** Уникальный идентификатор крипто-счета.
     * Крипто-эсептин уникалдуу идентификатору. */
    private Long uniqueCryptoAccount;

    /** Связанный пользователь, владеющий крипто-счетом.
     * Крипто-эсепти ээлеген колдонуучу. */
    private User userId;

    /** Связанная криптовалюта.
     * Байланышкан криптовалюта. */
    private Cryptocurrency cryptocurrencyId;

    /** Баланс крипто-счета.
     * Крипто-эсептеги баланс. */
    private Long balance;
}
