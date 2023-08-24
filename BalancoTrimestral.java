/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03;

/**
 *
 * @author Aluno
 */
public class BalancoTrimestral {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int gastoJaneiro = 15000;
        int gastoFevereiro = 23000;
        int gastoMarco = 17000;
        int gastoTrimestral = (gastoJaneiro + gastoFevereiro + gastoMarco)/3;
        
        System.out.println(gastoTrimestral);
        // TODO code application logic here
    }
    
}
