package Ex13funcionario;

public class teste {
    public static void main(String[] args) {
        Funcionario empregado = new Funcionario("Eduardo", 4500.0);

        System.out.println("Nome: " + empregado.getNome());
        System.out.println("Salário: R$" + empregado.getSalário());
    }
}

