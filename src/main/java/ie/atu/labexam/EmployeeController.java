package ie.atu.labexam;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private EmployeeService myService;
    public EmployeeController(EmployeeService myService)
    {
        this.myService = myService;
    }
    private List<Employee> list = new ArrayList<>();
    @GetMapping("/{id}")
    public List<Employee> getEmployees(@PathVariable String id)
    {
        list = myService.getEmployees(id);
        return list;
    }

    @PostMapping
    public List<Employee> addEmployee(@Valid @RequestBody Employee employee)
    {
        list = myService.addEmployee(employee);
        return list;
    }

    @PutMapping("/{id}")
    public List<Employee> updateEmployee(@PathVariable String id,@RequestBody Employee employee)
    {
        list = myService.updateEmployee(id, employee);
        return list;
    }

    @DeleteMapping("/{id}")
    public List<Employee> deleteEmployee(@PathVariable String id, @RequestBody Employee employee)
    {
        list = myService.deleteEmployee(id, employee);
        return list;
    }
}
