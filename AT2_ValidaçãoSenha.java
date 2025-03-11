/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ATIVIDADES_WHILE;

import java.util.Scanner;

/**
 *
 * @author Vitor
 */
public class AT2_ValidaçãoSenha {

    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);

        //System.out.println("Digite a senha para validar o usuário!");
        String senha = "";
        String tentativas;

        System.out.println("Para validar o login digite a senha: ");
        senha = tc.next();

        //String senha = tc.nextLine();
        while (!senha.equalsIgnoreCase("1234")) {

            System.out.println("Usuário inválido!");
            senha = tc.next();
            
            

        }

        System.out.println("Usuário validado!");

    }

}
