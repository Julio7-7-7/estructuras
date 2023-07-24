/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intro_pilas;

import java.util.Scanner;

/**
 *
 * @author EYAC
 */
public class Intro_Pilas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        
        System.out.println("Bienvenido a la pila");
        System.out.println("Digite el tamaño de la pila");
        int tamaño = leer.nextInt();
        int dato = 0, opc = 0;
        
        Pila a = new Pila(tamaño);
        
        do{
            System.out.println("Que desea hacer");
            System.out.println("1:Ingresar dato --- 2:Eliminar dato --- 3:Saber si esta vacia ---");
            System.out.println("4:Tamaño de la pila --- 5:Salir");
            opc = leer.nextInt();
            
            switch (opc){
                case 1:
                  System.out.println("Inserte dato");
                  a.insertar(dato = leer.nextInt());
                  System.out.println("Dato insertado");
                  System.out.println("");
                  break;
                  
                case 2:
                    a.eliminar();
                    break;
                case 3:
                    System.out.println(a.vacio());
                    System.out.println("");
                    break;
                case 4:
                    System.out.println(a.tamaño());
                    break;
            }
        }
        while (opc != 5);
    }
    
}
