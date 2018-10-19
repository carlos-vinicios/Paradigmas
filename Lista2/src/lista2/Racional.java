package lista2;

public class Racional {
    private int num;
    private int den;
    
    public Racional(){
        this.num = 0;
        this.den = 1;
    }
    
    public Racional(int num, int den){
        this.num = num;
        this.den = den;
    }
    
    public Racional somar(Racional r1, Racional r2){
        Racional r3;
        int den, num;
        if(r1.getDen() == r2.getDen()){
            num = r1.getNum() + r2.getNum();
            r3 = new Racional(num, r1.getDen());
            return r3;
        }else{
            if(r1.getDen() % r2.getDen() == 0 || r2.getDen() % r1.getDen() == 0){
                if(r1.getDen() > r2.getDen()){
                    den = r1.getDen();
                }else{
                    den = r2.getDen();
                }
            }else{
                den = r1.getDen() * r2.getDen();
            }
            num = r1.getNum() * (den / r1.getDen()) + r2.getNum() * (den / r2.getDen());
            r3 = new Racional(num, den);
            return r3;
        }
    }
    
    public Racional subtrair(Racional r1, Racional r2){
        Racional r3;
        int den, num;
        if(r1.getDen() == r2.getDen()){
            num = r1.getNum() - r2.getNum();
            r3 = new Racional(num, r1.getDen());
            return r3;
        }else{
            if(r1.getDen() % r2.getDen() == 0 || r2.getDen() % r1.getDen() == 0){
                if(r1.getDen() > r2.getDen()){
                    den = r1.getDen();
                }else{
                    den = r2.getDen();
                }
            }else{
                den = r1.getDen() * r2.getDen();
            }
            num = r1.getNum() * (den / r1.getDen()) - r2.getNum() * (den / r2.getDen());
            r3 = new Racional(num, den);
            return r3;
        }
    }
    
    public Racional multiplicar(Racional r1, Racional r2){
        return new Racional(r1.getNum() * r2.getNum(), r1.getDen() * r2.getDen());
    }
    
    public Racional dividir(Racional r1, Racional r2){
        return new Racional(r1.getNum() * r2.getDen(), r1.getDen() * r2.getNum());
    }
    
    public void imprimirA_B(Racional r){
        System.out.println(r.getNum());
        System.out.println("__");
        System.out.println(r.getDen());
    }
    
    public void imprimirRacional(Racional r){
        System.out.println(r.getNum() / r.getDen());
    }
    
    public int getNum(){
        return this.num;
    }
    
    public int getDen(){
        return this.den;
    }
}
