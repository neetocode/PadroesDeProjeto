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
public class Incremental {
    private static Incremental instancia;
    private static int count = 0;
    private int numero = 0;
        
    public static Incremental getInstancia(){
        Incremental.count++;
        if(instancia == null) instancia = new Incremental();
        return instancia;
    }
    
    protected Incremental(){
        
    }
    
    @Override
    public String toString(){
        this.numero = Incremental.count;
        return "Incremental "+this.numero;
    }
}
