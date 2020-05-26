/*
Implementar un algoritomo que me permita ingresar por teclado el nombre del 
estudiante, la carrera a la pertenese, indicar la fecha en la que se encuentra,
indicar sisque conoce la plataforma github, indicar caracteristicas, ventajas, 
desventajas, y un mensaje de salida.
 */
package caracteristicasdelgithub;

/**
 *
 * @author Aguaiza Quimbita Jonathan Fabricio
 */
import java.util.Scanner;
public class CaracteristicasDelGithub {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner objeto=new Scanner(System.in);
                //new, reserva espacio de memoria
        
        System.out.println("            UNIVEIRSIDAD DE LAS FUERZAS ARMADAS ESPE");
        System.out.println("NOMBRE: AGUAIZA JONATHAN                   Carrera: Ing Automotriz");
        
        System.out.println("Escriba caracteristica 1");
        String c1=objeto.nextLine();
        
        System.out.println("Escriba caracteristica 2");
        String c2=objeto.nextLine();
        
        System.out.println("Escriba caracteristica 3");
        String c3=objeto.nextLine();
        
        System.out.println("MUCHAS GRACIAS POR SU PARTICIPACIÓN");
        
    }
    
}
