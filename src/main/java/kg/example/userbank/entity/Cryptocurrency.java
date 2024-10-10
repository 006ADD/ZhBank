package kg.example.userbank.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cryptocurrency {
    private Long cryptoId;
    private String cryptoName;
    private String cryptoSymbol;
    private Long currentPrice;
    private Long marketCapital;
}
