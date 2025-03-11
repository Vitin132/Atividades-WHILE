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
public class AT3_Tabuada {

    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);

        int num = 0;
        int x;

        System.out.println("Digite um número:");
        x = tc.nextInt();


        while (num <= 9) {

            num++;

            int multi = x * num;

            System.out.println(x + " * " + num + " = " + multi);

        }

    }

}
