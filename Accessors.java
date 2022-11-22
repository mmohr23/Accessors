public class Employee
{
    //instance variables
    private String firstName;
    private String lastName;
    private int monthlySalary;
    private double shiftHours;
    
    //constructor
    public Employee(String fName, String lName, int salary, double hours)
    {
        firstName = fName;
        lastName = lName;
        monthlySalary = salary;
        shiftHours = hours;
    }
}