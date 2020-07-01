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
public class ShapeFactory {
    Shape shape;
    public Shape createShape (ShapeType shapeType){
        switch(shapeType){
            case Rectangle: return shape = Rectangle.Intance();
             case Triangle: return shape = Triangle.Intance();
              case Circle: return shape = Circle.Intance();
            
        }
        return null;
    }
    
}
