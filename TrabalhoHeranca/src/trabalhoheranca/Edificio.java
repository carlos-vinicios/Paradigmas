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
    
    public int totalAndares(){
        return this.totalDeAndares;
    }
    
    public void adicionarAndar(){
        this.totalDeAndares++;
    }
    
    public void adicionarPorta(Porta p){
        portas.add(p);
    }
}
