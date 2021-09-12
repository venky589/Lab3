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
import java.util.Scanner;
public class Account {
    Scanner sc= new Scanner(System.in);
    private int number;

    private double balance;

    private String customerName;
    private String customerPhone;
    public Account(){
        System.out.println("Empty constructor called");
        System.out.println();
    }
    
     public Account(int number,double balance,String customerName,String customerPhone){
        System.out.println("Account constructor with parameters called");
        this.number=number;
         System.out.println("number: "+number);
        this.balance=balance;
        System.out.println("balance: "+balance);
        this.customerName=customerName;
        System.out.println("customerName: "+customerName);
        this.customerPhone=customerPhone;
        System.out.println("customerPhone: "+"("+customerPhone+")");
         System.out.println();
    }
     public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }
    public void deposit( double deposit){
        //System.out.println("Enter how much you want to deposit: ");
       // double deposit=sc.nextDouble();
        balance=getBalance()+deposit;
        System.out.println("Deposit of "+deposit+" made. "+"New balance is "+balance);
        // System.out.println();
    }
     
    public void withdrawal(double withdrawAmt){
       // System.out.println("Enter how much you want to withdrawal: ");
       // double withdrawAmt=sc.nextDouble();
        balance-=withdrawAmt;
        System.out.println("withdrawal of "+withdrawAmt+" processed ,Remaining balance = "+(balance));
     System.out.println();
    }
     @Override
    public String toString() {
         System.out.println("To String called");
         System.out.println( "Account{" + "number=" + number + ", balance=" + balance + ", customerName=" + customerName + ", customerPhone=" +"("+ customerPhone +")"+ "}");
     
        return "Account{" + "number=" + number + ", balance=" + balance + ", customerName=" + customerName + ", customerPhone=" +"("+ customerPhone +")"+ "}";
        
    
    
    }
   
}
    

