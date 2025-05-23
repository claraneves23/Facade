// após implementar as classes solicitada remova os comentarios
// para executar o código

package br.fastfood.app;
import java.util.Scanner;
import br.fastfood.facade.ComboFacade;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("=== Menu de Combos ===");
        System.out.println("1 – Combo Master");
        System.out.println("2 – Super Combo");
        System.out.print("Sua escolha: ");
        int escolha = in.nextInt();

        ComboFacade facade = new ComboFacade();
        facade.criarCombo(escolha);

        while(escolha < 1 || escolha >2){
            System.out.println("Digite novamente:");
            escolha = in.nextInt();
            facade.criarCombo(escolha);
        }


        System.out.println("Itens do combo: ");
        facade.exibirItens();
        System.out.printf("Total a pagar: R$ %.2f%n", facade.getPrecoTotal());



    }
}