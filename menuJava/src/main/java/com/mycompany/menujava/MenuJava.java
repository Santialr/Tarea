/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.menujava;
import java.util.Scanner;
/**
 *
 * @author Ilerna 4.2.12
 */
public class MenuJava {

    public static void main(String[] args) {
     Scanner scanner = new Scanner (System.in);
     int opcion;
     
     do {
         mostrarMenu();
         System.out.println("Seleciona una opción:");
         opcion = scanner.nextInt();
         switch (opcion) {
                case 1: 
                    System.out.println("Has selecionado la primera opción.");
                    break;
                case 2:
                    System.out.println("Has seleccionado la segunda opción.");
                    break;
                case 3:
                    System.out.println("Has seleccionado la tercera opción.");
                    break;
                case 4:
                    System.out.println("Has salido del programa");
                    break;
                default:
                    System.out.println("No existe esa opción.");
     }
     } while(opcion != 4);
     scanner.close();
    }
    private static void mostrarMenu() {
        System.out.println("Menú");
        System.out.println("Opción 1");
        System.out.println("Opción 2");
        System.out.println("Opción 3");
        System.out.println("Salir");
    }
    
}
