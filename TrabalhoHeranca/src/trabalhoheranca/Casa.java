package trabalhoheranca;

public class Casa extends Imovel {
    private Porta p1, p2, p3;

    public Casa(Porta p1, String cor) {
        super(cor);
        this.p1 = p1;
    }
    
    public Porta getPorta1(){
        return this.p1;
    }
    
    public Porta getPorta2(){
        return this.p2;
    }
    
    public Porta getPorta3(){
        return this.p3;
    }
    
    @Override
    public int adicionarPorta(Porta p){
       if(p1 == null){
           this.p1 = p;
           return 1;
       }else if(p2 == null){
           this.p2 = p;
           return 1;
       }else if(p3 == null){
           this.p3 = p;
           return 1;
       }
       return 0;
    }
    
    @Override
    public int totalPortas(){
        int total=0;
        if(p1 != null)
            total++;
        if(p2 != null)
            total++;
        if(p3 != null)
            total++;
        return total;
    }
    
    @Override
    public int portasAbertas(){
        int total=0;
        if(p1.estaAberta())
            total++;
        if(p2.estaAberta())
            total++;
        if(p3.estaAberta())
            total++;
        return total;
    }
    
    
}
