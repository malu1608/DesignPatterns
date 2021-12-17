public class StringBar extends Bar{

    boolean start ;

    public boolean isHappyHour() {
        return start;
    }
    public void startHappyHour() {
        start =true;
    }
    public void endHappyHour() {
        start= false;
    }
}
