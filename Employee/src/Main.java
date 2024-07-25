public class Main {
    public static void main(String[] args) {
        Employee larry = new Employee("Larry", Location.MARS, EmployeeType.WIZARD, 80000, 101);

        System.out.println(larry.salary);
        larry.raise();
        System.out.println(larry.salary);
    }
}
