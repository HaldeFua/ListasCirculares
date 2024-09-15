package ListaAnimales;
import java.util.Scanner;

public class ListaAnimal {

    Animal cabeza = null;
    Scanner sc = new Scanner(System.in);

    public void llenarLista(){

        boolean centinela = true;

        while (centinela) {

            System.out.println("¿Desea agregar un nuevo animal a la lista? \n (1: sí / 2: no):");

            if(!sc.hasNextInt()){
                System.out.println("Ingrese un valor correcto");
                sc.next();
                continue;
            }

            int validacion = sc.nextInt();

            sc.nextLine();

            if(validacion == 1){

                 String especie, nombre;
                 int edad;

                System.out.println("Ingrese la especie del animal: ");
                especie = sc.nextLine();

                System.out.println("Ingrese el nombre del animal: ");
                nombre = sc.nextLine();

                System.out.println("Ingrese la edad del animal (en años): ");
                if(!sc.hasNextInt()){
                    System.out.println("Ingrese una edad valida: ");
                    sc.next();
                    edad = sc.nextInt();
                }else{
                    edad = sc.nextInt();
                }

                Animal nuevoNodo = new Animal(especie, nombre, edad);

                if(cabeza == null){
                    cabeza = nuevoNodo;
                    cabeza.setSiguiente(nuevoNodo);
                }else{
                    Animal nodo = cabeza;
                    while (nodo.getSiguiente() != cabeza){
                        nodo = nodo.getSiguiente();
                    }
                    nodo.setSiguiente(nuevoNodo);
                    nuevoNodo.setSiguiente(cabeza);
                }

            } else if (validacion == 2) {
                centinela = false;
            } else {
                System.out.println("Ingrese un valor correcto");
            }

        };


    }
    
    public void mostrarMatriz(){

        if(cabeza == null){
            System.out.println("La lista está vacía");
            return;
        }

        Animal nodo = cabeza;

        do{
            System.out.println("Registro #" + nodo.getId() + " es un " + nodo.getEspecie() + ", de nombre " + nodo.getNombre() + " y edad " + nodo.getEdad() + " año(s)");
            nodo = nodo.getSiguiente();
        }while(nodo != cabeza);
    }

}
