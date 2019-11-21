/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.enviodeemails;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Wian Clodoaldo
 */
public class JanelaSecundaria extends JFrame {

    private JPanel formulario;
    private CampoDeTexto campoEmail;
    private CampoDeSenha campoSenha;
    private BotoesCrudjs botoesCrud;
    private Individuo individuo;

    public Individuo getIndividuo() {
        return individuo;
    }

    public void setIndividuo(Individuo individuo) {
        this.individuo = individuo;
    }
    
    public void mostrar(Individuo individuo, JanelaSecundaria frame){
        this.individuo = individuo;
        frame.setVisible(true);
    }

    public JanelaSecundaria() {

        setSize(400, 200);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        inicializarFormulario();
        inicializarBotoes();

    }

    private void inicializarBotoes() {
        botoesCrud = new BotoesCrudjs() {
            @Override
            public void acaoEnviar() {
                
                
                
                individuo.setEmail(campoEmail.getText());
                individuo.setSenha(campoSenha.getText());

                try {
                    //ValidadorJs.validarEmail(individuo.getEmail());
                    //ValidadorJs.validarSenha(individuo.getSenha());
                    
                    EnviaMail envia = new EnviaMail();
                    System.out.println(individuo.getDestino());
                    System.out.println(individuo.getAssunto());
                    System.out.println(individuo.getMensagem());
                    System.out.println(individuo.getEmail());
                    System.out.println(individuo.getSenha());
                    
                    envia.enviar(individuo);
                    
                   JOptionPane.showMessageDialog(null, "Email enviado!");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null,"Email ou senha invalidos!");
                }

            }

           

          
        };
        add(botoesCrud, BorderLayout.SOUTH);
    }

    private void inicializarFormulario() {
        formulario = new JPanel(new GridLayout(3, 1));
        campoEmail = new CampoDeTexto("Email", 20);
        campoSenha = new CampoDeSenha("Senha", 20);

        formulario.add(campoEmail);
        formulario.add(campoSenha);

        add(formulario, BorderLayout.CENTER);
    }
}
