package br.senai.sp.jandira.model;

import java.time.LocalDate;

public class Cliente {
	
	public String nome;
	public LocalDate dataDeNascimento;
	public String genero[] = {"Feminino", "Masculino", "Outros"};
	public double peso;
	public double altura;
  
	
	public double getImc() {
		return peso / Math.pow(altura, 2);
	}
	
	public String getStatus() {
		
		if (getImc() <= 18.5) {
			return "Você está abaixo do peso";
		} else if (getImc() > 18.5 && getImc() < 25.0) {
			return "Você está com peso ideal";
		} else if (getImc() >= 25.0 && getImc() < 30.0) {
			return "Você está levemente acima do peso";
		} else if (getImc() >= 30.0 && getImc() < 35.0) {
			return "Você está com obesidade Grau I";
		} else if (getImc() >= 35.0 && getImc() < 40.0) {
			return "Você está com obesidade Grau II";
		} else {
			return "Você está com Obesidade Grau III";
		}
				
	}

}
