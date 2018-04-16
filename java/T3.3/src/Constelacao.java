import java.util.ArrayList;

/**
 * @author ruani
 *
 */

public class Constelacao {
	
	/**
	 * @param args
	 */

private ArrayList<Estrela> star;										
    
    public Constelacao(){
        this.star = new ArrayList<Estrela>();							
    }																	
    
    public void adicionar(Estrela e){	
    	//Obrigatorio 
        star.add(e);
    }
       
    public void mostrarEstrelas(){											
    	//Obrigatorio
    	System.out.println("Informa��es das estrelas desta constela��o: ");
    	System.out.println();                                           
		for(Estrela e: star) {
			
            System.out.println("A estrela: " + e.getNome());				    
            System.out.println("tem uma temperatura de " + e.getTemp() + " �C");	
            System.out.println("e colora��o: " + e.getCor());					
            System.out.println();                                      			
		}		
    }
    
    public void tempConstelacao(){
    	//Obrigatorio
        double total = 0;
        for(Estrela e: star){											
            total += e.getTemp();										
        }
        
        System.out.println("A soma total da temperatura das estrelas � = " + total + " �C");
    }
      
    
    public void InfoConstelacao() {
    	System.out.println("Bem vindo a constela��o Orion");
    	System.out.println();										   
    	System.out.println("Fazem parte desta constela��o as estrelas: ");
    	System.out.println();
    }
}
