
package pe.edu.uni.app.servicess;

import javax.swing.JOptionPane;


public class ViaExitosService {
    public double ImporteTotal(int cantDias,int cantHoras,double pagoHoras){
        double total;
        total=(cantDias*cantHoras)*pagoHoras;
        return total;
        
    }
   public double ImporteRetenido(int cantDias,int cantHoras,double pagoHoras){
       double total,impRet = 0;
       total=(cantDias*cantHoras)*pagoHoras;
        if(total>1500){
            impRet=total*0.08;
        }else{
            impRet=0;
        }
       return impRet;
   } 
   
}
