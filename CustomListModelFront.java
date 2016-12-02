/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import backEnd.Producto;
import java.util.ArrayList;
import javax.swing.AbstractListModel;

/**
 *
 * @author Javier
 */
public class CustomListModelFront extends AbstractListModel{
Producto producto = new Producto();
private String cadena;

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }


    @Override
    public int getSize() {
        return producto.buscarCat(cadena).size();
    }

    @Override
    public Object getElementAt(int i) {
        producto = producto.buscarCat(cadena).get(i);
        return producto.getCategoria()+" | "+producto.getNombre()+" | "+producto.getSelloCaloria()+" | "+producto.getSelloGrasas()
                +" | "+producto.getSelloAzucares()+" | "+producto.getSelloSodio();
    }

    
}
