/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.enviodeemails;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author Wian Clodoaldo
 */
public class CampoTextArea extends JPanel{
JLabel rotulo;
JTextArea campo;
    public CampoTextArea(String mensagem, int i, int i0) {
        rotulo = new JLabel(mensagem);
        campo = new JTextArea(i,i0);
        add(rotulo);
        add(campo);
    }

    String getText() {
       return campo.getText();
    }
    
}
