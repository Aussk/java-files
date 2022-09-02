
package calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("--- BEM VINDO A CALCULADORA!!! ---");
        int n1, n2;
        char op;
        char r = 'q';
        while (r != 'n'){
            System.out.println("primeiro valor: ");
            n1 = teclado.nextInt();
            System.out.println("segundo valor: ");
            n2 = teclado.nextInt();
            System.out.println("digite a operacao desejada! \n(+, -, x, /)");
            op = teclado.next().charAt(0);
            if (op == '+') {
                int soma = n1 + n2;
                System.out.print(n1 + " + " + n2 + " = " + soma);
            }
            else if (op == '-') {
                int subtracao = n1 - n2;
                System.out.print(n1 + " - " + n2 + " = " + subtracao);
            }
            else if (op == 'x') {
                int mult = n1 * n2;
                System.out.print(n1 + " x " + n2 + " = " + mult);
            }
            else if (op == '/') {
                int div = n1 / n2;
                System.out.print(n1 + " / " + n2 + " = " + div);
            }
            System.out.print("\ndeseja continuar? (s/n): ");
            r = teclado.next().charAt(0);
        }
        System.out.println("FIM DO PROGRAMA! volte sempre :D");
    }
}
