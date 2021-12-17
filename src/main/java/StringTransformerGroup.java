import java.util.List;

public class StringTransformerGroup implements StringTransformer{
    public List<StringTransformer> transformerList;

    public StringTransformerGroup(List<StringTransformer> t) {
        transformerList = t;
    }
    @Override
    public void execute(StringDrink drink)
    {
        int i =0;
        while(i != transformerList.size()){
            StringTransformer transformer = transformerList.get(i);
            transformer.execute(drink);
            i++;
        }
    }
}
