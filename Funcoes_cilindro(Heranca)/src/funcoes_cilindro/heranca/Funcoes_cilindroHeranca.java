package funcoes_cilindro.heranca;

public class Funcoes_cilindroHeranca {
    
    public class Ponto{
        protected int x, y;

        public Ponto(int x, int y) {
            this.x = x;
            this.y = y;
        }
        
        public void printPonto(){
            System.out.println("X:" + x + "\nY:" + y);
        }
    }

    public class Circulo extends Ponto{
        protected int r; //raio

        public Circulo(int r, int x, int y) {
            super(x, y);
            this.r = r;
        }
        
        public void calcularArea(){
            System.out.println("Area:" + (3.14*r*r));
        }
        
        public void printCirculo(){
            System.out.println("X:"+x+"\nY:"+y+"\nRaio:"+r);
        }
    }

    public class Cilindro extends Circulo{
        private int h; //altura

        public Cilindro(int h, int r, int x, int y) {
            super(r, x, y);
            this.h = h;
        }
        
        public void calcularArea(){
            System.out.println("Area:" + (2*3.14*r*r + 2*3.14*r*h));
        }
        
        public void calcularVol(){
            System.out.println("Volume:" + (3.14*r*r*h));
        }
    }

    public static void main(String[] args) {
        
    }
    
}