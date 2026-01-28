/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lectura04;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author UTPL
 */
public class LeerArchivo {

    public static void reporte(){
        double valor = 0;
        int contador = 0;
        double promedio = 0;

        try {
            Scanner entrada = new Scanner(new File("data/datosDos.txt"));

            while (entrada.hasNext()) {
                String linea = entrada.nextLine();
                List<String> lista = Arrays.asList(linea.split("\\|"));
                ArrayList<String> linea_partes = new ArrayList<>(lista);
                
                valor = valor + Double.parseDouble(linea_partes.get(3));
                contador = contador + 1;
            }
            
            promedio = valor / contador;
            entrada.close();
        } catch (Exception e) {
            System.err.println("Error al leer del archivo.");
            System.exit(1);
        }
        
        System.out.printf("El promedio es %.2f", promedio);
    }
}
