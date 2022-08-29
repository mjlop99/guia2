
package ejercicio5;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Ejercicio5 {

   
    public static void main(String[] args) {
        int existenciaGalletas=50,existenciaMani=50,existenciasChurritos=50,existenciasSoda=50;//variables de existencias
        int compraGalletas = 0,compraMani=0,compraChurritos=0,compraSoda=0,compra;//variables que cantidad a comprar
        int galletasAcumuladas=0,maniAcumulado=0,sodaAcumulada=0,churritosAcumulados=0;//variables para acumular existencias en caso de comprar dos veces lo mismo
        int clienteId=1,comodin=2;
        boolean continuar=true;
        
        
        //declaramos variables tipo string donde guardamos informacion para facturacios
        //se han hecho varios espacion y tabs para darlo algo de formato a la cadena de texto de la factura
        String detalleCompra="Factura                                              Cliente: "+
                clienteId+"\nCant          descricion          precio          total",
                detalleCompraGalleta="",detalleCompraMani="",detalleComprachurritos="",detalleCompraSoda="";
        double totalPago=0.00;
        
        DecimalFormat df = new DecimalFormat("$#,##0.00");//objeto para dar formato a los precios
        
        do {     //bucle para preguntar sobre la compra       

            
            compra = Integer.parseInt(JOptionPane.showInputDialog( "Bienvenido contamos con los siguientes productos\n"
                    + "1. galletas disponemos -> "+(existenciaGalletas-galletasAcumuladas)+" a $0.15"+"\n2. sodas disponemos -> "+
                    (existenciasSoda-sodaAcumulada) + " a $0.50"+ "\n3. churritos disponemos -> "+(existenciasChurritos-churritosAcumulados)
                    +" a $0.10"+"\n4. mani disponemos -> "+(existenciaMani-maniAcumulado)+" a $0.25"+
                            "\n5. No deseo comprar nada"+"\n6. pagar productos selecionados"+
                            "\n__________________________________________________\ndetalle de productos selecionados"+
                    detalleComprachurritos+detalleCompraGalleta+detalleCompraMani+detalleCompraSoda+
                    "\nTotal a pagar                                              "+df.format(totalPago)
                    ));
            
                    switch (compra) {//introduccion de cantidad de items por articulo y verificamos si contamos con existencia
                case 1:
                    compraGalletas=Integer.parseInt(JOptionPane.showInputDialog("introduce la cantidad de galletas a comprar"));
                    if ((existenciaGalletas-galletasAcumuladas)==0){
                        JOptionPane.showMessageDialog(null, "No poseemos mas articulos de este producto, Por favor seleciona otro producto");
                        compraGalletas=0;
                    }else if ((compraGalletas+galletasAcumuladas)>existenciaGalletas) {//primer if para verificar si tenemos existencias de ese producto
                        JOptionPane.showMessageDialog(null, "No poseemos esa cantidad de galletas por favor ingresar una cantidad menor a: " +
                                (existenciaGalletas-galletasAcumuladas));
                        compraGalletas=0;
                    }else if (compraGalletas<0) {//segundo if para verificar que no compre negativamente
                        JOptionPane.showMessageDialog(null, "no puedes hacer compras negativas");
                    }
                    break;
                case 2:
                    compraSoda=Integer.parseInt(JOptionPane.showInputDialog("introduce la cantidad de sodas a comprar"));
                    if ((existenciasSoda-sodaAcumulada)==0){
                        JOptionPane.showMessageDialog(null, "No poseemos mas articulos de este producto, Por favor seleciona otro producto");
                        compraSoda=0;
                    }else if ((compraSoda+sodaAcumulada)>existenciasSoda) {//primer if para verificar si tenemos existencias de ese producto
                        JOptionPane.showMessageDialog(null, "No poseemos esa cantidad de galletas por favor ingresar una cantidad menor a: " +
                                (existenciasSoda-sodaAcumulada));
                        compraSoda=0;
                    }else if (compraSoda<0) {//segundo if para verificar que no compre negativamente
                        JOptionPane.showMessageDialog(null, "no puedes hacer compras negativas");
                    }
                    break;
                case 3:
                    compraChurritos=Integer.parseInt(JOptionPane.showInputDialog("introduce la cantidad de churitos a comprar"));
                    
                    if ((existenciasChurritos-churritosAcumulados)==0){
                        JOptionPane.showMessageDialog(null, "No poseemos mas articulos de este producto, Por favor seleciona otro producto");
                        compraChurritos=0;
                    }else if ((compraChurritos+churritosAcumulados)>existenciasChurritos) {//primer if para verificar si tenemos existencias de ese producto
                        JOptionPane.showMessageDialog(null, "No poseemos esa cantidad de galletas por favor ingresar una cantidad menor a: " +
                                (existenciasChurritos-churritosAcumulados));
                        compraChurritos=0;
                    }else if (compraChurritos<0) {//segundo if para verificar que no compre negativamente
                        JOptionPane.showMessageDialog(null, "no puedes hacer compras negativas");
                    }
                    break;
                case 4:
                    compraMani=Integer.parseInt(JOptionPane.showInputDialog("introduce la cantidad de mani a comprar"));
                    if ((existenciaMani-maniAcumulado)==0){
                        JOptionPane.showMessageDialog(null, "No poseemos mas articulos de este producto, Por favor seleciona otro producto");
                        compraMani=0;
                    }else if ((compraMani+maniAcumulado)>existenciaMani) {//primer if para verificar si tenemos existencias de ese producto
                        JOptionPane.showMessageDialog(null, "No poseemos esa cantidad de galletas por favor ingresar una cantidad menor a: " +
                                (existenciaMani-maniAcumulado));
                        compraMani=0;
                    }else if (compraMani<0) {//segundo if para verificar que no compre negativamente
                        JOptionPane.showMessageDialog(null, "no puedes hacer compras negativas");
                    }
                    break;    
                case 5://si el cliente se arrepiente de comprar o bien no desea comprar nada desde el principio
                    //preguntamos si otro cliente desea comprar
                    comodin=Integer.parseInt(JOptionPane.showInputDialog("desea otros clientes realizar otra compra\n1. si\n2. no"));
                    if (comodin!=1) {//termina programa
                    continuar=false;
                    } else {//en caso de continuar reiniciamos todas la variables de facturacion y aumentamos id para nuevo cliente
                    detalleCompra="Cliente: "+clienteId+"\nCant          descricion          precio          total";detalleCompraGalleta="";detalleCompraMani="";
                    detalleComprachurritos="";detalleCompraSoda="";
                    galletasAcumuladas=0;maniAcumulado=0;sodaAcumulada=0;churritosAcumulados=0;//borramos posibles datos del cliente que no compro 
                    continuar=true;
                    }
                    JOptionPane.showMessageDialog(null, "muchas gracias, vuelva pronto");
                    break;
                case 6://el cliente paga en caso de haber elegido algun producto en caso de no haber elejido algun producto se cierra el programas
                    if(galletasAcumuladas==0 && sodaAcumulada==0 && maniAcumulado==0 && churritosAcumulados==0) {
                        JOptionPane.showMessageDialog(null, "No haz selecionado ninguna articulo");
                    }else{
                        //al selecionar la opcion automaticamente cancela las compras por lo que podemos disminuir el inventario y reiniciar las variables
                    //de compra acumulada
                    existenciasChurritos-=churritosAcumulados;existenciaGalletas-=galletasAcumuladas;existenciaMani-=maniAcumulado;existenciasSoda-=sodaAcumulada;
                    galletasAcumuladas=0;maniAcumulado=0;sodaAcumulada=0;churritosAcumulados=0;
                    //mostramos factura
                    JOptionPane.showMessageDialog(null, detalleCompra+detalleComprachurritos+detalleCompraGalleta+detalleCompraMani+detalleCompraSoda
                    +"\nTotal a pagar                                              "+df.format(totalPago));
                    //preguntamos si otro cliente desea comprar
                    comodin=Integer.parseInt(JOptionPane.showInputDialog("desea otros clientes realizar otra compra\n1. si\n2. no"));
                    if (comodin!=1) {//termina programa
                    continuar=false;
                    } else {//en caso de continuar reiniciamos todas la variables de facturacion y aumentamos id para nuevo cliente
                    clienteId++;
                    detalleCompra="Factura                                              Cliente: "+clienteId+
                            "\nCant          descricion          precio          total";detalleCompraGalleta="";
                    detalleCompraMani="";detalleComprachurritos="";detalleCompraSoda="";
                    continuar=true;
                    }
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "tu opcion es invalida, porfavor introduce alguna de la opciones correspondientes la proxima vez");
                    continuar= false;
            }
                    
                    //verificacmos si seleciono alguna compra en los pasos anteriores se verifico que ninguna compra puede ser negativa
                    //o que podemos realizar compras mas halla de nuestroinventario 
        if (compraChurritos>0 || compraGalletas>0 || compraMani>0 || compraSoda>0) {
            //detallamos cada item
            if (compraChurritos>0) {
                churritosAcumulados+=compraChurritos;//la variables de acumulacion sirven para acumular las entradas de datos de un mismo productos
                //ya que el usuarios puede compra el mismo articulo 1 o mas veces seguidas siempre que se cuente con existencias
                detalleComprachurritos="\n"+churritosAcumulados+"                  churritos"+"         $0.10              "+df.format(0.10*churritosAcumulados);
            }
            if (compraGalletas>0) {
                galletasAcumuladas+=compraGalletas;
                detalleCompraGalleta="\n"+galletasAcumuladas+"                  galletas"+"           $0.15              "+df.format(0.15*galletasAcumuladas);
                
            }
            if (compraMani>0) {
                maniAcumulado+=compraMani;
                detalleCompraMani="\n"+maniAcumulado+"                  mani"+"                 $0.25              "+df.format(0.25*maniAcumulado);
            }
            if (compraSoda>0) {
                sodaAcumulada+=compraSoda;
                detalleCompraSoda="\n"+sodaAcumulada+"                  soda"+"                 $0.50              "+df.format(0.5*sodaAcumulada);
            }
        }
        
        //al volver a iterar reiniciamos las variable de pregunta y sacamos total de articulos selecionados
        totalPago=(0.10*churritosAcumulados)+(0.15*galletasAcumuladas+(0.25*maniAcumulado)+(0.5*sodaAcumulada));
        compraGalletas = 0;compraMani=0;compraChurritos=0;compraSoda=0;
        
        //validacion para cerrar el programa en caso de que no haya inventario
            if (existenciaGalletas==0 && existenciaMani==0 && existenciasChurritos==0 &&existenciasSoda==0) {
                JOptionPane.showMessageDialog(null, "Por el momentos no tenemos mercaderia, gracias");
                continuar=false;
            }
        } while (continuar);
        
    }
    
}
