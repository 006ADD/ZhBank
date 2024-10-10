package kg.example.userbank.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Loan {
    private Long loanId;
    private Long amountLoad;
    private Long interestRate;
    private LocalDateTime loanTerm;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private User associatedId;
}
