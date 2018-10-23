package trabalhoheranca;

public class Porta {
    private boolean aberta;
    private String cor;
    private double dimX, dimY, dimZ;

    public Porta(String cor, double dimX, double dimY, double dimZ) {
        this.cor = cor;
        this.dimX = dimX;
        this.dimY = dimY;
        this.dimZ = dimZ;
        this.aberta = false;
    }
    
    public void abrir(){
        this.aberta = true;
    }
    
    public void fechar(){
        this.aberta = false;
    }
    
    public void pintar(String cor){
        this.cor = cor;
    }
    
    public boolean estaAberta(){
        return this.aberta;
    }
    
    public void alterarDimensoes(double x, double y, double z){
        this.dimX = x;
        this.dimY = y;
        this.dimZ = z;
    }
    
    public String getCor(){
        return this.cor;
    }
}
