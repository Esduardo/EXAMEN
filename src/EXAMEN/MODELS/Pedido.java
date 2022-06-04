package EXAMEN.MODELS;

public class Pedido {
    Cliente cliente;
    Catalogo Pizzas = new Catalogo();

    int opcion;
    Pizza pizza1;

    public Pedido(Cliente cliente, int opcion){
        this.cliente = cliente;
        this.opcion = opcion;
    }

    public Pizza SendPizza(){
        Pizza pizza1 = Pizzas.sendPizza((byte) ((int) opcion));
        return pizza1;
    }

    public Cliente getCliente(){
        return cliente;
    }
}
