/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab7;

/**
 *
 * @author its yo mama
 */
public class Node {
    public int nodeId; 
    private static int idNum = 0;
    
    public Node(){
        nodeId = idNum; 
        idNum+=1;     
    }
    
    @Override
    public String toString(){
        return Integer.toString(nodeId); 
    }
}
