public class HumanClient implements Client {
    HumanClient humanClient = new HumanClient();

    @Override
    public void happyHourStarted(Bar bar) {
        bar.startHappyHour();
    }

    @Override
    public void happyHourEnded(Bar bar) {
        bar.endHappyHour();
    }

    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        if (bar.isHappyHour())
            //observers.addObserver(humanClient);
        recipe.mix(drink);
    }
}
