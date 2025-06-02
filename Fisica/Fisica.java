import java.util.Scanner;
import java.util.ArrayList;

public class Fisica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int op;
        ArrayList<Energia> hist = new ArrayList<>();
        Energia energia = null;

        

        do{
            System.out.println("\n ----------------------------------------------");
            System.out.println("|         Sistema de Cálculo de Energia        |");
            System.out.println(" ----------------------------------------------");
            System.out.println("1 - Energia Potencial ");
            System.out.println("2 - Energia Cinética ");
            System.out.println("3 - Energia Mecânica ");
            System.out.println("0 - Sair ");
            System.out.println("Escolha o tipo de energia: ");
            op = scanner.nextInt();

            switch (op){
                case 1:
                    System.out.println("Calcular Energia Potencial!");
                    System.out.println("Insira a massa(KG): ");
                    double m = scanner.nextDouble();  
                    
                    System.out.println("Insira a altura(M): ");
                    double h = scanner.nextDouble();

                    energia = new EnergiaP(m, m, h);
                    hist.add(energia);
                break;

                case 2:
                    System.out.println("Calcular Energia Cinética!");
                    System.out.println("Insira a massa(KG): ");
                    m = scanner.nextDouble();  
                    
                    System.out.println("Insira a Velocidade(M/S): ");
                    double v = scanner.nextDouble(); 

                    energia = new EnergiaC(m, v);
                    hist.add(energia);
                break;

                case 3:
                    System.out.println("Calcular Energia Mecânica!");
                    System.out.println("Insira a massa(KG): ");
                    m = scanner.nextDouble();  
                    
                    System.out.println("Insira a Velocidade(M/S): ");
                    v = scanner.nextDouble(); 

                    System.out.println("Insira a altura(M): ");
                    h = scanner.nextDouble(); 

                    energia = new EnergiaM(m, m, h, v);
                    hist.add(energia);
                break;

                default:
                    System.out.println("Por favor, insira um número apenas das opções acima.");
                break;

                case 0:
                    System.out.println("Saindo...");
                    System.out.println("Histórico de Cálculos: ");
                    for (Energia e : hist) {
                        e.exibirResultados();}
                    System.out.println("Até a próxima!");
                break;
            }

            if (energia != null) {
                System.out.println("\nResultados: ");
                energia.exibirResultados();
                energia = null;
            }
        }while(op != 0);

    }
}