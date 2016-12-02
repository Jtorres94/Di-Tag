package archivo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 * Esta clase contiene getters, setters y todos los métodos que manejarán el archivo .txt que usaremos 
 * de base de datospara el programa
 * @author Ari
 * Nombre de la clase: ManejoArchivos
 */
public class ManejoArchivos {
    private String ruta;
   // private File fichero ;
    private FileWriter insertarFichero;
    private PrintWriter pw = null;
    
    /**
     * constructor con parámetros 
     * @param ruta parámetro para el constructor, corresponde la ruta donde se alojará el fichero
     */
    public ManejoArchivos(String ruta){
        this.ruta = ruta;
       // fichero = new File(ruta);
    }
    /**
     * metodo get del atributo ruta
     * @return el atributo ruta
     */
    public String getRuta() {
        return ruta;
    }
    /**
     * metodo set del atributo ruta
     * @param ruta 
     */
    public void setRuta(String ruta) {
        this.ruta = ruta;
    } 
    /**
     * metodo de tipo void que insertará el parámetro datos en el archivo .txt
     * @param datos corresponde a los datos del producto que se insertarán en el archivo
     */
    public void insertar (String datos){
        try{   
            insertarFichero = new FileWriter(this.ruta,true);
            pw = new  PrintWriter(insertarFichero);
           
            pw.println(datos);
            System.out.println("correcto");
        }catch(Exception e){
            e.printStackTrace();
        } finally {
           try {
           // Nuevamente aprovechamos el finally para 
           // asegurarnos que se cierra el fichero.
           if (null != insertarFichero)
              insertarFichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }  
        }
    /**
     * metodo de tipo void que elimina un producto del archivo
     * @param index define la linea que se eliminará en el archivo
     */
    public void eliminar(int index) {
 
    try {
 
      File inFile = new File(this.ruta);
      
      if (!inFile.isFile()) {
        System.out.println("Parameter is not an existing file");
        return;
      }
      //Construimos un nuevo archivo que despues sera renombrado como el origianl.
      File tempFile = new File(inFile.getAbsolutePath() + ".tmp");
      
      BufferedReader br = new BufferedReader(new FileReader(this.ruta));
      PrintWriter pw = new PrintWriter(new FileWriter(tempFile));
      
      String line = null;
 
      //Leemos el archivo original y escribimos todas las lineas
      //a excepcion de la "index".
      int cont=0;
      while ((line = br.readLine()) != null) {
        cont++;//contador para poder saber que linea debemos eliminar
        if (cont!=index) {
          pw.println(line);
          pw.flush();
        }

      }
      pw.close();
      br.close();
      
      //Eliminamos el archivo origial.
      if (!inFile.delete()) {
          JOptionPane.showMessageDialog(null, "No se pudo eliminar el archivo");
        return;
      } 
      
      //Renombramos el nuevo archivo con el nombre del archivo original.
      if (!tempFile.renameTo(inFile))
        JOptionPane.showMessageDialog(null, "No se pudo renombrar el archivo");
      
    }
    catch (FileNotFoundException ex) {
      ex.printStackTrace();
    }
    catch (IOException ex) {
      ex.printStackTrace();
    }
  }
   /**
    * metodo para modificar un producto en el archivo .txt donde
    * se reescribira todo el producto
    * @param index corresponde al indice del producto que modificaremos
    * @param cadena corresponde a los nuevos datos del producto que se ingresarán
    */ 
    public void modificar(int index, String cadena) {
 
    try {
 
      File inFile = new File(this.ruta);
      
      if (!inFile.isFile()) {
        System.out.println("Parameter is not an existing file");
        return;
      }
       
      //Construimos un nuevo archivo que despues sera renombrado como el origianl.
      File tempFile = new File(inFile.getAbsolutePath() + ".tmp");
      
      BufferedReader br = new BufferedReader(new FileReader(this.ruta));
      PrintWriter pw = new PrintWriter(new FileWriter(tempFile));
      
      String line = null;
 
      //Leemos el archivo original y escribimos todas las lineas
      //a excepcion de la "index".
      int cont=0;
      while ((line = br.readLine()) != null) {
        cont++;
        if (cont!=index) {//todas las lineas que esten en una posicion distinta de la index sera escritas sin ser modificadas.
          pw.println(line);
          pw.flush();
        }else
            if(cont==index){//cuando la posicion de la linea sea igual a la de index, esta se cambiara por la cadena ingresada.
             line = cadena;
              pw.println(line);
              pw.flush();
            }
      }
      pw.close();
      br.close();
      
      //Eliminamos el archivo original
      if (!inFile.delete()) {
        JOptionPane.showMessageDialog(null, "No se pudo eliminar el archivo");
        return;
      } 
      
      //Renombramos el nuevo archivo con el nombre del archivo original.
      if (!tempFile.renameTo(inFile))
        JOptionPane.showMessageDialog(null, "No se pudo renombrar el archivo");
      
    }
    catch (FileNotFoundException ex) {
      ex.printStackTrace();
    }
    catch (IOException ex) {
      ex.printStackTrace();
    }
  }
    /**
     * metodo que agrega datos a un ArrayList mientras no sean nulos
     * @return listaObj corresponde a un ArrayList con los datos del producto
     */ 
    public ArrayList <String> toArray(){
         File archivo = null;
         FileReader fr = null;
         BufferedReader br = null;
         ArrayList<String> listaObj = new ArrayList<>();
         try {
             //Apertura del fichero y creacion de BufferedReader para poder
             //hacer una lectura comoda (disponer del metodo readLine()).
             archivo = new File(this.ruta);
             fr = new FileReader(archivo);
             br = new BufferedReader(fr);
             //lectura de fichero
             String linea;
             while((linea = br.readLine())!=null){
                 listaObj.add(linea);
             }
         } catch (Exception e) {
             e.printStackTrace();
         }finally{
             // en el finally cerramos el fichero, para asegurarnos
             // que se cierra tanto si todo va bien cono si salta
             // una ecxepcion.
             try {
                 if(null != fr){
                     fr.close();
                 }
             } catch (Exception e2) {
                 e2.printStackTrace();
             }
         }
         return listaObj;
     }
}
