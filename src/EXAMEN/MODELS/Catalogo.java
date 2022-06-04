package EXAMEN.MODELS;

public class Catalogo {
    Pizza pizza1 = new Pizza("Hawaiana", "Grande",500);
    Pizza pizza2 = new Pizza("Champinones", "Mediana", 250);
    Pizza pizza3 = new Pizza("Peperoni", "Chica", 150);

    Pizza[] pizzas={
            pizza1,
            pizza2,
            pizza3
    };

    public Pizza sendPizza(byte i){
        return pizzas[i];
    }
}
