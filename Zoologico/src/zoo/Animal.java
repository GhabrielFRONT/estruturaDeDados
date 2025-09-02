package zoo;

public abstract class Animal {
    private String nome;
    private int idade;
    private double peso;
    private String habitat;

    public Animal(String nome, int idade, double peso, String habitat) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.habitat = habitat;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getPeso() {
        return peso;
    }

    public String getHabitat() {
        return habitat;
    }

    public abstract String emitirSom();
    public abstract String alimentar();
}

