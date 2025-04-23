package br.fastfood.model;

public class Burguer implements ItemCombo{
	    private final String nome;
	    private final double preco;

	    public Burguer(String nome, double preco) {
	        this.nome = nome;
	        this.preco = preco;
	    }
	    
	    public void BigMac(){
	    	Burguer bigmac = new Burguer("Big Mac",35);
	    }
	    
	    public void BigTasty(){
	    	Burguer bigtasty = new Burguer("Big Tasty",45);
	    }
	    
	    public void MacLancheFeliz(){
	    	Burguer maclanchefeliz = new Burguer("Mac Lanche Feliz",5);
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
