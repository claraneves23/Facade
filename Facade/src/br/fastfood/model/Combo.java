package br.fastfood.model;

public class Combo {
    private final ItemCombo burguer;
    private final ItemCombo bebida;
    private final ItemCombo sobremesa;

    public Combo(ItemCombo burguer, ItemCombo bebida, ItemCombo sobremesa){
        this.burguer = burguer;
        this.bebida = bebida;
        this.sobremesa = sobremesa;
    }

    public double getPrecoTotal(){
        return burguer.getPreco() + bebida.getPreco() + sobremesa.getPreco();
    }

    public void exibirItens(){
        System.out.println(burguer.toString());
        System.out.println(bebida.toString());
        System.out.println(sobremesa.toString());
    }
}
