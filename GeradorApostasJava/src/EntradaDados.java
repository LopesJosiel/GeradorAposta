import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random; // importando a classe random
import java.util.Scanner;
public class EntradaDados {
    public static void main (String [] args){
        Scanner ler = new Scanner(System.in);
        int n1;
        int n2;
        System.out.println ("Informe a quantidade de números possíveis:\n");
        // Lendo a entrada no teclado do total de números possíveis;
        n1 = ler.nextInt();
        ler.nextLine(); // esvazia o buffer do teclado
        System.out.println ("Informe quantos números vai apostar:\n");
        n2 = ler.nextInt();
        //utilizando a classe par trabalhar com números aleatórios
        Random aposta = new Random();
        for (int i = 1; i < n2+1; i++) {
            System.out.println(aposta.nextInt(n1));
        }

    }
}
