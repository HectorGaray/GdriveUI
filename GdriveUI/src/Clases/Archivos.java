/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/**
 *
 * @author CoordinacionTI
 */
public class Archivos {
    
    
    public void creaAchivo(String nombre){
        try {
            String ruta = "C:\\Users\\CoordinacionTI\\Desktop\\"+nombre+".bat";
            String contenido="@echo off\n" +
"color 0A\n" +
"title TRASLADO DE BACKUP'S\n" +
"echo.\n" +
"echo.\n" +
"echo ########################################################\n" +
"echo ######                                            ######\n" +
"echo ######   SCRIPT PARA TRASLADAR RESPALDOS DE BD    ######\n" +
"echo ######                                            ######\n" +
"echo ########################################################\n" +
"echo.";
            File file = new File(ruta);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(contenido);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    
}
