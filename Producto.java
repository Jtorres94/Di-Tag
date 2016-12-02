package backEnd;

import datos.Busqueda;
import datos.ManejoArchivos;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * clase que define un producto por su nombre, sellos, aportes nutricionales, categoria y codigo
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
    /**
     * constructor de la clase producto con parámetros
     * @param nombre corresponde al nombre del producto
     * @param selloCaloria corresponde al sello de calorias
     * @param selloGrasas correpsonde al sello de grasas
     * @param selloAzucares corresponde al sello de azucares
     * @param selloSodio corresponde al sello de sodio
     * @param calorias corresponde al aporte calorico
     * @param azucares corresponde al aporte nutricional de azucares
     * @param grasasTot corresponde al aporte nutricional de grasas totales
     * @param grasasSat correpsonde al aporte nutricional de grasas saturadsa
     * @param sodio corresponde al aporte nutricional de sodio
     * @param categoria corresponde a la categoria del producto
     * @param codigo corresponde al codigo del producto
     */
    public Producto(String codigo,String categoria,String nombre, String selloCaloria, String selloGrasas,
            String selloAzucares, String selloSodio, String calorias, String azucares, 
            String grasasTot, String grasasSat, String sodio) {
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
    /**
     * metodo Constructor sin parametros de la clase Producto
     */ 
    public Producto(){
        
    }
    
    /**
     * metodo get del atributo nombre
     * @return el nombre del producto
     */
    public String getNombre() {
        return nombre;
    }
    /** 
     * metodo set de nombre
     * @param nombre nombre del producto
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * metodo get del sello calorias
     * @return sello calorias
     */
    public String getSelloCaloria() {
        return selloCaloria;
    }
    /**
     * metodo set del sello calorias
     * @param selloGrasas
     */
    public void setSelloCaloria(String selloCaloria) {
        this.selloCaloria = selloCaloria;
    }
    /**
     * metodo get del sello de grasas
     * @return sello de grasas
     */
    public String getSelloGrasas() {
        return selloGrasas;
    }
    /**
     * metodo set de sello grasas
     * @param selloGrasas 
     */
    public void setSelloGrasas(String selloGrasas) {
        this.selloGrasas = selloGrasas;
    }
    /**
     * metodo get del sello de azucares
     * @return sello de azucares
     */
    public String getSelloAzucares() {
        return selloAzucares;
    }
    /**
     * metodo set del sello de azucares
     * @param selloAzucares 
     */
    public void setSelloAzucares(String selloAzucares) {
        this.selloAzucares = selloAzucares;
    }
    /**
    * metodo get del sello de sodios 
    * @return sello de sodios
    */
    public String getSelloSodio() {
        return selloSodio;
    }
    /**
     * metodo set del sello de sodio
     * @param selloSodio 
     */
    public void setSelloSodio(String selloSodio) {
        this.selloSodio = selloSodio;
    }
    /**
     * metodo get del aporte calorico
     * @return cantidad de calorias
     */
    public String getCalorias() {
        return calorias;
    }
    /**
     * metodo set del aporte calorico 
     * @param calorias 
     */
    public void setCalorias(String calorias) {
        this.calorias = calorias;
    }
    /**
     * metodo get del aporte diario de azucares
     * @return azucares diarias
     */
    public String getAzucares() {
        return azucares;
    }
    /**
     * metodo set del aporte diario de azucares
     * @param azucares 
     */
    public void setAzucares(String azucares) {
        this.azucares = azucares;
    }
    /**
     * metodo get de las grasas totales diarias del producto
     * @return grasas totales
     */
    public String getGrasasTot() {
        return grasasTot;
    }
    /**
     * metodo set de las grasas totales diarias del producto
     * @param grasasTot 
     */
    public void setGrasasTot(String grasasTot) {
        this.grasasTot = grasasTot;
    }
    /**
     * metodo get de las grasas saturadas diarias del producto
     * @return grasas saturadas
     */
    public String getGrasasSat() {
        return grasasSat;
    }
    /**
     * metodo set de las grasas saturadas diarias del producto
     * @param grasasSat 
     */
    public void setGrasasSat(String grasasSat) {
        this.grasasSat = grasasSat;
    }
    /**
     * metodo get del sodio diario del producto
     * @return sodio
    */
    public String getSodio() {
        return sodio;
    }
    /**
     * metodo set del sodio diario del producto
     * @param sodio 
     */
    public void setSodio(String sodio) {
        this.sodio = sodio;
    }
    /**
     * metodo get del codigo del producto
     * @return el codigo del producto
     */
    public String getCodigo() {
        return codigo;
    }
    /**
     * metodo set del codigo del producto
     * @param codigo recibe el código que se setteará
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    /**
     * metodo get de la categoria del producto
     * @return la categoria del producto
     */
    public String getCategoria() {
        return categoria;
    }
    /**
     * metodo set de la categoria del producto
     * @param categoria la categoría que se setteara 
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    /**
     * metodo para agregar un string equivalente al producto en el archivo
     * @param producto parametro de tipo producto que se pasara a string y luego se insertara en el archivo
     */
    public void agregarProducto (Producto producto) {
       datos.ManejoArchivos manejoArchivos = new ManejoArchivos("Productos.txt");
       manejoArchivos.insertar(producto.toString());
        
    }
    /**
     * metodo para modificar una linea del archivo
     * @param producto de tipo producto es el que se modificara en el archivo  
     * @param index indice correspondiente a la linea en la que se ubica el producto en el archivo
     */
    public void modificarProducto (Producto producto, int index){
        datos.ManejoArchivos manejoArchivos = new ManejoArchivos("Productos.txt");
        manejoArchivos.modificar(index, producto.toString());
    }
    /**
     * metodo para eliminar un producto del archivo
     * @param index indice de la linea donde se ubica el producto a eliminar
     */
    public void eliminarProducto (int index){
        datos.ManejoArchivos manejoArchivos = new ManejoArchivos("Productos.txt");
        manejoArchivos.eliminar(index);
    }
    /**
     * metodo de tipo ArrayList que toma el contenido del archivo y lo ingresa a un ArrayList
     * @return el ArrayList creado con los productos del archivo
     */
    public ArrayList<Producto> toArray(){
        ArrayList<Producto> listaProducto = new ArrayList<>();
        datos.ManejoArchivos manejoArchivos = new ManejoArchivos("Productos.txt");
        
        for (int i = 0; i < manejoArchivos.toArray().size(); i++) {
            String[] datosProducto = manejoArchivos.toArray().get(i).split(",");
            
            Producto producto = new Producto();
            producto.setCodigo(datosProducto[0]);
            producto.setCategoria(datosProducto[1]);
            producto.setNombre(datosProducto[2]);
            producto.setSelloCaloria(datosProducto[3]);
            producto.setSelloGrasas(datosProducto[4]);
            producto.setSelloAzucares(datosProducto[5]);
            producto.setSelloSodio(datosProducto[6]);
            producto.setCalorias(datosProducto[7]);
            producto.setAzucares(datosProducto[8]);
            producto.setGrasasTot(datosProducto[9]);
            producto.setGrasasSat(datosProducto[10]);
            producto.setSodio(datosProducto[11]);
            
            listaProducto.add(producto);
        }
        return listaProducto;
    }
    /**
     * metodo que permite la búsqueda de una categoria
     * @param cadena correspondiente a la representacion de la categoria en string
     * @return un ArrayList correspondiente a la categoria entera 
     */
    public ArrayList<Producto> buscarCat(String cadena){
        Busqueda busqueda = new Busqueda();
        return busqueda.buscarCat(cadena);
    }
    /**
     * metodo que permite la busqueda de un producto en base a un string ingresado por el usuario
     * instancia un objeto de tipo busqueda, compara y retorna el match 
     * @param cadena
     * @return el producto que hace match con la cadena ingresada
     */
    public Producto buscarProducto(String cadena){
        Busqueda busqueda = new Busqueda();
        return busqueda.buscarProducto(cadena);
    }
    /**
     * 
     * @return 
     */
    public String[] toVectorCat(){
        String v[] = new String[toArray().size()];
        for (int i = 0; i < toArray().size(); i++) {
            v[i]=toArray().get(i).getCodigo()+"-"+toArray().get(i).getNombre();
        }
        return v;
    }

    @Override
    public String toString() {
        return codigo + "," + categoria + "," + nombre + "," + selloCaloria + "," + selloGrasas + "," + selloAzucares + "," + selloSodio + ","+ calorias+ ","+ azucares + ","+ grasasTot + "," + grasasSat + "," + sodio;
    }
    
    
}
