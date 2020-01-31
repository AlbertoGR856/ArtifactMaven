/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.artifactmaven;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class ArtifactMaven {
    
     public static void main(String[] args) {

        // Creamos el teclado.
        Scanner teclado = new Scanner(System.in);

        // Se intoduce por consola una opción.
        System.out.println("Introduce una opción ");

        // Se declara la variable teclado.
        int opcion = teclado.nextInt();

        //Se intoduce por consola nuestra edad.
        System.out.println("Introduce tu edad :");

        // Se declara la variable edad.
        int edad = teclado.nextInt();

        // Utilizamos la estructura de seleción switch en la que se incluiran cada
        // uno de los rangos de edad con sus corespondientes case y breaks.
        switch (opcion) {

            case 1:

                if (edad < 18) {

                    System.out.println("No puedes votar");

                } else {
                    System.out.println("Si puedes votar");
                }

                break;

            case 2:

                if (edad == 18) {

                    System.out.println("Justo eres mayor de edad");

                } else {
                    System.out.println("Introduce la edad 18 años");
                }

                break;

            case 3:

                if (edad == 25) {

                    System.out.println("A disfrutar de la juventud");

                } else {
                    System.out.println("Introduce la edad de 25 años");
                }

                break;

            case 4:

                if (edad == 35) {

                    System.out.println("Si no trabajas, ponte las pilas");
                } else {
                    System.out.println("Introduce la edad 35 años");
                }

                break;

            case 5:

                if (edad == 45) {

                    System.out.println("Deberias pensar en abrir un plan de pensiones");
                } else {
                    System.out.println("Introduce la edad 45 años");
                }

                break;

            case 6:

                if (edad == 55) {

                    System.out.println("Viva la madurez");
                } else {
                    System.out.println("Introduce la edad 55 años");
                }

                break;

            case 7:

                if (edad == 65) {

                    System.out.println("Enhorabuena jubilado");
                } else {
                    System.out.println("Introduce la edad 65 años");
                }

                break;

            case 8:

                if (edad > 65) {

                    System.out.println("A disfrutar la vejez");
                } else {
                    System.out.println("Estas a punto de disfrutar de la vejez");
                }

                break;
                
               
        }
        
         System.out.println("Hola Mundo");
         System.out.println("Hola Mundo");


    }
    
}
