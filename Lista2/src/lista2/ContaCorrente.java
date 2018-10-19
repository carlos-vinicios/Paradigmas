package lista2;

import java.util.*;

public class ContaCorrente {
    private int num;
    private double saldo;
    private boolean especial; //status da conta
    private double limite;
    private ArrayList<Movimentacao> movimentacoes;

    public ContaCorrente() {
        //this.num = ;
        movimentacoes = new ArrayList();
    }
    
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    public void novaMovimentacao(String desc, int tipo, double valor){
        this.movimentacoes.add(new Movimentacao(desc, valor, tipo));
    }
    
    public ArrayList<Movimentacao> listarMovimentacao(){
        return movimentacoes;
    }
    
}
