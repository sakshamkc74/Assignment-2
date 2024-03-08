public class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void raiseSalary(double percent) {
        // Increase the salary by the given percentage
        salary *= (1 + percent / 100);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
    public static void main(String[] args) {


        //Employee
        Employee employee = new Employee(1, "Saksham", 45000.0);

        // Raise the salary by 12%
        employee.raiseSalary(13.5);

        // Print the details of the employee
        System.out.println("Employee Details:");
        System.out.println(employee);
    }
    }