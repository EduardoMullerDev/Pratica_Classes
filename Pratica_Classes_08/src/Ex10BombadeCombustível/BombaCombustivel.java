package Ex10BombadeCombustível;

public class BombaCombustivel {
    
private String tipoCombustivel;
private double valorLitro;
private double qntdCombustivel;

public BombaCombustivel(String tipoCombustivel, double valorLitro, double qntdCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
        this.valorLitro = valorLitro;
        this.qntdCombustivel = qntdCombustivel;
    }


public void abastecerPorValor(double valor) {
        double litrosAbastecidos = valor / valorLitro;
        if (litrosAbastecidos <= qntdCombustivel) {
            qntdCombustivel -= litrosAbastecidos;
            System.out.println("Abastecidos " + litrosAbastecidos + " litros de combustível.");
        } else {
            System.out.println("Desculpe, não há combustível na bomba.");
        }
    }


public void abastecerPorLitro(double litros) {
        double valorAPagar = litros * valorLitro;
        if (litros <= qntdCombustivel) {
            qntdCombustivel -= litros;
            System.out.println("Valor a ser pago: R$" + valorAPagar);
        } else {
            System.out.println("Desculpe, não há combustível suficiente na bomba.");
        }
    }

public void mudarValor(double novoValor){
    valorLitro = novoValor;
    System.out.println("o novo valor do litro do combustivel é: R$"+ novoValor);
}

public void mudarCombustivel(String novoCombustivel){
    tipoCombustivel = novoCombustivel;
System.out.println("Novo tipo de combustivel alterado:" + novoCombustivel);
}

public void mudarQntdCombustivel(double novaQntdCombustivel){
qntdCombustivel = novaQntdCombustivel;
System.out.println("Quantidade de combustivel da bomba é: " + novaQntdCombustivel);
}















}
