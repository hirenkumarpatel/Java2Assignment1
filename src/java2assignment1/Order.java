/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package java2assignment1;

/**
 *
 * @author c0651609
 */
public class Order {
    String customerId;
    String customerName;
    String timeReceived;
    String timeProcessed;
    String timeFulfilled;
    //List<String> listOfPurchases;
    String notes;
    
    public void setCustomerId(String newCustomerId)
    {
        this.customerId=newCustomerId;
    }
    public String getCustomerId()
    {
        return this.customerId;
    }
    public void setCustomerName(String newCustomerName)
    {
        this.customerName=newCustomerName;
    }
    public String getCustomerName()
    {
        return this.customerName;
    }
    public void setTimeReceived(String newTimeReceived)
    {
        this.timeReceived=newTimeReceived;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
    public String getTimeReceived()
    {
        return this.timeReceived;
    }
    
    public String getTimeProcessed()
    {
        return this.timeProcessed;
    }
    public void setTimeProcessed(String newTimeProcessed)
    {
        this.timeProcessed=newTimeProcessed;
    }
    public void setTimeFulfilled(String newTimeFulfilled)
    {
        this.timeFulfilled=newTimeFulfilled;
    }
    public String getTimeFulfilled()
    {
        return this.timeFulfilled;
    }
    //public void setNotes(String newNote)
}
