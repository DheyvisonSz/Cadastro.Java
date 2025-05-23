/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package AulaCalu2305;
import java.util.Scanner;
/**
 *
 * @author Aluno
 */
public class aulaCalu2305 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       intrucoes();
       Scanner scanner = new Scanner (System.in); 
       int dia = scanner.nextInt();

       //Switch case começa aqui
        switch(dia){
          case 1:
            System.out.println("o dia selecionado foi segunda-feira");
            break;
            
          case 2:
            System.out.println("o dia selecionado foi terça-feira");
            break;
            
          case 3:
            System.out.println("o dia selecionado foi Quarta-feira");
            break;
            
           case 4:
            System.out.println("o dia selecionado foi Quinta-feira");
            break;
            
           case 5:
            System.out.println("o dia selecionado foi Sexta-feira");
            break;
            
           case 6:
            System.out.println("o dia selecionado foi Sabado");
            break;
           case 7:
            System.out.println("o dia selecionado foi Domingo");
            break;
          default:
           System.out.println("o numero digitado invalido");
        }
       //switch case termina aqui
     }
    
  public static void intrucoes(){
      System.out.println("ola digite 1 para selecionar"
               + "Segunda-feira e 7 para selecionar domingo");
  }  
    
    
}