package zwei;

import java.util.List;

public class Supervisor extends Employee {


    private List<Employee> supervisedEmployees;

    public Supervisor(String name) {
        super(name);
    }

    public List<Employee> getSupervisedEmployee() {
        return supervisedEmployees;
    }

    public void hireEmployee(Employee employee) {
        supervisedEmployees.add(employee);
    }

    public void fireEmployee(Employee employee) {
        supervisedEmployees.remove(employee);
    }

    @Override
    public void listHierarchy(int level) {
        /*The employee hierarchy starts with the highest supervisor which is level 0. While
traversing the hierarchy tree, this level number is increased by 1 after each
employee level.
When listHierarchy(level) is called in Supervisor, printName(level) must
be invoked first before calling listHierarchy(level + 1) on all
supervisedEmployees.
In Worker, only printName(level) must be invoked. If you want to test the
functionality of your implementation locally, you can uncomment the code in the
EmployeeOverviewSystem class.*/


        printName(level);
        for (var employee : supervisedEmployees) {
            employee.listHierarchy(level + 1);
        }


    }
}
