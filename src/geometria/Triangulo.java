/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometria;

/**
 *
 * @author CBN
 */
public class Triangulo extends Figura {
    public double area, perimetro;
    
    public Triangulo (double base , double altura){
        super(base, altura);
        
    }
    
    public String mostrar2(){
        
        
        String resultados;
        perimetro = Math.pow((Math.pow(base,2)+Math.pow(altura, 2)),2);
        
        area=(resultado())/2;
        
        resultados="El area del triangulo es: "+area+"\n"+
                    "El perimetro del triangulo es: "+perimetro;
        
        return resultados;
    }
    
    
    
    
}
