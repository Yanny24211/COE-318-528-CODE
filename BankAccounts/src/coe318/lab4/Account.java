/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab4;

/**
 *
 * @author yspatel
 */
public class Account {
   String accName;
   double accBalance;
   int accNumber;
   
   public Account(String name, int number, double balance){
       accName = name;
       accNumber = number;
       accBalance = balance;
   }
   
   public String getName(){
       return accName;
   }
   
   public int getNumber(){
       return accNumber;
   }
   
   public double getBalance(){
       return accBalance;
   }
   
   public boolean withdraw(double amount){
       if(amount >= accBalance){
           return false;
       }
       else if(amount <= 0){
           return false;
       }
       else{
           accBalance = accBalance - amount;
           return true;
       }
   }
   
   public boolean deposit(double amount){
       if(amount <= 0){
           return false;
       }
       else{
           accBalance = accBalance + amount;
           return true;
       }
   }
   @Override
    public String toString() {//DO NOT MODIFY
    return "(" + getName() + ", " + getNumber() + ", " +
    String.format("$%.2f", getBalance()) + ")";
}
}
