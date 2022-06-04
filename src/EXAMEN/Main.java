package EXAMEN;

import EXAMEN.MODELS.Pedido;
import EXAMEN.MODELS.Pizza;
import EXAMEN.MODELS.Tienda;

import java.util.Scanner;

public class Main {
    public static void main(String [] srgs){
        Pedido();
    }
    public static void Pedido(){
            Scanner entrada = new Scanner(System.in);
            int opcion;

            do {
                System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
                System.out.println("+            Pizzeria Dominos                  +");
                System.out.println("+              Bienvenidos                     +");
                System.out.println("+      Seleccione una de las opciones          +");
                System.out.println("+           1. Mostrar catalogo                +");
                System.out.println("+           2. Ver pedidos                     +");
                System.out.println("+           3. Salir                           +");
                System.out.print("+++++ opcion: ");
                opcion = entrada.nextInt();

                switch (opcion){
                    case 1:
                        catalog();
                        break;
                    case 2:
                        break;
                    case 3:
                        System.out.println("Nos vemoooss........");
                        break;
                    default:
                        System.out.println("no existe :=");
                }
            }while (opcion != 3);
        }

        public static void catalog(){
        Pedido pedido1;
        Pizza pizza1;
        Scanner entrada = new Scanner(System.in);
        int  pre, opc;
        String nombre;

            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("+                  Catalogo                    +");
            System.out.println("+     1. Pizza Hawaiana      (grande)  $500.00 +");
            System.out.println("+     2. Pizza Champinones   (mediana) $250    +");
            System.out.println("+     3. Pizza peperoni      (chica)   $150    +");
            System.out.println("pedidos - elije una                           + ");
            System.out.print("                     opcion: ");
            opc = entrada.nextInt();
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("+              registro de nombre              +");
            System.out.print("+++++Nombre: ");
            nombre = entrada.next();


            Tienda objetotienda = new Tienda((int) (opc-1), nombre);


            pedido1 = objetotienda.sendPedido();
            pizza1 = pedido1.SendPizza();




            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("+  Nombre Cliente: " + pedido1.getCliente().getnombre());
            System.out.println("+           Pizza: " + pizza1.getNombrePizza());
            System.out.println("+          precio: $" + pizza1.getPrecio());
            System.out.println("+          tamaño: " + pizza1.getTamano());
        }
        public static void mostrar(){

        }
}
