package Ex06TV;
import java.util.Scanner;
public class programa {
    
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    
        Televisor tv = new Televisor();
        
       int menu = 0 ;

       while (menu !=4 ) {
        System.out.print("Escolha a ação desejada: ");
        System.out.println("1=  Alterar canal");
        System.out.println("2= Aumentar volume");
        System.out.println("3= Diminuir volume");
        System.out.println("4= Sair");
       
       menu = teclado.nextInt();
       }

switch (menu ){
    case 1:
    System.out.println("Por favor digite o canal desejado:");
    int novocanal = teclado.nextInt();
    tv.setCanal(novocanal);
break;
    case 2:
    tv.aumentarvolume();
break;
    case 3:
    tv.diminuirvolume();
break;
    case 4: 
    System.out.println("Desligando tv");
break;
    default : System.out.println("Opção invalida");
}

    }
}
