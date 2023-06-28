package org.example.User.Valdiation.Model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @NotNull
    private Integer userId; //it should not be a null value

    @NotNull
    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&*()\\-=_+{};':\"\\\\|,.<>?]).{8,}$", message = "Provide a valid username")
    private String userName;    //it must contain at least 1 lowercase, uppercase, special and numeric character and should be of length 8>=

    @Pattern(regexp = "^(0[1-9]|[1-2][0-9]|3[01])-(0[1-9]|1[0-2])-\\d{4}$", message = "Provide a valid Date of Birth")
    private String userDOB; //it must be in format dd-mm-yy

    @Pattern(regexp = "^(0[1-9]|[1-2][0-9]|3[01])-(0[1-9]|1[0-2])-\\d{4}$", message = "Provide a valid date")
    private String userDate;  //it must be in format dd-mm-yy

    @Pattern(regexp = "^(0[0-9]|1[0-9]|2[0-3]):([0-5][0-9])(:[0-5][0-9])?$", message = "Provide a valid timestamp")
    private String userTime;    //it must be in format HH:MM or HH:MM:SS

    @Email(message = "Provide a valid email")
    private String userEmail;   // it must be a something@something mail

    @Size(min = 12, max = 12, message = "PhoneNumber Should be of size 12 including country code")
    private String userPhoneNumber;

}
