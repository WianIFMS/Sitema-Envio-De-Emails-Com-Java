/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.enviodeemails;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.lang.String;

/**
 *
 * @author Wian Clodoaldo
 */
public abstract class BotoesCrud extends JPanel {
 private JButton enviar;   
 
 public BotoesCrud(){
     enviar = new JButton("Enviar");
     add(enviar);
     inicializarAcoes();
 }
 private void inicializarAcoes(){
  enviar.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
     acaoEnviar();
     //JanelaSecundaria frame = new JanelaSecundaria();
        //frame.setVisible(true);
        //new JanelaSecundaria().setVisible(true);
         
                
         
      }
      
  });
 }

    /**
     *
     */
    public abstract void acaoEnviar();
}
