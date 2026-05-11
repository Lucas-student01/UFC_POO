import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<Lutador> listaLutador = new ArrayList<>();
        List<Luta> listLuta = new ArrayList<>();
        List<Arbitro> listArbitro = new ArrayList<>();

        listaLutador.add(new Lutador("Lucas", "Brasileiro", (byte) 25, 1.75f, 61.1f, (byte) 0, (byte) 4, (byte) 0));
        listaLutador.add(new Lutador("Matheus", "Brasileiro", (byte) 25, 1.75f, 61.1f, (byte) 0, (byte) 4, (byte) 0));
        listaLutador.add(new Lutador("Danilo", "Brasileiro", (byte) 25, 1.75f, 61.1f, (byte) 0, (byte) 4, (byte) 0));
        listaLutador.add(new Lutador("Bitor", "Brasileiro", (byte) 25, 1.75f, 61.1f, (byte) 0, (byte) 4, (byte) 0));

        listLuta.add(new Luta((byte)5,1, listaLutador.get(0),listaLutador.get(1)));
        listLuta.add(new Luta((byte)5,2, listaLutador.get(2),listaLutador.get(3)));


        int x;
        do {
            Console.limpar();
            System.out.println("--MENU PRINCIPAL--");
            System.out.println("Mostrar Lutadores - 1");
            System.out.println("Mostrar Lutas - 2");
            System.out.println("Realizar Luta - 3");
            System.out.println("Sair - 0");

            System.out.print("Esolha uma opção: ");
            x = input.nextInt();
            switch (x) {
                case 1:
                    Console.limpar();
                    int y;
                    System.out.println("Mostrando Lutadores...");
                    do {
                        System.out.println("Cadastrar Lutador - 1");
                        System.out.println("Voltar - 0");

                        System.out.print("Esolha uma opção: ");
                        y = input.nextInt();
                        switch (y){
                            case 1:
                                Console.limpar();
                                System.out.println("Cadastrando Lutador...");
                                System.out.println("Mostrando Lutadores...");
                                break;
                            case 0:
                                System.out.println("Voltando para o Menu...");
                                break;
                            default:
                                System.out.println("Opção invalida!");
                        }
                    } while (y != 0);
                    break;
                case 2:
                    Console.limpar();
                    do {
                        System.out.println("Mostrando Lutas...");
                        System.out.println("Cadastrar Luta - 1");
                        System.out.println("Voltar - 0");

                        System.out.print("Esolha uma opção: ");
                        y = input.nextInt();
                        switch (y){
                            case 1:
                                Console.limpar();
                                System.out.println("Cadastrando Luta...");
                                break;
                            case 0:
                                System.out.println("Voltando para o Menu...");
                                break;
                            default:
                                System.out.println("Opção invalida!");
                        }
                    } while (y != 0);
                    break;
                case 3:
                    Console.limpar();
                    do {
                        System.out.println("Mostrando Lutas...");
                        System.out.print("Selecione a luta pelo Nº(ou digite 0 para voltar): ");
                        y = input.nextInt();
                        if (y != 0){
                            Console.limpar();
                            System.out.printf("Realizando luta Nº %d\n",y);
                            //implementar o metodo de realizar luta na classe luta

                            System.out.println("Imprimindo ganhador...");
                            //retornar o ganhador da luta de Nº x
                        }

                    } while (y != 0);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção invalida!");
            }
        } while (x != 0);
    }
}

