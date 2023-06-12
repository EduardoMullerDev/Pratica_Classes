package Ex14almentarsalario;

public class teste {
    

     public static void main(String[] args) {

       Funcionario empregado = new Funcionario("Eduardo", 4500.0);
       empregado.aumentarSalario(10);
        System.out.println("Nome: " + empregado.getNome());
        System.out.println("Novo Salário: R$" + empregado.getSalário());
       
       
       
       
    }

}
