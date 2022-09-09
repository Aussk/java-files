
package verifnotas;

import java.util.Random;
import java.text.DecimalFormat;
import java.math.RoundingMode;

// gerador de 20 notas aleatórias, cálculo da média aritmética e verificação!
public class Verifnotas {
    
    public static String arredondar(double nota) {
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
        decimalFormat.setRoundingMode(RoundingMode.DOWN);
        return decimalFormat.format(nota);
       }
    

    public static void main(String[] args) {
        Random aleatorio = new Random();
        double notas[] = new double[20];
        String notasform[] = new String[20];
        double soma = 0;
        double media;
        double maior = 0, menor = 0;
        String maiorformatado="", menorformatado="", mediaformatada="";
        int maioresmedia = 0, menoresmedia = 0;
        
        for (int i = 0; i < 20; i++) {
            notas[i] = 10 + aleatorio.nextDouble() * 90;
            notasform[i] = arredondar(notas[i]); 
            soma += notas[i];
        }
        media = soma / 20;
        mediaformatada = arredondar(media);
        
        for (int i = 0; i < 20; i++) {
            System.out.println(i + 1 + "° nota: " + notasform[i]);
        }
        
        
        for (int i = 0; i < 20; i++) {
            if (i == 0) {
                menor = notas[0];
                maior = notas[0];
                menorformatado = arredondar(notas[0]);
                maiorformatado = arredondar(notas[0]);
            }
            else {
                if (notas[i] < menor) {
                    menor = notas[i];
                    menorformatado = arredondar(notas[i]);
                }
                if (notas[i] > maior) {
                    maior = notas[i];
                    maiorformatado = arredondar(notas[i]);
                }
            }
            if (notas[i] > 60.0) {
                maioresmedia += 1;
            }
            else {
                menoresmedia += 1;
            }
        }
        System.out.println("media aritmetica: " + mediaformatada);
        System.out.println("maior nota: " + maiorformatado);
        System.out.println("menor nota: " + menorformatado);
        System.out.println("existem " + maioresmedia + " notas acima da media");
        System.out.println("existem " + menoresmedia + " notas abaixo da media");
    }
    
}
