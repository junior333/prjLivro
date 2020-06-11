package Livro;

public class Livro implements Leitura {
	private String titulo;
	private String autor;
	private int totPag;
	private int atPag;
	private boolean aberto;
	private Pessoa leitor;

	public Livro(String titulo, String autor, int totPag) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.totPag = totPag;
		this.atPag = 0;
		this.aberto = false;
	}

	public void consultar() {
		if(this.getLeitor() != null)
		System.out.println("Livro \ntitulo= " + titulo + "\nautor= " + autor + "\ntotPag= " + totPag + "\natPag= " + atPag
				+ "\naberto= " + aberto + "\nleitor= " + leitor.getNome());
		else {
			System.out.println("Livro \ntitulo= " + titulo + "\nautor= " + autor + "\ntotPag= " + totPag + "\natPag= " + atPag
					+ "\naberto= " + aberto +"\nleitor= LIVRO NÃO EMPRESTADO");
		}
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getTotPag() {
		return totPag;
	}

	public void setTotPag(int totPag) {
		this.totPag = totPag;
	}

	public int getAtPag() {
		return atPag;
	}

	public void setAtPag(int atPag) {
		this.atPag = atPag;
	}

	public boolean getAberto() {
		return aberto;
	}

	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}

	public Pessoa getLeitor() {
		return leitor;
	}

	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}

	@Override
	public void abrir() {
		if (!getAberto()) {
			setAberto(true);
		}
		System.out.println("LIVRO ABERTO");
	}

	@Override
	public void fechar() {
		if (getAberto()) {
			setAberto(false);
			setAtPag(0);
		}
		System.out.println("LIVRO FECHADO");
	}

	@Override
	public void folhear(int pg) {
		abrir();
		setAtPag(pg);
		System.out.println("LIVRO ABERTO NA PAGINA " + getAtPag());
	}

	@Override
	public void proxpg() {
		if (getAtPag() < getTotPag()) {
			setAtPag(getAtPag() + 1);
		} else {
			System.out.println("FIM DO LIVRO");
		}
	}

	@Override
	public void antpg() {
		if (getAtPag() > 0) {
			setAtPag(getAtPag() - 1);
		} else {
			System.out.println("COMEÇO DO LIVRO");
		}
	}

}
