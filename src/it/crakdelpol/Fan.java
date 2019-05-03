package it.crakdelpol;

public class Fan {

    private Mediator mediator;
    private boolean isOn = false;

    public Boolean getOn() {
        return this.isOn;
    }

    public void turnOff(){
        this.mediator.start();
        isOn = false;
    }
    public void turnOn(){
        this.mediator.stop();
        isOn = true;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}
