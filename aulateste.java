/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulateste;
import java.util.Scanner;
public class aulateste{
    public static void main (String[] args){
        Scanner entrada = new Scanner (System.in);
        String nome;
        System.out.println("Digite seu nome ou s  para Sair ");
        nome= entrada.nextLine();
        while (!nome.equals("s")){
    System.out.println("Bem vindo "+nome);
    System.out.println("Digite seu nome ou s para sair");
    nome = entrada.nextLine();
    }
        System.out.println("Fim da execução");
}
}
