/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escritura05;

import escritura04.CrearDocumento;
import java.util.Scanner;

/**
 *
 * @author UTPL
 */
public class Principal {

    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        String cadenaFinal = "";
        String respuesta;
        boolean bandera = true;
        while (bandera) {

                System.out.println("Ingrese su nombre");
                String nombre = entrada.nextLine();
                System.out.println("Ingrese su tipo de vehiculo");
                String vehiculo = entrada.nextLine();
                System.out.println("Ingrese su placa");
                String placa = entrada.nextLine();
                System.out.println("¿Desea ingresar otro usuario?");
                respuesta = entrada.nextLine();

                cadenaFinal = String.format("%s %s %s \n",
                        nombre, vehiculo, placa);
                if(respuesta.equals("N") || respuesta.equals("n")){
                    bandera = false;
                }

                CrearArchivoPlaca.agregarRegistros(cadenaFinal, placa);

            }

        } // fin de main
    }


