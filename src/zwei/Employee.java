package zwei;

public abstract class Employee {


    private final String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


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
        listHierarchy(level + 1);
    }

    public void printName(int level) {
        /*The employee hierarchy starts with the highest supervisor which is level 0. While
traversing the hierarchy tree, this level number is increased by 1 after each
employee level.
When listHierarchy(level) is called in Supervisor, printName(level) must
be invoked first before calling listHierarchy(level + 1) on all
supervisedEmployees.
In Worker, only printName(level) must be invoked. If you want to test the
functionality of your implementation locally, you can uncomment the code in the
EmployeeOverviewSystem class.*/

        System.out.println(getName() + " " + level);
    }
}
