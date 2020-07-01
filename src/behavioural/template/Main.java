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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien(01,"Nguyen Van Phung","CNTT2");
         SinhVien sv2 = new SinhVien(02,"Nguyen Van Phun","CNTT2");
          SinhVien sv3 = new SinhVien(03,"Nguyen Van Phu","CNTT2");
           SinhVien sv4 = new SinhVien(04,"Nguyen Van Ph","CNTT2");
            SinhVien sv5 = new SinhVien(05,"Nguyen Van P","CNTT2");
             SinhVien sv6 = new SinhVien(06,"Nguyen Van ","CNTT2");
        EntityDB<SinhVien> entityDB = new SinhVienDB();
        entityDB.add(sv1);
        entityDB.add(sv2);
        entityDB.add(sv3);
        entityDB.add(sv4);
        entityDB.add(sv5);
        entityDB.add(sv6);
        System.out.println(entityDB.toString());
        
        // TODO code application logic here
    }
    
}
