package trabalhoheranca;

public class Casa extends Imovel {
    private Porta p1, p2, p3;

    public Casa(Porta p1, Porta p2, Porta p3, String cor) {
        super(cor);
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }
    
    @Override
    public int totalPortas(){
        return 3;
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
