public class Ex04Pessoa {
    
    private String nome;
    private int idade;
    private double peso;
    private double altura;

    public Ex04Pessoa(String nome, int idade, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public void envelhecer() {
        idade++;
        if (idade < 21) {
            crescer(0.5);
        }
    }
    public void engordar(double quantidade) {
        peso += quantidade;
    }

    public void emagrecer(double quantidade) {
        peso -= quantidade;
    }

    public void crescer(double quantidade) {
        altura += quantidade;
    }


    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}


