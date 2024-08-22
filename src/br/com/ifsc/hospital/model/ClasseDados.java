
package br.com.ifsc.hospital.model;

import java.util.ArrayList;


public class ClasseDados {
    
    private static ClasseDados uniqueinstance;
    public static ArrayList<Medicamento> listaMedicamento = new ArrayList<>();
    public static ArrayList<Laboratorio> listaLaboratorio = new ArrayList<>();

    private ClasseDados() {
    }

    public static synchronized ClasseDados getInstance() {

        if (uniqueinstance == null) {
            uniqueinstance = new ClasseDados();
        }

        return uniqueinstance;
    }
    }
    

