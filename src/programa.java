import java.util.Scanner;

public class Main

{ public static void main(String[] args)
 {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Informe o 1º Nº");
    int numero = teclado.nextInt();

    System.out.println("Informe o 2º Nº");
    int numero2 = teclado.nextInt();

    double resultado = numero%numero2;

    if (resultado == 0)
    {
        System.out.println(numero+" é multiplo de "+ numero2);
    }
    else
    {
        System.out.println(numero+" não é multiplo de "+ numero2);
    }
 }
}
