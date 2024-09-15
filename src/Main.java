import ListaAnimales.*;

public class Main {
    public static void main(String[] args) {

//        ListaCircular lista = new ListaCircular();
//        lista.agregar(10);
//        lista.agregar(20);
//        lista.agregar(30);
//        lista.agregar(40);
//
//        System.out.println("Recorrido de la lista circular:");
//        lista.mostrar();

        ListaAnimal animales = new ListaAnimal();

        animales.llenarLista();
        animales.mostrarMatriz();

    }
}

