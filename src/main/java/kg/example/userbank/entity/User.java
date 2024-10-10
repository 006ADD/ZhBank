package kg.example.userbank.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {/** Пользлватель */
    private Long userId;
    private String firstname;
    private String lastname;
    private String email;
    private String address;
    private String password;
    private LocalDate dateOfBirth;
}
