package kg.example.userbank.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@Data
@NoArgsConstructor
public class CryptoWallet {
    private Long walletId;
    private User userId;
    private String type;
    private Long publicKey;
    private Long privateKey;
}
