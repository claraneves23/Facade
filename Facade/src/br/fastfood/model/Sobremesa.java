package br.fastfood.model;

public class Sobremesa implements ItemCombo {
	private final String nome;
	private final double preco;
	 
	public Sobremesa(String nome, double preco) {
       this.nome = nome;
       this.preco = preco;
   }
   public void Maca(){
    	Sobremesa maca = new Sobremesa("Maça",12);
   }
	
   public void Sorvete(){
   	  Sobremesa sorvete = new Sobremesa("sorvete",12);
   }
   
   public void Mousse(){
	   	  Sobremesa mousse = new Sobremesa("mousse",12);
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
