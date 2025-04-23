package br.fastfood.model;

public class Burguer implements ItemCombo{
	    private final String nome;
	    private final double preco;

	    public Burguer(String nome, double preco) {
	        this.nome = nome;
	        this.preco = preco;
	    }
	    
	    public static Burguer BigMac(){
	    	return new Burguer("Big Mac",35);
	    }
	    
	    public static Burguer BigTasty(){
	    	return new Burguer("Big Tasty",45);
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
