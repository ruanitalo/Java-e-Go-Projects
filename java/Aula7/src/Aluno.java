
public class Aluno {
	private String nome, ra;
	private int idade;
	public Aluno(String nome, String ra, int idade) {
		this.nome = nome;
		this.ra = ra;
		this.idade = idade;
		}
	
	public String getNome() {
		return nome;
	}
	
	public String getra() {
		return ra;
	}
	
	public int geIdade() {
		return idade;
	}
	
	public void mostrarInfo()	{
		System.out.println("Nome: "+ nome);
		System.out.println("Ra: "+ ra);
		System.out.println("Udade: " + idade);
	}
	
	

}
