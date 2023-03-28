/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab7;
import java.util.ArrayList;
import java.util.Scanner; 

/**
 *
 * @author Yanny
 */
public class UserMain implements UserInterface{
    String input = ""; 
    ArrayList<Object> element = new ArrayList<>(); 
    Scanner userIn = new Scanner(System.in); 
    
    public void run(){
        while(true){
            input = userIn.nextLine().trim(); 
            
            if(input.equalsIgnoreCase("end")){
                end(); 
                break; 
            }
            else if(input.equalsIgnoreCase("spice")){
                spice(); 
            }
            
            else{
                String[] parts = input.split(" "); 
                
                if(parts.length != 4){
                    System.out.println("Please review your input and try again!");
                }
                else if(input.toLowerCase().startsWith("r")){
                    double tempval; 
                    Node n1 = new Node(); 
                    Node n2 = new Node(); 
                    
                    n1.nodeId = Integer.parseInt(parts[1]); 
                    n2.nodeId = Integer.parseInt(parts[2]); 
                    tempval = Double.parseDouble(parts[3]); 
                    
                    Resistor r = new Resistor(tempval, n1, n2); 
                    
                    element.add(r); 
                }
                else{
                    if(input.toLowerCase().startsWith("v")){
                        double tempval; 
                        Node n1 = new Node(); 
                        Node n2 = new Node();
                        
                        n1.nodeId = Integer.parseInt(parts[1]); 
                        n2.nodeId = Integer.parseInt(parts[2]); 
                        tempval = Double.parseDouble(parts[3]); 

                        Voltage v = new Voltage(tempval, n1, n2); 

                        element.add(v);
                    }
                }
            }
        }
    }
    
    public void spice(){
        for(Object o: element){
        System.out.println(o); 
        }
    }
    
    public void display(){
        System.out.println("Input: "); 
    }
    
    public void start(){
        display(); 
        run(); 
    }
    
    public void end(){
        System.out.println("Program Done executing"); 
        
    }
    
    public static void main(String[] args){
        UserMain m = new UserMain(); 
        m.start(); 
    }
}
