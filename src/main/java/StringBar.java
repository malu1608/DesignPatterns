public class StringBar extends Bar {

    boolean start ;
    public StringBar(){
        start = false;
    }
    @Override
    public boolean isHappyHour() {
        return start;
    }

    @Override
    public void startHappyHour() {
        start =true;
        notifyObservers();
    }

    @Override
    public void endHappyHour() {
        start= false;
        notifyObservers();
    }

    public void order(StringDrink drink, StringRecipe recipe){
        recipe.mix(drink);
    }
}
