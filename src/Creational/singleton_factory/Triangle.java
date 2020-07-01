/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creational.singleton_factory;

/**
 *
 * @author Admin
 */
public class Triangle extends Shape{

   

    public Triangle() {
    }

    public Triangle(String brush, String paper, String frame) {
        super(brush, paper, frame);
    }
    
    

    @Override
    public String draw() {
        return "ve hinh vuong";
    }
    private static Triangle intance;
    public static Triangle Intance(){
        if(intance == null)
            intance = new Triangle();
        return intance;
    }
    
    
}
