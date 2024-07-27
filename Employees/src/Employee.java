public class Employee {
    private String name;
    protected double salary;
    private int age;

//    constructor for Employee class
    public Employee(String name, double salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

//    encapsulation to hide the original data from instances
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public double getSalary() {
        return this.salary;
    }

//    methods to change
    public void raiseSalary() {
        this.salary = this.salary * 1.2;
    }
}
