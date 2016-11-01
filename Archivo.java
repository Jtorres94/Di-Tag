/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package di.tag;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author Javier
 */
public class Archivo {
    public void buscar(String nombreB){
        try {
            File f = new File("Productos.txt");
            if(f.exists()){
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                String linea;
                while((linea=br.readLine())!=null){
                    String info[]=linea.split(",");
                    if(formato(info[0]).equals(nombreB)){
                        Producto p = new Producto(info[0],info[1],info[2],info[3],info[4],info[5],info[6],info[7],info[8],info[9],info[10],info[11]);
                        System.out.println("Producto encontrado");
                        p.desplegar();
                    }
                }
            }else{
                System.out.println("No hay nada por buscar");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void agregarProducto(Producto nuevo){
        try {
            File f= new File("Productos.txt");
            FileWriter fw;
            BufferedWriter bw;
            if (f.exists() && f.length()!=0){
                fw = new FileWriter(f,true);
                bw = new BufferedWriter(fw);
                bw.newLine();
                bw.write(nuevo.getNombre()+","+nuevo.getSelloCaloria()+","+nuevo.getSelloGrasas()+","+nuevo.getSelloAzucares()+","+nuevo.getSelloSodio()+","+nuevo.getCalorias()+","+nuevo.getAzucares()+","+nuevo.getGrasasTot()+","+nuevo.getGrasasSat()+","+nuevo.getSodio()+","+nuevo.getCodigo());
            }else{
                fw = new FileWriter(f);
                bw = new BufferedWriter(fw);
                bw.write(nuevo.getNombre()+","+nuevo.getSelloCaloria()+","+nuevo.getSelloGrasas()+","+nuevo.getSelloAzucares()+","+nuevo.getSelloSodio()+","+nuevo.getCalorias()+","+nuevo.getAzucares()+","+nuevo.getGrasasTot()+","+nuevo.getGrasasSat()+","+nuevo.getSodio()+","+nuevo.getCodigo());
            }
            bw.close();
            fw.close();     
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void buscarCat(String categoria){
        try {
            File f = new File("Productos.txt");
            if(f.exists()){
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                String linea;
                while((linea=br.readLine())!=null){
                    String info[]=linea.split(",");
                    System.out.println("Productos encontrados");
                        if(formato(info[10]).equals(categoria)){
                            Producto p = new Producto(info[0],info[1],info[2],info[3],info[4],info[5],info[6],info[7],info[8],info[9],info[10],info[11]);
                            p.desplegar();
                            System.out.println("**************************************");
                    }  
                }
            }else{
                System.out.println("No existen productos en esta categoria o no existe categoria");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void eliminarProducto(String nombreE){
        try {
            File f = new File("Productos.txt");
        if(f.exists()){
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String linea;
            String contactos[]= new String [numeroLineas()];
            br.close();
            fr.close();
            br = new BufferedReader(fr = new FileReader(f));
            int i=0;
            while((linea=br.readLine())!=null){
                contactos[i]=linea;
                i++;
            }
            br.close();
            fr.close();
            FileWriter fw = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(fw);
            boolean primeraL=true;
            for (int j = 0; j < contactos.length; j++) {
                String l [] = contactos[j].split(",");
                if(formato(l[11]).equals(nombreE)){
                    System.out.println("Elemento eliminado");
                }else{
                    if(primeraL==true){
                        bw.write(contactos[j]);
                        primeraL=false;
                    }else{
                        bw.newLine();
                        bw.write(contactos[j]);  
                    }
                }
            }
            bw.close();
            fw.close();
        }else
            System.out.println("No hay contactos que eliminar");
        } catch (Exception e) {
            System.out.println(e);
        } 
    }
    public void mostrar(){
        try {
            File f = new File("Productos.txt");
            if(f.exists()){
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                String linea;
                while((linea=br.readLine())!=null){
                    String [] info = linea.split(",");
                    Producto p = new Producto(info[0],info[1],info[2],info[3],info[4],info[5],info[6],info[7],info[8],info[9],info[10],info[11]);
                    p.desplegarAdmin();
                    System.out.println("*********************************");
                }
                
            }else{
                System.out.println("Lista inexistente");
            }
        } catch (Exception e) {
        }
    }
    public int numeroLineas(){
        int nrolineas=0;
        try {
            File f = new File("agenda.txt");
            if(f.exists()){
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                String linea;
                while((linea=br.readLine())!=null){
                    nrolineas++;
                }
            }
            
        } catch (Exception e) {
        }
        return nrolineas;
    }
    public  String formato(String producto){//da formato al String de entrada para tener coincidencia con los datos
        producto = producto.toLowerCase();
        producto = producto.replace(" ","");
        return producto;
    }
    public  String leerString(){//le una cadena de tipo String
        Scanner leer = new Scanner(System.in);
        String cadena=leer.nextLine();
        return cadena;
    }
}
