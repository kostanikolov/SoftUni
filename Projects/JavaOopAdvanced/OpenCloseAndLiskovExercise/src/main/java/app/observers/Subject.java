package app.observers;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<AbstractObserver> observers = new ArrayList<>();

    public void attach(AbstractObserver observer) {
        this.observers.add(observer);
    }

    public void notifyAllObservers() {
        for (var observer : this.observers) {
            observer.update();
        }
    }
}
