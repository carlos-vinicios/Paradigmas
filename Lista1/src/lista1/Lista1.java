package lista1;
import java.util.*;

/**
 * @author carlos_vinicios
 **/
public class Lista1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        /*//QUESTÃO 1
        int km_dirigidos, li_consumidos, km_combinada; 
        float consumo, total_combus, km_l;
        
        System.out.println("Digite os quilômetros dirigidos:");
        km_dirigidos = in.nextInt();
        System.out.println("Digite os litros de gasolina consumidos:");
        li_consumidos = in.nextInt();
        
        km_l = km_dirigidos / li_consumidos;
        
        System.out.println("Digite a quilometragem combinada");
        km_combinada = in.nextInt();
        
        consumo = km_combinada / km_l;
        
        System.out.println("O consumo em km/l: "+km_l);
        System.out.println("O total consumido até esse ponto é: " + consumo);
        //FIM QUESTÃO 1 */
        
        /*//QUESTÃO 2
        int itens_vendidos;
        double valor_item, total_vendido, sal_final;
        
        total_vendido = 0;
        
        System.out.println("Digite a quantidade de itens vendidos:");
        itens_vendidos = in.nextInt();
        
        for(int i = 0; i < itens_vendidos; i++){
            System.out.println("Digite o valor da " + (i+1) + "º mercadoria:");
            valor_item = in.nextFloat();
            
            total_vendido += valor_item;
        }
        
        sal_final = 200 + (total_vendido * 0.09);
        
        System.out.println("O salario dele será: R$" + sal_final);
        //FIM QUESTÃO 2 */
        
        /*//QUESTÃO 3
        int qtd_empregados;
        double horas_trab, sal_hora, sal_bruto;
        
        System.out.println("Digite a quantidade de empregados:");
        qtd_empregados = in.nextInt();
        
        for(int i = 0; i < qtd_empregados;  i++){
            System.out.println("Digite as horas trabalhadas:");
            horas_trab = in.nextDouble();
            
            System.out.println("Digite o salário-hora do empregado:");
            sal_hora = in.nextDouble();
            
            if(horas_trab > 40){
                sal_bruto = (sal_hora * horas_trab) + ((horas_trab - 40) * (sal_hora * 0.5));
            }else{
                sal_bruto = sal_hora * horas_trab;
            }
            
            System.out.println("O salário bruto: " + sal_bruto);
        }
        //FIM DA QUESTÃO 3 */
        
        /*//QUESTÃO 4
        int n = 5;
        for(int i = 1; i <= n; i++){
            System.out.println((10*i) + " " + (100*i) + " " + (1000*i));
        }
        //FIM DA QUESTÃO 4 */
        
        /*//QUESTÃO 7
        int num;
        
        System.out.println("Digite um número de 5 digitos:");
        num = in.nextInt();
        
        if(((num / 10000) >= 1) && ((num / 10000) < 10)){
            int dez_milhar = num / 10000;
            num = num % 10000;
            int milhar = num / 1000;
            num = num % 1000;
            num = num % 100;
            int dezena = num / 10;
            num = num % 10;
            int unidade = num;
            if(dez_milhar == unidade && milhar == dezena){
                System.out.println("palíndromo");
            }else{
                System.out.println("Não é palíndromo");
            }
        }else{
            System.out.println("Número não possui 5 digitos" + (num / 10000));
        }
        //FIM DA QUESTÃO 7 */
        
        /*//QUESTÃO 8
        int i, j, k;
      
        for(i = 0; i < 10; i++){
            for(j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        System.out.println();
        
        for(i = 9; i >= 0; i--){
            for(j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        System.out.println();
        
        for(i = 0; i < 10; i++){
            for(j = 0; j < i; j++){
                System.out.print(" ");
            }
            for(k = 0; k < (10 - i); k++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        System.out.println();
        
        for(i = 0; i < 10; i++){
            for(j = 0; j < (9 - i); j++){
                System.out.print(" ");
            }
            for(k = 0; k < (i+1); k++){
                System.out.print("*");
            }
            System.out.println();
        }
        //FIM DA QUESTÃO 8 */
        
        /*//QUESTÃO 9
        int prod, qtd_produto;
        
        System.out.println("Produto 1 - $2,98\nProduto 2 - $4,50\nProduto 3 - $9,98\nProduto 4 - $4,49\nProduto 5 - $6,87");
        prod = in.nextInt();
        qtd_produto = in.nextInt();
        
        switch(prod){
            case 1:
                System.out.println("Total: $" + (2.98 * qtd_produto));
                break;
            case 2:
                System.out.println("Total: " + (4.50 * qtd_produto));
                break;
            case 3:
                System.out.println("Total: " + (9.98 * qtd_produto));
                break;
            case 4:
                System.out.println("Total: " + (4.49 * qtd_produto));
                break;
            case 5:
                System.out.println("Total: " + (6.87 * qtd_produto));
                break;
            default:
                System.out.println("Produto inválido");
                break;
        }
        //FIM DA QUESTÃO 9*/
        
        /*//QUESTÃO 10
        int i, j, k;
        
        for(i = 0; i < 500; i++)
            for(j = 0; j < 500; j++)
                for(k = 0; k < 500; k++)    
                    if((i*i + j*j == k*k || k*k + i*i == j*j || k*k + j*j == i*i) && i > 0 && j > 0 && k > 0)
                        System.out.println(i + ", " + j + ", " + k);
               
        //FIM DA QUESTÃO 10*/
        
        /*//QUESTÃO 11
        int i, j, k, l = 1, m, n = 1;
        
        for(i = 0; i < 9; i++){
            for(m = 0; m < 2; m++){
                for(j = 0; j < (5 - n); j++)
                    System.out.print(" ");
                if(m == 0)
                    for(k = 0; k < l; k++)
                        System.out.print("*");
            }
            if(i < 4){
                l+=2;
                n++;
            }else{
                l-=2;
                n--;
            }
            System.out.println();
        }
        //FIM DA QUESTÃO 11*/
        
        /*//QUESTÃO 12
        int linhas, i, j, k, l = 1, m, n = 1, mid;
        
        System.out.println("Digite a quantidade de linhas do losango:");
        linhas = in.nextInt();
        
        mid = (int) linhas / 2;
        
        if(linhas % 2 != 0 && linhas >= 1 && linhas <= 19){   
            for(i = 0; i < linhas; i++){
                for(m = 0; m < 2; m++){
                    for(j = 0; j < ((mid + 1) - n); j++)
                        System.out.print(" ");
                    if(m == 0)
                        for(k = 0; k < l; k++)
                            System.out.print("*");
                }
                if(i < mid){
                    l+=2;
                    n++;
                }else{
                    l-=2;
                    n--;
                }
                System.out.println();
            }
        }else{
            System.out.println("Número inválido");
        }
        //FIM QUESTÃO 12*/
        
        //QUESTÃO 13
        
        float pi = 0;
        int i = 1, j;
        
        j = 1;
        do{
            if(i % 2 == 0)
                pi -= (float) 4 / j;
            else
                pi += (float) 4 / j;
            
            j+=2;
            i++;
            System.out.println("O valor de pi é " + pi);
        }while(pi != 3.14159);
        
        System.out.println("Qtd é " + i);
        System.out.println("O valor de pi é " + pi);
        //FIM QUESTÃO 13
    }
    
}
