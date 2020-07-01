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
public class Circle extends Shape{


    public Circle() {
    }

    public Circle(String brush, String paper, String frame) {
        super(brush, paper, frame);
    }
    
    @Override
    public String draw() {
        return "ve hinh tron";
    }
    private static Circle intance;
    public static Circle Intance(){
        if(intance==null)
            intance = new Circle();
        return intance;
    }
    
    
}
