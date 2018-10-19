package lista2;

import java.util.*;

public class Country {
    private String nome;
    private String capital;
    private double dimensao;
    private ArrayList<Country> fronteiras;

    public Country(String nome, String capital, double dimensao) {
        this.nome = nome;
        this.capital = capital;
        this.dimensao = dimensao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public double getDimensao() {
        return dimensao;
    }

    public void setDimensao(double dimensao) {
        this.dimensao = dimensao;
    }
    
    public boolean equals(Country outro){
        if(outro.getNome() == this.nome && outro.getDimensao() == this.dimensao && outro.getCapital() == this.capital)
            return true;
        else
            return false;
    }
    
    public void fronteiras(){
        int i;
        for(i=0; i < this.fronteiras.size(); i++)
            System.out.println(this.fronteiras.get(i).getNome());
        
    }
}
