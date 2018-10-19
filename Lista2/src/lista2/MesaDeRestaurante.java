package lista2;

import java.util.*;

public class MesaDeRestaurante {
    private int qtdClientes;
    private ArrayList<Pedido> pedidos;

    public MesaDeRestaurante(int qtdClientes) {
        this.qtdClientes = qtdClientes;
        this.pedidos = new ArrayList();
    }
    
    public void adicionaPedido(int qtd, double preco){
        pedidos.add(new Pedido(qtd, preco));
    }
    
    public void cancelaPedido(int num){
        pedidos.remove(num);
    }
    
    public double[] calculaTotal(){
        Pedido pedido;
        int index = 0;
        double totais[];
        totais = new double[3];
        while(index < pedidos.size()){
            pedido = pedidos.get(index);
            totais[0] = totais[0] + pedido.getQtd() * pedido.getPreco();
            index++;
        }
        totais[1] = totais[0] * 0.1;
        totais[2] = totais[0] / this.qtdClientes;
        return totais;
    }
    
    public String imprimeConta(){
        double totais[];
        String text;
        totais = calculaTotal();
        text = "Total a pagar: " + totais[0] + "\nTotal de gorjeta: " + totais[1] + "\nTotal sugerido para cada cliente: " + totais[2];
        return text;
    }
}
