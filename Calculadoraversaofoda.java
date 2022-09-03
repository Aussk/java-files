
package calculadoraversaofoda;

import java.util.Scanner;

public class Calculadoraversaofoda {
    
    public static int calcula(char op, int n1, int n2) {
        switch (op) {
            case '+':
                return n1 + n2;
            case '-':
                return n1 - n2;
            case 'x':
                return n1 * n2;
            case '/':
                return n1 / n2;
            default:
                return 0;
        }
    }
    /**
     sexo
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("ESSA AQUI E A CALCULADORA...");
        int num1, num2;
        int res;
        char ope = ' ';
        char r = 'k';
        while (r != 'n') {
            System.out.println("primeiro valor: ");
            num1 = teclado.nextInt();
            System.out.println("Segundo valor");
            num2 = teclado.nextInt();
            System.out.println("digite a operacao desejada (+, -, x, /)");
            ope = teclado.next().charAt(0);
            res = calcula(ope, num1, num2);
            while (res == 0) {
                System.out.println("operacao invalida! digite-a novamente.");
                System.out.println("(+, -, x, /)");
                ope = teclado.next().charAt(0);
                res = calcula(ope, num1, num2);
            }
            System.out.print(num1);
            System.out.print(" " + ope);
            System.out.print(" " + num2);
            System.out.print(" = " + res);
            System.out.println("\ndeseja continuar calculando? (s/n)");
            r = teclado.next().charAt(0);
        }
    }
}
