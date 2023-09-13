/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author T.I
 */
public class Pagamento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Cliente cliente = new Cliente();
        
        cliente.nomedoResponsavel = "Gustavo o Pai";
        cliente.nomedoAluno = "Helena filha do Gustavo";
        cliente.datadaCompra = "12/09/2023";
        cliente.valor = 50.02;
        
        //System.out.printf("O nome do responsavel é: %s e o valor gasto foi de %2f ",cliente.nomedoResponsavel,cliente.valor);        
        cliente.dadosCliente();
    }
    
}
