package aula11.novos.comandos;
import java.util.Scanner;
/**
 *
 * @author Aluno
 */
public class Aula11NovosComandos {

   
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
       
         System.out.print("Qual e sua idade? ");
        int idade = scanner.nextInt();
         
         
         if(idade >= 18){
             
             System.out.println("Voce e maior de idade");
             
         }
    
         else{
             
            System.out.println("Voce e Menor de idade");
         }
               
       
    }
}
