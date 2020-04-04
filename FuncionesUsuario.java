



public class FuncionesUsuario {
    
    
    public int calcularImpuesto(int edad, int cantHijos){
        int impuesto =0;
        int porcentajeImpuesto = 0;
        if(edad<18){
            impuesto = 0;
        }
        if (edad >= 18 && edad <30){
            impuesto = 2000;
        }
        if (edad >= 30 && edad<65){
            impuesto = 2000;
        }
        if(edad>= 65){
            impuesto = 2000;
        }
        
        if(cantHijos*3 > 50){
            impuesto = impuesto/2;
           
        }else{
            porcentajeImpuesto = 100 - cantHijos*3;
            impuesto = porcentajeImpuesto*impuesto/100;
           
        }
        
        return impuesto;
    }  
    
     
}
