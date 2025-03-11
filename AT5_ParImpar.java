/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ATIVIDADES_WHILE;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Vitor
 */
public class AT5_ParImpar {

    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);
        Scanner tc2 = new Scanner(System.in);
        Random rd = new Random();

        String escolhaUser = "";
        String escolhaPC = "";

        int numUser, numPC, soma;

        while (!escolhaUser.equalsIgnoreCase("sair")) {

            System.out.println("Escolha par ou ímpar!(Digite 'sair' para encerrar!)");
            escolhaUser = tc.nextLine();

            if (!escolhaUser.equalsIgnoreCase("sair")) {

                System.out.println("Escolha um número de 0 a 6");
                numUser = tc2.nextInt();

                numPC = rd.nextInt(6);

                soma = numPC + numUser;

                if (escolhaUser.equalsIgnoreCase("par")) {

                    escolhaPC = "ímpar";

                } else if (escolhaUser.equalsIgnoreCase("ímpar")) {

                    escolhaPC = "par";

                }

                if (escolhaUser.equalsIgnoreCase("par") && soma % 2 == 0) {

                    System.out.println("Você escolheu " + escolhaUser + " e colocou o número " + numUser + " e ganhou!");
                    System.out.println("O PC escolheu " + escolhaPC + " e colocou o número " + numPC + "!");

                } else if(escolhaUser.equalsIgnoreCase("ímpar") && soma % 2 == 0) {

                    System.out.println("Você escolheu " + escolhaUser + " e colocou o número " + numUser + " e perdeu!");
                    System.out.println("O PC escolheu " + escolhaPC + " e colocou o número " + numPC + "!");

                }
                
                if (escolhaUser.equalsIgnoreCase("par") && soma % 2 != 0) {

                    System.out.println("Você escolheu " + escolhaUser + " e colocou o número " + numUser + " e perdeu!");
                    System.out.println("O PC escolheu " + escolhaPC + " e colocou o número " + numPC + "!");

                } else if(escolhaUser.equalsIgnoreCase("ímpar") && soma % 2 != 0) {

                    System.out.println("Você escolheu " + escolhaUser + " e colocou o número " + numUser + " e ganhou!");
                    System.out.println("O PC escolheu " + escolhaPC + " e colocou o número " + numPC + "!");

                }
                
               

            }
            
            System.out.println("Fim de jogo!");
            
            
        }

    }

}
