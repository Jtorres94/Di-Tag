/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backEnd;

import datos.ManejoArchivos;
import java.util.ArrayList;

/**
 * Clase Administrador que modela al usuario administrador que podrá modificar, añadir y eliminar datos del archivo que se usa de base de datos
 * tiene como atributos la identificacion y la contraseña
 * @author Javier
 */
public class Administrador {
    private String id;
    private String password;
    /**
     * metodo constructor con parámetros
     * @param id identificacion del admin
     * @param password contraseña del administrador
     */
    public Administrador(String id, String password) {
        this.id = id;
        this.password = password;
    }
    /**
     * administrador sin parametros
     */
    public Administrador() {
    }
    /**
     * metodo get del atributo id
     * @return id del admin
     */
    public String getId() {
        return id;
    }
    /**
     * metodo set del atributo id del admin
     * @param id id que se asignará al admin
     */
    public void setId(String id) {
        this.id = id;
    }
    /**
     * metodo get del atributo password del admin
     * @return contraseña del admin
     */
    public String getPassword() {
        return password;
    }
    /**
     * metodo set del atributo password del admin
     * @param password contraseña que se le asignará al admin
     */
    public void setPassword(String password) {
        this.password = password;
    }
    /**
     * metodo para agregar un administrador en la base de datos y que tendra los permisos de administrador
     * @param administrador será un objeto de la clase administrador que será añadido
     */
    public void agregarAdmin (Administrador administrador) {
       datos.ManejoArchivos manejoArchivos = new ManejoArchivos("Administradores.txt");
       manejoArchivos.insertar(administrador.toString());
    }
    /**
     * metodo para eliminar un administrador de la base de datos 
     * @param index 
     */
    public void eliminarAdmin (int index){
        datos.ManejoArchivos manejoArchivos = new ManejoArchivos("Administradores.txt");
        manejoArchivos.eliminar(index);
    }
    /**
     * metodo que maneja los datos en un ArrayList con los administradores que luego seran añadidos al archivo
     * @return retorna un ArrayList 
     */
    public ArrayList<Administrador> toArray(){
        ArrayList<Administrador> listaAdmin = new ArrayList<>();
        datos.ManejoArchivos manejoArchivos = new ManejoArchivos("Administradores.txt");
        
        for (int i = 0; i < manejoArchivos.toArray().size(); i++) {
            String[] datosAdmin = manejoArchivos.toArray().get(i).split(",");
            
            Administrador admin = new Administrador();
            admin.setId(datosAdmin[0]);
            admin.setPassword(datosAdmin[1]);
            listaAdmin.add(admin);
        }
        return listaAdmin;
    }
    /**
     * metodo del tipo toString que retorna la id y la contraseña de un administrador separados por un punto y coma
     * @return 
     */
    @Override
    public String toString() {
        return id + "," + password;
    }
    
}
