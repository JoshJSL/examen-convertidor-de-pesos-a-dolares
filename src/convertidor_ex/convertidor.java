/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertidor_ex;

/**
 *
 * @author Soria Láscares Joshua
 * @version 1.0
 */
public class convertidor {
    private float doll;
    /**
     * convierte el parametro pes a float
     * divide el valor de pes entre el costo de el dolar en MXN
     * @param pes
     * @return 
     */
    public String convertir(String pes){
        doll = Float.parseFloat(pes);
        doll=doll/20f;
        return doll+"";
    }
    
}
