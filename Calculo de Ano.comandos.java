
package aula11.novos.comandos;
import java.util.Scanner;
/**
 *
 * @author Aluno
 */
public class Aula11NovosComandos {
   
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
       
         System.out.print("AnoAtual: ");
         int y = scanner.nextInt();
        System.out.print("AnoNascimento: ");
         int x = scanner.nextInt();
         System.out.print("Resultado: ");
          System.out.println(y - x);
    
    }
}
