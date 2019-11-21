/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.enviodeemails;

import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Wian Clodoaldo
 */
public class CampoDeTexto extends JPanel {
private JLabel rotulo;
private JTextField campo;
    public CampoDeTexto(String destinatario, int i) {
        rotulo = new JLabel(destinatario);
        campo = new JTextField(i);
        //this.setLayout(new FlowLayout(FlowLayout.LEFT));
        add(rotulo);
        add(campo);
        
    }

   

    String getText() {
    return campo.getText();
       
    } 
}
