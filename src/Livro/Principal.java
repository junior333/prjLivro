package Livro;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		int opc = 0, idade;
		String nome, sexo;
		int x = 1, y = 1;
		Pessoa[] p = new Pessoa[10];
		Livro[] l = new Livro[10];

		while (opc != 9 && x < 11 && y < 11) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("--------------MENU--------------\n"
					+ "1-CRIAR LEITOR\n2-CRIAR LIVRO\n3-FAZER EMPRESTIMO\n4-CONSULTAR LIVROS\n5-CONSULTAR LEITORES\n6-PROCURAR"
					+ "\n9-CANCELAR"));

			switch (opc) {
			case 1:
				JOptionPane.showMessageDialog(null, "CADASTRO DO LEITOR");
				nome = JOptionPane.showInputDialog("DIGITE O NOME");
				idade = Integer.parseInt(JOptionPane.showInputDialog("DIGITE A IDADE"));
				sexo = JOptionPane.showInputDialog("Sexo M/F");
				p[x] = new Pessoa(nome, idade, sexo);
				x++;
				break;
			case 2:
				JOptionPane.showMessageDialog(null, "CADASTRO DO LIVRO");
				String titulo = JOptionPane.showInputDialog("TITULO DO LIVRO");
				String autor = JOptionPane.showInputDialog("AUTOR DO LIVRO");
				int pg = Integer.parseInt(JOptionPane.showInputDialog("QUANTIDADE DE PAGINAS"));
				l[y] = new Livro(titulo, autor, pg);
				y++;
				break;
			case 3:
				JOptionPane.showMessageDialog(null, "EMPRESTIMO");
				System.out.println("LEITORES");
				for (int cp = 1; cp < x; cp++) {
					System.out.println(cp + "-" + p[cp].getNome());
				}
				int selp = Integer.parseInt(JOptionPane.showInputDialog("SELECIONE O LEITOR"));
				System.out.println();
				System.out.println("LIVROS");
				for (int cl = 1; cl < y; cl++) {
					System.out.println(cl + "-" + l[cl].getTitulo());
				}
				int sell = Integer.parseInt(JOptionPane.showInputDialog("SELECIONE O LIVRO"));

				l[sell].setLeitor(p[selp]);
				break;
			case 4:
				System.out.println("LIVROS");
				for (int cl = 1; cl < y; cl++) {
					l[cl].consultar();
					System.out.println();
				}
				break;
			case 5:
				System.out.println("LEITORES");
				for (int cp = 1; cp < x; cp++) {
					System.out.println(
							cp + "-" + p[cp].getNome() + " IDADE:" + p[cp].getIdade() + " SEXO: " + p[cp].getSexo());
					//p[cp].livrosEmprestados();
				}
				break;
			case 6:
				opc = Integer.parseInt(JOptionPane.showInputDialog("----------PROCURAR----------\n"+
						"1- LIVRO\n2-AUTOR\n3-LEITOR\n"));
				break;
			}
		}
	}

}
