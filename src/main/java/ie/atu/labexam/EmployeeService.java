package ie.atu.labexam;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class EmployeeService {
    private List<Employee>myList = new ArrayList<>();

    public List<Employee> addEmployee(Employee employee)
    {
        myList.add(employee);
        return myList;
    }
    public List<Employee> getEmployees(int id)
    {
        return myList;
    }

    public List<Employee> updateEmployee(String id, Employee employee)
    {
        for (int i = 0; i < myList.size(); i++) {
            Employee e = myList.get(i);
            if (e.getEmployeeCode().equals(id)) {
                e.setEmployeeCode(employee.getEmployeeCode());
                e.setName(employee.getName());
                e.setEmail(employee.getEmail());
                e.setSalary(employee.getSalary());
                e.setPosition(employee.getPosition());
                e.setDateOfJoining(employee.getDateOfJoining());
                return myList;
            }
        }
        throw new NoSuchElementException("Employee with ID " + id + "Not Found !!");
    }

    public List<Employee> deleteEmployee(String id, Employee employee)
    {
        for (int i = 0; i < myList.size(); i++) {
            Employee e = myList.get(i);
            if (e.getEmployeeCode().equals(id)) {
                myList.remove(e);
                return myList;
            }
        }
        throw new NoSuchElementException("Employee with ID " + id + "Not Found !!");
    }
}
