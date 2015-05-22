/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package java2assignment1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author c0653400
 */
public class Orders {
      int customerId;
    String customerName;
    String timeReceived;
    String timeProcessed;
    String timeFulfilled;
    Map<Integer,Integer> productId_quantity=new LinkedHashMap<>();
    String notes;
    
    public Orders(){
        this.customerId=0;
        this.customerName="";
        this.timeProcessed="";
        this.timeFulfilled="";
        this.notes="";
    }
    
    public Orders(int customerId,String customerName){
        this.customerId=customerId;
        this.customerName=customerName;
        this.setTimeReceived();
        this.timeProcessed="";
        this.timeFulfilled="";
        this.notes="";
    }
    
    public void setCustomerId(int customerId){
        this.customerId=customerId;
        this.setTimeReceived();
    }
    
    public int getCustomerId(){
        return this.customerId;
    }
    
    public void setCustomerName(String customerName){
        this.customerName=customerName;
        this.setTimeReceived();
    }
    
    public String getCustomerName(){
        return this.customerName;
    }
    
    public void setTimeReceived(){
        DateFormat formatter=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        this.timeReceived=formatter.format(new Date()).toString();
    }
    
    public String getTimeReceived(){
        return this.timeReceived;
    }
    
    public void setTimeProcessed(){
        DateFormat formatter=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        this.timeProcessed=formatter.format(new Date()).toString();
    }
    
    public String getTimeProcessed(){
        return this.timeProcessed;
    }
    
    public void setTimeFullFilled(){
        DateFormat formatter=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        this.timeFulfilled=formatter.format(new Date()).toString();
    }
    
    public String getTimeFullFilled(){
        return this.timeFulfilled;
    }
    
    public void setListOfPurchase(Integer productId,Integer quantity){
        productId_quantity.put(productId, quantity);
    }
    
    public Map<Integer,Integer> getListOfPurchase(){
        return this.productId_quantity;
    }
    
    public void setNotes(String notes){
        this.notes=notes;
    }
    
    public String getNotes(){
        return this.notes;
    }
    
    
}
