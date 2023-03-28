/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab7;

/**
 *
 * @author yo mama again
 */
public class Resistor {
    private double resValue; 
    private int resId;
    private static int totalRes; 
    private Node nodeOne; 
    private Node nodeTwo; 
    
    public Resistor(double resistance, Node node1, Node node2){
        if(resistance<0)
            throw new IllegalArgumentException("Resitance cannot be negative");
        
        if(node1 == null || node2 == null)
            throw new IllegalArgumentException("The nodes cannot be null");
           
        resValue = resistance;
        nodeOne = node1; 
        nodeTwo = node2; 
        resId = totalRes; 
        totalRes++; 
    }
    
    public Node [] getNodes(){
        Node[] nodes = {nodeOne, nodeTwo}; 
        return nodes; 
    }
    
    @Override
    public String toString(){
        return "R" + resId + " " + nodeOne + " " + nodeTwo + " " + resValue;
    }
    
}
