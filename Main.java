import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;

        do {
          System.out.println("\n --------------------------------");
            System.out.println("|          Menu Principal        |");
            System.out.println(" --------------------------------");
            System.out.println("1 - Sistema de Matemática");
            System.out.println("2 - Sistema de Física");
            System.out.println("3 - Sistema de Geografia");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    Matematica.main(null);
                    break;
                case 2:
                    Fisica.main(null);
                    break;
                case 3:
                    Geografia.main(null);
                    break;
                case 0:
                    System.out.println("Encerrando o programa");
                    break;
                default:
                    System.out.println("Opção inválida! Tente uma opção válida.");
            }
        } while (op != 0);

        sc.close();
    }
}