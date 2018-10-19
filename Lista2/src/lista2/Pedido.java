package lista2;

public class Pedido {
    private int qtd;
    private double preco;

    public Pedido(int qtd, double preco) {
        this.qtd = qtd;
        this.preco = preco;
    }
    
    public int getQtd(){
        return this.qtd;
    }
    
    public double getPreco(){
        return this.preco;
    }
    
    public void setQtd(int qtd){
        this.qtd = qtd;
    }
    
    public void setPreco(double preco){
        this.preco = preco;
    }
}
