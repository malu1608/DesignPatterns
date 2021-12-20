public class StringReplacer implements StringTransformer {
    private char a, b;

    public StringReplacer(char a1, char b1) {
        a = a1;
        b = b1;
    }


    public void execute(StringDrink drink) {
        String text = drink.getText();
        StringBuilder x = new StringBuilder("");
        for (int i = 0; i < drink.getText().length(); i++) {
            char c = drink.getText().charAt(i);
            if (c == a) {
                x.append(b);
            }
            else{
            x.append(c);}

        }drink.setText(x.toString());

    }

}