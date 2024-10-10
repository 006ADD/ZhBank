package kg.example.userbank.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
    private Long paymentId;
    private LocalDateTime dateAndTime;
    private Long amount;
    private String paymentType;
    private User associatedId;
    private User linkedAccountId;
}
