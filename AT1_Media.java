

package Atividades_WHILE;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AT1_Media {

    public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
        
        int cont = 1;
        int resp =0;
        int idade = 0;
        int soma = 0;
        
        System.out.println("Quantos alunos tem na turma?");
        int alunos = tc.nextInt();
        
        while(idade >= 0){
            
            System.out.println("Qual a idade do "+cont+" ° aluno? (-1 para sair)");
            idade = tc.nextInt();
            soma += idade;
            cont++;
            
           
        }
        int media = soma / alunos;
        
        System.out.println("A media entre as idades é: "+media);
        
    }
    
    
}
