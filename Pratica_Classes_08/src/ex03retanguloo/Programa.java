package ex03retanguloo;
import java.util.Scanner;

public class Programa {
    
    public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);


    System.out.print("Por favor digite a base: ");
    double baseR = teclado.nextDouble();

    System.out.print("Por favor digite a altura: ");
    double alturaR = teclado.nextDouble();

Ex03Retangulo Local = new Ex03Retangulo(baseR , alturaR);

double[]LadosRetangulo = Local.RetornarValor();
double Area = Local.calcularArea();
double perimetro = Local.calcularPerimetro();

System.out.print("Tamanho do piso a ser usado em M2: ");
double piso = teclado.nextDouble();
System.out.print("Tamanho do rodapé a ser usadoEM M2: ");
double rodape = teclado.nextDouble();

teclado.close();

int QTDpisos = (int) (Area / piso);
int QTDrodapes = (int) (perimetro / rodape);

System.out.printf("O lugar com base de %.2f metros e altura de %.2f metros:%n", LadosRetangulo[0], LadosRetangulo[1]);
System.out.printf("Quantidade de pisos necessários: %d%n", QTDpisos);
System.out.printf("Quantidade de rodapés necessários: %d%n", QTDrodapes);
    }

}
