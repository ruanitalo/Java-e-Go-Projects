/**
 * @author ruani
 *
 */
public class Estrela {
	
	/**
	 * @param args
	 */
	
    private String nome;
    private double temp;
    private String cor;
     
    public Estrela(String nome,double temp,String cor){
        this.nome = nome;
        this.temp = temp;
        this.cor = cor;        
    }
    
    public String getNome(){
        return nome;
    }
    
    public double getTemp(){
        return temp;
    }
    
    public String getCor(){
        return cor;
    }
    
    public void mostrar() {
    	//Obrigatorio
    	System.out.println("Nome: " + nome);
    	System.out.println("Temperatura: " + temp + " �C");
    	System.out.println("Cor: " + cor);
    	System.out.println();                                      
    }
    
    
}