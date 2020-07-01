/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioural.chain_of_responsibility;

/**
 *
 * @author Admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PheDuyet pheDuyet1 = new PheDuyet("Chu tich", 10000000);
        PheDuyet pheDuyet2 = new PheDuyet("Giam doc", 8000000);
        PheDuyet pheDuyet3 = new PheDuyet(" truong phong", 5000000);
        PheDuyet pheDuyet4 = new PheDuyet("Pho truong phong", 1000000);
                pheDuyet1.setNext(pheDuyet2)
                        .setNext(pheDuyet3)
                        .setNext(pheDuyet4);
         System.out.println(pheDuyet1.getTien(11000000));



        
    }
    
}
