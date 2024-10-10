package kg.example.userbank.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Представляет криптовалюту.
 * Криптовалютаны көрсөтөт.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cryptocurrency {
    /** Уникальный идентификатор криптовалюты.
     * Криптовалютанын уникалдуу идентификатору. */
    private Long cryptoId;

    /** Название криптовалюты.
     * Криптовалютанын аталышы. */
    private String cryptoName;

    /** Символ криптовалюты (например, BTC, ETH).
     * Криптовалютанын символу (мисалы, BTC, ETH). */
    private String cryptoSymbol;

    /** Текущий цена криптовалюты.
     * Криптовалютанын учурдагы баасы. */
    private Long currentPrice;

    /** Рыночная капитализация криптовалюты.
     * Криптовалютанын рыноктук капитализациясы. */
    private Long marketCapital;
}
