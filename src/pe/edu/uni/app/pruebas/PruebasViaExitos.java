
package pe.edu.uni.app.pruebas;

import pe.edu.uni.app.servicess.ViaExitosService;


public class PruebasViaExitos {
    public static void main(String[] args) {
        //variables
        int cantHoras,cantdias;
        double PagoHoras,importeRet ,totalImport,Sueldo;
        //datos
        cantdias=60;
        cantHoras=8;
        PagoHoras=5;
        //proceso
        ViaExitosService ves=new ViaExitosService();
        totalImport=ves.ImporteTotal( cantdias,cantHoras, PagoHoras);
        importeRet=ves.ImporteRetenido(cantdias,cantHoras,  PagoHoras);
        Sueldo=totalImport-importeRet;
        //salida
        System.out.println("Importe Sueldo Total Para el trabajador :"+totalImport);
        System.out.println("Importe de impuesto retenido "+ importeRet);
        System.out.println("Sueldo a Recibir :"+Sueldo);
        
    }
}
