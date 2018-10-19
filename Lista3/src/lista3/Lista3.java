package lista3;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Lista3 {

    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        /* QUESTÃO 1
        int classificador[];
        float valor;
        int exec = 0, i;
        classificador = new int[9];
        do{
            System.out.println("Digite o valor da venda semanal:");
            valor = ler.nextFloat();
            valor = 200 + (valor * 9 / 100);
            if(valor >= 200 && valor < 300){
                classificador[0]++;
            }else if(valor >= 300 && valor < 400){
                classificador[1]++;
            }else if(valor >=400 && valor < 500){
                classificador[2]++;
            }else if(valor >=500 && valor < 600){
                classificador[3]++;
            }else if(valor >=600 && valor < 700){
                classificador[4]++;
            }else if(valor >=700 && valor < 800){
                classificador[5]++;
            }else if(valor >=800 && valor < 900){
                classificador[6]++;
            }else if(valor >=900 && valor < 1000){
                classificador[7]++;
            }else{
                classificador[8]++;
            }
            System.out.println("Adicionar mais vendedores? 1- Sim | 2 - Não");
            exec = ler.nextInt();
        }while(exec == 1);
        
        for(i=0; i < classificador.length-1; i++){
            System.out.println("R$ "+ (i+2) +"00 - "+ (i+2) +"99");
            System.out.println("Quantidade:" + classificador[i]);
        }
        System.out.println("R$ 1000 e acima");
        System.out.println("Quantidade:" + classificador[i]);
        */
        
        /* QUESTÃO 2
        Random gerador = new Random();
        int d1, d2, jogadas[], res, i;
        
        jogadas = new int[11];
        
        for(i = 0; i < 32000; i++){
            d1 = gerador.nextInt(6)+1;
            d2 = gerador.nextInt(6)+1;
            res = d1 + d2;
            switch(res){
                case 2:
                    jogadas[0]++;
                    break;
                case 3:
                    jogadas[1]++;
                    break;
                case 4:
                    jogadas[2]++;
                    break;
                case 5:
                    jogadas[3]++;
                    break;
                case 6:
                    jogadas[4]++;
                    break;
                case 7:
                    jogadas[5]++;
                    break;
                case 8:
                    jogadas[6]++;
                    break;
                case 9:
                    jogadas[7]++;
                    break;
                case 10:
                    jogadas[8]++;
                    break;
                case 11:
                    jogadas[9]++;
                    break;
                case 12:
                    jogadas[10]++;
                    break;
            }
        }
        
        for(i=0; i < jogadas.length; i++)
            System.out.println((i+2)+": "+jogadas[i]);
        */
        
        
        
        
        
        
    }
}
