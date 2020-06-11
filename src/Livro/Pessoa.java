package Livro;

public class Pessoa {
	private String nome;
	private int idade;
	private String sexo;
	
	public Pessoa(String nome, int idade, String sexo) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public void livrosEmprestados() {
		Livro l[]=new Livro [10];
		int cont=0;
		for(int i=0;i<10;i++) {
			if(l[i].getLeitor().equals(this.getNome())) {
				System.out.println(l[i].getTitulo()+"-"+l[i].getAutor());
				cont++;
			}
		}
		System.out.println("QUANTIDADE DE LIVROS: "+cont);
	}
}
