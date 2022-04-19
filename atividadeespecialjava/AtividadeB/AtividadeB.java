
public class AtividadeB {
    public static class Multiplos{
        public void mil(){
            int resultado = 0;
            for(int i=0; i < 1000;i++){
                if (i%5 ==0 || i%3 ==0) {
                    resultado = resultado +i;
                }
            } 
            System.out.println("A soma de todos os números múltiplos de 3 e 5 abaixo de 1000 da: "+resultado);
        }
    }
    public static void main(String[] args) throws Exception {
        
        System.out.println(" MÚLTIPLOS DE 1000 \n \n \n ");
       
        Multiplos operador;
        operador = new Multiplos();
        operador.mil();
        valores.close();
    }
}
