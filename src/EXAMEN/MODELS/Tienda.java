package EXAMEN.MODELS;

public class Tienda {
    Pedido pedido;
    int opcion;
    String nombre;
    Cliente cliente;

    public Tienda(int opcion, String nombre){
        this.opcion = opcion;
        this.nombre = nombre;
    }

    public Pedido sendPedido(){
        return pedido = new Pedido(cliente = new Cliente(nombre), opcion);
    }

}
