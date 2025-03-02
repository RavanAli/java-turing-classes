package AHappyFamily;

import java.util.Set;

public class RoboCat extends Pet{
    public RoboCat(Species species, String nickname) {
        super(species, nickname);
    }
    public RoboCat(String nickname, int age, int trickLevel, Set<String> habits, Species species) {
        super(species, nickname, age, trickLevel, habits);
    }
    @Override
    public void eat(){
        System.out.println("RoboCat is eating");
    }
    @Override
    public void respond() {
        System.out.println("Beep. I am your RoboCat.");
    }

    @Override
    public void foul() {
        System.out.println("Beep. I delete data");
    }
}