package com.mycompany.enviodeemails;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import com.mycompany.enviodeemails.Individuo;

/**
 *
 * @author Wian Clodoaldo
 */
class JanelaPrincipal extends JFrame {

    private JPanel formulario;
    private CampoDeTexto campoDestino;
    private CampoDeTexto campoAssunto;
    private CampoTextArea campoMensagem;
    private Individuo individuo;
    private BotoesCrud botoesCrud;

    public JanelaPrincipal() {

        setSize(500, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        inicializarFormulario();
        inicializarBotoes();

    }

    private void inicializarBotoes() {
        botoesCrud = new BotoesCrud() {
            @Override
            public void acaoEnviar() {

                individuo = new Individuo();

               individuo.setDestino(campoDestino.getText());
                individuo.setAssunto(campoAssunto.getText());
                individuo.setMensagem(campoMensagem.getText());
                
               JanelaSecundaria frame = new JanelaSecundaria();
        
                try {
                    Validador.validarDestino(individuo.getDestino());
                    Validador.validarAssunto(individuo.getAssunto());
                    Validador.validarMensagem(individuo.getMensagem());
                 frame.mostrar(individuo, frame);
                   // JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null,"Todos os campos precisão ser preenchidos!");
                }
                

            }

        };
        add(botoesCrud, BorderLayout.SOUTH);

    }

    private void inicializarFormulario() {
        formulario = new JPanel(new GridLayout(3, 1));
        campoDestino = new CampoDeTexto("Destinatario", 20);
        campoAssunto = new CampoDeTexto("Assunto", 20);
        campoMensagem = new CampoTextArea("Mensagem", 10, 20);
        formulario.add(campoDestino);
        formulario.add(campoAssunto);
        formulario.add(campoMensagem);
        add(formulario, BorderLayout.CENTER);
    }

}
