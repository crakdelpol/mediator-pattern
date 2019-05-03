package it.crakdelpol;

public class Button {

    private Mediator mediator;

    public void press() {
        mediator.press();
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}
