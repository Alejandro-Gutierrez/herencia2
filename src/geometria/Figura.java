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
public abstract class Figura {
    protected double base, altura;
    
    public Figura(double base , double altura){
        this.base=base;
        this.altura=altura;
        
    }
    
    public double resultado(){
        double area;
        area=(base*altura);
        return area;
    }
    
}
