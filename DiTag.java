/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package di.tag;

import VentanasBke.AdminVP;
import VentanasFte.DitagVP;
import datos.Busqueda;
import backEnd.Administrador;
import backEnd.Producto;
import datos.Validacion;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Javier
 */
public class DiTag {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Menu menu = new Menu();
        menu.menu();*/
        //AdminVP v = new AdminVP();
        //v.setVisible(true);
        //Administrador admin = new Administrador();
        //Scanner leer = new Scanner(System.in);
        //System.out.println("Ingrese id");
        //String a = leer.nextLine();
        //admin.eliminarAdmin(2);
        //System.out.println("Ingrese contraseña");
        //String b = leer.nextLine();
        //admin.agregarAdmin(new Administrador(a, b));
        DitagVP d = new DitagVP();
        d.setVisible(true);
        //Producto producto = new Producto();
        //Busqueda busqueda = new Busqueda();

        
    }
    /*public static boolean contiene(String cadena){
        boolean c=false;
        if(cadena.contains("Aguas y Bebidas")){
            c=true;
        }
        return c;
    }
    public static String [][] aguasYbebidas(){//Productos de categoria aguas y bebidas
        String [][]matriz = new String[3][10];
        matriz[0][0]="Crush";
        matriz[0][1]="Libre de sellos";
        matriz[0][2]="Libre de Sellos";
        matriz[0][3]="Alto en Azucares";
        matriz[0][4]="Libre de sellos";
        matriz[0][5]="104kcal (5%)";
        matriz[0][6]="26g (29%";
        matriz[0][7]="0 (0%)";
        matriz[0][8]="0 (0%)";
        matriz[0][9]="12mg (1%)";
        matriz[1][0]="Pure life";
        matriz[1][1]="Libre de sellos";
        matriz[1][2]="Libre de sellos";
        matriz[1][3]="Libre de sellos";
        matriz[1][4]="Libre de sellos";
        matriz[1][5]="0kcal (0%)";
        matriz[1][6]="0g (0%)";
        matriz[1][7]="0 (0%)";
        matriz[1][8]="0 (0%)";
        matriz[1][9]="2mg (0%)";
        matriz[2][0]="Cocacola zero";
        matriz[2][1]="Libre de sellos";
        matriz[2][2]="Libre de sellos";
        matriz[2][3]="Libre de sellos";
        matriz[2][4]="Libre de sellos";
        matriz[2][5]="0kcal (0%)";
        matriz[2][6]="0g (0%)";
        matriz[2][7]="0 (0%)";
        matriz[2][8]="0 (0%)";
        matriz[2][9]="35mg (1%)";
        return matriz;
    }
    public static String [][] snackSalados(){//productos de categoria lacteos
       String [][]matriz = new String[3][10];
        matriz[0][0]="Kryzpo";
        matriz[0][1]="Alto en calorias";
        matriz[0][2]="Libre de sellos";
        matriz[0][3]="Libre de sellos";
        matriz[0][4]="Libre de sellos";
        matriz[0][5]="142kcal (7%)";
        matriz[0][6]="0,1g (0%)";
        matriz[0][7]="8,6g (16%)";
        matriz[0][8]="1,0g (5%)";
        matriz[0][9]="133mg (6%)";
        matriz[1][0]="Lays";
        matriz[1][1]="Alto en calorias";
        matriz[1][2]="Libre de sellos";
        matriz[1][3]="Libre de sellos";
        matriz[1][4]="Libre de sellos";
        matriz[1][5]="134g (6%)";
        matriz[1][6]="<0,2 (N/A)";
        matriz[1][7]="8,3g (15%)";
        matriz[1][8]="1,0g (5%)";
        matriz[1][9]="160mg (7%)";
        matriz[2][0]="Selz";
        matriz[2][1]="Alto en calorias";
        matriz[2][2]="Alto en grasas saturadas";
        matriz[2][3]="Libre sellos";
        matriz[2][4]="Alto en sodio";
        matriz[2][5]="169kcal (9%)";
        matriz[2][6]="2,3g (3%)";
        matriz[2][7]="8,3g (15%)";
        matriz[2][8]="2,3g (11%)";
        matriz[2][9]="309mg (13%)";
        return matriz;
    }
    public static String [][] cereales(){//productos de categoria no perecibles
         String [][]matriz = new String[3][10];
        matriz[0][0]="Chocapic";
        matriz[0][1]="Alto en calorias";
        matriz[0][2]="Libre de sellos";
        matriz[0][3]="Libre de sellos";
        matriz[0][4]="Libre de sellos";
        matriz[0][5]="112kcal (6%)";
        matriz[0][6]="5,0g (6%)";
        matriz[0][7]="1,5g (3)";
        matriz[0][8]="0,6g (3%)";
        matriz[0][9]="97mg (4%)";
        matriz[1][0]="Quaker cuadritos";
        matriz[1][1]="Alto en calorias";
        matriz[1][2]="Libre de sellos";
        matriz[1][3]="Libre de sellos";
        matriz[1][4]="Libre de sellos";
        matriz[1][5]="114kcal (6%)";
        matriz[1][6]="5,1g (N/A)";
        matriz[1][7]="1,5g (3%)";
        matriz[1][8]="0,3g (1%)";
        matriz[1][9]="103mg (4%)";
        matriz[2][0]="Fitness";
        matriz[2][1]="Libre de sellos";
        matriz[2][2]="Libre de sellos";
        matriz[2][3]="Libre de sellos";
        matriz[2][4]="Libre de sellos";
        matriz[2][5]="103kcal (5%)";
        matriz[2][6]="6,7g (7%)";
        matriz[2][7]="0,8g (1%)";
        matriz[2][8]="0,4g (2%)";
        matriz[2][9]="102mg (4%)";
        return matriz;
    }
    public static String leerString(){//le una cadena de tipo String
        Scanner leer = new Scanner(System.in);
        String cadena=leer.nextLine();
        return cadena;
    }
    public static void mostrarMatriz(String [][]matriz){//muestra una matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public static boolean existe(String producto,String [][]matriz){//valida si existe o no el producto en una matriz
    boolean existe=false;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) 
                if(formato(matriz[i][j]).equals(producto)){
                    existe=true;
                    break;
            }
        }
        return existe;
    }
    public static int indice(String producto,String [][]matriz){//me indica el indice donde se encuentra el producto
       int indice=-1;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(existe(producto,matriz) && producto.equals(formato(matriz[i][j]))){
                    indice=i;
                    break;
                }
            }
        }
        return indice;
    }
    public static void mostrarProducto(String producto,String [][]matriz,String [][]matriz1,String [][]matriz2){//muestra el producto junto a la informacion de sus etiqutas nutricionales
         if(indice(producto,matriz)!=-1){
            for (int i = 0; i < matriz[0].length; i++) {
                System.out.print(matriz[indice(producto,matriz)][i]+"\t");
            }
        }else
            if(indice(producto,matriz1)!=-1){
                for (int i = 0; i < matriz1[0].length; i++) {
                    System.out.print(matriz1[indice(producto,matriz1)][i]+"\t");
                }
        }else
            if(indice(producto,matriz2)!=-1){
                for (int i = 0; i < matriz2[0].length; i++) {
                    System.out.print(matriz2[indice(producto,matriz2)][i]+"\t");
                }
        }else
                    System.out.println("No existe el producto");
    }
    public static void mostrarCategoria(String [][]matriz,String [][]matriz1,String [][]matriz2){//muestra una categoria elegida por el usuario
        String opc;
        System.out.println();
        System.out.println("Elija categoria");
        System.out.println("1.-Aguas y Bebidas");
        System.out.println("2.-Snaks Salados");
        System.out.println("3.-Cereales");
        opc=leerString();
        switch(opc){
            case "1":
                mostrarMatriz(matriz);
                break;
            case "2":
                mostrarMatriz(matriz1);
                break;
            case "3":
                mostrarMatriz(matriz2);
                break;
            case "4":
                System.exit(0);
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
    }
    public static String formato(String producto){//da formato al String de entrada para tener coincidencia con los datos
        producto = producto.toLowerCase();
        producto = producto.replace(" ","");
        return producto;
    }
     public static void opciones(){//metodo tipo void que muestra las opciones de nuestro menu principal
        System.out.println("Ingrese opcion");
        System.out.println("1.- Buscar por nombre de producto");
        System.out.println("2.- Buscar y mostrar por categoria");
        System.out.println("3.- Salir");
    }
     public static void menu(){//metodo que nos permite utilizar una interfaz basica en consola a traves de un menu.
        String opc;
        do{
            opciones();
            opc=leerString();
            switch(opc){
                case "1":
                    System.out.println("Ingrese producto");
                    mostrarProducto(formato(leerString()),aguasYbebidas(),snackSalados(),cereales());
                    break;
                case "2":
                    mostrarCategoria(aguasYbebidas(),snackSalados(),cereales());
                    break;
                case "3":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }while(!opc.equals("3"));
    }*/
}
