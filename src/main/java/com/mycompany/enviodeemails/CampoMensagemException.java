/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.enviodeemails;

import javax.swing.JOptionPane;

/**
 *
 * @author Wian Clodoaldo
 */
public class CampoMensagemException extends Exception {

    public CampoMensagemException() {
        JOptionPane.showMessageDialog(null, "Campo de mensagem limpo. Escreva alguma coisa!");
    }
    
    
}
