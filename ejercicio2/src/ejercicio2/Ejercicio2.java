
package ejercicio2;

import javax.swing.JOptionPane;
public class Ejercicio2 {

   
    public static void main(String[] args) {
        String contra = JOptionPane.showInputDialog("Escriba su nueva contraseña"),intento;
        int i =1;
        do {            
            intento = JOptionPane.showInputDialog("ingrese su contraseña");
            if (contra.equals(intento)) {
                i=3;
                JOptionPane.showMessageDialog(null, "la contraseña es correcta");
            }else if(i>=3){
            JOptionPane.showMessageDialog(null, "has intentado 3 veces, has alcanzado el limite de intentos");
            }else if (contra != intento) {
                JOptionPane.showMessageDialog(null, "contraseña incorrecta por favor interntar nuevamentes");
            }
            i++;
        } while (i<=3 && intento!=contra);
        
        
        
    }
    
}
