/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author S545233
 */
public class Bank {
    public static void main(String args[]){
    Account a1=new Account();
    
    a1.getBalance();
     Account a2=new Account(12345,150.0,"James Harden","666-278-567");
     a2.getNumber();
     a2.getCustomerName();
     a2.getBalance();
     a2.getCustomerPhone();
     a2.deposit(100.0); 
     a2.withdrawal(50.0);
     a2.toString();
     //System.out.println(a2);
 
}
}
