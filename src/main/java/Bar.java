import java.util.List;

abstract class Bar {

    public Bar bar;
    public List<BarObserver> observers;
    public BarObserver(List<BarObserver> a){
        observers = a;
    }
    public abstract boolean isHappyHour(); //abstract significa que metodo existe mas esta implemnetado noutra classe
    public abstract void startHappyHour();
    public abstract void endHappyHour();

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
