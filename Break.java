/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgbreak;

/**
 *
 * @author T.I
 */
public class Break {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 0;
        int y = 30;
        for (int i = x; i < y; i++){
            if (i%19==0){
                System.out.println("Achei o número divisivel por 19 entre x e y" +i);
               break;
            }
        }
        // TODO code application logic here
    }
    
}
