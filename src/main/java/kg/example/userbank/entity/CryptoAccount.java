package kg.example.userbank.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CryptoAccount {
    private Long uniqueCryptoAccount;
    private User userId;
    private Cryptocurrency cryptocurrencyId;
    private Long balance;
}
