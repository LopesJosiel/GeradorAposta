import java.util.Scanner;
public class EntradaDados {
    public static void main (String [] args){
        Scanner ler = new Scanner(System.in);
        int n1;
        int n2;
        System.out.println ("Informe a quantidade de números possíveis:\n");
        n1 = ler.nextInt();
        ler.nextLine(); // esvazia o buffer do teclado
        System.out.println ("Informe quantos números vai apostar:\n");
        n2 = ler.nextInt();
    }
}
