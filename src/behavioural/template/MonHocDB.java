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
public class MonHocDB extends EntityDB<MonHoc>{

    @Override
    protected MonHoc findById(int id) {
        
        for(MonHoc monhoc:list){
            if(id==getKey(monhoc))
            {
                return monhoc;
            }
        }
        return null;
    }

    @Override
    protected int getKey(MonHoc mh) {
        return mh.getMaMH();
    }
    
    
}
