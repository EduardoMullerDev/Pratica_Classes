package Ex11ClasseCarro;

public class carro {
    private double consumoCombustivel;
    private double qntdCombustivel;

public carro(double consumoCombustivel) {
        this.consumoCombustivel = consumoCombustivel;
        this.qntdCombustivel = 0;
    }

public void andar(double distancia) {
        double combustivelNecessario = distancia / consumoCombustivel;
        if (combustivelNecessario <= qntdCombustivel) {
            qntdCombustivel -= combustivelNecessario;
            System.out.println("O carro percorreu " + distancia + " km.");
        } else {
            System.out.println("Desculpe, não há combustível suficiente para percorrer essa distância.");
        }
    }

public double obterGasolina() {
        return qntdCombustivel;
    }

 public void adicionarGasolina(double quantidade) {
        qntdCombustivel += quantidade;
        System.out.println("Abastecidos " + quantidade + " litros de combustível.");
    }

}
