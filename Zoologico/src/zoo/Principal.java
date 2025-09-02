package zoo;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Animal> animais = new ArrayList<>();

        animais.add(new Cachorro("Bolt", 5, 20.5, "Canil", "Labrador"));
        animais.add(new Gato("Mimi", 3, 4.2, "Gatil", "Preto"));
        animais.add(new Leao("Simba", 7, 190.0, "Savana", 25.5));

        for (Animal animal : animais) {
            System.out.println("Nome: " + animal.getNome());
            System.out.println("Som: " + animal.emitirSom());
            System.out.println("Alimentação: " + animal.alimentar());
            System.out.println("-----------------------------");
        }
    }
}
