
public class Aluno {
	private String nome;
	private int idade;
	public Aluno(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
		}
	
	public String getNome() {
		return nome;
	}
	
	public int geIdade() {
		return idade;
	}
	
	public void mostrarInfo()	{
		System.out.println("Nome: "+ nome);
	
		System.out.println("Udade: " + idade);
	}
}
