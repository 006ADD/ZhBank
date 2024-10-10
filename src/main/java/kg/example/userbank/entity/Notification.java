package kg.example.userbank.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Notification {
    private Long notificationId;
    private LocalDateTime dateAndTime;
    private String message;
    private User associatedId;
    private String typeNotification;
}
