/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.enviodeemails;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Wian Clodoaldo
 */
class CampoDeSenha extends JPanel {

    private JLabel rotulo;
    private JTextField campo;

    CampoDeSenha(String senha, int i) {
       rotulo = new JLabel(senha);
       campo = new JTextField(i);
       add(rotulo);
     add(campo);
     
    }

    String getText() {
       return campo.getText();
    }
}
