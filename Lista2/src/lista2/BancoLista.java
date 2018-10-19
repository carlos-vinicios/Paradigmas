package lista2;

import java.util.*;

public class BancoLista {
    private ArrayList<ContaCorrente> contas;
    
    public BancoLista(){
        contas = new ArrayList();
    }
    
    public void criarConta(){
        this.contas.add(new ContaCorrente());
    }
    
    public void fecharConta(ContaCorrente conta){
        contas.remove(conta);
    }
    
    public boolean sacar(ContaCorrente conta, double valor){
        double novoSaldo;
        if(conta.getSaldo() >= valor){
            novoSaldo = conta.getSaldo() - valor; 
            conta.setSaldo(novoSaldo);
            return true;
        }
        return false;
    }
    
    public boolean depositar(ContaCorrente conta, double valor){
        double novoSaldo;
        if(valor > 0){
            novoSaldo = conta.getSaldo() + valor;
            conta.setSaldo(novoSaldo);
            return true;
        }
        return false;
    }
    
    public double saldo(ContaCorrente conta){
        return conta.getSaldo();
    }
    
    public String extrato(ContaCorrente conta){
        String str = "";
        ArrayList<Movimentacao> movimentacoes;
        int i;
        
        movimentacoes = conta.listarMovimentacao();
        
        for(i=0; i < movimentacoes.size(); i++){
            Movimentacao movi = movimentacoes.get(i);
            str= str + "Valor: R$ "+movi.getValor()+"\nDescrição: "+movi.getDescricao()+"\nTipo: "+movi.getTipo()+"\n";
        }
        
        return str;
    }
    
    //Conta1 para conta2
    public boolean transferencia(ContaCorrente conta1, ContaCorrente conta2, double valor){
        double novoSaldo;
        if(conta1.getSaldo() >= valor){
            novoSaldo = conta2.getSaldo() + valor;
            conta2.setSaldo(novoSaldo);
            novoSaldo = conta1.getSaldo() - valor;
            conta1.setSaldo(novoSaldo);
            return true;
        }
        return false;
    }
}
