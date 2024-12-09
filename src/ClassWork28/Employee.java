package ClassWork28;

public class Employee {
    private String name;
    private double salary;

    Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
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
    void displayInfo(){
        System.out.println("Name: "+ name + "Salary: " + salary);
    }
    public void calculateBonus(double percentage, double fixedAmount){
        percentage = 7;
        double bonus = salary * (percentage/100);
        fixedAmount = salary + bonus;
    }

}
