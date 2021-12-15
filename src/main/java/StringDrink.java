public class StringDrink {
    private String drink; //declaracao do objeto

    public StringDrink(String c_obj) { // criacao do seu construtor p obj
        drink = c_obj;
    }

    public void setText(String c) { //criacao do atributo do obj criado
        drink = c;
    }

    public String getText() { //return do atributo
        return drink;
    }

}
