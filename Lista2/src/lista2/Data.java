package lista2;

public class Data {
    private String data;
    
    public Data(int dia, int mes, int ano){
        data = dia+"/"+mes+"/"+ano;
    }
    
    public Data(int dia, String mes, int ano){
        data =  mes+" "+ dia +", " + ano;
    }
    
    public Data(int dias, int ano){
        data = dias+" "+ano;    
    }
    
    public String getData(){
        return data;
    }
}
