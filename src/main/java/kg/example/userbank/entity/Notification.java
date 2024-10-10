package kg.example.userbank.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * Представляет уведомление.
 * Уведомлениени көрсөтөт.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Notification {
    /** Уникальный идентификатор уведомления.
     * Уведомлениенин уникалдуу идентификатору. */
    private Long notificationId;

    /** Дата и время уведомления.
     * Уведомлениенин датасы жана убактысы. */
    private LocalDateTime dateAndTime;

    /** Сообщение уведомления.
     * Уведомлениенин билдирүүсү. */
    private String message;

    /** Связанный пользователь, получивший уведомление.
     * Уведомлениени алган колдонуучу. */
    private User associatedId;

    /** Тип уведомления (например, информационное, предупреждение).
     * Уведомлениенин типи (мисалы, маалыматтык, эскертүү). */
    private String typeNotification;
}
