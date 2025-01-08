package SmartHomeManagmentSystem;

public class Camera extends Device {
    public Camera(int id, String name) {
        super(id, name, DeviceType.CAMERA);
    }

    @Override
    public void turnOn() {
        super.turnOn();
    }

    @Override
    public void turnOff() {
        super.turnOff();
    }

    public void startRecording() {
        super.turnOff();
        System.out.println("Camera start to record");
    }
    public void stopRecording() {
        super.turnOff();
        System.out.println("Camera stop to record");
    }

}
