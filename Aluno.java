/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escola;

/**
 *
 * @author Família Muniz
 */
public class Aluno {
 
	private String nomeAluno;

    public double getNota1Aluno() {
        return nota1Aluno;
    }

    public double getNota2Aluno() {
        return nota2Aluno;
    }
	private double nota1Aluno;
	private double nota2Aluno;
	public void setNomeAluno(String nome)
	{
		nomeAluno=nome;
	}
	public void setNota1Aluno(double nota1)
	{
		nota1Aluno=nota1;
	}
	public void setNota2Aluno(double nota2)
	{
		nota2Aluno=nota2;
	}
	public Double getMediaAluno()
	{
		return (nota1Aluno+nota2Aluno)/2;
	}
	public String getNomeAluno()
	{
		return nomeAluno;
	}
	
    }
