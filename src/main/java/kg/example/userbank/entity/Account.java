package kg.example.userbank.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account { /** Счет */
    private Long accountId;
    private Long accountNumber;
    private String accountType;
    private Long balance;
    private LocalDate openingDate;
    private User userId;
}
