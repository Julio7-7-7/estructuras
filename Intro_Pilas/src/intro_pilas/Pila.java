/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intro_pilas;

/**
 *
 * @author EYAC
 */
public class Pila {
    
    int vectorPila[];
    int cima;
    
    public Pila(int tamaño){
        vectorPila = new int[tamaño];
        cima=0;
    }
    
    //metodo insertar
    public void insertar(int dato){
        vectorPila[cima] = dato;
        cima++;
    }
    
    //metodo eliminar
    public int eliminar(){
        int eliminar = 0;
        if(cima==0){
            System.out.println("la pila esta vacia");
        }
        else{
            eliminar = vectorPila[cima];
            cima--;
        }
        return eliminar;
    }
    
    public boolean vacio(){
        if(cima==0){
            return true;
        }
        else{
            return false;
        }
    }
    public int tamaño(){
        return vectorPila.length -1;
    }
}
