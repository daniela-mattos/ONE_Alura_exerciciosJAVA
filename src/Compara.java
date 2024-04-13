import java.util.Scanner;

public class Compara {
    public static void main(String[] args) {

        int numero1 = 0, numero2 = 0;
        System.out.println("Digite um número: ");
        Scanner leitura = new Scanner(System.in);
        numero1 = leitura.nextInt();
        numero2 = leitura.nextInt();
        if (numero1 == numero2) {
            System.out.println("Os números são iguais");
        } else {
            System.out.println("Os números são diferentes");
            if (numero1 > numero2) {
                System.out.println("O primeiro é maior que o segundo");
            } else {
                System.out.println("O segundo é maior do que o primeiro");
            }
        }


    }
}
