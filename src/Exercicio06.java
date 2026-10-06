import java.util.Random;
import java.util.Scanner;

public class Exercicio06 {
    static void main() {

        Scanner sc = new Scanner(System.in);

        int[][] x = new int[5][5];



        lerDados(x);

        imprimir(x);

//        inverter(x);
//        System.out.println("Depois da inversão");
//        imprimir(x);
//        System.out.println();

    }

    static void lerDados(int[][] x){
        Random random = new Random();
        for (int i = 0; i < x.length; i++) {
            for(int j = 0; j < x.length; j++){
            x[i][j]= random.nextInt(0,100);

         }

        }
    }

    static void imprimir(int[][] x){
        for (int i = 0; i < x.length; i++) {
            for(int j = 0; j < x.length; j++){
                System.out.print(x[i][j] + "\t");
            }
            System.out.println();

        }
    }
}


//    static void inverter(int[][] x){
//        int aux;
//        int j = x.length - 1;
//        for(int i = 0; i < x.length / 2; i++){
//            aux = x[i];
//            x[i] = x[j];
//            x[j] = aux;
//            j--;
//        }
//    }


