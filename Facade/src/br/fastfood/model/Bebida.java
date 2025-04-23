package br.fastfood.model;

public class Bebida implements ItemCombo{
	 private final String nome;
	 private final double preco;
	 
	public Bebida(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
	
	public void Milkshake(){
    	Bebida milkshake = new Bebida("Milkshake",12);
    }
	
	public void Cerveja(){
    	Bebida cerveja = new Bebida("Cerveja",2);
    }
	
	public void Agua(){
    	Bebida agua = new Bebida("Agua",120);
    }
	
    public String getNome()  
    { 
    	return nome; 
    }
    public double getPreco() { 
    	return preco; 
    }
    @Override public String toString() { 
    	return nome + " R$" + preco; 
    	
    }
}
