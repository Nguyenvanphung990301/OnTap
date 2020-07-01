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
public class ATM {
    public static interface ATMobserver{
        boolean kiemTraSoDu(int soTienRut);
        void nhanThongBao(int soTienDaRut,String thongBao);
    }
    ATMobserver observer;
    private boolean kiemTraTienRut(int soTienRut){
        return observer.kiemTraSoDu(soTienRut);
    }
    public void rutTien(int soTien){
        if(kiemTraTienRut(soTien))
            observer.nhanThongBao(soTien, "Giao dich thanh cong");
        else
            observer.nhanThongBao(0, "Giao dich khong thanh cong");
    }
    public void thietLapTaiKhoan(ATMobserver observer){
        this.observer = observer;
    }
    
}
