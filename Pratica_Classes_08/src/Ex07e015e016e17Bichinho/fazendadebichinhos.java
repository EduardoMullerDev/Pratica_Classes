package Ex07e015e016e17Bichinho;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class fazendadebichinhos {
   
    private List<Tamagoshi> bichinhos;

    public fazendadebichinhos() {
        bichinhos = new ArrayList<>();
    }

    public void adicionarBichinho(Tamagoshi bichinho) {
        bichinhos.add(bichinho);
    }

    public void alimentarTodos(int quantidadeComida) {
        for (Tamagoshi bichinho : bichinhos) {
            bichinho.alterarFome(bichinho.retornarFome() - quantidadeComida);
        }
    }

    public void brincarTodos(int tempoBrincadeira) {
        for (Tamagoshi bichinho : bichinhos) {
            bichinho.alterarSaude(bichinho.retornarSaude() + tempoBrincadeira);
            bichinho.alterarFome(bichinho.retornarFome() + tempoBrincadeira);
        }
    }

    public void ouvirTodos() {
        for (Tamagoshi bichinho : bichinhos) {
            System.out.println("O bichinho " + bichinho.retornarNome() + " diz: Estou muito feliz!");
        }
    }

    public void exibirStatusTodos() {
        for (Tamagoshi bichinho : bichinhos) {
            System.out.println("Nome: " + bichinho.retornarNome());
            System.out.println("Fome: " + bichinho.retornarFome());
            System.out.println("Saúde: " + bichinho.retornarSaude());
            System.out.println("Idade: " + bichinho.retornarIdade());
            System.out.println("Humor: " + bichinho.calcularHumor());
        }
    }

    public static void main(String[] args) {
        fazendadebichinhos fazenda = new fazendadebichinhos();
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo à Fazenda de Bichinhos!");

        fazenda.adicionarBichinho(new Tamagoshi("Blastoise", random.nextInt(100), random.nextInt(100), random.nextInt(10)));
        fazenda.adicionarBichinho(new Tamagoshi("Charmander", random.nextInt(100), random.nextInt(100), random.nextInt(10)));
        fazenda.adicionarBichinho(new Tamagoshi("Bulbasar", random.nextInt(100), random.nextInt(100), random.nextInt(10)));

        int opcao;
        do {
            
            System.out.println("1 - Alimentar todos os bichinhos");
            System.out.println("2 - Brincar com todos os bichinhos");
            System.out.println("3 - Ouvir todos os bichinhos");
            System.out.println("4 - Exibir status de todos os bichinhos");
            System.out.println("0 - Sair");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("quantidade de comida:");
                    int quantidadeComida = scanner.nextInt();
                    fazenda.alimentarTodos(quantidadeComida);
                    System.out.println("Todos os bichinhos foram alimentados!");
                    break;
                case 2:
                    System.out.println("tempo de brincadeira:");
                    int tempoBrincadeira = scanner.nextInt();
                    fazenda.brincarTodos(tempoBrincadeira);
                    System.out.println("Todos os bichinhos brincaram!");
                    break;
                case 3:
                    fazenda.ouvirTodos();
                    break;
                case 4:
                    fazenda.exibirStatusTodos();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }

        } while (opcao != 0);

        scanner.close();
    }
}

