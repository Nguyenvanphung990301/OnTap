/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioural.template;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public abstract class EntityDB<T> {
    ArrayList<T> list = new ArrayList<>();
    public boolean add(T t){
        int id = getKey(t);
        T item = findById(id);
        if(item == null)
        {
            list.add(t);//neu chua co id trong mang thi add id do vao list
            return true;
        }
        else
        {
            return false;
        }
        
        
    }
    public int update(T t){
        int id = getKey(t);
        T item = findById(id);
        if(item != null)
        {
           
            list.remove(item);// xoa id da co trong mang
            list.add(t);//add id moi vao mang la bien t
            return 1;
        }
        else
        {
            return 0;
        }
    }
    public int delete(T t){
        int id = getKey(t);// gans id = id nhap vao
        T item = findById(id);// tim id nhap vao cho no bang item
        if(item != null){
            list.remove(item);
            return 1;
        }
        else
        {
            return 0;
        }
        
    }
    protected abstract T findById(int  id);
    public int deleteByKey(int id){
        return 1;
    }
    protected abstract int getKey(T t);

    @Override
    public String toString() {
        return "EntityDB{" + "list=" + list + '}';
    }
    
    
    
    
}
