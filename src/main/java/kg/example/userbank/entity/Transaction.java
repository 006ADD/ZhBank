package kg.example.userbank.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Transaction {/** Транзакция */
    private Long transactionId;
    private LocalDateTime dateAndTime;
    private Long amount;
    private String type;
    private String sourceAccountId;
    private String destinationAccountId;
    private String description;
}
