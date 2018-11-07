package trabalhoheranca;

import java.util.Scanner;
import java.util.ArrayList;

public class TrabalhoHeranca {

    public static Porta novaPorta(Scanner ler) {
        String cor;
        Double x, y, z;
        System.out.println("Qual a cor da porta?");
        cor = ler.next();
        System.out.println("Quais as dimensões da porta? (x,y,z)");
        x = ler.nextDouble();
        y = ler.nextDouble();
        z = ler.nextDouble();
        return new Porta(cor, x, y, z);
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int opc, i, index;
        String cor;
        ArrayList<Casa> casas = new ArrayList();
        ArrayList<Edificio> edificios = new ArrayList();
        ArrayList<Porta> portas;
        Boolean exec = true;
        do {
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
                                System.out.println("Casa " + (i+1));
                                i++;
                            }
                            index = ler.nextInt();
                            Casa c2 = casas.get(index-1);
                            System.out.println("O que deseja fazer?\n1-Adicionar porta\n2-Total de portas\n3-Portas abertas\n4-Abrir porta\n5-Pintar porta\n6-Fechar porta");
                            opc = ler.nextInt();
                            switch (opc) {
                                case 1:
                                    Porta p2;
                                    p2 = novaPorta(ler);
                                    c2.adicionarPorta(p2);
                                    System.out.println("Porta adicionada com sucesso!");
                                    break;
                                case 2:
                                    System.out.println("Total de portas:" + c2.totalPortas());
                                    break;
                                case 3:
                                    System.out.println("Portas abertas: " + c2.portasAbertas());
                                    break;
                                case 4:
                                    System.out.println("Qual porta deseja abrir?\n1-P1\n2-P2\n3-P3");
                                    index = ler.nextInt();
                                    switch (index) {
                                        case 1:
                                            c2.getPorta1().abrir();
                                            break;
                                        case 2:
                                            c2.getPorta2().abrir();
                                            break;
                                        case 3:
                                            c2.getPorta3().abrir();
                                            break;
                                    }
                                    break;
                                case 5:
                                    System.out.println("Qual porta deseja pintar?\n1-P1\n2-P2\n3-P3");
                                    index = ler.nextInt();
                                    System.out.println("Digite a nova cor:");
                                    cor = ler.next();
                                    switch (index) {
                                        case 1:
                                            c2.getPorta1().pintar(cor);
                                            break;
                                        case 2:
                                            c2.getPorta1().pintar(cor);
                                            break;
                                        case 3:
                                            c2.getPorta1().pintar(cor);
                                            break;
                                    }
                                    break;
                                case 6:
                                    System.out.println("Qual porta deseja fechar?\n1-P1\n2-P2\n3-P3");
                                    index = ler.nextInt();
                                    switch (index) {
                                        case 1:
                                            c2.getPorta1().fechar();
                                            break;
                                        case 2:
                                            c2.getPorta2().fechar();
                                            break;
                                        case 3:
                                            c2.getPorta3().fechar();
                                            break;
                                    }
                                    break;
                            }
                            break;
                        case 2:
                            System.out.println("Escolha no indice abaixo\nEdifício:");
                            while (i < edificios.size()) {
                                System.out.println("Edifício"+(i + 1));
                                i++;
                            }
                            index = ler.nextInt();
                            Edificio ed2 = edificios.get(index-1);
                            System.out.println("O que deseja fazer?\n1-Adicionar porta\n2-Total de portas\n3-Portas abertas\n4-Abrir porta\n5-Pintar porta\n6-Fechar porta\n7-Total de andares\n8-Adicionar andar");
                            opc = ler.nextInt();
                            switch (opc) {
                                case 1:
                                    Porta p2;
                                    p2 = novaPorta(ler);
                                    ed2.adicionarPorta(p2);
                                    System.out.println("Porta adicionada com sucesso!");
                                    break;
                                case 2:
                                    System.out.println("Total de portas: " + ed2.totalPortas());
                                    break;
                                case 3:
                                    System.out.println("Total de portas abertas: " + ed2.portasAbertas());
                                    break;
                                case 4:
                                    portas = ed2.getPortas();
                                    System.out.println("Qual porta deseja abrir?");
                                    while (i < portas.size()) {
                                        System.out.println("" + (i + 1) + "");
                                    }
                                    index = ler.nextInt();
                                    portas.get(index - 1).abrir();
                                    break;
                                case 5:
                                    portas = ed2.getPortas();
                                    System.out.println("Qual porta deseja pintar?");
                                    while (i < portas.size()) {
                                        System.out.println("" + (i + 1) + "");
                                    }
                                    index = ler.nextInt();
                                    System.out.println("Qual a cor que deseja?");
                                    cor = ler.next();
                                    portas.get(index - 1).pintar(cor);
                                    break;
                                case 6:
                                    portas = ed2.getPortas();
                                    System.out.println("Qual porta deseja fechar?");
                                    while (i < portas.size()) {
                                        System.out.println("" + (i + 1) + "");
                                    }
                                    index = ler.nextInt();
                                    portas.get(index - 1).fechar();
                                    break;
                                case 7:
                                    System.out.println(ed2.totalAndares());
                                    break;
                                case 8:
                                    ed2.adicionarAndar();
                                    System.out.println("Andar adicionado com sucesso");
                                    break;
                            }
                            break;
                    }
                    break;
                default:
                    System.out.println("Opção invalida!!");
                    break;
            }
            System.out.println("Deseja continuar operando?\n1-Sim\n2-Não");
            opc = ler.nextInt();
            if(opc == 2)
                exec = false;
        } while (exec);
    }
}
