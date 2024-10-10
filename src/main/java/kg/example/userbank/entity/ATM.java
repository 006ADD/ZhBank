package kg.example.userbank.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ATM {
    private Long atmId;
    private String address;
    private String geolocation;
}
