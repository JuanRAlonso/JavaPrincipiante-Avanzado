
/**
 *
 * @author juan.rios
 * 
 * 
 * Este ejemplo sirve para observa la concatenacion de cadenas con el operador +
 */
public class ConcatenacionDeCadenas {
    
    public static void main(String[] args) {
        
        //Aquí lo que se está haciendo es declarar las variables de tipo cadena
        String usuario = "Juan";
        String apellido = "Alonso";
        String titulo = "Ing.";
                
        System.out.println(titulo + " " + usuario + " " + apellido);
        
        //También se puede unir todas las cadenas en una sola variable, de la siguiente manera
        
        String cadenaCompleta = titulo + " " + usuario + " " + apellido;
        
        //Imprimiendo la cadena completa
        System.out.println("cadenaCompleta = " + cadenaCompleta);
                
    }
    
    
}
