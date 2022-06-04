package EXAMEN.MODELS;

public class Pedido {
    Comprador comprador;
    Catalogo Pizzas = new Catalogo();

    int opcion;
    Pizza pizza1;

    public Pedido(Comprador comprador, int opcion){
        this.comprador = comprador;
        this.opcion = opcion;
    }

    public Pizza SendPizza(){
        Pizza pizza1 = Pizzas.sendPizza((byte) ((int) opcion));
        return pizza1;
    }

    public Comprador getCliente(){
        return comprador;
    }
}
