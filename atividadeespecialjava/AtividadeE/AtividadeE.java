
import java.lang.Math;
import java.util.Scanner;
public class AtividadeE {
    public static class formula{
        public void s(int velocidadeInicial,int espacoInicial, int aceleracao, int instante){
            double resultado = espacoInicial+velocidadeInicial*instante+aceleracao*(Math.pow(instante, 2)/2);
            System.out.println("O resultado da formúla é: "+resultado);
        }
    }
    public static void main(String[] args) throws Exception {
       
        Scanner valores = new Scanner(System.in);
      
        
        System.out.print( "\n Insira a velocidade inicial: ");
        int velocidadeInicial = valores.nextInt();
        System.out.print( "\n Insira a espaço inicial: ");
        int espacoInicial = valores.nextInt();
        System.out.print( "\n Insira a aceleração: ");
        int aceleracao = valores.nextInt();
        System.out.print( "\n Insira o instante: ");
        int instante = valores.nextInt();
   

        formula operador;

        operador = new formula();

        operador.s( velocidadeInicial, espacoInicial,  aceleracao,  instante);
        valores.close();
    }
   
}