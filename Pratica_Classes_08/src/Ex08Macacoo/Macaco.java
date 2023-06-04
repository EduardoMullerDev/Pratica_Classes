package Ex08Macacoo;

public class Macaco {
    
private String nome;
private String bucho;

public Macaco(String nome) {
    this.nome = nome;
    this.bucho = "";
}

public void comer(String alimento) {
    if (bucho.length() == 0) {
        bucho += alimento;
    } else {
        bucho += ", " + alimento;
    }
    System.out.printf("%s comeu %s\n", nome, alimento);
}

public void verBucho() {
    if (bucho.length() == 0) {
        System.out.printf("%s está com o bucho vazio.\n", nome);
    } else {
        System.out.printf("%s tem no bucho: %s\n", nome, bucho);
    }
}

public void digerir() {
    if (bucho.length() == 0) {
        System.out.printf("%s não tem nada para digerir.\n", nome);
    } else {
        System.out.printf("%s está digerindo: %s\n", nome, bucho);
        bucho = "";
    }
}



}



