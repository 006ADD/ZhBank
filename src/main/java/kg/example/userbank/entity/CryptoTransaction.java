package kg.example.userbank.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CryptoTransaction {
    private Long cryptoTransId;
    private LocalDateTime dateAndTime;
    private Long amount;
    private String type;
    private Cryptocurrency sourceCryptoAccountId;
    private Cryptocurrency destinationCryptoAccountId;
    private Long commission;
}
