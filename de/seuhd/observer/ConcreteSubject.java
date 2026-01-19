package de.seuhd.observer;

public class ConcreteSubject extends Subject {
    private int value;

    public void setValue(int value) {
        this.value = value;
        System.out.println("Value of subject updated to " + value);
        System.out.println("Sending update to observers...");
        notifyObservers();
    }

    public int getValue() {
        return value;
    }

}
