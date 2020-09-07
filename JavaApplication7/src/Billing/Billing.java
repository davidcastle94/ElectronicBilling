/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Billing;

import Model.Customer;
/**
 *
 * @DSLC
 */
public class Billing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Customer c1 = new Customer("David ", 801180584);  
        
        System.out.print(c1.toString());
        System.out.print("Hello work- how are you");
        
        
    }
    
}
