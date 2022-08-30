package br.senai.sp.jandira.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import br.senai.sp.jandira.model.Cliente;

public class FrameCalculoImc {
	public Color corDeFundoDaTela;
	public String titulo;
	public int largura, altura;
	public Color corDoBotao;
	public Color corDoTextoDoBotao;
	public Font fonteDosLabels;
	public Color letras;

	// criar janela
	public void criarTela() {
		JFrame tela = new JFrame();
		tela.setTitle(titulo);
		tela.setSize(largura, altura);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);

		// obter a instancia do painel de controle
		Container painel = tela.getContentPane();
		painel.setBackground(corDeFundoDaTela);

		// criar os componentes da tela e colocar no painel (container)
		// x, y, larg, alt
		JLabel labelImc = new JLabel();
		labelImc.setText("IMC");
		labelImc.setBounds(30, 10, 30, 50);
		labelImc.setFont(new Font("Arial", Font.BOLD, 17));
		labelImc.setForeground(new Color(255, 255, 255));
		labelImc.setFont(fonteDosLabels);

		JLabel labelNome = new JLabel();
		labelNome.setText("Nome:");
		labelNome.setBounds(30, 40, 100, 30);
		labelNome.setForeground(letras);
		labelNome.setFont(fonteDosLabels);

		JTextField textFieldNome = new JTextField();
		textFieldNome.setBounds(30, 70, 300, 30);

		JLabel labelPeso = new JLabel();
		labelPeso.setText("Peso:");
		labelPeso.setBounds(30, 110, 100, 30);
		labelPeso.setForeground(letras);

		JTextField textFieldPeso = new JTextField();
		textFieldPeso.setBounds(30, 140, 300, 30);

		JLabel labelAltura = new JLabel();
		labelAltura.setText("Altura:");
		labelAltura.setBounds(30, 180, 100, 30);
		labelAltura.setForeground(letras);

		JTextField textFieldAltura = new JTextField();
		textFieldAltura.setBounds(30, 210, 300, 30);

		JLabel labelNasc = new JLabel();
		labelNasc.setText("Data de Nasc.:");
		labelNasc.setBounds(30, 250, 100, 30);
		labelNasc.setForeground(letras);

		JTextField textFieldNasc = new JTextField();
		textFieldNasc.setBounds(30, 280, 300, 30);

		JButton buttonCalcular = new JButton();
		buttonCalcular.setText("Calcular");
		buttonCalcular.setBounds(400, 280, 150, 30);
		buttonCalcular.setForeground(corDoTextoDoBotao);
		buttonCalcular.setBackground(corDoBotao);

		JLabel labelResultado = new JLabel();
		labelResultado.setText("Seu IMC é:");
		labelResultado.setBounds(30, 400, 300, 30);
		labelResultado.setForeground(letras);

		JLabel labelStatus = new JLabel();
		labelStatus.setText("Seu status IMC é:");
		labelStatus.setBounds(30, 430, 300, 30);
		labelStatus.setForeground(letras);

		// eventos
		
		buttonCalcular.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Cliente cliente = new Cliente();
				cliente.nome = textFieldNome.getText();
				cliente.peso = Double.parseDouble(textFieldPeso.getText());
				cliente.altura = Double.parseDouble(textFieldAltura.getText());

				labelResultado.setText(cliente.nome + ", seu Imc é " + cliente.getImc());
				labelStatus.setText("status IMC:  " + cliente.getStatus());
			
			}
		});
				textFieldNome.addMouseListener(new MouseListener() {
					
					@Override
					public void mouseReleased(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void mousePressed(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void mouseExited(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void mouseEntered(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void mouseClicked(MouseEvent e) {
						JOptionPane.showMessageDialog(null, "nao vai digitar nada");
						
					}
				});
				
		// add componentes ao painel (container)
		painel.add(labelImc);
		painel.add(buttonCalcular);
		painel.add(labelNome);
		painel.add(textFieldNome);
		painel.add(labelPeso);
		painel.add(textFieldPeso);
		painel.add(labelAltura);
		painel.add(textFieldAltura);
		painel.add(labelNasc);
		painel.add(textFieldNasc);
		painel.add(labelResultado);
		painel.add(labelStatus);
		tela.setVisible(true);

	}
}