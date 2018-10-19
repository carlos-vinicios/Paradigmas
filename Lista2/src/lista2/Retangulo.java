package lista2;

public class Retangulo {
    private double base;
    private double altura;

    public Retangulo() {
        this.base = 1;
        this.altura = 1;
    }
    
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double calcularPerimetro(){
        return 2*base + 2*altura;
    }
    
    public double calcularArea(){
        return base*altura;
    }
}
