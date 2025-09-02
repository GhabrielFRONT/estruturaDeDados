package zoo;

public class Leao extends Animal {
    private double tamanhoJuba;

    public Leao(String nome, int idade, double peso, String habitat, double tamanhoJuba) {
        super(nome, idade, peso, habitat);
        this.tamanhoJuba = tamanhoJuba;
    }

    public double getTamanhoJuba() {
        return tamanhoJuba;
    }

    @Override
    public String emitirSom() {
        return "Rugido";
    }

    @Override
    public String alimentar() {
        return "carne";
    }
}
