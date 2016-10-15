/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padroesdeprojeto.singleton.atividade01;

/**
 *
 * @author 20141LBSI120044
 */
public class PadroesDeProjetoSingletonAtividade01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        for(int i = 0;i < 10;i++){
            Incremental inc = Incremental.getInstancia();
            System.out.println(inc.toString());
        }
        
        
    }
    
}
