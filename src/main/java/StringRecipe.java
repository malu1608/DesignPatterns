import java.util.List;

public class StringRecipe{
    public List<StringTransformer> transformerList;

    public StringRecipe(List<StringTransformer> t) {
        transformerList = t;
    }

    public void mix(StringDrink drink) {
        int i =0;
        while(i != transformerList.size()){
            StringTransformer transformer = transformerList.get(i);
            transformer.execute(drink);
            i++;
        }
    }
}