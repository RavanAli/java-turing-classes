package SmartHomeManagmentSystem;

public class Light extends Device{

    public Light(int id, String name){
        super(id, name, DeviceType.LIGHT);
    }

    @Override
    public void turnOn(){
        super.turnOn();
    }

    @Override
    public void turnOff(){
        super.turnOff();
    }
}
