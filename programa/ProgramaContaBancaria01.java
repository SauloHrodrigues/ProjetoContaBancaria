package HerancaEPolimorfismo.material.programa;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class ProgramaContaBancaria01 {
    public static void main(String[] args) {
        /*Exercitando conceito de herança e polimorfismo, utilizado o emprego
        de classes abstrata e extensão.
         */
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        System.out.println("************************************");
        System.out.println("****BANCO XPTO***********************");
        System.out.println("************************************");
        System.out.println();
        menuInicial(input);
    }
    public static void menuInicial(Scanner input){
       boolean permanecerNoMenu = true;
        while (permanecerNoMenu) {
            System.out.println("Menu: ");
            System.out.println("1 - Abrir nova conta:");
            System.out.println("2 - Fechar conta:    ");
            System.out.println("3 - Verificar Saldo: ");
            System.out.println("4 - Exzibir extrato: ");
            System.out.println("0 - Sair do Sistema: ");
            int opcao = input.nextInt();
            switch (opcao) {
                case 0:
                    permanecerNoMenu = false;
                    break;
                default:
                    System.out.println("opção inválida!");
                    System.out.print("Realizar outra operação? (s/n) ");
                    String sair = input.next();
                    if (sair.equalsIgnoreCase("s")){
                        permanecerNoMenu = true;
                    } else if (sair.equalsIgnoreCase("n")) {
                        permanecerNoMenu = false;
                    }else {
                        System.out.println("Opção Inválida. Tente mais tarde. Obrigado.");
                        permanecerNoMenu=false;
                    }
            }
        }
    }
}
