/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab7;
import java.util.ArrayList;

/**
 *
 * @author yo mama
 */
public class Circuit {
    ArrayList<Resistor> resistors = new ArrayList<Resistor>(); 
    ArrayList<Voltage> voltages = new ArrayList<Voltage>();
    private static Circuit instance = null; 
    public static Circuit getInstance() {
    if (instance == null){ 
        instance = new Circuit();
    }
    return instance;
    }
    
    private Circuit(){
        
    }
    
    public void addR(Resistor r){
        resistors.add(r); 
    }
    
    public void addV(Voltage v){
        voltages.add(v); 
    }
    
    @Override
    public String toString(){
        String s = "";
        String s1 = ""; 
        int i = 0; 
        
        while(i<voltages.size() || i<resistors.size()){
            if(i<resistors.size()){
                s1 += resistors.get(i); 
            }
            if(i<voltages.size()){
                s += voltages.get(i); 
            }
            i++; 
        }
        return s + s1;
    }
}
