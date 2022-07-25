import java.util.Scanner;
public class ConverterSegundos {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Variáveis
        double segundos, horas, minutos;
        int opcao;

        do {
            System.err.println("\nBoas-vindas ao Converter Segundos!" + "\n" + "Selecione uma das opções abaixo:" );
            System.out.println("\n--------------------------------");
            System.out.println("1 - Converter Segundos\n2 - Sair");
            opcao = sc.nextInt();

            if (opcao == 1){
            System.out.println("\nDigite quantos segundos você deseja converter:");
            segundos = sc.nextDouble();
    
            // Cálculos
            horas = segundos / 3600;
            minutos = segundos / 60;
    
            System.out.println("");
            System.out.println(segundos + " segundos é equivalente a: ");
    
            System.out.println("\nHoras: " + horas + " h");
            System.out.println("Minutos: " + minutos + " min");
            } 
            else if (opcao == 2) {
                System.out.println("\nSaindo...");
                System.exit(0);
            }
        }

        while (opcao != 2);

        sc.close();

    }
    
}