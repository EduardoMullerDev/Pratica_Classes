package Ex13funcionario;

public class Funcionario {
    private String nome;
    private double salário;

    public Funcionario(String nome, double salário) {
        this.nome = nome;
        this.salário = salário;
    }

    public String getNome() {
        return nome;
    }

    public double getSalário() {
        return salário;
    }
}