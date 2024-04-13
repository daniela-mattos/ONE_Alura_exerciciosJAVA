import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int menu = 0;

        do {
            System.out.println("O que deseja fazer? ");
            System.out.println("1 - Calcular a ára do Quadrado");
            System.out.println("2 - Carcular a área do Círculo");
            System.out.println("3 - Carcular a Tabuada de um número");
            System.out.println("4 - Comparar números");
            System.out.println("5 - Par ou ímpar?");
            System.out.println("6 - Fatorar um número");
            System.out.println("7 - Positivo ou negativo?");
            System.out.println("Digite -1 Para sair");

            Scanner leitura = new Scanner(System.in);
            System.out.println("\nInforme o número: ");
            menu = leitura.nextInt();

            switch (menu) {
                case 1: {
                    System.out.println("\nDigite o valor do lado 1: ");
                    double lado1 = leitura.nextDouble();
                    System.out.println("Digite o valor do lado 2: ");
                    double lado2 = leitura.nextDouble();
                    System.out.println(String.format("O quadrado é: %.2f", lado1 * lado2));
                    break;
                }
                case 2: {
                    System.out.println("\nDigite o valor do raio: ");
                    double raio = leitura.nextDouble();
                    double pi = 3.14;
                    double resposta = (raio * raio) * pi;
                    System.out.println(String.format("A área do círculo é: %.2f", resposta));
                    break;
                }
                case 3: {
                    System.out.println("\nDigite o número: ");
                    int numero = leitura.nextInt();
                    System.out.println(String.format("Tabuada do %d: ", numero));

                    for (int i = 1; i < 11; i++) {
                        System.out.println(String.format("%d x %d = %d", numero, i, numero * i));
                    }
                    break;
                }
                case 4: {
                    System.out.println("\nInforme o numero 1");
                    int numero1 = leitura.nextInt();
                    System.out.println("Informe o numero 2");
                    int numero2 = leitura.nextInt();
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
                case 5: {
                    System.out.println("\nInforme o numero: ");
                    int numero = leitura.nextInt();
                    if (numero % 2 == 0) {
                        System.out.println("O número é par");
                    } else {
                        System.out.println("O número é ímpar");
                    }
                    break;
                }
                case 6: {
                    System.out.println("\nInforme o numero: ");
                    int numero = leitura.nextInt();
                    System.out.println(String.format("!%d", numero));
                    String mostra = "!" + numero + " = " + numero;
                    int fatorial = numero;
                    for (int i = numero - 1; i > 0; i--) {
                        fatorial *= i;
                        mostra = mostra + " x " + i;

                        if (i != 1) {
                            System.out.println(String.format("%s", mostra));
                        }

                    }
                    System.out.println(String.format("%s = %d", mostra, fatorial));
                    break;
                }
                case 7: {
                    int numero = 0;
                    System.out.println("Digite um número: ");
                    //Scanner leitura = new Scanner(System.in);
                    numero = leitura.nextInt();
                    if (numero > 0) {
                        System.out.println("O número é positivo");
                    } else {
                        System.out.println("O número é negativo");
                    }
                    break;
                }
            }
        } while (menu != -1);
    }
}