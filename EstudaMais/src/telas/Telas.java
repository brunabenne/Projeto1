package telas;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.Rectangle;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import java.awt.Cursor;
import javax.swing.JButton;
import java.awt.List;
import java.awt.Choice;
import java.awt.FlowLayout;

public class Telas extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Telas frame = new Telas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Telas() {
		setBounds(new Rectangle(0, 0, 1290, 850));
		getContentPane().setLayout(null);
		
		JRadioButton btnSCompleto = new JRadioButton("");
		btnSCompleto.setBounds(94, 189, 33, 30);
		btnSCompleto.setOpaque(false);
		btnSCompleto.setBorder(null);
		btnSCompleto.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		getContentPane().add(btnSCompleto);
		
		final JRadioButton btnSPersonal = new JRadioButton("");
		btnSPersonal.setBounds(710, 189, 33, 30);
		btnSPersonal.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSPersonal.setOpaque(false);
		btnSPersonal.setBorder(null);
		getContentPane().add(btnSPersonal);		
		
		final JRadioButton btnCurto = new JRadioButton("");
		btnCurto.setBounds(772, 361, 13, 13);
		btnCurto.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCurto.setOpaque(false);
		btnCurto.setBorder(null);
		getContentPane().add(btnCurto);
		
		final JRadioButton btnMedio = new JRadioButton("");		
		btnMedio.setBounds(931, 361, 13, 13);
		btnMedio.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnMedio.setOpaque(false);
		btnMedio.setBorder(null);
		getContentPane().add(btnMedio);
		
		
		//Ao usar o modificador final em variáveis, você garante que o valor atribuído inicialmente 
		//não será alterado acidentalmente em outras partes do código.
		final JRadioButton btnLongo = new JRadioButton("");
		btnLongo.setBounds(1091, 361, 13, 13);
		btnLongo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLongo.setOpaque(false);
		btnLongo.setBorder(null);
		getContentPane().add(btnLongo);
		
		ButtonGroup buttonGroup = new ButtonGroup();
		
		buttonGroup.add(btnSCompleto);
		buttonGroup.add(btnSPersonal);
				
		ButtonGroup buttonGroup2 = new ButtonGroup();
		
		buttonGroup2.add(btnCurto);
		buttonGroup2.add(btnMedio);
		buttonGroup2.add(btnLongo);
		
		btnSPersonal.addItemListener(new ItemListener() {   //APENAS "LIGA" OS BOTOES DO GRUPO2 SE O BOTAO PERSONAL ESTIVER SELECIONADO
		    public void itemStateChanged(ItemEvent e) {
		        if (btnSPersonal.isSelected()) {
		            btnCurto.setEnabled(true);
		            btnMedio.setEnabled(true);
		            btnLongo.setEnabled(true);
		        } else {
		            btnCurto.setEnabled(false);
		            btnMedio.setEnabled(false);
		            btnLongo.setEnabled(false);
		        }
		    }
		});
		
		
		
		Choice choice_SC = new Choice();
		choice_SC.setBounds(455, 561, 136, 30);
		choice_SC.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		getContentPane().add(choice_SC);
		
		choice_SC.addItem("");
		choice_SC.addItem("2019");
		choice_SC.addItem("2020");
		choice_SC.addItem("2021");
		choice_SC.addItem("2022");
		choice_SC.addItem("2023");
		
		
		Choice choice_SP = new Choice();
		choice_SP.setBounds(1057, 592, 121, 30);
		choice_SP.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		getContentPane().add(choice_SP);
		
		choice_SP.addItem("");
		choice_SP.addItem("2019");
		choice_SP.addItem("2020");
		choice_SP.addItem("2021");
		choice_SP.addItem("2022");
		choice_SP.addItem("2023");
		
		JButton btnIniciar = new JButton("");
		btnIniciar.setBounds(621, 834, 33, 9);
		btnIniciar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		getContentPane().add(btnIniciar);
		
		JLabel lblTelaEscolha = new JLabel("");
		lblTelaEscolha.setBounds(0, 0, 1280, 800);
		lblTelaEscolha.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		lblTelaEscolha.setIcon(new ImageIcon("C:\\Users\\bruna\\AppData\\Local\\Microsoft\\Windows\\INetCache\\IE\\JKVCOXFQ\\Escolha_de_Simulado[1].png"));
		getContentPane().add(lblTelaEscolha);
	}
}
