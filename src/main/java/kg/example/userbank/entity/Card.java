package kg.example.userbank.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Card {
    private Long cardId;
    private Long cardNumber;
    private LocalDateTime expirationDate;
    private Long cvvCode;
    private String cardType;
    private User associatedId;
    private User linkedId;
}
