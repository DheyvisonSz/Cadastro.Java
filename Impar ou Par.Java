package aula11.novos.comandos;
import java.util.Scanner;
/**
 *
 * @author Aluno
 */
public class Aula11NovosComandos {

   
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        
       System.out.print("Digite o numero: ");
        int num =  scanner.nextInt();
        
        int resultado = num % 2;
        
        if (resultado == 0 ){
          System.out.println("Par");
        } 
        else{
           System.out.println("Impar");      
        }
   

     }
}
