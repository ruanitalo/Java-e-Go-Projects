
public class Teste {
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Alexsandro",50);
		Aluno a2 = new Aluno("Marcio",60);
		Aluno a3 = new Aluno("Ruan",23);
		Disciplina d = new Disciplina("COBOL");
		d.matricular("00024545845",a1);
		d.matricular("00024545855",a2);
		d.matricular("00024545895",a3);
		// o Hashcode determina a ordem de 
		//inserção no Hashmap
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		System.out.println(a3.hashCode());
		d.listarAlunos();
		
	}
}
