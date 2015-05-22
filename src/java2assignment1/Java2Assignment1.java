/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2assignment1;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author c0651609
 */
public class Java2Assignment1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String customerId;
        String customerName;
        Date timeReceived;
        Date timeProcessed;
        Date timeFulfilled;
        String notes;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Customer Id");
        customerId = sc.nextLine();
        System.out.println("Enter Customer Name");
        customerName = sc.nextLine();
        System.out.println("Enter Notes");
        notes = sc.nextLine();

        Order order = new Order(customerId, customerName);
        
        try {
            if (order.getCustomerId().equals("") || order.getCustomerName().equals("")) {
                throw new RuntimeException("Customer Id or Name Does not Exists");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        
        Purchase purchase= new Purchase("", quantity)
        

    }

}
