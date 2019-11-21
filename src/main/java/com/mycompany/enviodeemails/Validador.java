package com.mycompany.enviodeemails;

import com.sun.corba.se.impl.protocol.AddressingDispositionException;
import com.sun.xml.internal.messaging.saaj.packaging.mime.MessagingException;
import java.lang.String;

/**
 *
 * @author Wian Clodoaldo
 */
public class Validador {

    public static void validarDestino(String destino) throws Exception {
        if ( !destino.contains("@")) {
            //throw new DestinoInvalidoException();
            throw new CampoDestinoException();
        }

    }

    public static void validarAssunto(String assunto) throws Exception {
        if (assunto.length() < 2) {
            throw new CampoAssuntoException();
        }
    }

    public static void validarMensagem(String mensagem) throws Exception {
        if (mensagem.length() < 2) {
            throw new CampoMensagemException();
        }
    }

}
