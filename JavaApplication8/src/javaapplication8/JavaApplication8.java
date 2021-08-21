/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;
import java.util.Scanner;

/**
 *
 * @author Convidado
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
        double salariominimo=ler.nextDouble();
        int quantidadeagua=ler.nextInt();
      
      double valormilitrosagua = salariominimo*0.02;
      int divisao=quantidadeagua/1000;
      double total=valormilitrosagua*divisao;
        System.out.println(total);
        double desconto=total-(total*0.15);
      System.out.println(desconto);
       
       
       
       
       
    }
    
}
