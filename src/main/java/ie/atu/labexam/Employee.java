package ie.atu.labexam;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    @Pattern(regexp = "EMP-XXXX", message = "Employee Code must be unique!!")
    private String employeeCode;
    @Length(max = 100, message = "Maximum 100 characters!!!")
    private String name;
    @Email(message = "Email must be in valid format!!")
    private String email;
    @Pattern.List(, message = "Error")

    private String position;
    @Positive (message = "Salary must be greater than 0!!!")
    private float salary;
    //@PastOrPresent(message = "Must be today or earlier!!!")
    private String dateOfJoining;
}
