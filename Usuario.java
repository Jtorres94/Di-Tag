/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package di.tag;

/**
 *
 * @author Javier
 */
public class Usuario {
    Archivo a = new Archivo();
    
    public void buscarCategoria(){
        System.out.println("Ingrese categoria a buscar");
        a.buscarCat(a.formato(a.leerString()));
    }
    public void buscarProducto(){
        System.out.println("Ingrese producto a buscar");
        a.buscar(a.formato(a.leerString()));
    }
}
