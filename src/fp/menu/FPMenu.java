/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fp.menu;
import java.util.*;
/**
 *
 * @author Alumno
 */
public class FPMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("La opción elegida es: "+menu());
    }
    
    public static int menu(){
        int opcion;
        do{
            Scanner entrada = new Scanner(System.in);
            System.out.println("**** Cálculo de áreas ****");
            System.out.println("**** Menú: ****");
            System.out.println("Introduzca la opción deseada: ");
            System.out.println("1. Área de cuadrados");
            System.out.println("2. Área de círculos");
            System.out.println("3. Área de triángulos");
            System.out.println("0. Salir");
            opcion=entrada.nextInt();
            
        }while (opcion<0 || opcion >3);
        return opcion;
    }    
    
   public static float calculaArea(int opcion){
       float area;
       switch (opcion){
           case 1:
               area = areaCuadrado();
               break;
           case 2:
               area = areaCirculo();
               break;
           case 3:
               area = areaTriangulo();
               break;
           default:
               mensajeSalida();
       }
       return area;
   }
   
}
