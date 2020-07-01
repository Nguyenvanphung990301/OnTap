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
public class PheDuyet {
    String nguoi;
    float from;
    PheDuyet next;

    public PheDuyet(String nguoi, float from) {
        this.nguoi = nguoi;
        this.from = from;
    }

    public PheDuyet setNext(PheDuyet next) {
        this.next = next;
        return next;
    }
    public String getTien(float tien){
        if(tien>=this.from)
            return this.nguoi + this.from;
            return this.next.getTien(tien);
                    
    }
    
    
}
