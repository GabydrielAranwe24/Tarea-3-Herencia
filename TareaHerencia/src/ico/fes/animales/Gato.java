package ico.fes.animales;

/**
 *
 * @author Gabriel Carmona
 */
public class Gato extends Animal {

    private String raza;
    private boolean pelaje;
    private String tamanio;
    private String nombre;
    private int edad;

    public Gato() {
    }

    @Override
    public void EmitirSonido() {
        super.EmitirSonido(); //To change body of generated methods, choose Tools | Templates.
    }

    public Gato(String raza, boolean pelaje, String tamanio, String nombre, int edad) {
        this.raza = raza;
        this.pelaje = pelaje;
        this.tamanio = tamanio;
        this.nombre = nombre;
        this.edad = edad;
    }

    public Gato(String raza, boolean pelaje, String tamanio, String nombre, int edad, int numeroPatas, int numeroOrejas, String espeiceAnimal, String nombreColSubespecie, String genero) {
        super(numeroPatas, numeroOrejas, espeiceAnimal, nombreColSubespecie, genero);
        this.raza = raza;
        this.pelaje = pelaje;
        this.tamanio = tamanio;
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

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return super.toString() + "Gato{" + "raza=" + raza + ", pelaje=" + pelaje + ", tamanio=" + tamanio + ", nombre=" + nombre + ", edad=" + edad + '}';
    }

}
