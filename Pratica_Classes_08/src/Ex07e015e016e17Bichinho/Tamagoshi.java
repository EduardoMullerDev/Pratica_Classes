package Ex07e015e016e17Bichinho;

public class Tamagoshi {

    private String nome;
    private int fome;
    private int saude;
    private int idade;  

    public Tamagoshi(String nome, int fome, int saude, int idade) {
        this.nome = nome;
        this.fome = fome;
        this.saude = saude;
        this.idade = idade;
    }

    public void alterarNome(String novoNome) {
        this.nome = novoNome;
    }

    public void alterarFome(int novaFome) {
        this.fome = novaFome;
    }

    public void alterarSaude(int novaSaude) {
        this.saude = novaSaude;
    }

    public void alterarIdade(int novaIdade) {
        this.idade = novaIdade;
    }

    public String retornarNome() {
        return this.nome;
    }

    public int retornarFome() {
        return this.fome;
    }

    public int retornarSaude() {
        return this.saude;
    }

    public int retornarIdade() {
        return this.idade;
    }

   public void alimentar(double qtdComida){
    this.saude -= qtdComida;
    if (this.fome < 0) {
            this.fome = 0;
        }   
   }
   
   public void brincar(int tempoBrincadeira) {
        this.saude += tempoBrincadeira;
        if (this.saude > 100) {
            this.saude = 100;
        }
    }
   
   
    public String calcularHumor() {
        int humor = this.fome + this.saude;

        if (humor <= 10) {
            return "Triste";
        } else if (humor > 10 && humor <= 30) {
            return "Desanimado";
        } else if (humor > 30 && humor <= 50) {
            return "Normal";
        } else if (humor > 50 && humor <= 70) {
            return "Bem humorado";
        } else if (humor >= 70 && humor <= 100) {
            return "Muito feliz";
        }

        return "";
    }
    public String toString() {
        return "Nome: " + this.nome + "\nFome: " + this.fome + "\nSaúde: " + this.saude + "\nIdade: " + this.idade;
}
}
