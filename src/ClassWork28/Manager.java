package ClassWork28;

public class Manager extends Employee {
    private int teamSize ;

    Manager(String name, double salary, int teamSize){
        super(name, salary);
        this.teamSize = teamSize;
    }
    public int getTeamSize(){
        return teamSize;
    }
    public void setTeamSize(){
        this.teamSize = teamSize;
    }
    void displayInfo(){
        System.out.println("Name: " + super.getName() + "Salary: " + super.getSalary() + "Team size: " +  teamSize);
    }

}
