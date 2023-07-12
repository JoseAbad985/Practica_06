/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica_06;

import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author samanthasuquilandaquilli
 */
public class Controlador {

    public void crearDirectorio(String ruta, String nombreDirectorio) {
        String rutaFinal = ruta + "/" + nombreDirectorio;
        File directorio = new File(rutaFinal);
        if (directorio.exists() == false) {

            directorio.mkdir();

        }
    }

    public void creaArchivo(String ruta, String nombreArchivo) throws IOException {
        String rutaFinal = ruta + "/" + nombreArchivo;
        File archivo = new File(rutaFinal);
        if (archivo.exists() == false) {

            archivo.createNewFile();

        }
    }

    public void eliminarArchivoODirectorio(String rutaArchivoODirectorio) {
        File archivoODirectorio = new File(rutaArchivoODirectorio);
        if (archivoODirectorio.exists()) {
            eliminarDirectorio(archivoODirectorio);
        } else {
            if (archivoODirectorio.delete()) {
            }
        }
    }

    private void eliminarDirectorio(File directorio) {
        File[] archivos = directorio.listFiles();
        if (archivos != null) {
            for (File archivo : archivos) {
                if (archivo.isDirectory()) {
                    eliminarDirectorio(archivo);
                } else {
                    archivo.delete();

                }
            }
        }

        directorio.delete();
    }

    public void renombrarArchivo(String url, String urlren, String renombrar) {

        File archivoR = new File(urlren);

        File archivoD = new File(url + "/" + renombrar);

        archivoR.renameTo(archivoD);

    }

}
