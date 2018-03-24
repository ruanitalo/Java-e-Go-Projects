
public class Lampada {
	boolean acesa;
    int durabilidade, duraMax;
    
    public int getDurabilidade(){
        return this.durabilidade;
    }
    
    public void setDurabilidade(int durabilidade){
        this.durabilidade = durabilidade;
    }
    public void setDuraMax(int duraMax){
        this.duraMax = duraMax;
    }
    
    public int getDuraMax(){
        return this.duraMax;
    }
    
    public boolean isAcesa(){       
    return this.acesa;
    }
    
    public void setAcesa(boolean acesa){
        if(durabilidade==duraMax)
        {
            this.acesa = false;
        }
        else{
            durabilidade++; 
            this.acesa = acesa;
        }
    }       

}
