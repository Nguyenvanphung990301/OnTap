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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape rectangle = shapeFactory.createShape(ShapeType.Rectangle);
        rectangle.setBrush("Muc");
        rectangle.setPaper("Giay");
        rectangle.setFrame("co");
        System.out.print(rectangle.draw()+rectangle.toString());
    }
    
}
