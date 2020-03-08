/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nombre;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Nombre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine();
        String apellidos = sc.nextLine();
        int edad = sc.nextInt();
        System.out.println("hola"+ nombre+" "+ edad+ " "+ apellidos);
    }
    
}
