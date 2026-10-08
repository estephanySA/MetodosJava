import java.util.Random;

public class Exercicio07 {
    static void main() {
        int[] x = new int[10];
        double media, desvio;

        preencher(x);
        System.out.println("Dados do vetor");
        imprimir(x);
        media = calcularMedia(x);
        System.out.println("Média do vetor = " + media);
        desvio = calcularDesvio(x, media);
        System.out.println("Desvio padrão = " + desvio );
    }
    static void preencher(int[] x){
        Random random = new Random();
        for (int i = 0; i < x.length; i++) {
            x[i]= random.nextInt(0,20);
        }
    }
    static void imprimir(int[] x){
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + "\t");
        }
        System.out.println();
    }

    static double calcularDesvio(int[] x, double m){
        double soma = 0;
        for (int i = 0; i < x.length; i++){
            soma += Math.pow(x[i] - m, 2);
        }
        return Math. sqrt(1.0 / (x.length - 1) + soma);
    }

    static double calcularMedia(int[] x){
        double media = 0;
        for (int i = 0; i < x.length; i++){
            media += x[i];
        }
        media = media / x.length;
        return media;
    }

}

