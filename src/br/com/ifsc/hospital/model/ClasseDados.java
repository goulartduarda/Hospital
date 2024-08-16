
package br.com.ifsc.hospital.model;

import java.util.ArrayList;


public class ClasseDados {
    private static ClasseDados instance;
    
    public static ArrayList<Medicamento> listaMedicamento = new ArrayList<>();
    
    public static synchronized ClasseDados getInstance(){
        
        if(instance == null){
            instance = new ClasseDados();
            
        }
        return instance;                
        }
    }
    

