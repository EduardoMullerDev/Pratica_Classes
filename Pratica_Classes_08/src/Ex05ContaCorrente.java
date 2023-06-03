public class Ex05ContaCorrente {
 
    private int numeroConta;
    private String nomeCorrentista;
    private double saldo;

    public  Ex05ContaCorrente(int numeroConta, String nomeCorrentista, double saldo) {
        this.numeroConta = numeroConta;
        this.nomeCorrentista = nomeCorrentista;
        this.saldo = saldo;
    }

    public void alterarNome(String novoNome) {
        this.nomeCorrentista = novoNome;
    }
    public void deposito(double valor) {
        saldo += valor;
    }
    public void saque(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        }   
else {
     System.out.println("Saldo insuficiente");}
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNomeCorrentista() {
        return nomeCorrentista;
    }

    public void setNomeCorrentista(String nomeCorrentista) {
        this.nomeCorrentista = nomeCorrentista;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}

