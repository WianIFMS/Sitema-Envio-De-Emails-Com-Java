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
public class CampoDestinoException extends Exception {

    public CampoDestinoException() {
    JOptionPane.showMessageDialog(null, "Email de destino invalido!");
    }
    
}
