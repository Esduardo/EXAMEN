package EXAMEN.MODELS;

public class Tienda {
    Pedido pedido;
    int opcion;
    String nombre;
    Comprador comprador;

    public Tienda(){

    }
    public Tienda(int opcion, String nombre){
        this.opcion = opcion;
        this.nombre = nombre;
    }


    public Pedido sendPedido(){
        return pedido = new Pedido(comprador = new Comprador(nombre), opcion);
    }

}
