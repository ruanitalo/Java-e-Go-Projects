
public class Teste {
	public static void main(String[] args) {
        //Pessoa renan = new Pessoa();
        //renan.setNome("Renan");
        //renan.setIdade(1-3);
        //renan.setVegetariana(false);
        //Churrasco casaDoMaozinha = new Churrasco();
        //System.out.println(casaDoMaozinha.verificarConsumo(renan));
        
        Lampada quarto = new Lampada();
        //SETA A DURABILIDADE MÁXIMA PARA 10 DIAS
        quarto.setDuraMax(10);
        //ACENDE A LAMPADA
        quarto.setAcesa(true);
        //VERIFICA O ESTADO DA LAMPADA
        quarto.isAcesa();
    }

}
