package aplicacao;

import javax.swing.*;

public class DecoradorSimples {
	public static void main(String[] args) {
		String linguagem[] = {
				"C#", "JAVA", "C", "PHP", "RUBY", "JavaScript"
				, "PYTHON", "PASCAL", "COBOL", "BASIC", "LISP", "SQL"
				, "LUA", "C++", "FORTRAN", "RUST"
		};
		
		JTextArea saida = new JTextArea(8, 20);
		JScrollPane scroll = new JScrollPane(saida);
		
		saida.setText("LINGUAGENS DE PROGRAMAÇÃO\n\n");
		for(int i = 0; i <= linguagem.length - 1; i++) {
			saida.append("Posição " + (i + 1) + "a. " + ": " + linguagem[i] + "\n");
		}
		JOptionPane.showMessageDialog(null, scroll);
		// como mostrar os dados sem o decorator?
		JOptionPane.showMessageDialog(null, linguagem);
	}
}
