import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int resultadoFatorial = 1;

        System.out.print("Fatorial: ");
        int numeroDigitado =  sc.nextInt();

        System.out.print(numeroDigitado + "! = ");

        for(int i = numeroDigitado; i >= 1; i--){
            resultadoFatorial *= i;
        }

        System.out.println(resultadoFatorial);

        sc.close();
    }
}
