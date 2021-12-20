import java.util.ArrayList;
import java.util.List;

abstract class Bar {
    public List<BarObserver> observers;
    public Bar bar;
    public Bar() {
        this.observers = new ArrayList<>();
    }
    public Bar(List<BarObserver> observers) {
        this.observers = observers;
    }


    public abstract boolean isHappyHour(); //abstract significa que metodo existe mas esta implementado noutra classe
    public abstract void startHappyHour();
    public  abstract void endHappyHour();

    public void addObserver(BarObserver observer) {
        observers.add(observer);
    }
    public void removeObserver(BarObserver observer) {
        observers.remove(observer);
    }
    public void notifyObservers() {
        for (BarObserver observer : observers)
            if (isHappyHour()) observer.happyHourStarted(this);
            else observer.happyHourEnded(this);
    }


}
