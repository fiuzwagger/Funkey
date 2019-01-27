package view;

import model.Utilizador;
import model.Controlador;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileNotFoundException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import javax.swing.JTextPane;
import javax.swing.JCheckBox;
import javax.swing.UIManager;
import javax.swing.JTextField;

public class Divulgacao extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Divulgacao frame = new Divulgacao();
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
	public Divulgacao() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {

				try {
					Controlador.saveFileCliente();
					Controlador.saveFileSubscricao();
					Controlador.saveFileDivulgacao();
					Controlador.saveFileConfiguracao();
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		Image icon = new ImageIcon(this.getClass().getResource("/icon.png")).getImage();
		setIconImage(icon);
		setResizable(false);
		setTitle("FunKey-Divulga��o");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1022, 618);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		// Centrar a janela
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);

		JPanel panel_6 = new JPanel();
		panel_6.setBackground(SystemColor.controlHighlight);
		panel_6.setBounds(0, 558, 1016, 21);
		contentPane.add(panel_6);
		panel_6.setLayout(null);
		
		JLabel lblBemvindo = new JLabel("New label");
		lblBemvindo.setFont(new Font("Verdana", Font.PLAIN, 15));
		lblBemvindo.setBounds(773, 13, 368, 16);
		contentPane.add(lblBemvindo);
		lblBemvindo.setText("Bem Vindo admin!");

		JLabel lblPoweredByFunkey = new JLabel("Powered by Funkey");
		lblPoweredByFunkey.setBounds(870, 0, 126, 14);
		lblPoweredByFunkey.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_6.add(lblPoweredByFunkey);

		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(10, 13, 179, 532);
		contentPane.add(panel);
		panel.setLayout(null);

		JButton btnSubscricao = new JButton("Subscri\u00E7\u00E3o");
		btnSubscricao.setBounds(12, 118, 156, 37);
		panel.add(btnSubscricao);
		btnSubscricao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Subscricao frame = new Subscricao();
				frame.setVisible(true);
				dispose();
			}
		});
		btnSubscricao.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseEntered(MouseEvent e) {
				btnSubscricao.setBackground(Color.GRAY);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnSubscricao.setBackground(Color.DARK_GRAY);
			}
		});
		btnSubscricao.setFont(new Font("Arial", Font.BOLD, 15));
		btnSubscricao.setBackground(Color.DARK_GRAY);
		btnSubscricao.setForeground(Color.ORANGE);

		JButton btnDivulgacao = new JButton("Divulga\u00E7\u00E3o");
		btnDivulgacao.setBounds(12, 180, 156, 37);
		panel.add(btnDivulgacao);
		btnDivulgacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDivulgacao.setForeground(Color.ORANGE);
		btnDivulgacao.setFont(new Font("Arial", Font.BOLD, 15));
		btnDivulgacao.setBackground(SystemColor.activeCaption);

		JButton btnPerfil = new JButton("Perfil do Cliente");
		btnPerfil.setBounds(12, 246, 156, 37);
		panel.add(btnPerfil);
		btnPerfil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Perfil frame = new Perfil();
				frame.setVisible(true);
				dispose();
			}
		});
		btnPerfil.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnPerfil.setBackground(Color.GRAY);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnPerfil.setBackground(Color.DARK_GRAY);
			}
		});
		btnPerfil.setForeground(Color.ORANGE);
		btnPerfil.setFont(new Font("Arial", Font.BOLD, 15));
		btnPerfil.setBackground(Color.DARK_GRAY);

		JButton btnConsultas = new JButton("Consultas");
		btnConsultas.setBounds(12, 313, 156, 37);
		panel.add(btnConsultas);
		btnConsultas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Consultas frame = new Consultas();
				frame.setVisible(true);
				dispose();
			}
		});
		btnConsultas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnConsultas.setBackground(Color.GRAY);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnConsultas.setBackground(Color.DARK_GRAY);
			}
		});
		btnConsultas.setForeground(Color.ORANGE);
		btnConsultas.setFont(new Font("Arial", Font.BOLD, 15));
		btnConsultas.setBackground(Color.DARK_GRAY);

		JButton btnConsumo = new JButton("Consumo");
		btnConsumo.setBounds(12, 374, 156, 37);
		panel.add(btnConsumo);
		btnConsumo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Consumo frame = new Consumo();
				frame.setVisible(true);
				dispose();
			}
		});
		btnConsumo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnConsumo.setBackground(Color.GRAY);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnConsumo.setBackground(Color.DARK_GRAY);
			}
		});
		btnConsumo.setForeground(Color.ORANGE);
		btnConsumo.setFont(new Font("Arial", Font.BOLD, 15));
		btnConsumo.setBackground(Color.DARK_GRAY);

		JButton btnConfiguracoes = new JButton("Configura\u00E7\u00F5es");
		btnConfiguracoes.setBounds(12, 437, 156, 37);
		panel.add(btnConfiguracoes);
		btnConfiguracoes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Configuracoes frame = new Configuracoes();
				frame.setVisible(true);
				dispose();
			}
		});
		btnConfiguracoes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnConfiguracoes.setBackground(Color.GRAY);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnConfiguracoes.setBackground(Color.DARK_GRAY);
			}
		});
		btnConfiguracoes.setForeground(Color.ORANGE);
		btnConfiguracoes.setFont(new Font("Arial", Font.BOLD, 15));
		btnConfiguracoes.setBackground(Color.DARK_GRAY);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 179, 578);
		panel.add(lblNewLabel);
		Image img = new ImageIcon(this.getClass().getResource("/este.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));

		JTextPane textPane = new JTextPane();
		textPane.setFont(new Font("Verdana", Font.PLAIN, 15));
		textPane.setBackground(UIManager.getColor("Button.darkShadow"));
		textPane.setBounds(282, 127, 323, 270);
		contentPane.add(textPane);

		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (textField.getText().equals("")) {
					JOptionPane.showMessageDialog(contentPane, "Verifique se o campo quarto est� preenchido.");
				} else {
					String noticia = textPane.getText();
					int quarto = Integer.parseInt(textField.getText());
					Controlador.adicionarDivulgacao(quarto, noticia);
					JOptionPane.showMessageDialog(contentPane,
							"Mensagem enviada ao quarto" + " " + textField.getText() + " com sucesso!");
				}
			}
		});
		btnEnviar.setForeground(Color.WHITE);
		btnEnviar.setFont(new Font("Verdana", Font.BOLD, 18));
		btnEnviar.setBackground(Color.DARK_GRAY);
		btnEnviar.setBounds(690, 210, 218, 90);
		contentPane.add(btnEnviar);
		// Botao de Logout
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int selectedOption = JOptionPane.showConfirmDialog(null, "Tem a certeza que quer sair da conta atual?",
						"Message", JOptionPane.YES_NO_OPTION);
				if (selectedOption == JOptionPane.YES_OPTION) {
					Controlador.logout();
					Login frame = new Login();
					frame.setVisible(true);
					dispose();
				}
			}
		});
		btnNewButton.setBackground(SystemColor.menu);
		btnNewButton.setBounds(948, 488, 56, 57);
		contentPane.add(btnNewButton);
		Image img2 = new ImageIcon(this.getClass().getResource("/logout.png")).getImage();
		btnNewButton.setIcon(new ImageIcon(img2));

		textField = new JTextField();
		textField.setBounds(425, 429, 116, 22);
		contentPane.add(textField);
		textField.setColumns(10);

		JLabel lblQuarto = new JLabel("Quarto");
		lblQuarto.setFont(new Font("Verdana", Font.PLAIN, 16));
		lblQuarto.setBounds(345, 432, 68, 16);
		contentPane.add(lblQuarto);
		
		JLabel lblNotcias = new JLabel("Not\u00EDcias");
		lblNotcias.setForeground(Color.DARK_GRAY);
		lblNotcias.setFont(new Font("Verdana", Font.BOLD, 23));
		lblNotcias.setBounds(557, 43, 123, 38);
		contentPane.add(lblNotcias);
	}
}