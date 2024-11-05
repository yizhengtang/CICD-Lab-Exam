package ie.atu.labexam;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private String employeeCode;
    private String name;
    private String email;
    private String position;
    private float salary;
    private String dateOfJoining;
}
