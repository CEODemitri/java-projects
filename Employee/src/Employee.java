public class Employee {
    String name;
    Location location;
    EmployeeType employeeType;
    double salary;
    int age;

    Employee(String name, Location location, EmployeeType employeeType, double salary, int age) {
        this.name = name;
        this.location = location;
        this.employeeType = employeeType;
        this.salary = salary;
        this.age = age;

    }

    void raise() {
        this.salary = this.salary * 1.3;
    }
}
