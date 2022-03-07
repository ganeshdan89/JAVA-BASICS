/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class Archivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ManejoArchivos ma = new ManejoArchivos();
        JOptionPane.showMessageDialog(null,"Debe seleccionar en donde se guardará el archivo de texto");
        
        String ruta = ma.SeleccionarDirectorio();;
        String texto = "";
        
        texto = JOptionPane.showInputDialog("Ingrese un nombre");
        //La variable booleana que aparece abajo define si al ser true agrega texto sin sobre escribir o si sobrescribe al ser false
        ma.EscribirArchivo(true, ruta, texto);       
        
       String lectura = ma.LeeArchivo(ruta);
       
    }

}
