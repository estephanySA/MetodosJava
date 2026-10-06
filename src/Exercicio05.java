import java.util.Random;
import java.util.Scanner;

public class Exercicio05 {
    static void main() {

        Scanner sc = new Scanner(System.in);

        int[] x = new int[10];



        lerDados(x);
        System.out.println("Antes da inversão");
        imprimir(x);
        System.out.println();
        inverter(x);
        System.out.println("Depois da inversão");
        imprimir(x);
        System.out.println();

        }

        static void lerDados(int[] x){
            Random random = new Random();
            for (int i = 0; i < x.length; i++) {
                x[i]= random.nextInt(1,20);
            }
        }

        static void imprimir(int[] x){
            for(int i = 0; i < x.length; i++){
            System.out.print(x[i] + "\t");
        }
    }

        static void inverter(int[] x){
        int aux;
        int j = x.length - 1;
        for(int i = 0; i < x.length / 2; i++){
            aux = x[i];
            x[i] = x[j];
            x[j] = aux;
            j--;
        }
    }
}

