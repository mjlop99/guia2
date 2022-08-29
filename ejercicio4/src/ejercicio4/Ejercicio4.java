
package ejercicio4;
import javax.swing.JOptionPane;
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int pedirNumero,numeroMayor=0,NumeroMenor=0,sumaPositivos=0,sumaNegativos=0,media=0,cantidadIngresada=1;
        
        do {            
            pedirNumero=Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero diferente a -1"));
//            calcular numero mayor
            if (pedirNumero>numeroMayor && pedirNumero!=-1) {
                numeroMayor=pedirNumero;
            }
//            calculo de numero menor

            if (pedirNumero<NumeroMenor && pedirNumero!=-1) {
                NumeroMenor=pedirNumero;
            }
//            calculo de suma positivos
            if (pedirNumero>=0 && pedirNumero!=-1) {
                sumaPositivos+=pedirNumero;
            }
//            calculo de suma negativos
            if (pedirNumero<-1 && pedirNumero!=-1) {
                sumaNegativos+=pedirNumero;
            }
//            calculo de media
            if (pedirNumero!=-1) {
                media=(sumaPositivos+sumaNegativos)/cantidadIngresada;
            cantidadIngresada++;
            System.out.println(cantidadIngresada);
            }
        } while (pedirNumero!=-1);
        JOptionPane.showMessageDialog(null, "el numero mayor es : "+ numeroMayor+ "\nel numero menor es : "+NumeroMenor
                +"\nla suma de positivos es: "+sumaPositivos+ "\nla suma de negaticos es : "+ sumaNegativos + "\nla media es : "+media);
    }
    
}
