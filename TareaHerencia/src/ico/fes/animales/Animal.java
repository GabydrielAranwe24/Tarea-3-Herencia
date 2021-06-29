/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.animales;

/**
 *
 * @author Gabriel Carmona
 */
public class Animal {

    private int numeroPatas;
    private int numeroOrejas;
    private String espeiceAnimal;
    private String nombreColSubespecie;//nombre coloquial de la subespecie
    private String genero;

    public Animal() {
    }

    public Animal(int numeroPatas, int numeroOrejas, String espeiceAnimal, String nombreColSubespecie, String genero) {
        this.numeroPatas = numeroPatas;
        this.numeroOrejas = numeroOrejas;
        this.espeiceAnimal = espeiceAnimal;
        this.nombreColSubespecie = nombreColSubespecie;
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public int getNumeroOrejas() {
        return numeroOrejas;
    }

    public void setNumeroOrejas(int numeroOrejas) {
        this.numeroOrejas = numeroOrejas;
    }

    public String getEspeiceAnimal() {
        return espeiceAnimal;
    }

    public void setEspeiceAnimal(String espeiceAnimal) {
        this.espeiceAnimal = espeiceAnimal;
    }

    public String getNombreColSubespecie() {
        return nombreColSubespecie;
    }

    public void setNombreColSubespecie(String nombreColSubespecie) {
        this.nombreColSubespecie = nombreColSubespecie;
    }

    @Override
    public String toString() {
        return "Animal{" + "numeroPatas=" + numeroPatas + ", numeroOrejas=" + numeroOrejas + ", espeiceAnimal=" + espeiceAnimal + ", nombreColSubespecie=" + nombreColSubespecie + ", genero=" + genero + '}';
    }

    public void EmitirSonido() {
        if (this.nombreColSubespecie.equals("felino")) {
            System.out.println("Miauuuuu Miauuuuu");
        } else {
            System.out.println("Guauu Guauuuu Guauu");
        }
    }

}
