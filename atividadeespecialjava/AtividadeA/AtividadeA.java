import java.util.Scanner;
public class AtividadeA {
    public static class Fatorial{
    public  void fatoriar(int valor){
        if (valor == 0){
            System.out.println(1);
            return;
        }
         int resultado = valor;
        for(int i=1;  valor-i!=1 ;i++){
            resultado = resultado * (valor - i);
        }
        System.out.println(resultado);
    }
}
    public static void main(String[] args) throws Exception {
        Scanner valores = new Scanner(System.in);
        System.out.println(" FATORIAL \n \n \n Insira o valor: ");
        int fatoriando = valores.nextInt();
        Fatorial operador;
        operador = new Fatorial();
        operador.fatoriar(fatoriando);
        valores.close();
    }
   
}
