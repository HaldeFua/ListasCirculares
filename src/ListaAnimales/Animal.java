package ListaAnimales;

public class Animal {

    private static int contador = 0;
    private int id;
    private String especie;
    private String nombre;
    private int edad;
    private Animal siguiente;

    public Animal(String especie, String nombre, int edad) {
        this.id = ++contador;
        this.especie = especie;
        this.nombre = nombre;
        this.edad = edad;
        this.siguiente = null;
    }

    public void setSiguiente(Animal siguiente) {
        this.siguiente = siguiente;
    }

    public Animal getSiguiente() {
        return siguiente;
    }

    public int getId() {
        return id;
    }

    public String getEspecie() {
        return especie;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}
