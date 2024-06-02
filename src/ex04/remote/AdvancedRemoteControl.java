package ex04.remote;

import ex04.device.Device;

public class AdvancedRemoteControl extends RemoteControl {
    public AdvancedRemoteControl(Device device) {
        super(device);
    }

    @Override
    public void togglePower() {
        System.out.println("고급 전원 토글");
        device.turnOn();
    }

    public void setVolume(int volume) {
        System.out.println("볼륨 설정: " + volume);
        // 디바이스 볼륨 설정 로직
    }
}
