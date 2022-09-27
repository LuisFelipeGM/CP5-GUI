// Nome: Daniel Henrique Alcântara Oliveira Martins		RM: 94615
// Nome: Luís Felipe Garcia Menzes						RM: 94051

package fiap;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class UsaPrincipal {
	public static void main(String[] args) {
		GUIPrincipal frame = new GUIPrincipal();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setLocation((tela.width - frame.getSize().width) / 2,
				(tela.height - frame.getSize().height) / 2);
		frame.setVisible(true);
	}

}
