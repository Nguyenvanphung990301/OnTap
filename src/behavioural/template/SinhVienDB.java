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
public class SinhVienDB extends EntityDB<SinhVien>{
  

 

    @Override
    protected SinhVien findById(int id) {
          for(SinhVien sinhVien: list){
            if(id==getKey(sinhVien)){
                return sinhVien;
            }
            
        }
        return null;
    }

    @Override
    protected int getKey(SinhVien t) {
         return t.getMaSV();
    }
    public String toString(){
        String str="";
        for(SinhVien sv:list){
            str +="MaSV:"+sv.getMaSV()+"\n";
        }
        return str;
    }
    
    
}
