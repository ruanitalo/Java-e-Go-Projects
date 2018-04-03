//aula 1 vetores
//polimorfismo parametrico (generics) eh o ato de se ter uma classe ao qual ha um parametro ex: T(tipo) que modifica o comportamento
// de acordo com alguma instancia
public class Disciplina {
	private String nome;
	private Aluno[]	alunos; //evita dar get para nao pegar a lista toda
	private int qtAtual;
	
	public Disciplina(String nome, int maxAluno) {
		this.nome = nome;
		this.alunos = new Aluno[maxAluno];
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getQAtual() {
		return qtAtual;		
	}
	
	public void matricular(Aluno a) {
		alunos[qtAtual++] = a;
	}
	
	public void removerUltimo() {
		qtAtual--;
		alunos[qtAtual]	 = null;
	}
	
	public void mostrarAluno() {
		for(int i=0; i<qtAtual;i++) { //variavel auxiliar int i=0 e um indice
			alunos[i].mostrarInfo();
		}
	}
}

