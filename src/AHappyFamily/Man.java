package AHappyFamily;

public final class Man extends Human{

    public Man(String name, String surname, int dateOfBirth) {
        super(name, surname, dateOfBirth);
    }
    @Override
    public void greetPet(){
        System.out.println("Salam e");
    }
    public void repairCar(){
        System.out.println("yene noldu bu zibile");
    }
}
