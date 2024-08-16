
package controller;

import br.com.ifsc.hospital.model.Medicamento;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import view.TelaCadastroMedicamento;

public class ControllerCadastroMedicamento implements ActionListener{
    
    TelaCadastroMedicamento telaCadastroMedicamento;
//passando os paramentros pra ficar ouvindo o que acontece na tela 
    public ControllerCadastroMedicamento(TelaCadastroMedicamento telaCadastroMedicamento) {
        this.telaCadastroMedicamento = telaCadastroMedicamento;
        this.telaCadastroMedicamento.getjButton1Novo().addActionListener(this);
        this.telaCadastroMedicamento.getjButton1Cancelar().addActionListener(this);
        this.telaCadastroMedicamento.getjButton1Gravar().addActionListener(this);
        this.telaCadastroMedicamento.getjButton1Buscar().addActionListener(this);
        this.telaCadastroMedicamento.getjButton1Sair().addActionListener(this);
        
    }
    
    
//implementação 
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== this.telaCadastroMedicamento.getjButton1Novo()){
            JOptionPane.showMessageDialog(null, "text text text");
            
        } else if (e.getSource()== this.telaCadastroMedicamento.getjButton1Sair()){
            JOptionPane.showMessageDialog(null, "text text text");
            
        } else if (e.getSource()== this.telaCadastroMedicamento.getjButton1Gravar()){
            
            Medicamento medicamento = new Medicamento();
            medicamento.setId(Integer.parseInt(this.telaCadastroMedicamento.getjTFId().getText));
            medicamento.setDescricaoMedicamento(this.telaCadastroMedicamento.getJTFDescricao().getText());
            br.com.ifsc.hospital.model.ClasseDados.listaMedicamento.add(medicamento);
            
        }else if (e.getSource()== this.telaCadastroMedicamento.getjButton1Buscar()){
            JOptionPane.showMessageDialog(null, br.com.ifsc.hospital.model.ClasseDados.listaMedicamento.toString());
        }
        
    }

    
    
}
