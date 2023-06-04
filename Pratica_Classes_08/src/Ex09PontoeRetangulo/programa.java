package Ex09PontoeRetangulo;
import java.util.Scanner;
public class programa {
    
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Coordenada X: ");
        int x = teclado.nextInt();
        System.out.print("Coordenada Y: ");
        int y = teclado.nextInt();
        ponto verticedepartida = new ponto(x, y);

        System.out.print("Informe a largura do retângulo: ");
        int largura = teclado.nextInt();
        System.out.print("Informe a altura do retângulo: ");
        int altura = teclado.nextInt();
        
        Retangulo retangulo = new Retangulo(verticedepartida, largura, altura);

    int menu = 0;
    
    
    System.out.print("Escolha a ação desejada \n");
    System.out.println("1 - Imprimir vértices do retângulo");
    System.out.println("2 - Imprimir centro do retângulo");
    System.out.println("3 - Sair");
    System.out.print("Escolha uma opção: ");
    menu = teclado.nextInt();

teclado.close();

    switch (menu) {
        case 1:
            System.out.println("Vértices do retângulo:");
            verticedepartida.imprimir();
            ponto verticeSuperiorDireito = new ponto(verticedepartida.getX() + largura, verticedepartida.getY() + altura);
            verticeSuperiorDireito.imprimir();
            break;
        case 2:
            ponto centro = retangulo.encontrarCentro();
            System.out.println("Centro do retângulo:");
            centro.imprimir();
            break;
        case 3:
            System.out.println("Encerrando o programa.");
            break;
        default:
            System.out.println("Opção inválida. Tente novamente.");
            break;
    }




    }
}
