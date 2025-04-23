package br.fastfood.facade;

import br.fastfood.model.Burguer;
import br.fastfood.model.Sobremesa;
import br.fastfood.model.Bebida;
import br.fastfood.model.Combo;

public class ComboFacade  {
    private Combo combo;

    public void criarCombo(int escolha){
        switch (escolha){
            case 1:
                combo = new Combo(Burguer.BigMac(),Bebida.Cerveja(),Sobremesa.Maca());
                break;
            case 2:
                combo = new Combo(Burguer.BigTasty(),Bebida.Agua(),Sobremesa.Sorvete());
                break;
            default:
                System.out.println("\nOpção Inválida\n");
        }
    }

    public void exibirItens(){
        if (combo!=null){
            combo.exibirItens();
        }
        else {
            System.out.println("Erro");
        }
    }

    public double getPrecoTotal(){
        if (combo!=null){
            return combo.getPrecoTotal();
        }
       return 0;
    }



}
