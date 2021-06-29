package ico.fes.animales;


/**
 *
 * @author Gabriel Carmona
 */
public class Perro extends Animal {

    private String raza;
    private boolean pelaje;
    private int peso;
    private String nombre;
    private int edad;

    public Perro() {
    }

    public Perro(String raza, boolean pelaje, int peso, String nombre, int edad) {
        this.raza = raza;
        this.pelaje = pelaje;
        this.peso = peso;
        this.nombre = nombre;
        this.edad = edad;
    }

    public Perro(String raza, boolean pelaje, int peso, String nombre, int edad, int numeroPatas, int numeroOrejas, String espeiceAnimal, String nombreColSubespecie, String genero) {
        super(numeroPatas, numeroOrejas, espeiceAnimal, nombreColSubespecie, genero);
        this.raza = raza;
        this.pelaje = pelaje;
        this.peso = peso;
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public boolean isPelaje() {
        return pelaje;
    }

    public void setPelaje(boolean pelaje) {
        this.pelaje = pelaje;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return super.toString() + "Perro{" + "raza=" + raza + ", pelaje=" + pelaje + ", peso=" + peso + ", nombre=" + nombre + ", edad=" + edad + '}';
    }

    public void Sonido() {
        System.out.println("Guauuuu");
    }

}
