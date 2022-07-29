import java.util.Scanner;

public class ConverterSegundos {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Variáveis
        double segundos, horas, minutos;
        int opcao;

        do {
            System.out.println("\nBoas-vindas ao Converter Segundos!" + "\n" + "Selecione uma das opções abaixo:" );
            System.out.println("\n--------------------------------");
            System.out.println("1 - Converter Segundos\n2 - Sair");
            opcao = sc.nextInt();

            if (opcao == 1){
            System.out.println("\nDigite quantos segundos você deseja converter:");
            segundos = sc.nextDouble();
    
            // Cálculos
            minutos = segundos / 60;
            horas = segundos / 3600;
    
            System.out.println("");
            System.out.println(segundos + " segundos é equivalente a: ");

            System.out.println("Minutos: " + minutos + " min");
            System.out.println("Horas: " + horas + " h");
            
            } 
            else if (opcao == 2) {
                System.out.println("\nSaindo...");
                System.exit(0);
            }

            else {
                System.out.println("\nOpção inválida. Por favor, digite apenas 1 ou 2.");
            }
        }

        while (opcao != 2);

        sc.close();

    }
    
}