
package controller;

import br.com.ifsc.hospital.model.Laboratorio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import view.telaCadastroLaboratorio;

public class ControllerCadastroLaboratorio implements ActionListener{
    
    telaCadastroLaboratorio TelaCadastrolaboratorio1;
    
    public ControllerCadastroLaboratorio(telaCadastroLaboratorio telaCadastroLaboratorio1) {

        this.TelaCadastrolaboratorio1 = telaCadastroLaboratorio1;

        this.TelaCadastrolaboratorio1.getjButton1Novo().addActionListener(this);
        this.TelaCadastrolaboratorio1.getjButton1Cancelar().addActionListener(this);
        this.TelaCadastrolaboratorio1.getjButton1Gravar().addActionListener(this);
        this.TelaCadastrolaboratorio1.getjButton1Buscar().addActionListener(this);
        this.TelaCadastrolaboratorio1.getjButton1Sair().addActionListener(this);
        
        

        utillities.Utillities.ativaDesativa(false, this.TelaCadastrolaboratorio1.getjPanelBotoes());
        utillities.Utillities.limpaComponentes(false, this.TelaCadastrolaboratorio1.getJPanelDados());
    }

    @Override
    public void actionPerformed(ActionEvent evento) {

        if (evento.getSource() == this.TelaCadastrolaboratorio1.getjButton1Novo()) {
            utillities.Utillities.ativaDesativa(true, this.TelaCadastrolaboratorio1.getjPanelBotoes());
            utillities.Utillities.limpaComponentes(true,this.TelaCadastrolaboratorio1.getJPanelDados());
            
            this.TelaCadastrolaboratorio1.getjTextField1Id().setEnabled(false);

        } else if (evento.getSource() == this.TelaCadastrolaboratorio1.getjButton1Cancelar()) {
            utillities.Utillities.ativaDesativa(false, this.TelaCadastrolaboratorio1.getjPanelBotoes());
            utillities.Utillities.limpaComponentes(false, this.TelaCadastrolaboratorio1.getJPanelDados());

        } else if (evento.getSource() == this.TelaCadastrolaboratorio1.getjButton1Gravar()) {

            Laboratorio laboratorio = new Laboratorio();
            
            laboratorio.setId(br.com.ifsc.hospital.model.ClasseDados.listaLaboratorio.size() + 1);
            laboratorio.setNomeFantasia(this.TelaCadastrolaboratorio1.getjTextField1Nome().getText());
            laboratorio.setContato(this.TelaCadastrolaboratorio1.getjTextField1Fone1().getText());
            laboratorio.setStatus(this.TelaCadastrolaboratorio1.getjTextField1Status().getSelectedText()+ "");

            br.com.ifsc.hospital.model.ClasseDados.listaLaboratorio.add(laboratorio);
            
            utillities.Utillities.ativaDesativa(false, this.TelaCadastrolaboratorio1.getjPanelBotoes());
            utillities.Utillities.limpaComponentes(false, this.TelaCadastrolaboratorio1.getJPanelDados());

        } else if (evento.getSource() == this.TelaCadastrolaboratorio1.getjButton1Buscar()) {
            // Chamar a tela de buscas...
            //como não desenvolvemos ainda, carregar uma tela de dialogo presentando
            //pelo metodo toString() o resultado da lista referente ao cadastro
            JOptionPane.showMessageDialog(null, br.com.ifsc.hospital.model.ClasseDados.listaLaboratorio.toString());
        } else if (evento.getSource() == this.TelaCadastrolaboratorio1.getjButton1Sair()) {
            this.TelaCadastrolaboratorio1.dispose();
        }

    }
}
