/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.enviodeemails;

/**
 *
 * @author Wian Clodoaldo
 */
public class ValidadorJs {
     public static void validarEmail(String email) throws Exception  {
      if (email == null || !email.contains("@")) {
           throw new EmailInvalidoException();
        }
      
  }

    static void validarSenha(String senha) throws Exception {
        if (senha.length() < 0) {
            throw new SenhaInvalidoException();
        }
        
    }

  
}
