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
public class Admin {
    private String id;
    private String password;
    Archivo a = new Archivo();
    public Admin(String id, String password) {
        this.id = id;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void agregarProducto(){
        System.out.println("Ingrese nombre");
        String nombre=a.leerString();
        System.out.println("Ingrese si tiene Sello de Calorias");
        String selloCalorias=a.leerString();
        System.out.println("Ingrese si tiene Sello de Grasas");
        String selloGrasas=a.leerString();
        System.out.println("Ingrese si tiene Sello de Azucares");
        String selloAzucares=a.leerString();
        System.out.println("Ingrese si tiene Sello de Sodio");
        String selloSodio=a.leerString();
        System.out.println("Ingrese cantidad de calorias");
        String calorias=a.leerString();
        System.out.println("Ingrese cantidad de azucares");
        String azucares=a.leerString();
        System.out.println("Ingrese cantidad de grasas totales");
        String grasasTot=a.leerString();
        System.out.println("Ingrese cantidad de grasas saturadas");
        String grasasSat=a.leerString();
        System.out.println("Ingrese cantidad de sodio");
        String sodio=a.leerString();
        System.out.println("Ingrese a que categoria pertenece");
        String categoria=a.leerString();
        System.out.println("Ingrese el codigo del producto");
        String codigo=a.leerString();
        a.agregarProducto(new Producto(nombre,selloCalorias,selloGrasas,selloAzucares,selloSodio,calorias,azucares,grasasTot,grasasSat,sodio,categoria,codigo));
    }
    
    public void eliminarProducto(){
        System.out.println("Ingrese codigo del producto");
        a.eliminarProducto(a.formato(a.leerString()));
    }
    
    public void mostrarTodo(){
        a.mostrar();
    }
}
