package SmartHomeManagmentSystem;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Elesger", "Elesgerli","elesger@gmail.com", "elesger1999");
        User user2 = new User("Aysel", "Kamanli", "aysel@gmail.com","aysel2121");

        user1.register();
        user1.login();


        SmartHome home = new SmartHome();
        home.addUser(user1);
        home.addUser(user2);

        Light light = new Light(1,"Isiq");
        Thermostat thermostat = new Thermostat(2,"thermostat");
        Camera camera = new Camera(3,"kamera");
        Doorbell doorbell = new Doorbell(4, "zeng");

        light.turnOn();
        thermostat.setTemperature(23);
        camera.startRecording();
        doorbell.ring();
    }
}
