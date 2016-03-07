
/**
 * Write a description of class MiHashMap here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MiHashMap
{
    // Guarda las claves del hashmap como Strings
    private String[] claves;
    // Guarda los valores del hashmap como ints
    private int[] valores; 

    /**
     * Constructor for objects of class MiHashMap
     */
    public MiHashMap()
    {
        claves = new String[0];
        valores = new int[0];
    }

    /**
     * Asocia el valor especificado con la clave especificada. 
     * Si la clave existía, entonces sobreescribe su valor 
     * y devuelve el valor antiguo. Si no existía devuelve -1.
     */
    public int put(String clave, int valor)
    {
        boolean claveRep = false;
        int numero = -1;
        for (int count = 0; count < claves.length; count++) {
            if (claves[count] == clave) {
                numero = valores[count];
                valores[count] = valor;
                claveRep = true;
            }
        }
        if(!claveRep){
            String[] claves2 = claves;
            claves = new String[claves2.length + 1];
            int[] valores2 = valores;
            valores = new int[valores2.length + 1];
            
            for (int count = 0; count < claves2.length; count++)
            {
                claves[count] = claves2[count];
                valores[count] = valores2[count];
            }
            claves[claves2.length] = clave;
            valores[valores2.length] = valor;
        }
        return numero;
    }
    
    /**
     *  Devuelve el valor asociado con la clave especificada o -1 
     *  en caso de que la clave no exista.
     */
    public int get(String clave){
        boolean encontrado = false;
        int valor = -1;
        for (int count = 0; count < claves.length && !encontrado; count++){
            if (clave == claves[count]){
                encontrado = true;
                valor = valores[count];
            }
        }
        return valor;
    }
}
