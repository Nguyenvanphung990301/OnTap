/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioural.observer;

/**
 *
 * @author Admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ATM atm = new ATM();
        TaiKhoan taiKhoan = new TaiKhoan(2000000);
        atm.thietLapTaiKhoan(taiKhoan);
        atm.rutTien(1000000);
        atm.rutTien(2000000);
        // TODO code application logic here
    }
    
}
