/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab6;
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
    
    public void add(Resistor r){
        resistors.add(r); 
    }
    
    @Override
    public String toString(){
        String s = "";
        for(int i = 0; i < resistors.size(); i++)
        {
            s += resistors.get(i) + "\n";
        }
        return s;
    }
    public static void main(String[] args)
    {
        Circuit circuit = Circuit.getInstance();
        circuit.add(new Resistor(30, new Node(), new Node()));
        circuit.add(new Resistor(50, new Node(), new Node()));

        System.out.println(circuit);
    }
    
}
