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
public class Rectangle extends Shape{


    public Rectangle(String brush, String paper, String frame) {
        super(brush, paper, frame);
    }

    public Rectangle() {
    }

    @Override
    public String draw() {
       return "Ve hinh chu nhat";
    }
   
        private static Rectangle intance;
        public static Rectangle Intance(){
            if(intance == null)
                intance = new Rectangle();
            return intance;
        }   
}
