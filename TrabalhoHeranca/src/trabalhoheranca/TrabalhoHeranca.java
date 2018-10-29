package trabalhoheranca;

import java.util.Scanner;
import java.util.ArrayList;

public class TrabalhoHeranca {

    public static Porta novaPorta(Scanner ler) {
        String cor;
        int x, y, z;
        System.out.println("Qual a cor da porta?");
        cor = ler.next();
        System.out.println("Quais as dimensões x,y,z");
        x = ler.nextInt();
        y = ler.nextInt();
        z = ler.nextInt();
        return new Porta(cor, x, y, z);
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int opc, i, index;
        String cor;
        ArrayList<Casa> casas = new ArrayList();
        ArrayList<Edificio> edificios = new ArrayList();

        System.out.println("O que deseja fazer\n1-Construir\n2-Manipular");
        opc = ler.nextInt();
        switch (opc) {
            case 1:
                System.out.println("O que deseja construir?\n1-Casa\n2-Edificio");
                opc = ler.nextInt();
                switch (opc) {
                    case 1:
                        Porta p1;
                        System.out.println("Qual a cor da casa?");
                        cor = ler.next();
                        p1 = novaPorta(ler);
                        Casa c1 = new Casa(p1, cor);
                        casas.add(c1);
                        break;
                    case 2:
                        System.out.println("Qual a cor do edifício?");
                        cor = ler.next();
                        Edificio ed1 = new Edificio(cor);
                        edificios.add(ed1);
                        break;
                    default:
                        break;
                }
                break;
            case 2:
                System.out.println("1-Casas\n2-Edifícios");
                opc = ler.nextInt();
                i = 0;
                switch (opc) {
                    case 1:
                        System.out.println("Escolha no indice abaixo\nCasa:");
                        while (i < casas.size()) {
                            System.out.print(i + 1);
                        }
                        index = ler.nextInt();
                        Casa c2 = casas.get(index);
                        System.out.println();
                        break;
                    case 2:
                        System.out.println("Escolha no indice abaixo\nEdifício:");
                        while (i < edificios.size()) {
                            System.out.print(i + 1);
                        }
                        index = ler.nextInt();
                        Edificio ed2 = edificios.get(index);
                        break;
                }
                break;
            default:
                break;
        }

    }
}
