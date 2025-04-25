/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atvd.pkg2504;
import java.util.Scanner;
/**
 *
 * @author Aluno
 */
public class Atvd2504 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       Scanner scan = new Scanner (System.in);
       
       int crepeticao;
       // O int e pra criar uma variável
       for(crepeticao =1;crepeticao <=4;crepeticao++){
        //For é usada para criar um loop, que permite executar um bloco de código repetidamente    
        System.out.println("Qual seu nome:");
        String nome = scan.next ();
        
        System.out.println("Qual sua idade:");
        String idade = scan.next ();
        
        System.out.println("CEP:");
        String cep = scan.next ();
        
        System.out.println("dados de cadastro:");
        System.out.println(nome); 
         System.out.println(idade);
         System.out.println(cep);

          
        }
       //esse daqui e o segundo codigo nao esqueça de separar

         System.out.println("Quantos vezes que quer no cadastro?");
        int quantidade = scan.nextInt ();
        int contagemrep ;
       
        
        for(contagemrep =1;contagemrep <=quantidade;contagemrep--){

      
        
        System.out.println("Qual seu nome:");
        String nome = scan.next ();
        
        System.out.println("Qual sua idade:");
        String idade = scan.next ();
        
        System.out.println("CEP:");
        String cep = scan.next ();
        
        System.out.println("dados de cadastro:");
        System.out.println(nome); 
         System.out.println(idade);
         System.out.println(cep);
       }
    }
    
}
