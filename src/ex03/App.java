package ex03;


import ex03.device.Device;
import ex03.device.Radio;
import ex03.device.TV;
import ex03.remote.BasicRemoteControl;
import ex03.remote.RemoteControl;

public class App {
    public static void main(String[] args) {
        Device tv = new TV();
        RemoteControl remote = new BasicRemoteControl(tv);

        // TV를 제어
        remote.togglePower();

        // 런타임에서 구현 변경
        Device radio = new Radio();
        remote = new BasicRemoteControl(radio);

        // 라디오를 제어
        remote.togglePower();
    }
}