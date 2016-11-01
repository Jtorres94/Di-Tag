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
public class Menu {
    Usuario usuario = new Usuario();
    Admin administrador = new Admin("Javier","18730377k");
    Archivo archivo = new Archivo();
    
    private void menuAdmin(){
        String opc;
        do{
            System.out.println("1.- Mostrar lista completa de productos");
            System.out.println("2.- Agregar Productos");
            System.out.println("3.- Eliminar productos");
            System.out.println("4.- Salir");
            opc=archivo.leerString();
            switch(opc){
                case "1":
                    administrador.mostrarTodo();
                    break;
                case "2":
                    administrador.agregarProducto();
                    break;
                case "3":
                    administrador.eliminarProducto();
                    break;
                case "4":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion no valida, Ingrese una opcion valida por favor");
            }
        }while(opc!="4");
    }
    
    public void menu(){
        String opc;
        do{
            System.out.println("Ingrese opcion");
            System.out.println("1.- Menu admin");
            System.out.println("2.- Buscar por Producto");
            System.out.println("3.- Buscar por categoria");
            System.out.println("4.- Salir");
            opc = archivo.leerString();
            switch(opc){
                case "1":
                    System.out.println("Ingrese id y luego contraseña");
                    if(archivo.leerString().equals(administrador.getId()) && archivo.leerString().equals(administrador.getPassword())){
                        menuAdmin();
                    }else{
                        System.out.println("Id o Contraseña incorrecta");
                    }
                    break;
                case "2":
                    usuario.buscarProducto();
                    break;
                case "3":
                    usuario.buscarCategoria();
                    break;
                case "4":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion no valida, Ingrese una opcion valida por favor");
                    break;
            }
        }while(opc!="4");
    }
}
