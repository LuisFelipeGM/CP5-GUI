// Nome: Daniel Henrique Alcântara Oliveira Martins		RM: 94615
// Nome: Luís Felipe Garcia Menzes						RM: 94051

package fiap;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


@SuppressWarnings("serial")
public class GUIPrincipal extends JFrame {
	private Container contentPane;
	private JMenuBar mnBarra;
	private JMenu mnArquivo, mnCadastros;
	private JMenuItem miSair, miFilmes;
	
	public GUIPrincipal() {
		inicializarComponentes();
		definirEventos();
	}
	
	public void inicializarComponentes() {
		setTitle("Janela Principal");
		setBounds(0, 0, 800, 500);
		contentPane = getContentPane();
		mnBarra = new JMenuBar();
		mnArquivo = new JMenu("Arquivo");
		mnArquivo.setMnemonic('A');
		mnCadastros = new JMenu("Cadastros");
		mnCadastros.setMnemonic('C');
		miSair = new JMenuItem("Sair", new ImageIcon(getClass().getResource("exit_icon.png")));
		miFilmes = new JMenuItem("Filmes");
		setJMenuBar(mnBarra);
		mnBarra.add(mnArquivo);
		mnBarra.add(mnCadastros);
		mnArquivo.add(miSair);
		mnCadastros.add(miFilmes);
	}
	
	public void definirEventos() {
		
		miSair.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				System.exit(0);	
			}
		});
		
		miFilmes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUIFilmes filmes = new GUIFilmes();
				contentPane.removeAll();
				contentPane.add(filmes);
				contentPane.validate();

			}
		});
		
	}

}
