
package controller;

import br.com.ifsc.hospital.model.ClasseDados;
import br.com.ifsc.hospital.model.Medicamento;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import view.TelaCadastroMedicamento;


public class ControllerCadastroMedicamento implements ActionListener{
    
    TelaCadastroMedicamento telaCadastroMedicamento;

    public ControllerCadastroMedicamento(TelaCadastroMedicamento telaCadastroMedicamento) {
        
        this.telaCadastroMedicamento = telaCadastroMedicamento;
        
        this.telaCadastroMedicamento.getjButtonNovo().addActionListener(this);
        this.telaCadastroMedicamento.getjButtonCancelar().addActionListener(this);
        this.telaCadastroMedicamento.getjButtonGravar().addActionListener(this);
        this.telaCadastroMedicamento.getjButtonBuscar().addActionListener(this);
        this.telaCadastroMedicamento.getjButtonSair().addActionListener(this);
        
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == this.telaCadastroMedicamento.getjButtonNovo()){
            JOptionPane.showMessageDialog(null, "Rá gluglu");
        }else if(e.getSource() == this.telaCadastroMedicamento.getjButtonSair()){
            JOptionPane.showMessageDialog(null, "Yeyé");
        }else if(e.getSource() == this.telaCadastroMedicamento.getjButtonGravar()){
            Medicamento medicamento = new Medicamento();
            medicamento.setId(Integer.parseInt(this.telaCadastroMedicamento.getjTFId().getText()));
            medicamento.setDescricaoMedicamento(this.telaCadastroMedicamento.getjTFDescricao().getText());
            // Obs.: Note que só coloquei dois atribtos como exemplo
            //Deve-se colocar todos os dados da classe
            
            ClasseDados.listaMedicamento.add(medicamento);
        }else if(e.getSource() == this.telaCadastroMedicamento.getjButtonBuscar()){
            JOptionPane.showMessageDialog(null, ClasseDados.listaMedicamento.toString());
        }
    } 
}
