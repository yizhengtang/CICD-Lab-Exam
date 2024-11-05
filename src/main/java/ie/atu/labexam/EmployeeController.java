package ie.atu.labexam;

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
    public List<Employee> getEmployees(@PathVariable int id)
    {
        list = myService.getEmployees(id);
        return list;
    }

    @PostMapping
    public List<Employee> addEmployee(@RequestParam Employee employee)
    {
        list = myService.addEmployee(employee);
        return list;
    }

    @PutMapping("/{id}")
    public List<Employee> updateEmployee(@PathVariable String id,@RequestParam Employee employee)
    {
        list = myService.updateEmployee(id, employee);
        return list;
    }

    @DeleteMapping("/{id}")
    public List<Employee> deleteEmployee(@PathVariable String id, @RequestParam Employee employee)
    {
        list = myService.deleteEmployee(id, employee);
        return list;
    }
}
