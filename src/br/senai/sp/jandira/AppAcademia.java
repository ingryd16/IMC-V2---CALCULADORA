package br.senai.sp.jandira;

import java.awt.Color;
import java.awt.Font;
import java.time.LocalDate;

//import javax.swing.JOptionPane;

import br.senai.sp.jandira.gui.FrameCalculoImc;
import br.senai.sp.jandira.model.Cliente;

public class AppAcademia {
	
	public static void main(String[] args) {
		
		FrameCalculoImc tela = new FrameCalculoImc();
		tela.titulo = "Calculadora IMC";
		tela.altura = 600;
		tela.largura = 600;
		tela.corDeFundoDaTela = new Color(196, 196, 255);
		tela.corDoBotao = new Color(120, 196, 255);
		tela.corDoTextoDoBotao = new Color(255, 255, 255);
		tela.fonteDosLabels = new Font("Arial", Font.BOLD, 15);
		tela.letras = new Color();
		tela.criarTela();
		
		/*
		 * FrameCalculoImc tela2 = new FrameCalculoImc(); tela2.titulo = "turma ds1ma";
		 * tela2.altura = 600; tela2.largura = 300; tela2.corDeFundoDaTela = new
		 * Color(110, 40, 70); tela2.corDoBotao = new Color(255, 255, 255);
		 * tela2.criarTela();
		 */
		
		Cliente ana = new Cliente();
		Cliente pedro = new Cliente();
		
		//pra mostrar o endereço do objeto 
		/*
		 * System.out.println(ana); System.out.println(pedro);
		 */
				
		ana.nome = "Ana Maria Braga";
		ana.dataDeNascimento = LocalDate.of(1950, 6, 21);
		ana.peso = 42;
		ana.altura = 1.68;
		ana.getImc();
		System.out.printf("Seu IMC é: %s", ana.getImc());
		//ou poderia ser assim tb pra mostrar o imc:
		//double xx = ana.getImc();
		//System.out.println(xx);
		
		//pra mostrar o status:
		//String teste = ana.getStatus();
		//JOptionPane.showMessageDialog(null, teste);
		
		pedro.nome = "Pedro Dias";
		pedro.dataDeNascimento = LocalDate.of(2002, 2, 2);
		
	
	}

}
