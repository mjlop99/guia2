
package ejercicio1;

import javax.swing.JOptionPane;
public class Ejercicio1 {

    
    public static void main(String[] args) {
        int numeroDeFila=0;
        String triangulo="";
        do {
        numeroDeFila = Integer.parseInt(JOptionPane.showInputDialog("mostrar el numero de filas del triengulo"));
            if (numeroDeFila<=0) {
                JOptionPane.showConfirmDialog(null, "numero de filas invalido, porfavor ingresar un numero mayor a cero");
            }else{
            
                for (int i = 1; i<=numeroDeFila; i++) {
                    triangulo+="*";
                    System.out.println(triangulo);
                }
                for (int i = numeroDeFila; i>0; i--) {
                    triangulo=triangulo.substring(1);
                    System.out.println(triangulo);
                }
            
            }
        } while (numeroDeFila<=0);
    }
    
}
