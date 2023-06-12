package Ex11ClasseCarro;

public class teste {
    public static void main(String[] args) {
        carro meuFusca = new carro(20);
        meuFusca.adicionarGasolina(100);
        meuFusca.andar(10000);
        System.out.println("Combustível restante no tanque: " + meuFusca.obterGasolina() + " litros.");
    }
}

