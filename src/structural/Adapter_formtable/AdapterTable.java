/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structural.Adapter_formtable;

import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Admin
 */
public class AdapterTable {
    public static TableModel listAdapter(ArrayList<SinhVien> listSV){
        DefaultTableModel tableModel =null;
        Vector data = new Vector();
        Vector header = new Vector<>();
        for (SinhVien sv:listSV){
            Vector row = new Vector();
            row.add(sv.ten);
            row.add(sv.ngaySinh);
            row.add(sv.diaChi);
            data.add(row);
            
        }
        header.add("ten");
        header.add("ngay sinh");
        header.add("dia chi");
        tableModel = new DefaultTableModel(data,header);
        return tableModel;
        
        
    }
}
