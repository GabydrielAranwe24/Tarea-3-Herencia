package tareaherencia;

import ico.fes.animales.Gato;
import ico.fes.animales.Perro;

/**
 *
 * @author Gabriel Carmona
 */
public class TareaHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Perro Perro = new Perro("Maltese", true, 6, "Zelda", 5, 4, 2, "mamifero", "canino", "femenino");
        System.out.println(Perro);
        Perro.EmitirSonido();
        Gato Gato = new Gato("Calico", true, "chico", "Felix", 4, 4, 2, "mamifero", "felino", "masculino");
        System.out.println(Gato);
        Gato.EmitirSonido();
    }

}
