package AHappyFamily;

import java.util.Set;

public class Dog extends Pet implements Foul{
    public Dog(Species species, String nickname, int trickLevel, int i, Set<String> dogHabits) {
        super(species, nickname);
    }

    public Dog(String nickname, int age, int trickLevel, Set<String> habits, Species species) {
        super(species, nickname, age, trickLevel, habits);
    }

    @Override
    public void eat(){
        System.out.println("Dog is eating");
    }
    @Override
    public void respond(){
        System.out.println("Hav-hav");
    }
    public void foul(){
        System.out.println("Oops. I break glass");
    }

}