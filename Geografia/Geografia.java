import java.util.ArrayList;
import java.util.Scanner;

public class Geografia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Rocha> rochas = new ArrayList<>();
        String opcao;

        do {
            System.out.println("\n ------------------------------------------");
            System.out.println("|          Menu de Tipos de Rochas         |");
            System.out.println(" ------------------------------------------");
            System.out.println("1. Adicionar Rocha Sedimentar");
            System.out.println("2. Adicionar Rocha Magmática");
            System.out.println("3. Adicionar Rocha Metamórfica");
            System.out.println("4. Exibir todas as Rochas");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextLine();

            switch (opcao) {
                case "1":
                    System.out.print("Digite o nome da rocha sedimentar: ");
                    String nomeSed = sc.nextLine();
                    System.out.print("Digite o local onde foi encontrada: ");
                    String localSed = sc.nextLine();
                    rochas.add(new RochaSedimentar(nomeSed, localSed));
                    break;
                case "2":
                    System.out.print("Digite o nome da rocha magmática: ");
                    String nomeMag = sc.nextLine();
                    System.out.print("Digite o local onde foi encontrada: ");
                    String localMag = sc.nextLine();
                    rochas.add(new RochaMagmatica(nomeMag, localMag));
                    break;
                case "3":
                    System.out.print("Digite o nome da rocha metamórfica: ");
                    String nomeMet = sc.nextLine();
                    System.out.print("Digite o local onde foi encontrada: ");
                    String localMet = sc.nextLine();
                    rochas.add(new RochaMetamorfica(nomeMet, localMet));
                    break;
                case "4":
                    System.out.println("\n ----------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("|                                                         Informações das Rochas Cadastradas                                                         |");
                    System.out.println(" ----------------------------------------------------------------------------------------------------------------------------------------------------");
                    for (Rocha r : rochas) {
                        r.exibirInformacoes();
                    }
                    break;
                case "0":
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (!opcao.equals("0"));
        
        sc.close();
    }
}