package ex04;


import ex04.device.Device;
import ex04.device.Radio;
import ex04.device.TV;
import ex04.remote.AdvancedRemoteControl;

public class App {
    public static void main(String[] args) {
        Device tv = new TV();
        AdvancedRemoteControl advancedRemote = new AdvancedRemoteControl(tv);

        // TV 제어
        advancedRemote.togglePower();
        advancedRemote.setVolume(10);

        // 런타임에서 라디오로 전환
        Device radio = new Radio();
        advancedRemote = new AdvancedRemoteControl(radio);

        // 라디오 제어
        advancedRemote.togglePower();
        advancedRemote.setVolume(5);
    }
}