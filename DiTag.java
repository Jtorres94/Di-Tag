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
        
    }
    public static String [][] aguasYbebidas(){//Productos de categoria aguas y bebidas
        String [][]matriz = new String[3][3];
        matriz[0][0]="Nombre";
        matriz[0][1]="Alto 1";
        matriz[0][2]="Alto 2";
        matriz[1][0]="Nombre1";
        matriz[1][1]="Alto 3";
        matriz[1][2]="Alto 4";
        matriz[2][0]="Nombre2";
        matriz[2][1]="Alto 5";
        matriz[2][2]="Alto 6";
        return matriz;
    }
    public static String [][] lacteos(){//productos de categoria lacteos
        String [][]matriz = new String[3][3];
        matriz[0][0]="Nombre";
        matriz[0][1]="Alto 1";
        matriz[0][2]="Alto 2";
        matriz[1][0]="Nombre1";
        matriz[1][1]="Alto 3";
        matriz[1][2]="Alto 4";
        matriz[2][0]="Nombre2";
        matriz[2][1]="Alto 5";
        matriz[2][2]="Alto 6";
        return matriz;
    }
    public static String [][] noPerecibles(){//productos de categoria no perecibles
        String [][]matriz = new String[3][3];
        matriz[0][0]="Nombre";
        matriz[0][1]="Alto 1";
        matriz[0][2]="Alto 2";
        matriz[1][0]="Nombre1";
        matriz[1][1]="Alto 3";
        matriz[1][2]="Alto 4";
        matriz[2][0]="Nombre2";
        matriz[2][1]="Alto 5";
        matriz[2][2]="Alto 6";
        return matriz;
    }
    public static String leerString(){//le una cadena de tipo String
        Scanner leer = new Scanner(System.in);
        String cadena=leer.nextLine();
        return cadena;
    }
    public static void mostrarCategoria(String [][]matriz){//muestra una matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public static boolean existe(String producto,String [][]matriz){//valida si existe o no el producto en una matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(matriz[i][j]==producto){
                    return true;
                }
            }
        }
        return false;
    }
    public static int indice(String producto,String [][]matriz){//me indica el indice donde se encuentra el producto
        int indice=-1;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(existe(producto,matriz)){
                    indice=i;
                }
            }
        }
        return indice;
    }
    public static void mostrarProducto(String [][]matriz){
        
    }
}
