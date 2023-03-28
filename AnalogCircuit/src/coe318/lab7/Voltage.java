/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab7;

/**
 *
 * @author Yanny
 */
public class Voltage {
    private double voltage; 
    private Node nodeOne; 
    private Node nodeTwo; 
    private int id; 
    private static int count =1; 
    
    public Voltage(double voltage, Node n1, Node n2){
        nodeOne = n1; 
        nodeTwo = n2; 
        this.voltage = voltage; 
        this.id = count; 
        count++;
    }
    
    public Node[] getNode(){
        Node[] nodes = {nodeOne, nodeTwo};
        return nodes; 
    }
    
    @Override 
    public String toString(){
        return("V"+ this.id + " " + nodeOne + " " + nodeTwo + " " + this.voltage); 
    }
}
