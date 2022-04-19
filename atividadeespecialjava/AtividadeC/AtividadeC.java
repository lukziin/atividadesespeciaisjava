import java.util.Scanner;
public class AtividadeC {
    public static class PA{
        public void soma(int numero, int valorInicial, int valorFinal){
            int resultado = (numero * (valorInicial+valorFinal))/2;
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
        System.out.print( "\n Insira o valor final: ");
        int valorFinal = valores.nextInt();
        PA operador;

        operador = new PA();

        operador.soma(numero,valorInicial,valorFinal);
        valores.close();
    }
   
}
