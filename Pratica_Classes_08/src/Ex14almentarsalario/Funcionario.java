package Ex14almentarsalario;

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

 public void aumentarSalario(double porcentualDeAumento) {
        double aumento = salário * (porcentualDeAumento / 100);
        salário += aumento;
        System.out.println("Salário aumentado em " + porcentualDeAumento + "%");
    }




}
