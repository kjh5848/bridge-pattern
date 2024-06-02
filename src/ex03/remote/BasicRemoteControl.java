package ex03.remote;


import ex03.device.Device;

public class BasicRemoteControl extends RemoteControl {

    public BasicRemoteControl(Device device) {
        super(device);
    }

    @Override
    public void togglePower() {
        System.out.println("전원 토글");
        device.turnOn();
    }
}