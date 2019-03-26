package state;

//public class State {
//
//    void on(LightSwitch ls){
//        System.out.println("Light is already on");
//    }
//
//    void off(LightSwitch ls){
//        System.out.println("Light is already off");
//    }
//
//}


enum State{
    OFF_HOOK,
    ON_HOOK,
    CONNECTING,
    CONNECTED,
    ON_HOLD
}