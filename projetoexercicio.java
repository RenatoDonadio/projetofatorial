/**
 * projetoexercicio
 */
import java.util.Scanner; 
public class projetoexercicio {

    public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);
   int n;
   System.out.println("Digite o número para realizar o fatorial");
    n = teclado.nextInt();

    /*
     Formula fatorial = n1 * (n-1) * (n-2) * (n-3) * .... 1
     */
    int n1;



   int contagem = n;
    n1 = 1;
     
    while(contagem>=1){
    n1 = n1 * n;
     contagem--;
    

    }

    System.out.println("Fatorial = " + n1);
  teclado.close();
    }
}