
package com.mycompany.enviodeemails;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Wian Clodoaldo
 */
abstract class BotoesCrudjs extends JPanel {
     private JButton enviar;   
 
 public BotoesCrudjs(){
     enviar = new JButton("Enviar");
     add(enviar);
     inicializarAcoes();
 }
 private void inicializarAcoes(){
  enviar.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
     acaoEnviar();
        // new JanelaSecundaria().setVisible(true);
        // new JanelaSecundaria().setVisible(false);
         // JOptionPane.showMessageDialog(null,"Mensagem enviada");
          
         
                
         
      }
      
  });
 }

    public abstract void acaoEnviar();
       //public abstract void enviar();
}
