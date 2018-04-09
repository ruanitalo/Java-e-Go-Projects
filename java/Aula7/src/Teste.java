
public class Teste {
//	public static void main(String[] args) {
		
		Aluno a1=new Aluno("Alexandre","00545412441", 27);
		Aluno a2=new Aluno("Ruan","00545412451", 23);
		Aluno a3=new Aluno("Andressa","00545412431", 21);
		Aluno a4=new Aluno("Bianca","00545412421", 22);
		Disciplina d=new Disciplina("Cobol",4);
		d.matricular(a1);
		d.matricular(a2);
		d.matricular(a3);
		d.matricular(a4);
		d.removerUltimo();
		d.mostrarAluno();
	
		
	//public static void main(String[] args) {
	//	Loja l = new Loja("Loja teste");
	//	Produto p0 = new Produto("Teste 0",500);
	//	Produto p1 = new Produto("Teste 0",100);
	//	Produto p2 = new Produto("Teste 0",150);
	//	Produto p3 = new Produto("Teste 0",600);
	//	Produto p4 = new Produto("Teste 0",250);
	//	l.inserirProduto(p1);
	//	l.inserirProduto(p2);
	//	l.inserirProduto(p0);
	//	l.inserirProduto(p4);
	//	l.inserirProduto(p3);
	//	System.out.println(l.mediaPreco());
	//	System.out.println(l.mediaPreco());
		
//	}

//}
