import java.util.ArrayList;

public class DisciplinaD {
		private String nome;
		private ArrayList<Aluno> alunos;
		
		public DisciplinaD(String nome) {
			this.nome = nome;
			this.alunos = new ArrayList<Aluno>();
		}
		
		public String getNome() {
			return nome;
		}
		
		public void matricular(Aluno a) {
			if(a != null)
				alunos.add(a);
			}
		
		public void remover(Aluno a) {
			if(alunos.remove(a))
				System.out.println(a.getNome() + "removido");
			else
				System.out.println("Aluno n encontrado");
		}
		
		public void removerPeloIndice(int i) {
			if(i < 0 || i > alunos.size())
				System.out.println("Erro");
			else
				alunos.remove(i);
		}
// Arrays Normais: o tamanho e pelo array.length;      ArrayList: array.size();     conhecido como collection
		
		public int buscarAluno(Aluno a) {
			//se n achar, devolve -1
			return alunos.lastIndexOf(a);
		}
		
		public Aluno selecionarAluno(int i) {
			return alunos.get(i);
		}
		
		public void mostrarAluno() {
			for(Aluno a : alunos) { //Aluno a   >> variavel auxiliar eh um elemento
				a.mostrarInfo();
			}
		}
}
