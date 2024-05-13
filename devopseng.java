public class devopseng extends Employee {
    private double bonus;
    public devopseng(String name, int empId, double salary, double bonus) {
        super(name, empId, salary);
        this.bonus = bonus; }
    // Function to calculate total salary including bonus
    public double calculateTotalSalary() {
        return salary + bonus;
    }
    // Function to display employee details with total salary
    public void displayEmployeeDetailsWithTotalSalary() {
        displayEmployeeDetails();
        System.out.println("Bonus: $" + bonus);
        System.out.println("Total Salary: $" + calculateTotalSalary());  }}
