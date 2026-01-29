/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escritura04;

import escritura03.CrearArchivoTexto;
import java.util.Scanner;

/**
 *
 * @author UTPL
 */
public class Principal {

    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        String cadenaFinal = "";

        for (int i = 1; i < 3; i++) {

            System.out.println("Ingrese su nombre");
            String nombre = entrada.nextLine();
            System.out.println("Ingrese su correo");
            String correo = entrada.nextLine();
            System.out.println("Ingrese su cedúla");
            String cedula = entrada.nextLine();

            cadenaFinal = String.format("%s %s %s\n", 
                    nombre,
                    correo, cedula);

            CrearDocumento.agregarRegistros(cadenaFinal, cedula);

        }

    } // fin de main
}
