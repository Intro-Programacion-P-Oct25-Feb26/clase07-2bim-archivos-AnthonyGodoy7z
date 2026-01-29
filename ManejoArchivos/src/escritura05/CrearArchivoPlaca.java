/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escritura05;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.Formatter;

/**
 *
 * @author UTPL
 */
public class CrearArchivoPlaca {

    public static void agregarRegistros(String valor, String placa) {

        String inicial = placa.substring(0, 1);
        if (inicial.equals("L")) {
            try {
                FileOutputStream fos = new FileOutputStream("data/placaLoja.txt", true); // true = append
                OutputStreamWriter osw = new OutputStreamWriter(fos);// estos dos sirven para almacenar en el mismo archivos mas informacion
                Formatter salida = new Formatter(osw);

                salida.format("%s", valor);
                salida.close();

            } catch (Exception e) {
                System.err.println("Error al crear el archivo.");
                System.exit(1);

            }
        } else {
            if (inicial.equals("G")) {
                try {
                    FileOutputStream fos = new FileOutputStream("data/placaGuayas.txt", true); // true = append
                    OutputStreamWriter osw = new OutputStreamWriter(fos);// estos dos sirven para almacenar en el mismo archivos mas informacion
                    Formatter salida = new Formatter(osw);

                    salida.format("%s", valor);
                    salida.close();

                } catch (Exception e) {
                    System.err.println("Error al crear el archivo.");
                    System.exit(1);

                }
            } else {
                if (inicial.equals("P")) {
                    try {
                        FileOutputStream fos = new FileOutputStream("data/placaPichincha.txt", true); // true = append
                        OutputStreamWriter osw = new OutputStreamWriter(fos);// estos dos sirven para almacenar en el mismo archivos mas informacion
                        Formatter salida = new Formatter(osw);

                        salida.format("%s", valor);
                        salida.close();

                    } catch (Exception e) {
                        System.err.println("Error al crear el archivo.");
                        System.exit(1);

                    }
                } else {
                    try {
                        FileOutputStream fos = new FileOutputStream("data/PlacaOtros.txt", true); // true = append
                        OutputStreamWriter osw = new OutputStreamWriter(fos);// estos dos sirven para almacenar en el mismo archivos mas informacion
                        Formatter salida = new Formatter(osw);

                        salida.format("%s", valor);
                        salida.close();

                    } catch (Exception e) {
                        System.err.println("Error al crear el archivo.");
                        System.exit(1);
                    }
                }

            }
        }

    }
}
