package kg.example.userbank.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * Представляет кредит.
 * Кредитти көрсөтөт.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Loan {
    /** Уникальный идентификатор кредита.
     * Кредиттин уникалдуу идентификатору. */
    private Long loanId;

    /** Сумма кредита.
     * Кредиттин суммасы. */
    private Long amountLoad;

    /** Процентная ставка.
     * Пайыздык чен. */
    private Long interestRate;

    /** Срок кредита.
     * Кредиттин мөөнөтү. */
    private LocalDateTime loanTerm;

    /** Дата начала кредита.
     * Кредиттин башталган күнү. */
    private LocalDateTime startDate;

    /** Дата окончания кредита.
     * Кредиттин аяктаган күнү. */
    private LocalDateTime endDate;

    /** Связанный пользователь, взявший кредит.
     * Кредитти алган колдонуучу. */
    private User associatedId;
}
