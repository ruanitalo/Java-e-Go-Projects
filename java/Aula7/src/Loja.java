import java.util.ArrayList;

public class Loja {

	private String nome;
	private ArrayList<Produto> prods;
	
	public Loja(String nome) {
		super();
		this.nome = nome;
		this.prods = new ArrayList<Produto>();
	}
	public double mediaPreco() {
		double soma = 0.0;
		for(Produto p : prods) {
			soma += p.getPreco();
		}
		return soma/prods.size();
	}
	
	public void inserirProduto(Produto p) {
		prods.add(p);
	}
	
	public void maiorPreco() {
		double maior = prods.get(0).getPreco();
		for(Produto p : prods) {
			maior = Math.max(maior, p.getPreco());
		}
	}
	public void menorPreco() {
		double menor = prods.get(0).getPreco();
		for(Produto p : prods) {
			menor = Math.min(menor, p.getPreco());
		}
	}
	
}
