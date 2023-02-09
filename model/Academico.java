package br.ufjf.poo.model;

import java.util.ArrayList;

public class Academico extends Pessoa{
	private int academicoId;
	private ArrayList<Disciplina> disciplinas;
	
	public int getAcademicoId() {
		return academicoId;
	}


	public void setAcademicoId(int academicoId) {
		this.academicoId = academicoId;
	}


	public ArrayList<Disciplina> getDisciplinas() {
		return disciplinas;
	}


	public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	public void imprimirGrade() {
		System.out.println("grade:");
		for(Disciplina d: disciplinas){
			System.out.println(d.getNomeDisciplina());	
		}
	}
}
