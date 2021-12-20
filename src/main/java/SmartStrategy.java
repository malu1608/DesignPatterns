import java.util.ArrayList;
import java.util.List;

public class SmartStrategy implements OrderingStrategy {
    private List<StringDrink> waiting_list_drinks;
    private List<StringRecipe> waiting_list_recipes;
    public SmartStrategy(){
        waiting_list_recipes = new ArrayList<StringRecipe>();
        waiting_list_drinks = new ArrayList<StringDrink>();
    }

    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        if(bar.isHappyHour()){
            bar.order(drink,recipe);
        }
        else{
            waiting_list_drinks.add(drink);
            waiting_list_recipes.add(recipe);
        }
    }

    @Override
    public void happyHourStarted(StringBar bar) {
        for(int i=0;i<waiting_list_drinks.size();i++)
            bar.order(waiting_list_drinks.get(i),waiting_list_recipes.get(i));
        waiting_list_drinks.clear();
        waiting_list_recipes.clear();
    }

    @Override
    public void happyHourEnded(StringBar bar) {

    }
}
