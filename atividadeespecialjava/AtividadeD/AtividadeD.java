import java.lang.Math;
import java.util.Scanner;
public class AtividadeD {
    public static class PA{
        public void soma(int numero, int valorInicial, int razao){
            double resultado = (valorInicial*(Math.pow(razao, numero)-1))/(razao-1);
            System.out.println("O resultado da soma dos termos é: "+resultado);
        }
    }
    public static void main(String[] args) throws Exception {
       
        Scanner valores = new Scanner(System.in);
        System.out.println( " PA \n ");
        System.out.print( "Insira o número de termos:");

        int numero = valores.nextInt();
        System.out.print( "\n Insira o valor inicial: ");
        int valorInicial = valores.nextInt();
        System.out.print( "\n Insira a razão: ");
        int razao = valores.nextInt();
        while(razao < 2){
            System.out.print( "\n Insira um valor válido: ");
             razao = valores.nextInt();
        }

        PA operador;

        operador = new PA();

        operador.soma(numero,valorInicial,razao);
        valores.close();
    }
   
}
