package kg.example.userbank.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * Представляет отчет.
 * Отчеттү көрсөтөт.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Report {
    /** Уникальный идентификатор отчета.
     * Отчеттун уникалдуу идентификатору. */
    private Long reportId;

    /** Дата отчета.
     * Отчеттин датасы. */
    private LocalDateTime date;

    /** Тип отчета (например, финансовый, аналитический).
     * Отчеттин типи (мисалы, финансылык, аналитикалык). */
    private String reportType;

    /** Связанный пользователь, создавший отчет.
     * Отчетти түзгөн колдонуучу. */
    private User associatedId;
}
