package br.fastfood.model;

public class Bebida implements ItemCombo{
	 private final String nome;
	 private final double preco;
	 
	public Bebida(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

	
	public static Bebida Cerveja(){
    	return new Bebida("Cerveja",2);
    }
	
	public static Bebida Agua(){
    	return new Bebida("Agua",120);
    }

    @Override
    public String getNome()  
    { 
    	return nome; 
    }
    @Override
    public double getPreco() { 
    	return preco; 
    }
    @Override public String toString() { 
    	return nome + " R$" + preco; 
    	
    }
}
