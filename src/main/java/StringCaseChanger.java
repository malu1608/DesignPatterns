public class StringCaseChanger implements StringTransformer {

    public void execute(StringDrink drink) {
        StringBuilder x = new StringBuilder("");
        for (int i = 0; i < drink.getText().length(); i++) {
            char c = drink.getText().charAt(i);
            if (Character.isLowerCase(c)) {
                x.append(Character.toUpperCase(c));

            }else {
                x.append(Character.toLowerCase(c));
            }
        }drink.setText(x.toString());
    }

}


