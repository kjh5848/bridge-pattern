package ex04.remote;

import ex04.device.Device;

class BasicRemoteControl extends RemoteControl {
    public BasicRemoteControl(Device device) {
        super(device);
    }

    @Override
    public void togglePower() {
        System.out.println("전원 토글");
        device.turnOn();
    }
}