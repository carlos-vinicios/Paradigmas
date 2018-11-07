package trabalhoheranca;

import java.util.ArrayList;

public class Edificio extends Imovel {
    private int totalDeAndares;
    private ArrayList<Porta> portas;

    public Edificio(String cor) {
        super(cor);
        this.totalDeAndares = 0;
        this.portas = new ArrayList();
    }
    
    
    public ArrayList getPortas(){
        return portas;
    }
    
    @Override
    public int portasAbertas(){
        int total = 0, i;
        for(i=0; i < this.portas.size(); i++)
            if(this.portas.get(i).estaAberta())
                total++;
        
        return total;
    }
    
    @Override
    public int totalPortas(){
        return portas.size();
    }
    
    @Override
    public int adicionarPorta(Porta p){
        portas.add(p);
        return 1;
    }
    
    public int totalAndares(){
        return this.totalDeAndares;
    }
    
    public void adicionarAndar(){
        this.totalDeAndares++;
    }
}
