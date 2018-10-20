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
 /* QUESTÃO 3
        String reserva, fila;
        char assento;
        boolean assentos[][];
        int i, j, classe, index_fila, index_assento = 0;

        assentos = new boolean[20][6];

        for (i = 0; i < assentos.length; i++) {
            for (j = 0; j < assentos[i].length; j++) {
                assentos[i][j] = false;
            }
        }

        System.out.println("1- Primeira Classe\n2- Econômica");
        classe = ler.nextInt();
        System.out.println("Escolha um assento:");
        if (classe == 1) {
            System.out.println("  A  B  C  D  E  F");
            for (i = 0; i < 5; i++) {
                System.out.print(i + 1);
                for (j = 0; j < assentos[i].length; j++) {
                    System.out.print("  " + assentos[i][j]);
                }
                System.out.println();
            }
        } else {
            System.out.println("     A       B       C      D      E      F");
            for (i = 5; i < assentos.length; i++) {
                System.out.print(i + 1);
                for (j = 0; j < assentos[i].length; j++) {
                    System.out.print("  " + assentos[  i][j]);
                }
                System.out.println();
            }
        }
        reserva = ler.next();
        if (reserva.length() == 3) {
            fila = reserva.charAt(0) + "" + reserva.charAt(1);
            assento = reserva.charAt(2);
        } else {
            fila = reserva.charAt(0)+"";
            assento = reserva.charAt(1);
        }
        switch (assento) {
            case 'A':
                index_assento = 0;
                break;
            case 'B':
                index_assento = 1;
                break;
            case 'C':
                index_assento = 2;
                break;
            case 'D':
                index_assento = 3;
                break;
            case 'E':
                index_assento = 4;
                break;
            case 'F':
                index_assento = 5;
                break;
        }
        index_fila = Integer.parseInt(fila);
        if (!assentos[index_fila][index_assento]) {
            assentos[index_fila][index_assento] = true;
            System.out.print("         Bilhete de reserva       \n Assento: "+reserva+"\n Classe: ");
            if(classe == 1)
                System.out.print("Primeira Classe");
            else
                System.out.print("Econômica");
        }else{
            System.out.println("Erro na sua reserva de assento");
        }
         */
 
         /* QUESTÃO 4
        int a[] = {2, 9, 5, 6};
        int b[] = {9, 2, 3};

        InteiroGrande n1, n2, n3;
        n1 = new InteiroGrande(a);
        n2 = new InteiroGrande(b);
        n3 = n1.add(n2);
        n3.print();
        */
    }

    static class InteiroGrande {

        private int digitos[];
        private int last;

        public InteiroGrande() {
            digitos = new int[40];
            last = 0;
        }

        public InteiroGrande(int numero[]) {
            digitos = numero;
            last = numero.length;
        }

        public void input(int value) {
            digitos[last] = value;
            last++;
        }

        public int[] output() {
            return digitos;
        }

        public void print() {
            int i;
            for (i = 0; i < digitos.length; i++) {
                System.out.print(digitos[i]);
            }
            System.out.println();
        }

        public InteiroGrande add(InteiroGrande b) {
            int numero[], resto = 0, soma = 0, i, j, k;
            int a_digs[];
            int b_digs[];
            if (this.digitos.length < b.output().length) {
                a_digs = b.output();
                b_digs = this.digitos;
            } else {
                a_digs = this.digitos;
                b_digs = b.output();
            }
            numero = new int[a_digs.length + 1];
            k = a_digs.length;
            i = a_digs.length - 1;
            j = b_digs.length - 1;
            while (k >= 0) {
                soma += resto;
                resto = 0;
                if (i >= 0) {
                    soma += a_digs[i];
                }
                if (j >= 0) {
                    soma += b_digs[j];
                }
                if (soma > 9) {
                    resto = soma / 10;
                    soma -= 10;
                }
                numero[k] = soma;
                i--;
                j--;
                k--;
                soma = 0;
            }
            return new InteiroGrande(numero);
        }

        public InteiroGrande subtract(InteiroGrande b) {
            int numero[], sub = 0, i, j, k;
            int a_digs[];
            int b_digs[];
            if (this.digitos.length < b.output().length) {
                a_digs = b.output();
                b_digs = this.digitos;
            } else {
                a_digs = this.digitos;
                b_digs = b.output();
            }
            numero = new int[a_digs.length + 1];
            k = a_digs.length;
            i = a_digs.length - 1;
            j = b_digs.length - 1;
            while (k >= 0) {
                if (i >= 0) {
                    sub -= a_digs[i];
                }
                if (j >= 0) {
                    sub += b_digs[j];
                }
                sub = Math.abs(sub);
                numero[k] = sub;
                i--;
                j--;
                k--;
                sub = 0;
            }
            return new InteiroGrande(numero);
        }
    }
}
