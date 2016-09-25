/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package di.tag;

import java.util.Scanner;

/**
 *
 * @author Javier
 */
public class DiTag {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        menu();
    }
    public static String [][] aguasYBebidas(){//Productos de categoria aguas y bebidas
        String [][]matriz = new String[3][10];
        matriz[0][0]="crush";
        matriz[0][1]="Libre de sellos";
        matriz[0][2]="libre de Sellos";
        matriz[0][3]="Alto en Azucares";
        matriz[0][4]="Libre de sellos";
        matriz[0][5]="104kcal (5%)";
        matriz[0][6]="26g (29%";
        matriz[0][7]="0 (0%)";
        matriz[0][8]="0 (0%)";
        matriz[0][9]="12mg (1%)";
        matriz[1][0]="pure life";
        matriz[1][1]="Libre de sellos";
        matriz[1][2]="Libre de sellos";
        matriz[1][3]="Libre de sellos";
        matriz[1][4]="Libre de sellos";
        matriz[1][5]="0kcal (0%)";
        matriz[1][6]="0g (0%)";
        matriz[1][7]="0 (0%)";
        matriz[1][8]="0 (0%)";
        matriz[1][9]="2mg (0%)";
        matriz[2][0]="cocacola zero";
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
    public static String [][] lacteos(){//productos de categoria lacteos
       String [][]matriz = new String[3][10];
        matriz[0][0]="nombre 4";
        matriz[0][1]="Alto 1";
        matriz[0][2]="Alto 2";
        matriz[0][3]="Alto 3";
        matriz[0][4]="Alto 4";
        matriz[0][5]="Calorias";
        matriz[0][6]="Azucares totales";
        matriz[0][7]="Grasas totales";
        matriz[0][8]="Grasas saturadas";
        matriz[0][9]="Sodio";
        matriz[1][0]="nombre 5";
        matriz[1][1]="Alto 1";
        matriz[1][2]="Alto 2";
        matriz[1][3]="Alto 3";
        matriz[1][4]="Alto 4";
        matriz[1][5]="Calorias";
        matriz[1][6]="Azucares totales";
        matriz[1][7]="Grasas totales";
        matriz[1][8]="Grasas saturadas";
        matriz[1][9]="Sodio";
        matriz[2][0]="nombre 6";
        matriz[2][1]="Alto 1";
        matriz[2][2]="Alto 2";
        matriz[2][3]="Alto 3";
        matriz[2][4]="Alto 4";
        matriz[2][5]="Calorias";
        matriz[2][6]="Azucares totales";
        matriz[2][7]="Grasas totales";
        matriz[2][8]="Grasas saturadas";
        matriz[2][9]="Sodio";
        return matriz;
    }
    public static String [][] noPerecibles(){//productos de categoria no perecibles
         String [][]matriz = new String[3][10];
        matriz[0][0]="nombre 7";
        matriz[0][1]="Alto 1";
        matriz[0][2]="Alto 2";
        matriz[0][3]="Alto 3";
        matriz[0][4]="Alto 4";
        matriz[0][5]="Calorias";
        matriz[0][6]="Azucares totales";
        matriz[0][7]="Grasas totales";
        matriz[0][8]="Grasas saturadas";
        matriz[0][9]="Sodio";
        matriz[1][0]="nombre 8";
        matriz[1][1]="Alto 1";
        matriz[1][2]="Alto 2";
        matriz[1][3]="Alto 3";
        matriz[1][4]="Alto 4";
        matriz[1][5]="Calorias";
        matriz[1][6]="Azucares totales";
        matriz[1][7]="Grasas totales";
        matriz[1][8]="Grasas saturadas";
        matriz[1][9]="Sodio";
        matriz[2][0]="nombre 9";
        matriz[2][1]="Alto 1";
        matriz[2][2]="Alto 2";
        matriz[2][3]="Alto 3";
        matriz[2][4]="Alto 4";
        matriz[2][5]="Calorias";
        matriz[2][6]="Azucares totales";
        matriz[2][7]="Grasas totales";
        matriz[2][8]="Grasas saturadas";
        matriz[2][9]="Sodio";
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
                if((formato(matriz[i][j]).equals(producto)){
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
                if(existe(producto,matriz) && producto.equals(matriz[i][j])){
                    indice=i;
                    break;
                }
            }
        }
        return indice;
    }
    public static void mostrarProductoString producto,String [][]matriz,String [][]matriz1,String [][]matriz2){//muestra el producto junto a la informacion de sus etiqutas nutricionales
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
        System.out.println("2.-Lacteos");
        System.out.println("3.-No perecibles");
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
                    mostrarProducto(formato(leerString()),aguasYbebidas(),lacteos(),noPerecibles());
                    break;
                case "2":
                    mostrarCategoria(aguasYbebidas(),lacteos(),noPerecibles());
                    break;
                case "3":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }while(!opc.equals("3"));
    }
}
