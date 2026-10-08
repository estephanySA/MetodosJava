import java.util.Random;
import java.util.Scanner;

public class Exercicio06 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int[][] x = new int[5][5];
        int[] maior; // declarar a variavel já criada dentro do static //

        lerDados(x);
        System.out.println("Matriz");
        imprimir(x);
        maior = maiorValor(x);
        System.out.println("\nMaior valor de cada linha");
        imprimirMaiorValor(maior); //Outro valor no () pois não é ume método da matriz//
    }


    static void imprimirMaiorValor(int[] maior){
        for(int i = 0; i < maior.length; i++){
            System.out.print(maior[i] + " ");
        }
    }



    static int[] maiorValor(int[][] x){
        int[] maior = new int[x.length];
        for(int i = 0; i < x.length; i++){
            for(int j = 0; j < x.length; j++){
                if(x[i][j] > maior[i]){
                    maior[i] = x[i][j];
                }
            }
        }return maior;
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




