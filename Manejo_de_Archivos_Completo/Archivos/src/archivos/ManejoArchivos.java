/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JFileChooser;

//File: Se usará para comprobar si existe el fichero especificado.
//FileWriter: Se usará para especificar el archivo en el que se va a escribir.
//BufferedWriter: se encargará de escribir en el archivo.

/**
 *
 * @author Daniel
 */
public class ManejoArchivos {
  
    public ManejoArchivos() {

    }

 //Selecciona el directorio y crea el arhivo de texto
    public String SeleccionarDirectorio() {
        String ruta;       
        File archivoSeleccionado;
        JFileChooser seleccionarArchivo;
        seleccionarArchivo = new JFileChooser();
        //Recordar que show sirve para salvar o abrir ficheros showSaveDialog o showOpenDialog
        seleccionarArchivo.showSaveDialog(null);
        archivoSeleccionado = seleccionarArchivo.getSelectedFile();        
        ruta = archivoSeleccionado.toString();
        return ruta;

    }

    public String LeeArchivo(String ruta) {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        String retorno = "";
        try {
            // Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda (disponer del metodo readLine()).
            archivo = new File(ruta);
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            // Lectura del fichero
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] resultado = linea.split(":");
                for (String str : resultado) {
                    System.out.println(str);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // En el finally cerramos el fichero, para asegurarnos
            // que se cierra tanto si todo va bien como si salta 
            // una excepcion.
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return retorno;
    }

    public void EscribirArchivo(boolean anexar, String ruta, String texto) {
        FileWriter fichero = null;
        PrintWriter pw = null;
        try {
            fichero = new FileWriter(ruta, anexar);
            pw = new PrintWriter(fichero);
            //pw.println(texto);
            pw.printf(texto);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                // Nuevamente aprovechamos el finally para 
                // asegurarnos que se cierra el fichero.
                if (null != fichero) {
                    fichero.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

}
