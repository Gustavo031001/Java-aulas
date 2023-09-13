/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author T.I
 */
public class Cliente {
    String nomedoResponsavel;
    String nomedoAluno;
    String datadaCompra;
    double valor;
    
    void dadosCliente(){
        System.out.printf("Nome do responsavel é: %s \n ",nomedoResponsavel);
        System.out.printf("Nome do aluno: %s \n ",nomedoAluno );
        System.out.printf("Valor gasto: %2s \n ",valor);
    }    
}
