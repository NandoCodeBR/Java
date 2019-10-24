/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escola;

import java.util.Scanner;

/**
 *
 * @author Família Muniz
 */
public class Escola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Aluno aluno1=new Aluno();
	String nomeAluno;
	double nota1, nota2;
     	Scanner entrada=new Scanner(System.in);
	System.out.printf("Entre com o nome do aluno:");
	nomeAluno=entrada.nextLine();
	System.out.printf("Entre com a primeira nota:");
	nota1=entrada.nextDouble();
	System.out.printf("Entre com a segunda nota:");
	nota2=entrada.nextDouble();
	aluno1.setNomeAluno(nomeAluno);
	aluno1.setNota1Aluno(nota1);
	aluno1.setNota2Aluno(nota2);
	System.out.printf("Sua média é: %.2f\n", aluno1.getMediaAluno());
        

    }
    
}
