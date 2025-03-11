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
public class AT4_While {

    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);

       
        

        System.out.println("Digite um número:");
        int num = tc.nextInt();

        
        int x = num;
        while (x > 1) {

            x--;
            num = num * x;
        }
        System.out.print(num);

    }

}


