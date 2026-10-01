import java.util.Scanner;

public class Exercicio04 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        double a, b, c, delta;
        double[] raiz;

        System.out.println("Informe o valor de A: ");
        a = sc.nextDouble();
        if(a == 0){
            System.out.println("Infelizmente o valor digitado não é uma equação de 2º Grau, digite um novo valor: ");
        }else {
            System.out.println("Informe o valor de B: ");
            b = sc.nextDouble();
            System.out.println("Informe o valor de C: ");
            c = sc.nextDouble();
            delta = calcularDelta (a, b, c);
            if(delta >= 0){
                raiz = calcularRaiz(a, b, delta);
                System.out.println("x1 =" + String.format("%.2f", raiz[0]));
                System.out.println("x2 =" + String.format("%.2f", raiz[1]));
            }else {
                System.out.println("A equação não tem raiz real: ");
            }

        }

    }

    static double calcularDelta(double a,double b,double c){
        return b * b - 4 * a * c;
    }

    static double[] calcularRaiz(double a,double b,double delta){
        double[] raiz = new double[2];
        raiz[0] = (-b + Math.sqrt(delta)) / (2 * a);
        raiz[1] = (-b - Math.sqrt(delta)) / (2 * a);
        return raiz;
    }

}



// return tem a função de break para um método;
// não da pra dar return em várias variaveis exemplo return x, y, z;
// solução para return ser usado com várias variaveis, criar um método para cada return ou criar um vetor que contenha as variaveis que vc deseja