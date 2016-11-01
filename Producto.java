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
public class Producto {
    private String nombre;
    private String selloCaloria;
    private String selloGrasas;
    private String selloAzucares;
    private String selloSodio;
    private String calorias;
    private String azucares;
    private String grasasTot;
    private String grasasSat;
    private String sodio;
    private String categoria;
    private String codigo;

    public Producto(String nombre, String selloCaloria, String selloGrasas, String selloAzucares, String selloSodio, String calorias, String azucares, String grasasTot, String grasasSat, String sodio,String categoria, String codigo) {
        this.nombre = nombre;
        this.selloCaloria = selloCaloria;
        this.selloGrasas = selloGrasas;
        this.selloAzucares = selloAzucares;
        this.selloSodio = selloSodio;
        this.calorias = calorias;
        this.azucares = azucares;
        this.grasasTot = grasasTot;
        this.grasasSat = grasasSat;
        this.sodio = sodio;
        this.categoria = categoria;
        this.codigo = codigo;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSelloCaloria() {
        return selloCaloria;
    }

    public void setSelloCaloria(String selloCaloria) {
        this.selloCaloria = selloCaloria;
    }

    public String getSelloGrasas() {
        return selloGrasas;
    }

    public void setSelloGrasas(String selloGrasas) {
        this.selloGrasas = selloGrasas;
    }

    public String getSelloAzucares() {
        return selloAzucares;
    }

    public void setSelloAzucares(String selloAzucares) {
        this.selloAzucares = selloAzucares;
    }

    public String getSelloSodio() {
        return selloSodio;
    }

    public void setSelloSodio(String selloSodio) {
        this.selloSodio = selloSodio;
    }

    public String getCalorias() {
        return calorias;
    }

    public void setCalorias(String calorias) {
        this.calorias = calorias;
    }

    public String getAzucares() {
        return azucares;
    }

    public void setAzucares(String azucares) {
        this.azucares = azucares;
    }

    public String getGrasasTot() {
        return grasasTot;
    }

    public void setGrasasTot(String grasasTot) {
        this.grasasTot = grasasTot;
    }

    public String getGrasasSat() {
        return grasasSat;
    }

    public void setGrasasSat(String grasasSat) {
        this.grasasSat = grasasSat;
    }

    public String getSodio() {
        return sodio;
    }

    public void setSodio(String sodio) {
        this.sodio = sodio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    public void desplegar(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Alto en calorias: "+selloCaloria);
        System.out.println("Alto en grasas: "+selloGrasas);
        System.out.println("Alto en azucares: "+selloAzucares);
        System.out.println("Alto en sodio: "+selloSodio);
        System.out.println("Calorias: "+calorias);
        System.out.println("Azucares: "+azucares);
        System.out.println("Grasas totales: "+grasasTot);
        System.out.println("Grasas saturadas: "+grasasSat);
        System.out.println("Sodio: "+sodio);
        
    }
    
    public void desplegarAdmin(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Alto en calorias: "+selloCaloria);
        System.out.println("Alto en grasas: "+selloGrasas);
        System.out.println("Alto en azucares: "+selloAzucares);
        System.out.println("Alto en sodio: "+selloSodio);
        System.out.println("Calorias: "+calorias);
        System.out.println("Azucares: "+azucares);
        System.out.println("Grasas totales: "+grasasTot);
        System.out.println("Grasas saturadas: "+grasasSat);
        System.out.println("Sodio: "+sodio);
        System.out.println("Categoria: "+categoria);
        System.out.println("Codigo: "+codigo);
        
    }
}
