package it.crakdelpol;

public class Button {
    private Fan fan;

    public Button(Fan fan) {
        this.fan = fan;
    }

    public void press(){
        if(fan.getOn()){
            fan.turnOff();
        } else {
            fan.turnOn();
        }
    }
}
