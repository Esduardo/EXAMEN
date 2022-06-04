package EXAMEN.MODELS;

public class Pizza {
    private String nombrePizza;
    private String tamano;
    private int precio;

    public Pizza(String nombrePizza, String tamano, int precio) {
        this.nombrePizza = nombrePizza;
        this.tamano = tamano;
        this.precio = precio;

    }
    public String getNombrePizza() {
        return nombrePizza;
    }

    public String getTamano(){
        return tamano;
    }

    public int getPrecio() {
        return precio;
    }

}
