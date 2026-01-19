package de.seuhd.observer;

public class ConcreteObserver implements Observer {
    private static int counter = 0;
    private int id;
    private Subject subject;

    public ConcreteObserver(Subject subject) {
        this.subject = subject;
        this.id = ++counter;
        subject.attach(this);
    }

    @Override
    public void update(Subject subject) {
        if (subject instanceof ConcreteSubject) {
            int value = ((ConcreteSubject) subject).getValue();
            System.out.println("Observer " + id + " received update from subject: New value is " + value);
        }
    }

    public void detach() {
        if (subject != null) {
            subject.detach(this);
        }
    }
}
