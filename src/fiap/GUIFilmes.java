// Nome: Daniel Henrique Alcântara Oliveira Martins		RM: 94615
// Nome: Luís Felipe Garcia Menzes						RM: 94051

package fiap;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.event.*;

@SuppressWarnings("serial")
public class GUIFilmes extends JPanel {
	private JLabel lbCodigo, lbTitulo, lbProdutora, lbGenero, lbImagem;
	private JTextField tfCodigo, tfTitulo;
	private JRadioButton rbWarner, rbFox, rbDisney, rbUniversal;
	private JList<String> liFotos;
	private ImageIcon imagem1;
	private JScrollPane sp;
	private JButton btSalvar, btCancelar;
	
	public GUIFilmes() {
		inicializarComponentes();
		definirEventos();
	}
	
	public void inicializarComponentes() {
		setLayout(null);
		setBackground(Color.lightGray);
		lbCodigo = new JLabel("Codigo:");
		lbTitulo = new JLabel("Titulo:");
		tfCodigo = new JTextField();
		tfTitulo = new JTextField();
		
		lbProdutora = new JLabel("Produtora:");
		rbWarner = new JRadioButton("Warner");
		rbWarner.setBackground(getBackground());
		rbFox = new JRadioButton("Fox");
		rbFox.setBackground(getBackground());
		rbDisney = new JRadioButton("Disney");
		rbDisney.setBackground(getBackground());
		rbUniversal= new JRadioButton("Universal");
		rbUniversal.setBackground(getBackground());
		
		String[] fotos = new String[5];
		fotos[0] = "Fantasia";
		fotos[1] = "Infantil";
		fotos[2] = "Medieval";
		fotos[3] = "Nordico";
		fotos[4] = "Terror";
        
        liFotos = new JList<String>(fotos);
        sp = new JScrollPane(liFotos);
        lbGenero = new JLabel("Genero:");
        imagem1 = new ImageIcon();
        lbImagem = new JLabel(imagem1);
		
		btSalvar = new JButton("Salvar");
		btCancelar = new JButton("Cancelar");
		
		lbCodigo.setBounds(10, 30, 60, 25);
		tfCodigo.setBounds(80, 30, 50, 25);
		lbTitulo.setBounds(10, 60, 60, 25);
		tfTitulo.setBounds(80, 60, 160, 25);
		
		lbProdutora.setBounds(10, 100, 70, 25);
		rbWarner.setBounds(20, 125, 100, 25);
		rbFox.setBounds(20, 150, 100, 25);
		rbDisney.setBounds(20, 175, 100, 25);
		rbUniversal.setBounds(20, 200, 100, 25);
		
		lbGenero.setBounds(260, 30, 60, 25);
		sp.setBounds(260, 60, 100, 120);
		lbImagem.setBounds(400, 50, 180, 180);
		
		btSalvar.setBounds(200, 320, 100, 25);
		btCancelar.setBounds(450, 320, 100, 25);
		
		add(lbCodigo);
		add(tfCodigo);
		add(lbTitulo);
		add(tfTitulo);
		add(lbProdutora);
		add(rbWarner);
		add(rbFox);
		add(rbDisney);
		add(rbUniversal);
		add(lbGenero);
		add(sp);
		add(lbImagem);
		add(btSalvar);
		add(btCancelar);

		
	}
	
	public void definirEventos() {
		
		 liFotos.addListSelectionListener(new ListSelectionListener() {
	            public void valueChanged(ListSelectionEvent e) {
	                imagem1 = new ImageIcon(getClass().getResource("Genero/" + 
	                					liFotos.getSelectedValue() + ".png"));
	                lbImagem.setIcon(imagem1);
	            }
	     });
	        
	     
		 btSalvar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				String dados = "Filme Selecionado: ";
				dados += "\nCodigo: " + tfCodigo.getText();
				dados += "\nTitulo: " + tfTitulo.getText();
				if(rbWarner.isSelected()) {
					dados+= "\nProdutora: Warner";
				}else if(rbFox.isSelected()){
					dados+= "\nProdutora: Fox";
				}else if(rbDisney.isSelected()){
					dados+= "\nProdutora: Disney";
				}else if(rbUniversal.isSelected()){
					dados+= "\nProdutora: Universal";
				}
				
				JOptionPane.showMessageDialog(null, dados, "Filme ", JOptionPane.INFORMATION_MESSAGE, imagem1);
			}
		});
	        
	      
		
		btCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);				
			}
		});
		
	}
}
