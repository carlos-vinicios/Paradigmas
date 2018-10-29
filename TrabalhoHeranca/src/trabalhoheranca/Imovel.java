package trabalhoheranca;

public abstract class Imovel {
    protected String cor;

    public abstract int portasAbertas();
    public abstract int totalPortas();
    public abstract int adicionarPorta(Porta p);
    
    public Imovel(String cor) {
        this.cor = cor;
    }
    
    public void pintar(String cor){
        this.cor = cor;
    }
    
    public String getCor(){
        return this.cor;
    }
}
