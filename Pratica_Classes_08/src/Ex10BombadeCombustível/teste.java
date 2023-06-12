package Ex10BombadeCombustível;

public class teste {
    
 public static void main(String[] args) {

BombaCombustivel bomba = new BombaCombustivel("Gasolina", 4.79, 5000);

bomba.abastecerPorLitro(5);
bomba.abastecerPorValor(200);
bomba.mudarCombustivel(" Aditivada");
bomba.mudarQntdCombustivel(2000);
bomba.mudarValor(5.50);
 }

}
