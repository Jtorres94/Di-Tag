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
public class CustomListModel extends AbstractListModel{
    Producto producto = new Producto();

    @Override
    public int getSize() {
        return producto.toArray().size();
    }

    @Override
    public Object getElementAt(int i) {
        producto = producto.toArray().get(i);
        return producto.getCodigo()+" | "+producto.getCategoria()+" | "+producto.getNombre()+" | "+producto.getSelloCaloria()+" | "+producto.getSelloGrasas()
                +" | "+producto.getSelloAzucares()+" | "+producto.getSelloSodio()+" | "+producto.getCalorias()+" | "+producto.getAzucares()+" | "+
                producto.getGrasasTot()+" | "+producto.getGrasasSat()+" | "+producto.getSodio();
    }

    public void refrescar(){
        this.fireIntervalAdded(this, getSize(), getSize()+1); // nos permite notificarle al JList que un elemento ha sido agregado
    }
}
