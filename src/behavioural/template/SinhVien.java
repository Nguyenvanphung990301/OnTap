/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioural.template;

/**
 *
 * @author Admin
 */
public class SinhVien {
    private int maSV;
    private String tenSV;
    private String lop;

    public SinhVien(int maSV, String tenSV, String lop) {
        this.maSV = maSV;// ma sv bang ma sv nhap vao
        this.tenSV = tenSV;
        this.lop = lop;
    }

    public int getMaSV() {
        return maSV;
    }
    
    
}
