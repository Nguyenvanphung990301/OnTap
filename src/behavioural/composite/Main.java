/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioural.composite;

/**
 *
 * @author Admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Khoa root = new BoMon("Toan");
        root.add(new GiangVien("Nguyen Van Phung"));
        System.out.print(root.getTreeFolder());
        // TODO code application logic here
    }
    
}
