package ClassWork28;

public class Developer extends Employee {
    private String pL ;

    Developer(String name, double salary, String pL){
        super(name, salary);
        this.pL = pL;
    }
    public String getpL(){
        return pL;
    }
    public void setpL(){
        this.pL = pL;
    }

    void displayInfo(){
        System.out.println("Name: " + super.getName() + "Salary: " + super.getSalary() + "Programming Language: " +  pL);
    }

}
