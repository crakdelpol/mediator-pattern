package it.crakdelpol;

public class Fan {

    private Mediator mediator;
    private boolean isOn = false;

    public Boolean getOn() {
        return isOn;
    }

    public void setOn(Boolean on) {
        isOn = on;
    }


    public void turnOff(){
        mediator.start();
        isOn = false;
    }
    public void turnOn(){
        isOn = true;
        mediator.stop();
    }

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}
