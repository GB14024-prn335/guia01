/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC02
 */

        
public class Utilities {
    
    /**
     * 
     * @param texto
     * @return 
     */
    public String getResume(String texto) {
        
        return "";
}
    public String capitalizar(String texto){
    
    return "";
    }
    
    public int contarCoincidencias(String frase[], String texto[]){
    
      String frase_Aux[] = new String[frase.length];
        String cadenaAux="";
       
        for(int i=0;i<frase.length;i++)
        {
            frase_Aux = frase[i].split(texto[i]);
            cadenaAux+=frase_Aux[i];
        }
        
    
    return 0;
    }
    
  
}
