public class ListaCircular {

    NodoCircular cabeza = null;

    public void agregar(int valor) {
        NodoCircular nuevo = new NodoCircular(valor);
        if (cabeza == null) {
            cabeza = nuevo;
            cabeza.siguiente = cabeza;
        } else {
            NodoCircular temp = cabeza;
            while (temp.siguiente != cabeza) {
                temp = temp.siguiente;
            }
            temp.siguiente = nuevo;
            nuevo.siguiente = cabeza;
        }
    }

    public void mostrar() {
        if (cabeza == null) {
            System.out.println("La lista está vacía.");
            return;
        }
        NodoCircular temp = cabeza;
        do {
            System.out.println(temp.dato);
            temp = temp.siguiente;
        } while (temp != cabeza); 
    }

}


